package com.example.ahmed.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mickey_image_1.animate()
                .rotation(360f)
                .translationXBy(-1000f)
                .translationYBy(-1000f)
                .duration = 3000

        poke_image_2.animate()
                .rotation(360f)
                .translationXBy(1000f)
                .translationYBy(1000f)
                .duration = 3000

        // Clicked
        btn.setOnClickListener {
            mickey_image_1.animate()
                    .rotation(360f)
                    .translationXBy(1000f)
                    .translationYBy(1000f)
                    .scaleX(0.5f)
                    .scaleY(0.5f)
                    .duration = 3000

            poke_image_2.animate()
                    .rotation(360f)
                    .translationXBy(-1000f)
                    .translationYBy(-1000f)
                    .scaleX(0.5f)
                    .scaleY(0.5f)
                    .duration = 3000
        }
    }
}
