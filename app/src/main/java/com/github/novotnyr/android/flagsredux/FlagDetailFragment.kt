package com.github.novotnyr.android.flagsredux

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FlagDetailFragment : Fragment(R.layout.fragment_flag_detail) {
    private lateinit var flagImageView: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        flagImageView = view.findViewById(R.id.flagImageView)
    }
}