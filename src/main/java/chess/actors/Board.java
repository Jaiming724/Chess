package chess.actors;

import chess.actors.pieces.Color;
import chess.actors.pieces.Pawn;
import chess.actors.pieces.Piece;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Board extends Actor {
    private ShapeRenderer shapeRenderer;
    private Piece[][] pieces;
    private Stage stage;

    public Board(Stage stage) {
        super();
        shapeRenderer = new ShapeRenderer();
        this.stage = stage;
        stage.addActor(new Pawn(Color.WHITE));

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        float count = 0;
        for (float i = 0; i < 8; i++) {
            for (float j = 0; j < 8; j++) {
                if (count % 2 == 0) {
                    shapeRenderer.setColor(0 / 255f, 0 / 255f, 0 / 255f, 1.0f);

                } else {
                    shapeRenderer.setColor(100 / 255f, 100 / 255f, 100 / 255f, 1.0f);
                }

                shapeRenderer.rect(j * 100, i * 100, ((j * 100) + 100), ((i * 100) + 100));
                count++;
            }
            count = i - 1;
        }
        shapeRenderer.end();
    }

    @Override
    public void act(float delta) {

    }

}
