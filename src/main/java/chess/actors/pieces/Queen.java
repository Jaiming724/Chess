package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class Queen extends Piece {
    public Queen(Texture texture, int x, int y, Color color) {
        super(texture, x, y, color);
    }

    @Override
    public boolean isValidMove() {
        return false;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
