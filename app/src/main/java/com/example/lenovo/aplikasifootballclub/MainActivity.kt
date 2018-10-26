package com.example.lenovo.aplikasifootballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.lenovo.aplikasifootballclub.Adapter.RecyclerViewAdapter
import com.example.lenovo.aplikasifootballclub.Layout.MainActivityUI
import com.example.lenovo.aplikasifootballclub.Model.Item
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()
    var title = "Football"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)

        val list = findViewById<RecyclerView>(Ids.club_list)
        initData()
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = RecyclerViewAdapter(this, items) {
            //Intent Menggunakan ANKO dengan membawa String dengan deklarasi "$nama_string" to Isi
            startActivity<Detail_Club>("deskripsi" to it.deskripsi, "foto" to it.image)
        }
    }

    public object Ids {
        val club_list = 1
    }

    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val deskripsi = resources.getStringArray(R.array.club_detail)

        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i], image.getResourceId(i, 0), deskripsi[i]))
        }
        image.recycle()
    }
}



