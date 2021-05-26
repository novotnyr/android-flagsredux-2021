package com.github.novotnyr.android.flagsredux

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class FlagDetailFragment : Fragment(R.layout.fragment_flag_detail) {
    private lateinit var flagImageView: ImageView

    private val args: FlagDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        flagImageView = view.findViewById(R.id.flagImageView)
        flagImageView.setImageResource(args.flag.flagResource)
    }
}