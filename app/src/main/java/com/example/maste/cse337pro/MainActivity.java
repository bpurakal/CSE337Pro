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

        
        final Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        final Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        final Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        final Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final Button button9=(Button) findViewById(R.id.button9);
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

    //displays the current win message in the currentPlayer text view
    public void setWinner(char winner){
        currentPlayer.setText(Character.toUpperCase(winner) +R.string.win_message);
    }

    // row column 0-2 for the set mark use this to call the middleware

    public void placeMarkOnBoard(int rowNumber, int columnNumber){
        //TODO add in the middleware and database class to the project.
        //middleware.placeMarkOnBoard(Character.toUpperCase(this.mark),rowNumber ,columnNumber);
    }

}
