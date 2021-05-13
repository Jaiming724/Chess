package chess.actors.pieces;

import com.badlogic.gdx.graphics.Texture;

public class PieceFactory {
    private Piece[][] board;

    public PieceFactory(Piece[][] board) {
        this.board = board;
    }

    public Piece makePiece(String name, Color color, int x, int y) {
        Piece piece = null;
        name = name.toLowerCase();
        switch (name) {
            case "pawn":
                if (color == Color.WHITE)
                    piece = new Pawn(new Texture("white_pawn.png"), x, y, color, board);
                else
                    piece = new Pawn(new Texture("black_pawn.png"), x, y, color, board);
                break;
            case "bishop":
                if (color == Color.WHITE)
                    piece = new Bishop(new Texture("white_bishop.png"), x, y, color, board);
                else
                    piece = new Bishop(new Texture("black_bishop.png"), x, y, color, board);
                break;
            case "knight":
                if (color == Color.WHITE)
                    piece = new Knight(new Texture("white_knight.png"), x, y, color, board);
                else
                    piece = new Knight(new Texture("black_knight.png"), x, y, color, board);
                break;
            case "rook":
                if (color == Color.WHITE)
                    piece = new Rook(new Texture("white_rook.png"), x, y, color, board);
                else
                    piece = new Rook(new Texture("black_rook.png"), x, y, color, board);
                break;
            case "queen":
                if (color == Color.WHITE)
                    piece = new Queen(new Texture("white_queen.png"), x, y, color, board);
                else
                    piece = new Queen(new Texture("black_queen.png"), x, y, color, board);
                break;
            case "king":
                if (color == Color.WHITE)
                    piece = new King(new Texture("white_king.png"), x, y, color, board);
                else
                    piece = new King(new Texture("black_king.png"), x, y, color, board);
                break;
            default:
                piece = new Pawn(new Texture("white_pawn.png"), x, y, color, board);

        }

        return piece;
    }


}
