package com.example.firebaseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebaseproject.adapters.ViewPagerAdapter
import com.example.firebaseproject.fragments.FavoritesFragment
import com.example.firebaseproject.fragments.HomeFragment
import com.example.firebaseproject.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_new.*
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*


class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)




        val actionBar = supportActionBar
        actionBar!!.title = "Main Menu"
        actionBar.setDisplayHomeAsUpEnabled(true)
        setUpTabs()



    }
    private fun setUpTabs(){
        val adapter= ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoritesFragment(),"Favorites")
        adapter.addFragment(SettingsFragment(),"Settings")
        viewPager.adapter=adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
    }
}







