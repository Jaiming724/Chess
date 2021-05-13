package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class Bishop extends Piece {
    public Bishop(Texture texture, int x, int y, Color color, Piece[][] board) {
        super(texture, x, y, color, board);
    }

    @Override
    public MoveType isValidMove() {
        return MoveType.ABORT;
    }

    @Override
    public String toString() {
        return "B";
    }
}
