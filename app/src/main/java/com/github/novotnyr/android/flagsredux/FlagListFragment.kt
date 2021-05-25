package com.github.novotnyr.android.flagsredux

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class FlagListFragment : Fragment(R.layout.fragment_flag_list) {
    private lateinit var flagRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        flagRecyclerView = view.findViewById(R.id.flagRecyclerView)
    }
}