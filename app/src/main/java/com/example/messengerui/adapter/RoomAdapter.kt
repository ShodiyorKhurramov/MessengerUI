package com.example.messengerui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerui.R
import com.example.messengerui.model.Room
import com.google.android.material.imageview.ShapeableImageView

class RoomAdapter(var context: Context, var items : ArrayList<Room>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_room_view,parent,false)
        return  MemberVievHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item=items[position]
        if(holder is MemberVievHolder){
            val tv_fullname=holder.tv_fullname
            val iv_profile=holder.iv_profile

            iv_profile .setImageResource(item.profile)
            tv_fullname.text=item.fullname

        }
    }
    class MemberVievHolder(view : View) : RecyclerView.ViewHolder(view){
        var iv_profile : ShapeableImageView
        var tv_fullname : TextView



        init {
            iv_profile=view.findViewById(R.id.iv_profile)
            tv_fullname=view.findViewById(R.id.tv_fullname)
        }

    }
}
