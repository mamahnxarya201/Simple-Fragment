package com.belajar.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        var pertama:Boolean = false

        btn1.setOnClickListener {
            pertama = !pertama
            if (pertama){
                changefragment(Gambar_Pertama.newInstance())
            }else{
                changefragment(Gambar_Kedua.newInstance())
            }
        }
    }

    private fun changefragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame1,fragment)
        transaction.commit()
    }
}
