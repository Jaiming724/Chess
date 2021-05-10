package chess.actors.pieces;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pawn extends Image implements Piece {
    private Sprite sprite;

    public Pawn(Color color) {
        super(new Texture("white_pawn.png"));
        if (color == Color.BLACK) {
            sprite = new Sprite(new Texture("black_pawn.png"));
        } else {
            sprite = new Sprite(new Texture("white_pawn.png"));

        }
        sprite.setPosition(100, 100);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        Gdx.gl.glEnable(GL20.GL_BLEND);

        batch.enableBlending();

        //batch.draw(sprite, sprite.getX(), sprite.getY());

        batch.disableBlending();
        Gdx.gl.glDisable(GL20.GL_BLEND);

    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
