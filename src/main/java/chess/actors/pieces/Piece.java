package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;


public abstract class Piece extends Image {
    Color color;
    String name;
    float startX, startY;

    public Piece(Texture texture, int x, int y, Color color) {
        super(texture);
        setBounds(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        setPosition(x, y);
        addListener(new DragListener() {

            @Override
            public void dragStart(InputEvent event, float x, float y, int pointer) {
                System.out.println("start x " + closest(getX()) + " start y " + closest(getY()));
                startX = closest(getX());
                startY = closest(getY());
            }

            public void drag(InputEvent event, float x, float y, int pointer) {
                moveBy(x - getWidth() / 2, y - getHeight() / 2);
            }

            @Override
            public void dragStop(InputEvent event, float x, float y, int pointer) {
                System.out.println("Closest X " + closest(getX()) + " Closest Y " + closest(getY()));

                if (isValidMove()) {
                    setPosition(closest(getX()), closest(getY()));
                } else {
                    setPosition(startX, startY);
                }
            }
        });
        this.color = color;
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


    public int closest(float x) {

        if (x + 100 - x < 20) {
            x += 20;
        }
        return ((int) Math.round(x / 100.0)) * 100;

    }


    public Color getPieceColor() {
        return color;
    }

    public String getName() {
        return "Piece";
    }

    public abstract boolean isValidMove();
}
