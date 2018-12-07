package sungyeh.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_add.*

class Add : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        button.setOnClickListener {
            println(add(editText2.text.toString().toInt(), editText3.text.toString().toInt()))
        }
    }

     fun add(int1: Int, int2: Int): Int {
        return int1 + int2
    }
}

