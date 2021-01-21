package com.example.gapotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gapotest.Adapter.ViewPagerAdapter
import com.example.gapotest.Fragment.FollowFragment
import com.example.gapotest.Fragment.FootballFragment
import com.example.gapotest.Fragment.ForYouFragment
import com.example.gapotest.Fragment.TechnologyFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun setupTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FollowFragment(),"Theo dõi")
        adapter.addFragment(ForYouFragment(),"Cho bạn")
        adapter.addFragment(FootballFragment(),"Bóng đá")
        adapter.addFragment(TechnologyFragment(),"Công nghệ")


    }
}