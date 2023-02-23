package com.manash.classwork

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
class OpenCamera : AppCompatActivity() {
    lateinit var camera_open_id: Button
    lateinit var click_image_id: ImageView
    private  val pic_id = 123
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.open_camera)
        camera_open_id = findViewById(R.id.camera_button)
        click_image_id = findViewById(R.id.click_image)

        camera_open_id.setOnClickListener {
            val camera_intent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
                Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            } else {
                TODO("VERSION.SDK_INT < CUPCAKE")
            }

            startActivityForResult(camera_intent, pic_id)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == pic_id) {
            val photo = data!!.extras!!["data"] as Bitmap?
            click_image_id.setImageBitmap(photo)
        }
    }
}