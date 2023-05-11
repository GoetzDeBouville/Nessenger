@file:Suppress("DEPRECATION")

package com.example.nessenger.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.nessenger.Fragments.Home
import com.example.nessenger.Fragments.Profile
import com.example.nessenger.Fragments.Settings

internal class MyAdapter(var context : Context, fm : FragmentManager, private var totalTabs : Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                Home()
            }

            1 -> {
                Profile()
            }

            2 -> {
                Settings()
            }

            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}