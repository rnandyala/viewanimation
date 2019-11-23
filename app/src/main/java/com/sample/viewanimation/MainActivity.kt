package com.sample.viewanimation

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        val spaceshipImage = findViewById(R.id.sampleImageview) as ImageView
        val hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.sampleimageanimation)
        spaceshipImage.startAnimation(hyperspaceJumpAnimation)
    }
}
