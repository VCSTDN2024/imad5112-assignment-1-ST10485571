package vcmsa.ci.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnBreakfast: Button
    private lateinit var btnLunch: Button
    private lateinit var btnDinner: Button
    private lateinit var btnSnack: Button
    private lateinit var btnClear: Button
    private lateinit var btnExit: Button
    private lateinit var resultTextView: TextView


    private var timeInt: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnBreakfast = findViewById(R.id.button)
        btnLunch = findViewById(R.id.button2)
        btnDinner = findViewById(R.id.button3)
        btnSnack = findViewById(R.id.button4)
        btnClear = findViewById(R.id.button5)
        btnExit = findViewById(R.id.button6)
        resultTextView = findViewById(R.id.textView3)
        timeInt = findViewById(R.id.timeEditText)

        btnBreakfast.setOnClickListener() {
            //Show breakfast options when button is clicked
            val userInput = timeInt?.text.toString().trim().toInt()

            when(userInput){
                in 600..1200 -> resultTextView.text = "Breakfast: club sandwich, english breakfast, pancakes, omemlette, oats, cereal with a drink, juice or tea"

                else -> {
                    resultTextView.text = "Incorrect time input.Outside Breakfast Suggestion!"
                }
            }
         //   resultTextView.text =
          //      "Breakfast: club sandwich, english breakfast, pancakes, omemlette, oats, cereal with a drink, juice or tea"
        }
        btnLunch.setOnClickListener() {
            //Show lunch options when button is clicked
            val userInput = timeInt?.text.toString().trim().toInt()

            when(userInput) {
                in 1200..1700 -> resultTextView.text = "Lunch: pizza, burger and fires, slap chips, kota,wraps, cheese sandwich with juice, a drink or tea"

                else -> {
                    resultTextView.text = "Incorrect time input. Outside Lunch Suggestion!"
                }
            }
           // resultTextView.text =
              //  "Lunch: pizza, burger and fires, slap chips, kota,wraps, cheese sandwich with juice, a drink or tea"
        }
        btnDinner.setOnClickListener() {
            //Show dinner options when button is clicked
            val userInput = timeInt?.text.toString().trim().toInt()

            when(userInput) {
                in 1700..2300 -> resultTextView.text = "Dinner: rice and mince, mac and cheese, chicken curry, stick beef and noodles, pap and pork, vegetables with tea, coffee, or juice"

                else -> {
                    resultTextView.text = "Incorrect time input. Outside Dinner Suggestion!"
                }
            }
          //  resultTextView.text =
             //   "Dinner: rice and mince, mac and cheese, chicken curry, stick beef and noodles, pap and pork, vegetables with tea, coffee, or juice"
        }
        btnSnack.setOnClickListener() {
            //Show snack options when button is clicked
            val userInput = timeInt?.text.toString().trim().toInt()

            when(userInput) {
                in 100..600 -> resultTextView.text = "Snacks: just have a class of water"
                in 1100..1200 -> resultTextView.text = "Snacks: sweets, chips, fruits, peanuts, ice-cream, fruits"
                in 900..1000 -> resultTextView.text = "Tea Break."

                else -> {
                    resultTextView.text = "Incorrect time input. Outside Snack Suggestion!"
                }
            }
            //resultTextView.text = "Snacks: sweets, chips, fruits, peanuts, ice-cream"
        }
        btnClear.setOnClickListener() {
            // Clear the text in the TextView and EditText when button is clicked
            timeInt?.text?.clear()
            resultTextView.text = ""
        }
        btnExit.setOnClickListener() {
            //Close the current activity or application when button is clicked
            finish()
        }
    }






    }

