package au.edu.swin.sdmd.w07_booklist_solutions_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.booklist)

        list.adapter = BooklistAdapter()
        list.layoutManager = LinearLayoutManager(this)
    }
}