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
import com.example.messengerui.adapter.PeopelAdapter
import com.example.messengerui.model.Chat
import com.example.messengerui.model.Peopel
import com.example.messengerui.model.Room


class PeopleFragment : Fragment() {

lateinit var recyclerView :RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(),R.color.black)
        val view = inflater.inflate(R.layout.fragment_people, container, false)
            initView(view)
        return view
    }

    private fun initView(view :View) {
        recyclerView=view.findViewById(R.id.recyclerView2)
        recyclerView.setLayoutManager(GridLayoutManager(requireContext(),2))
        refreshAdapter(gatAllChats())
    }

    fun refreshAdapter(peopel :ArrayList<Peopel>){
        val adapter= PeopelAdapter(requireContext(),peopel)
        recyclerView.adapter=adapter
    }

    fun gatAllChats():ArrayList<Peopel> {

        val storis:ArrayList<Peopel> = ArrayList<Peopel>()
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))

        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))
        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))
        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))
        storis.add(Peopel(R.drawable.walking_image,"shodiyor",R.drawable.walking_image,))
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))
        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))
        storis.add(Peopel(R.drawable.walking_image,"shodiyor",R.drawable.walking_image,))
        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))
        storis.add(Peopel(R.drawable.anonim_image,"shodiyor",R.drawable.anonim_image,))
        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))
        storis.add(Peopel(R.drawable.hao_wen,"hao wen",R.drawable.hao_wen,))


        return  storis

    }


}