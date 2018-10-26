package com.example.lenovo.aplikasifootballclub.Layout

import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.lenovo.aplikasifootballclub.Adapter.RecyclerViewAdapter
import com.example.lenovo.aplikasifootballclub.Detail_Club
import com.example.lenovo.aplikasifootballclub.MainActivity
import com.example.lenovo.aplikasifootballclub.R
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        scrollView {
            recyclerView() {
                id = MainActivity.Ids.club_list

            }.lparams(width = matchParent, height = wrapContent) {

            }
        }
    }
}

class DetailClubUi : AnkoComponent<Detail_Club> {
    override fun createView(ui: AnkoContext<Detail_Club>) = with(ui) {
        verticalLayout {
            padding = dip(16)

            imageView() {
                id = Detail_Club.Ids.iv_detail_club
            }.lparams {

                width = dip(100)
                height = dip(100)
                gravity = Gravity.CENTER_HORIZONTAL

            }
            textView() {
                id = Detail_Club.Ids.tv_detail_club
                width = matchParent
                height = wrapContent
                gravity = Gravity.CENTER_HORIZONTAL
            }.lparams(width = matchParent) {
                height = matchParent
                margin = dip(10)
            }
        }
    }

}

class ItemViewUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.HORIZONTAL
            imageView {
                id = RecyclerViewAdapter.Ids.image

            }.lparams(width = dip(50), height = dip(50)) {
                margin = dip(10)
            }
            textView {
                id = RecyclerViewAdapter.Ids.name
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }
    }

}
