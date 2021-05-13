package chess.actors;

import chess.actors.pieces.Color;
import chess.actors.pieces.Piece;
import chess.actors.pieces.PieceFactory;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Board extends Actor {
    public static final int TILE_SIZE_X = 100;
    public static final int TILE_SIZE_Y = 100;
    private Stage stage;
    private PieceFactory pieceFactory;
    private ShapeRenderer shapeRenderer;
    private Piece[][] pieces;

    public Board(Stage stage) {
        super();
        this.stage = stage;

        pieces = new Piece[8][8];
        shapeRenderer = new ShapeRenderer();
        pieceFactory = new PieceFactory(pieces);
    }

    public void init() {
        setUp();
        printBoard();
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        batch.end();
        batch.begin();
        float count = 0;
        for (float i = 0; i < 8; i++) {
            for (float j = 0; j < 8; j++) {
                if (count % 2 == 0) {
                    shapeRenderer.setColor(91 / 255f, 93 / 255f, 94 / 255f, 1.0f);

                } else {
                    shapeRenderer.setColor(49 / 255f, 53 / 255f, 59 / 255f, 1.0f);
                }

                shapeRenderer.rect(j * TILE_SIZE_X, i * TILE_SIZE_Y, ((j * TILE_SIZE_X) + TILE_SIZE_X), ((i * TILE_SIZE_Y) + TILE_SIZE_Y));
                count++;
            }
            count = i - 1;
        }
        shapeRenderer.end();
        batch.end();
        batch.begin();

    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    private void setUp() {
        for (int i = 0; i < 8; i++) {
            Piece whitePawn = pieceFactory.makePiece("Pawn", Color.WHITE, i * TILE_SIZE_X, TILE_SIZE_Y);
            pieces[1][i] = whitePawn;

            Piece blackPawn = pieceFactory.makePiece("Pawn", Color.BLACK, i * TILE_SIZE_X, 6 * TILE_SIZE_Y);
            pieces[6][i] = blackPawn;
        }

        pieces[0][0] = pieceFactory.makePiece("Rook", Color.WHITE, 0, 0);
        pieces[0][7] = pieceFactory.makePiece("Rook", Color.WHITE, 7 * TILE_SIZE_X, 0);
        pieces[7][0] = pieceFactory.makePiece("Rook", Color.BLACK, 0, 7 * TILE_SIZE_Y);
        pieces[7][7] = pieceFactory.makePiece("Rook", Color.BLACK, 7 * TILE_SIZE_X, 7 * TILE_SIZE_Y);

        pieces[0][1] = pieceFactory.makePiece("Knight", Color.WHITE, TILE_SIZE_X, 0);
        pieces[0][6] = pieceFactory.makePiece("Knight", Color.WHITE, 6 * TILE_SIZE_X, 0);
        pieces[7][1] = pieceFactory.makePiece("Knight", Color.BLACK, TILE_SIZE_X, 7 * TILE_SIZE_Y);
        pieces[7][6] = pieceFactory.makePiece("Knight", Color.BLACK, 6 * TILE_SIZE_X, 7 * TILE_SIZE_Y);

        pieces[0][2] = pieceFactory.makePiece("Bishop", Color.WHITE, 2 * TILE_SIZE_X, 0);
        pieces[0][5] = pieceFactory.makePiece("Bishop", Color.WHITE, 5 * TILE_SIZE_X, 0);
        pieces[7][2] = pieceFactory.makePiece("Bishop", Color.BLACK, 2 * TILE_SIZE_X, 7 * TILE_SIZE_Y);
        pieces[7][5] = pieceFactory.makePiece("Bishop", Color.BLACK, 5 * TILE_SIZE_X, 7 * TILE_SIZE_Y);

        pieces[0][4] = pieceFactory.makePiece("King", Color.WHITE, 4 * TILE_SIZE_X, 0);
        pieces[7][4] = pieceFactory.makePiece("King", Color.BLACK, 4 * TILE_SIZE_X, 7 * TILE_SIZE_Y);

        pieces[0][3] = pieceFactory.makePiece("Queen", Color.WHITE, 3 * TILE_SIZE_X, 0);
        pieces[7][3] = pieceFactory.makePiece("Queen", Color.BLACK, 3 * TILE_SIZE_X, 7 * TILE_SIZE_Y);
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[0].length; j++) {
                if (pieces[i][j] != null) {
                    stage.addActor(pieces[i][j]);
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[0].length; j++) {
                if (pieces[i][j] == null) {
                    System.out.print("*");
                } else {
                    System.out.print(pieces[i][j].toString());
                }
            }
            System.out.println();
        }
    }


}
