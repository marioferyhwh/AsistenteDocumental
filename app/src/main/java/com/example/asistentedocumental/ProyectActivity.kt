package com.example.asistentedocumental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_proyect.*

class ProyectActivity : AppCompatActivity() {

    var perfil: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyect)
        //documentos
        but_pr_doc.setOnClickListener {
            val intent = Intent(this, DocumentationActivity::class.java)
            startActivity(intent)
        }

        //inparcialidad
        but_pr_impar.setOnClickListener {
            //val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            //startActivity(intent)
        }
        //preliminar
        but_pr_pre.setOnClickListener {
            //val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            //startActivity(intent)
        }
        //hoja de vida
        but_pr_hv.setOnClickListener {
            // val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            // startActivity(intent)
        }
        //medicion de puesta a tierra
        but_pr_l_ground.setOnClickListener {
            //val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            //startActivity(intent)
        }
        //medicion continua
        but_pr_l_con.setOnClickListener {
            //val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            //startActivity(intent)
        }
        //variables electricas
        but_pr_l_var.setOnClickListener {
            //val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            // startActivity(intent)
        }
        //certificado retir
        but_pr_re_cert.setOnClickListener {
            //  val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            // startActivity(intent)
        }
        // esenciales
        but_pr_lv.setOnClickListener {
            val intent = Intent(this, ListVerfEsentialListActivity::class.java)
            startActivity(intent)
        }
        //finales
        but_pr_lv_end.setOnClickListener {
            val intent = Intent(this, ListVerfFinalListActivity::class.java)
            startActivity(intent)
        }
    }
}