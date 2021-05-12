package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class Pawn extends Piece {

    public Pawn(Texture texture, int x, int y, Color color) {
        super(texture, x, y, color);
    }

    @Override
    public boolean isValidMove() {
        return false;
    }

    @Override
    public String toString() {
        return "P";
    }
}
