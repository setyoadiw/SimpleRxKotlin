package com.luminary.setyo.simplerxkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.Observable
import org.reactivestreams.Subscription

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sample 1
        Observable.fromArray("setyo","adi","wibowo","naruto").filter {
            data -> data.contains("setyo")
        }
                .subscribe {
            data -> Log.d("data:",data.toString())
        }

        //sample 2

        Flowable.just(12,12,23,21,33).map {
            t -> t.toDouble()

        }.filter {
            t: Double -> t < 15

        }.subscribe {
            t: Double? -> Log.d("data2:",t.toString())

        }

        




    }
}

