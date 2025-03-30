package vcmsa.ci.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
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
    private lateinit var textView: TextView


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

        btnBreakfast. setOnClickListener() {
            //Show breakfast options when button is clicked
            resultTextView.text =
                "Breakfast: club sandwich, english breakfast, pancakes, omemlette, oats, cereal with a drink, juice or tea"
        }
        btnLunch. setOnClickListener() {
            //Show lunch options when button is clicked
            resultTextView.text =
                "Lunch: pizza, burger and fires, slap chips, kota,wraps, cheese sandwich with juice, a drink or tea"
        }
        btnDinner. setOnClickListener() {
            //Show dinner options when button is clicked
            resultTextView.text =
                "Dinner: rice and mince, mac and cheese, chicken curry, stick beef and noodles, pap and pork, vegetables with tea, coffee, or juice"
        }
        btnSnack. setOnClickListener() {
            //Show snack options when button is clicked
            resultTextView.text = "Snacks: sweets, chips, fruits, peanuts, ice-cream"
        }
        btnClear. setOnClickListener() {
            // Clear the text in the TextView when button is clicked
            resultTextView.text = ""
        }
        btnExit. setOnClickListener() {
            //Close the current activity or application when button is clicked
            finish()
        }
    }
}