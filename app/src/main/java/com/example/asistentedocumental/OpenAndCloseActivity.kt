package com.example.asistentedocumental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asistentedocumental.adapters.OpenAndCloseAdapter
import com.example.asistentedocumental.models.OpenAndClose
import kotlinx.android.synthetic.main.activity_open_and_close.*

class OpenAndCloseActivity : AppCompatActivity() {
    var openandcloses = ArrayList<OpenAndClose>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_and_close)
        ReadOpenAndClose()
        recycleview_open_close.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleview_open_close.adapter = OpenAndCloseAdapter(openandcloses)
        but_open_close.setOnClickListener {
            openandcloses.add(OpenAndClose())
            recycleview_open_close.adapter = OpenAndCloseAdapter(openandcloses)
        }
    }

    fun ReadOpenAndClose() {
        openandcloses.add(OpenAndClose())
    }
}