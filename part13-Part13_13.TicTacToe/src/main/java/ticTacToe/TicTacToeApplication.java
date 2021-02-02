package ticTacToe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


import java.awt.*;

public class TicTacToeApplication extends Application {
    private boolean xstate;
    private boolean finished;
    private Label turn;
    private Button[] buttons;

    public TicTacToeApplication() {
        this.xstate = true;
        this.finished = false;
        this.turn = new Label("Turn: X");
        this.buttons = new Button[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = createButton();
        }

    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        this.turn.setFont(Font.font("Monospaced", 20));
        GridPane pane = new GridPane();
        pane.setVgap(5);
        pane.setHgap(5);
        pane.add(buttons[0],1,0);
        pane.add(buttons[1],1,1);
        pane.add(buttons[2],1,2);
        pane.add(buttons[3],2,0);
        pane.add(buttons[4],2,1);
        pane.add(buttons[5],2,2);
        pane.add(buttons[6],3,0);
        pane.add(buttons[7],3,1);
        pane.add(buttons[8],3,2);

        layout.setTop(turn);
        layout.setCenter(pane);

        Scene game = new Scene(layout);
        stage.setScene(game);
        stage.show();
    }

    private Button createButton() {
        Button btn = new Button(" ");
        btn.setFont(Font.font("Monospaced", 40));
        btn.setPrefSize(90,90);

        btn.setOnAction((event) -> {
            if (finished == true) {
                return;
            }
            if(!btn.getText().equals(" ")) {
                return;
            }

            if(xstate == true) {
                btn.setText("X");
                this.turn.setText("Turn: O");
                this.xstate = false;
            } else {
                btn.setText("O");
                this.turn.setText("Turn: X");
                this.xstate = true;
            }
            if(gameWon()) {
                this.turn.setText("The end!");
                this.finished = true;
            } else {
                return;
            }
        });

        return btn;
    }

    public boolean gameWon() {
        if(!buttons[0].getText().equals(" ")) {
            if(buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        if(!buttons[0].getText().equals(" ")) {
            if(buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())) {
                return true;
            }
        }
        if(!buttons[0].getText().equals(" ")) {
            if(buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())) {
                return true;
            }
        }
        if(!buttons[3].getText().equals(" ")) {
            if(buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText())) {
                return true;
            }
        }
        if(!buttons[6].getText().equals(" ")) {
            if(buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText())) {
                return true;
            }
        }
        if(!buttons[1].getText().equals(" ")) {
            if(buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText())) {
                return true;
            }
        }
        if(!buttons[2].getText().equals(" ")) {
            if(buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        if(!buttons[2].getText().equals(" ")) {
            if(buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText())) {
                return true;
            }
        }
        return false;
    }
}
