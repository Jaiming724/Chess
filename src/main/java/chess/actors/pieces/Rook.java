package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class Rook extends Piece {
    public Rook(Texture texture, int x, int y, Color color) {
        super(texture, x, y, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
