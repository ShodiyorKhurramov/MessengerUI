package com.example.messengerui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerui.R
import com.example.messengerui.adapter.ChatAdapter
import com.example.messengerui.model.Chat
import com.example.messengerui.model.Message
import com.example.messengerui.model.Room


class ChatsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(),R.color.white)
        val view = inflater.inflate(R.layout.fragment_chats, container, false)
        initView(view)
        return view
    }

    private fun initView(view :View) {
        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(requireContext(),1))
        refreshAdapter(gatAllChats())
    }

    fun refreshAdapter(chats :ArrayList<Chat>){
        val adapter= ChatAdapter(requireContext(),chats)
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