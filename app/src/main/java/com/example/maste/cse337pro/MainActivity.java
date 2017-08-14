package com.example.maste.cse337pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //example button
        //TODO use button.setText('-'); to set the text to a dash this can also be left blank
        /*buttonEXMP=(Button) findViewById(R.id.button1);
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


        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //sets up the current player text view use setCurrentPlayer to change player with X or O
        currentPlayer = (TextView) findViewById(R.id.currentPlayer);
        //TODO set the current player

    }


    //sets the current player pass in x or o
    //it does not matter it will capitalize it for you
    public void setCurentPlayer(char mark){

        this.mark = Character.toUpperCase(mark);
        currentPlayer.setText(R.string.current_player_message+mark);

    }

    //Sets the win or draw message on the currentPlayer text view
    //pass in d or D for draw and X/x or O/o for win message
    public void setWinnerOrDraw(char mark){
        if(mark == 'D' || mark == 'd'){
            currentPlayer.setText(R.string.draw_message);
        }else {
            currentPlayer.setText(Character.toUpperCase(mark) + R.string.win_message);
        }
    }

    // row column 0-2 for the set mark use this to call the middleware

    public void placeMarkOnBoard(int rowNumber, int columnNumber){
        //TODO add in the middleware and database class to the project.
        //middleware.placeMarkOnBoard(Character.toUpperCase(this.mark),rowNumber ,columnNumber);
    }

    // true toggles the all the buttons on or off
    //true = on, false = off
    public void setToggleAllButtons(boolean state){
        //TODO toggle button logic
        //buttonEXMP.setEnabled(state);
    }

}
