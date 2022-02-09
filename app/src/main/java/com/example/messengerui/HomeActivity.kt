package com.example.messengerui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.messengerui.fragment.ChatsFragment
import com.example.messengerui.fragment.PeopleFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var navigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
       initViews()
    }


    private fun initViews() {
        navigationView = findViewById(R.id.nav_bottom)

        replaceFragment(ChatsFragment())
        navigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_chats -> replaceFragment(ChatsFragment())
                R.id.ic_people -> replaceFragment(PeopleFragment())

            }
//            return@setOnNavigationItemSelectedListener true
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_frg, fragment)
            commit()
        }
    }


}
