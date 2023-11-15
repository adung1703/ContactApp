package com.huudung.contactapp

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(val items : ArrayList<ItemData>) : RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val avatar = itemView.findViewById<ImageView>(R.id.avatar)
        val name = itemView.findViewById<TextView>(R.id.name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.avatar.setImageResource(items[position].avatar)
        holder.name.text = items[position].name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("id", items[position].id)
            intent.putExtra("name", items[position].name)
            intent.putExtra("phone", items[position].phone)
            intent.putExtra("email", items[position].mail)
            holder.itemView.context.startActivity(intent)
        }
        val popupMenu = PopupMenu(holder.itemView.context, holder.itemView)
        popupMenu.menuInflater.inflate(R.menu.my_menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.call -> {
                    val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${items[position].phone}"))
                    holder.itemView.context.startActivity(intent)
                    true
                }
                R.id.mess -> {
                    val intent = Intent(Intent.ACTION_SEND, Uri.parse("smsto:${items[position].phone}"))
                    holder.itemView.context.startActivity(intent)
                    true
                }
                R.id.mail -> {
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.type = "text/plain"
                    intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jan@example.com"))
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Email subject")
                    intent.putExtra(Intent.EXTRA_TEXT, "Email message text")
                    holder.itemView.context.startActivity(intent)
                    true
                }
                else -> false
            }
        }

        // Xử lý sự kiện khi icon menu được click
        holder.itemView.setOnLongClickListener {
            popupMenu.show()
            true
        }
    }
}