package com.example.lenovo.aplikasifootballclub

import android.os.Bundle
import org.jetbrains.anko.*
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import kotlinx.android.synthetic.*
import android.widget.TextView
import com.example.lenovo.aplikasifootballclub.Layout.DetailClubUi
import com.squareup.picasso.Picasso

class Detail_Club : AppCompatActivity() {
    var deskripsiClub = ""
    var fotoClub = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailClubUi().setContentView(this)
        deskripsiClub = intent.getStringExtra("deskripsi")
        fotoClub = intent.getIntExtra("foto", 0)


        val TvDeskripsiKlub: TextView = findViewById(Ids.tv_detail_club)
        val IvDeskripsiKlub: ImageView = findViewById(Ids.iv_detail_club)


        TvDeskripsiKlub.text = deskripsiClub
        Picasso.get().load(fotoClub).into(IvDeskripsiKlub)

    }

    public object Ids {
        var tv_detail_club = 1
        var iv_detail_club = 2
    }
}




