package com.example.asistentedocumental.adapters

import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.FileProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.asistentedocumental.R
import com.example.asistentedocumental.models.OpenAndClose
import kotlinx.android.synthetic.main.activity_documentation.*
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList



class OpenAndCloseAdapter(val conformes: ArrayList<OpenAndClose>) :
    RecyclerView.Adapter<OpenAndCloseAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_noconformes, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return conformes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binbQuest(conformes[position])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val REQUEST_IMAGE_CAPTURE = 1
        fun binbQuest(noconforme: OpenAndClose) {
            var descripcion = itemView.findViewById<TextView>(R.id.textview_id)
            var retie = itemView.findViewById<TextView>(R.id.textview_ret)
            var cierre = itemView.findViewById<TextView>(R.id.textview_close)
            var button = itemView.findViewById<Button>(R.id.button_foto)
            descripcion.text = noconforme.descripcion
            retie.text = noconforme.retie
            cierre.text = noconforme.cierre
            button.setOnClickListener {
                //dispatchTakePictureIntent()
                /*
                val intent = Intent(this, ProyectAsigActivity::class.java)
                intent.putExtra("editOk", editOk)
                startActivity(intent)
                */
            }
        }

    }

}