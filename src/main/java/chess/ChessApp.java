package chess;

import chess.actors.Board;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class ChessApp extends ApplicationAdapter {
    private Stage stage;

    @Override
    public void create() {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        Board board = new Board(stage);
        stage.addActor(board);
        board.init();

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(.9f, .9f, .9f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
        Gdx.graphics.setTitle("Fps: " + Gdx.graphics.getFramesPerSecond());
    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
