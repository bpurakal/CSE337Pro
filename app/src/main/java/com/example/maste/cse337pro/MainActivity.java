package com.example.maste.cse337pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.util.Log;
import android.view.View;
import android.widget.*;
import edu.oakland.production.database.*;
import edu.oakland.production.display.TTTDisplay;
import edu.oakland.production.middleware.*;


public class MainActivity extends AppCompatActivity {
//this is only for display team

    TextView currentPlayer;
    private char mark;
    //TODO the buttons should be stored as instance variables as they will need to be
    //public Button buttonEXMP;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    //TODO manipulated by other classes like winOrDraw

//this is only for display team

   // private TTTDisplay display;
    private TTTMiddleware middleware;
    private TTTDatabase database;
    private boolean draw = false;
    TextView currentPlayer;
    private char mark;
    //TODO the buttons should be stored as instance variables as they will need to be
    public Button buttonEXMP;
    //TODO manipulated by other classes like winOrDraw


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //example button
 /*     //TODO use button.setText('-'); to set the text to a dash this can also be left blank
        buttonEXMP=(Button) findViewById(R.id.button1);
        buttonEXMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonEXMP.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 0 , 0);
                //Disable the buttone after cliacked
                buttonEXMP.setEnabled(false);
               //can make a method
               if (Character.toUpperCase(mark) == 'X' ){
                   setCurentPlayer('O');
               }else{
                   setCurentPlayer('X');
               }
               //TODO checkWinOrDraw in this method call


            }
        });*/


        final Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 0 , 0);
                //Disable the buttone after cliacked
                button1.setEnabled(false);
                changeCurrentPlayer();
                checkForWinOrDraw();
                //can make a method
            }
        });
        final Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 0 , 1);
                //Disable the buttone after cliacked
                button2.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });



        final Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 0 , 2);
                //Disable the buttone after cliacked
                button3.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });

        final Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 1 , 0);
                //Disable the buttone after cliacked
                button4.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });


        final Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 1 , 1);
                //Disable the buttone after cliacked
                button5.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });

        final Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 1 , 2);
                //Disable the buttone after cliacked
                button6.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });

        final Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button7.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 2 , 0);
                //Disable the buttone after cliacked
                button7.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });

        final Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button8.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 2 , 1);
                //Disable the buttone after cliacked
                button8.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });

        final Button button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button9.setText(mark+"");
                //TODO call placeMarkOnBoard(row,col); to set the mark
                placeMarkOnBoard( 2 , 2);
                //Disable the buttone after cliacked
                button9.setEnabled(false);
                changeCurrentPlayer();

                checkForWinOrDraw();
                //can make a method
            }
        });

        final Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = new TTTDatabase();
                middleware = new TTTMiddleware(database);
               // display = new TTTDisplay(middleware);
                setCurentPlayer('X');
                setToggleAllButtons(true);
            }
        });


        //sets up the current player text view use setCurrentPlayer to change player with X or O
        currentPlayer = (TextView) findViewById(R.id.currentPlayer);
        //TODO set the current player

    }

    public void changeCurrentPlayer() {
        if (Character.toUpperCase(mark) == 'X' ){
            setCurentPlayer('O');
        }else{
            setCurentPlayer('X');
        }
    }
    //sets the current player pass in x or o
    //it does not matter it will capitalize it for you
    public void setCurentPlayer(char m){

        this.mark = Character.toUpperCase(m);
        currentPlayer.setText("Current Player "+mark);

    }

    //Sets the win or draw message on the currentPlayer text view
    //pass in d or D for draw and X/x or O/o for win message
    public void setWinnerOrDraw(char m){
        if(m == 'D' || m == 'd'){
            currentPlayer.setText("The game is a draw.");
            setToggleAllButtons(false);
        }else {
            currentPlayer.setText(Character.toUpperCase(mark) + " Won the game!");
            setToggleAllButtons(false);
        }
    }

    // row column 0-2 for the set mark use this to call the middleware

    public void placeMarkOnBoard(int rowNumber, int columnNumber){
        //TODO add in the middleware and database class to the project.
       // Log.d("plaecMark", rowNumber+" "+columnNumber);
        middleware.placeMarkOnBoard(Character.toUpperCase(this.mark),rowNumber ,columnNumber);
    }

    // true toggles the all the buttons on or off
    //true = on, false = off
    public void setToggleAllButtons(boolean state){
        //TODO toggle button logic
        //buttonEXMP.setEnabled(state);
        final Button button1=(Button) findViewById(R.id.button1);
        button1.setEnabled(state);
        button1.setText("");
        final Button button2=(Button) findViewById(R.id.button2);
        button2.setEnabled(state);
        button2.setText("");
        final Button button3=(Button) findViewById(R.id.button3);
        button3.setEnabled(state);
        button3.setText("");
        final Button button4=(Button) findViewById(R.id.button4);
        button4.setEnabled(state);
        button4.setText("");
        final Button button5=(Button) findViewById(R.id.button6);
        button5.setEnabled(state);
        button5.setText("");
        final Button button6=(Button) findViewById(R.id.button5);
        button6.setEnabled(state);
        button6.setText("");
        final Button button7=(Button) findViewById(R.id.button7);
        button7.setEnabled(state);
        button7.setText("");
        final Button button8=(Button) findViewById(R.id.button8);
        button8.setEnabled(state);
        button8.setText("");
        final Button button9=(Button) findViewById(R.id.button9);
        button9.setEnabled(state);
        button9.setText("");
        final Button button10=(Button) findViewById(R.id.button10);
        button10.setEnabled(!state);

    }

    public void checkForWinOrDraw(){

        char status = middleware.checkForWinOrDraw();
        status = Character.toUpperCase(status);
      //  currentPlayer.setText(status+"");
        switch(status) {
            case 'X' :
                setWinnerOrDraw(status);
            case 'O' :
                setWinnerOrDraw(status);
            case 'D' :
                setWinnerOrDraw(status);
            case 'N' :
                return;
            default :
                return;
        }
    }
}
