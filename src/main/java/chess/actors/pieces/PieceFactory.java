package chess.actors.pieces;

public class PieceFactory {

    public Piece makePiece(String name, Color color, int x, int y) {
        Piece piece = null;
        switch (name) {
            case "Pawn":
                if (color == Color.WHITE)
                    piece = new Pawn(color, "white_pawn.png", x, y);
                else
                    piece = new Pawn(color, "black_pawn.png", x, y);
                break;
        }

        return piece;
    }


}
