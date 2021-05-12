package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class Queen extends Piece {
    public Queen(Texture texture, int x, int y, Color color) {
        super(texture, x, y, color);
    }

    @Override
    public MoveType isValidMove() {

        return MoveType.ABORT;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
