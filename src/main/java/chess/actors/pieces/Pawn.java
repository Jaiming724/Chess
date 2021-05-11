package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;

public class Pawn extends Piece {
    private Sprite sprite;

    public Pawn(Color color, int x, int y) {

        if (color == Color.BLACK) {
            sprite = new Sprite(new Texture("black_pawn.png"));

        } else {
            sprite = new Sprite(new Texture("white_pawn.png"));
        }
        this.color = color;
        this.name = "Pawn";
        sprite.setPosition(x, y);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
        addListener(new DragListener() {

            public void drag(InputEvent event, float x, float y, int pointer) {
                moveBy(x - getWidth() / 2, y - getHeight() / 2);
            }

            @Override
            public void dragStop(InputEvent event, float x, float y, int pointer) {
                System.out.println(getDragStartX());
                System.out.println("X " + (getX() / 2) + " Y " + (getY() / 2));
               // sprite.setPosition(closest(getX() / 2), closest(getY() / 2));
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {

        batch.draw(sprite, sprite.getX(), sprite.getY());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    protected void positionChanged() {
        super.positionChanged();
        sprite.setPosition(getX(), getY());
    }

    public Color getPieceColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int closest(float x) {
        int i = (int) Math.ceil(x);
        return ((i + 99) / 100) * 100;
    }


}
