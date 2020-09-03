package com.example.proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.proyectokotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mBiding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBiding= ActivityMainBinding,inflate(layoutInflate)
       // setContentView(R.layout.activity_main)
      //  setContentView(mBiding.root)

        //val value="Algo"//declaración variable

       // mBiding.button.setOnClickListener{
          //  thisFunDonothing()
      //  }

        buttonOne.setOnClickListener { //el mejor proceso synthetic

        }
    }

    fun thisFunDonothing(){ //función o método
        Log.d("TAG","ALGO")//mostrar resultado
    }
}