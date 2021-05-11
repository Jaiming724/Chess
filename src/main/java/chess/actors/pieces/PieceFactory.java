package chess.actors.pieces;

import com.badlogic.gdx.Gdx;

public class PieceFactory {

    public Piece makePiece(String name, Color color, int x, int y) {
        Piece piece = null;
        switch (name) {
            case "Pawn":
                piece = new Pawn(color, x, y);
                break;
        }

        return piece;
    }


}
