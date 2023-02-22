package com.manash.classwork

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri

class CameraIntent : AppCompatActivity() {
    lateinit var uploadImage: Button
    lateinit var iv: ImageView
    lateinit var filepath: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera_intent)
        uploadImage = findViewById(R.id.btn_upload_image)

        iv = findViewById(R.id.image_preview)

        val ip = registerForActivityResult(ActivityResultContracts.GetContent())
        {
            filepath = it!!
            iv.setImageURI(it)
        }
        uploadImage.setOnClickListener() {
            ip.launch("image/*")

        }
    }
}