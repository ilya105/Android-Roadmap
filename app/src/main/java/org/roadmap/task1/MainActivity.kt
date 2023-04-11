package org.roadmap.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtn1amount: EditText
    private lateinit var txtn2amount: EditText
    private lateinit var txtn3amount: EditText
    private lateinit var txtavg: TextView
    private lateinit var txtmax: TextView
    private lateinit var txtmin: TextView
    private lateinit var txteven: TextView
    private lateinit var txtodd: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            txtn1amount=findViewById(R.id.txtn1amount)
            txtn1amount=findViewById(R.id.txtn2amount)
            txtn1amount=findViewById(R.id.txtn3amount)
            txtavg=findViewById(R.id.txtavg)
            txtmin=findViewById(R.id.txtmin)
            txtmax=findViewById(R.id.txtmax)
            txteven=findViewById(R.id.txteven)
            txtodd=findViewById(R.id.txtodd)


        }



    private fun computeavg() {

        val a:Int = 1
        val b:Int = 3
        val c:Int = 6
        val avg:Int =(a + b + c) / 3
        print(avg)

    }


}
