package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public abstract class Piece extends Image {
    public Piece(Texture texture){
        super(texture);
    }
    Color color;
    String name;
}
