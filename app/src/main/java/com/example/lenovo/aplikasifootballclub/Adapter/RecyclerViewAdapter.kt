package com.example.lenovo.aplikasifootballclub.Adapter

import android.content.Context
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.lenovo.aplikasifootballclub.Layout.ItemViewUI
import com.example.lenovo.aplikasifootballclub.Model.Item
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoContext


class RecyclerViewAdapter(private val context: Context, private val items: List<Item>,
                          private val listener: (Item) -> Unit) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(ItemViewUI().createView(AnkoContext.create(parent.context, parent)))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val name = view.findViewById<TextView>(Ids.name);
        private val image = view.findViewById<ImageView>(Ids.image);

        fun bindItem(items: Item, listener: (Item) -> Unit) {
            name.text = items.name;
            val deskripsi = items.deskripsi
            items.image?.let { Picasso.get().load(it).into(image) }

            itemView.setOnClickListener {
                listener(items)
            }
        }
    }

    public object Ids {
        val image = 1
        val name = 2
    }
}