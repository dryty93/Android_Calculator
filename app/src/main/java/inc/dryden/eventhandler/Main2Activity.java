package inc.dryden.eventhandler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       final int hold_this[];
        hold_this = new int[2];  // allocating memory to array






        Button one_button = findViewById(R.id.one);
                one_button.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){

                                TextView answer = (TextView)findViewById(R.id.Answer);
                                answer.setText("1");
                                hold_this[0] = 1;
                                //if(hold_this.length == 0 )
                                 //{
                                   //  hold_this[0] = 1;
                                //}

                                //else
                                //{
                                  //  hold_this[1] = 1;
                                //}

                            }

                            }
                );
        Button two_button = findViewById(R.id.two);
        two_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("2");
                        hold_this[1] = 2;

                    }

                }
        );

        Button three_button = findViewById(R.id.three);
        three_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("3");
                        hold_this[1] = 3;

                    }

                }
        );

        Button four_button = findViewById(R.id.four);
        four_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("4");
                        hold_this[1] = 4;

                    }

                }
        );

        Button five_button = findViewById(R.id.five);
        five_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("5");
                        hold_this[1] = 5;

                    }

                }
        );

        Button six_button = findViewById(R.id.six);
        six_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("6");
                        hold_this[1] = 6;

                    }

                }
        );

        Button seven_button = findViewById(R.id.seven);
        seven_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("7");
                        hold_this[1] = 7;

                    }

                }
        );

        Button eight_button = findViewById(R.id.eight);
        eight_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("8");
                        hold_this[1] = 8;

                    }

                }
        );

        Button nine_button = findViewById(R.id.nine);
        nine_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("9");
                        hold_this[1] = 9;

                    }

                }
        );

        Button plus_button = findViewById(R.id.plus);
        plus_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("+");
                        String operator = "+";
                    }
                }
        );

        Button eq_button = findViewById(R.id.eq);
        eq_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        //answer.setText("=");
                        int first_num, operator, sec_num;
                        first_num = hold_this[0];
//                        operator = hold_this.indexOf(1);
                        sec_num = hold_this[1];
                        //answer.setText(first_num);
                        int sum;

                        sum = first_num + sec_num;
                        String n = String.valueOf(sum);
                        answer.setText(n);
                        hold_this[0] = sum;

                    }
                }
        );

        Button clear_button = findViewById(R.id.clear);
        clear_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answer = (TextView)findViewById(R.id.Answer);
                        answer.setText("");

                    }

                }
        );
            }

    }




