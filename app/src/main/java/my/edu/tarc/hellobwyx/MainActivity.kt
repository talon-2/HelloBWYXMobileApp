package my.edu.tarc.hellobwyx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance name : type / class name
class MainActivity : AppCompatActivity() {
    //onCreate = main function
    //fun = function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Load UI to memory, R = resources
        setContentView(R.layout.activity_main)

        //Linking UI to program code
        //Declare variables here
        // val = value(cannot change during run time) , var = variable( can change)

        val imageViewQR : ImageView = findViewById(R.id.qrCodeImg)
        val textViewName : TextView = findViewById(R.id.nameStr)
        val buttonShow : Button = findViewById(R.id.showBtn)
        val buttonHide = findViewById<Button>(R.id.hideBtn) //casting val to Button(not recommended)

        //Insert event handler
        buttonShow.setOnClickListener{
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }
    }
}