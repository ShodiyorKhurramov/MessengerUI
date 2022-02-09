package com.example.messengerui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerui.R
import com.example.messengerui.model.Peopel
import com.google.android.material.imageview.ShapeableImageView


    class PeopelAdapter(var context: Context, var items : ArrayList<Peopel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


        override fun getItemCount(): Int {
            return items.size
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val view= LayoutInflater.from(parent.context).inflate(R.layout.item_peopelpage_view,parent,false)
            return  MemberVievHolder(view)

        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val item=items[position]
            if(holder is MemberVievHolder){
                val image1=holder.image1
                val image2=holder.image2
                val fullnamestrory=holder.tv_fullnamestrory

                 fullnamestrory.text=item.fullnamestory
                image1.setImageResource(item.image1)
                image2.setImageResource(item.image2)


            }
        }
        class MemberVievHolder(view : View) : RecyclerView.ViewHolder(view){
            var tv_fullnamestrory : TextView
            var image2 : ImageView
            var image1 : ShapeableImageView



            init {
                tv_fullnamestrory=view.findViewById(R.id.fullnamestory)
                image1=view.findViewById(R.id.image1)
                image2=view.findViewById(R.id.image2)
            }

        }
    }
