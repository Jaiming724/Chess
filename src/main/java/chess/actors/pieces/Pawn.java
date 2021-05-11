package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class Pawn extends Piece {

    public Pawn(Color color, String file, int x, int y) {
        super((new Texture(file)), x, y, color);
    }


}
