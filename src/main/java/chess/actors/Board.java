package chess.actors;

import chess.actors.pieces.Color;
import chess.actors.pieces.Piece;
import chess.actors.pieces.PieceFactory;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Board extends Actor {
    private ShapeRenderer shapeRenderer;
    private Piece[][] pieces;
    public static final int TILE_SIZE_X = 100;
    public static final int TILE_SIZE_Y = 100;
    Stage stage;
    PieceFactory pieceFactory;

    public Board(Stage stage) {
        super();
        this.stage = stage;

        pieces = new Piece[8][8];
        shapeRenderer = new ShapeRenderer();
        pieceFactory = new PieceFactory();
    }

    public void init() {
        setUp();
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
            pieces[i][1] = whitePawn;
            stage.addActor(whitePawn);

            Piece blackPawn = pieceFactory.makePiece("Pawn", Color.BLACK, i * TILE_SIZE_X, 6 * TILE_SIZE_Y);
            pieces[i][6] = blackPawn;
            stage.addActor(blackPawn);

        }
    }


}
