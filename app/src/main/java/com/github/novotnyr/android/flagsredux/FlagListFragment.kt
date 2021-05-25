package com.github.novotnyr.android.flagsredux

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class FlagListFragment : Fragment(R.layout.fragment_flag_list) {
    private lateinit var flagRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        flagRecyclerView = view.findViewById(R.id.flagRecyclerView)
        flagRecyclerView.adapter = FlagListAdapter {
            TODO("Dopracovať klik na vlajku")
        }.apply {
            submitList(listOf(
                Flag("Austria", R.drawable.austria),
                Flag("Croatia", R.drawable.croatia),
                Flag("Czech Republic", R.drawable.czech),
                Flag("Germany", R.drawable.germany),
                Flag("Hungary", R.drawable.hungary),
                Flag("Poland", R.drawable.poland),
                Flag("Romania", R.drawable.romania),
                Flag("Serbia", R.drawable.serbia),
                Flag("Slovakia", R.drawable.slovakia),
                Flag("Slovenia", R.drawable.slovenia),
                Flag("Ukraine", R.drawable.ukraine),
            ))
        }
    }
}