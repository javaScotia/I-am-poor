/*
NAME:Adrian Tsien
DATE:10/23/23
ASSIGNMENT: I AM POOR PART 5
 */

package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button; //button declared
    Button button2; //button 2 declared
    TextView text; //text declared

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button4); //button initialized
        button2 = findViewById(R.id.button3); //button 2 initialized
        text = findViewById(R.id.textView2); //text initialized

        /**
         * executes whenever the button is pressed
         * onClick passes button the method verifyRichness
         * @param - the click listener method
         */
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                verifyRichness(button);
            }
        });

        /**
         * executes whenever the button2 is pressed
         * onClick passes button2 the method verifyRichness
         * @param - the click listener method
         */
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                verifyRichness(button2);
            }
        });
    }

    /**
     * checks what the button text is
     * if the text says "I am poor" - change color of text to red and text to "I am poor"
     * if the text doesn't say "I am poor" - change color of text to green and text to "I am rich"
     * @param button
     */
    public void verifyRichness (Button button){
        if (button.getText().equals("I am poor")) {

            text.setTextColor(Color.RED);
            text.setText("I AM POOR");
        }
        else {
            text.setTextColor(Color.GREEN);
            text.setText("I AM RICH");
        }
    }
}