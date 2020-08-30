package com.example.asistentedocumental

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_documentation.*
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class DocumentationActivity : AppCompatActivity() {
    var editOk: Boolean = false
    val REQUEST_IMAGE_CAPTURE = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_documentation)
        editOk = intent.getBooleanExtra("editOk", false)

        button5.setOnClickListener {
            // dispatchTakePictureIntent()
            /*
            val intent = Intent(this, ProyectAsigActivity::class.java)
            intent.putExtra("editOk", editOk)
            startActivity(intent)
            */
        }
        button6.setOnClickListener {
            dispatchTakePictureIntent()
            /*
            val intent = Intent(this, ProyectAsigActivity::class.java)
            intent.putExtra("editOk", editOk)
            startActivity(intent)
            */
        }

/*
        button1.setOnClickListener {
            var intent = Intent(this,ListEsentialsTest1Activity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            var intent = Intent(this,ListEsentialsTest2Activity::class.java).apply {
                putExtra("formato",1)
            }
            startActivity(intent)
        }

        button3.setOnClickListener {
            var intent = Intent(this,ListEsentialsTest2Activity::class.java).apply {
                putExtra("formato",2)
            }
            startActivity(intent)
        }

        button4.setOnClickListener {
            var intent = Intent(this,ListEsentialsTest2Activity::class.java).apply {
                putExtra("formato",3)
            }
            startActivity(intent)
        }
        */
/*
        button5.setOnClickListener {
            var intent = Intent(this,ListEsentialsTest2Activity::class.java).apply {
                putExtra("formato",4)
            }
            startActivity(intent)
        }
*/
    }

    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
              //  startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
// Create the File where the photo should go
                val photoFile: File? = try {
                    createImageFile()
                } catch (ex: IOException) {
                    // Error occurred while creating the File
                    //...
                    null
                }
                // Continue only if the File was successfully created
                photoFile?.also {
                    val photoURI: Uri = FileProvider.getUriForFile(
                        this,
                        "com.example.android.fileprovider",
                        it
                    )
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
                }
            }
        }
    }

    lateinit var currentPhotoPath: String

    @Throws(IOException::class)
    private fun createImageFile(): File {
        // Create an image file name
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val storageDir: File = this.getExternalFilesDir(Environment.DIRECTORY_PICTURES)!!
        println("directorio de storedir")
        println(storageDir)
        return File.createTempFile(
            "JPEG_${timeStamp}_", /* prefix */
            ".jpg", /* suffix */
            storageDir /* directory */
        ).apply {
            // Save a file: path for use with ACTION_VIEW intents
            currentPhotoPath = absolutePath
        }
    }

}