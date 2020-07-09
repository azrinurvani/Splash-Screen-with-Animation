package com.mobile.azrinurvani

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation

import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreenActivity : AppCompatActivity() {

    companion object{
        private const val splashTimeOut = 5000L
    }
    private lateinit var myAnim : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler().postDelayed({
            val i = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(i)
            finish()
        }, splashTimeOut)

        myAnim = AnimationUtils.loadAnimation(this,R.anim.mysplashanimation)
        logo.startAnimation(myAnim)
    }
}
