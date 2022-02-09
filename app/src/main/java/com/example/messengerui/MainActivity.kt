package com.example.messengerui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerui.adapter.ChatAdapter
import com.example.messengerui.model.Chat
import com.example.messengerui.model.Message
import com.example.messengerui.model.Room

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView :RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))
       refreshAdapter(gatAllChats())
    }

    fun refreshAdapter(chats :ArrayList<Chat>){
        val adapter= ChatAdapter(this,chats)
        recyclerView.adapter=adapter
    }

    fun gatAllChats():ArrayList<Chat>{
        val storis:ArrayList<Room> = ArrayList<Room>()

        storis.add(Room(R.drawable.anonim_image,"ghvgyvyfkhjnjhdbjhj"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))
        storis.add(Room(R.drawable.anonim_image,"shodiyor"))


        val chats:ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(storis))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",false)))
        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",true)))

        chats.add(Chat(Message(R.drawable.anonim_image,"jjjjmdiyor",false)))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",true)))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",false)))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",false)))
        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",false)))
        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",true)))

        chats.add(Chat(Message(R.drawable.anonim_image,"jjjjmdiyor",false)))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",true)))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",false)))

        chats.add(Chat(Message(R.drawable.anonim_image,"shodiyor",false)))


        return chats
    }
}