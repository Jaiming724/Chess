package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;

public class Pawn extends Piece {

    public Pawn(Color color, int x, int y) {
        super((new Texture("black_pawn.png")));
        setBounds(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        setPosition(x, y);
        addListener(new DragListener() {

            public void drag(InputEvent event, float x, float y, int pointer) {
                moveBy(x - getWidth() / 2, y - getHeight() / 2);
            }

            @Override
            public void dragStop(InputEvent event, float x, float y, int pointer) {
                System.out.println(getDragStartX());
                System.out.println("X " + (getX()) + " Y " + (getY()));
                System.out.println("Closest X " + closest(getX()) + " Closest Y " + closest(getY()));
                setPosition(closest(getX()), closest(getY()));
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    protected void positionChanged() {
        super.positionChanged();
        super.setPosition(getX(), getY());
    }

    public Color getPieceColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int closest(float x) {

        if (x + 100 - x < 20) {
            x += 20;
        }
        int rounded = ((int) Math.round(x / 100.0)) * 100;

        return rounded;

    }


}
