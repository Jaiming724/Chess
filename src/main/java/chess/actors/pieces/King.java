package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class King extends Piece {
    public King(Texture texture, int x, int y, Color color) {
        super(texture, x, y, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}