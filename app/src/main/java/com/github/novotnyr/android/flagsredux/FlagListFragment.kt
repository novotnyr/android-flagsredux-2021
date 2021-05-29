package com.github.novotnyr.android.flagsredux

import android.os.Bundle
import android.view.View
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.transition.MaterialFade

class FlagListFragment : Fragment(R.layout.fragment_flag_list) {
    private lateinit var flagRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        postponeEnterTransition()
        view.doOnPreDraw { startPostponedEnterTransition() }

        flagRecyclerView = view.findViewById(R.id.flagRecyclerView)
        flagRecyclerView.adapter = FlagListAdapter { flag, flagViewHolder ->
            FlagListFragmentDirections
                .actionFlagListFragmentToFlagDetailFragment(flag)
                .let {
                    exitTransition = MaterialFade()
                    val flagTransitionName = flag.country
                    val extras = FragmentNavigatorExtras(flagViewHolder.flagImageView to flagTransitionName)
                    view.findNavController().navigate(it, extras)
                }
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