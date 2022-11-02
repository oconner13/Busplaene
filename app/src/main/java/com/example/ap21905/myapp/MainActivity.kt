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
        Toast.makeText(this,"Abfahrt Lüneburg, Schnellenberger Weg",Toast.LENGTH_SHORT).show()
        ausgabe.text = "Reppenstedt, Schnellenberger Weg"
        browse("https://www.hvv.de/de/fahrplaene/abruf-fahrplaninfos/abfahrten-auf-ihrem-monitor/abfahrten-anzeige?show=da23bd4ef3f5437f88ec055f4d3d1a43")
    }

    fun onClick1(V:View) {
        Toast.makeText(this,"Abfahrt Reppenstedt, Landwehrplatz",Toast.LENGTH_SHORT).show()
        ausgabe.text = "Reppenstedt, Landwehrplatz"
        browse("https://www.hvv.de/de/fahrplaene/abruf-fahrplaninfos/abfahrten-auf-ihrem-monitor/abfahrten-anzeige?show=630267ee2d944e3e94a9e8ad53c3e2c8")
    }

    fun onClick2(V:View) {
        Toast.makeText(this,"Abfahrt Bf. Lüneburg (ZOB)",Toast.LENGTH_SHORT).show()
        ausgabe.text = "Bf. Lüneburg (ZOB)"
        browse("https://www.hvv.de/de/fahrplaene/abruf-fahrplaninfos/abfahrten-auf-ihrem-monitor/abfahrten-anzeige?show=1076e8a4103343fba091b8ee758053e3")
    }

}
