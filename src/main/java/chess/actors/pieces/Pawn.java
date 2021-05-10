package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Pawn extends Actor implements Piece {
    private Sprite sprite;

    public Pawn(Color color) {
        if (color == Color.BLACK) {
            sprite = new Sprite(new Texture("black_pawn.png"));
        } else {
            sprite = new Sprite(new Texture("white_pawn.png"));

        }
        sprite.setPosition(100,100);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {

        sprite.draw(batch);
        //batch.draw(sprite, sprite.getX(), sprite.getY());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
