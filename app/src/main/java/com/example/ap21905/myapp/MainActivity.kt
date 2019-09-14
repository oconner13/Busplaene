package com.example.ap21905.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Browser
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(V:View) {
        Toast.makeText(this,"Abfahrt Lüneburg, Am Sande",Toast.LENGTH_SHORT).show()
        ausgabe.text = "Lüneburg, Am Sande"
        browse("https://abfahrten.hvv.de/677202df-0d1f-4009-be1f-80b9c167166a")
    }

    fun onClick1(V:View) {
        Toast.makeText(this,"Abfahrt Reppenstedt, Schnellenberger Weg",Toast.LENGTH_SHORT).show()
        ausgabe.text = "Reppenstedt, Schnellenberger Weg"
        browse("https://abfahrten.hvv.de/f9a1e0a1-44be-4577-bfa3-8a1c6abaadf1")
    }

    fun onClick2(V:View) {
        Toast.makeText(this,"Abfahrt Bf. Lüneburg (ZOB)",Toast.LENGTH_SHORT).show()
        ausgabe.text = "Bf. Lüneburg (ZOB)"
        browse("https://abfahrten.hvv.de/56effe72-853c-4770-83cb-3c6e2320fbc3")
    }

}
