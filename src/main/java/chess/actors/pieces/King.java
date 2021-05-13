package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class King extends Piece {
    public King(Texture texture, int x, int y, Color color, Piece[][] board) {
        super(texture, x, y, color, board);
    }

    @Override
    public MoveType isValidMove() {

        return MoveType.ABORT;
    }

    @Override
    public String toString() {
        return "K";
    }
}
