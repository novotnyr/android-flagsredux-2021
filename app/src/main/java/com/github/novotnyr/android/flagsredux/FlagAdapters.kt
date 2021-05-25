package com.github.novotnyr.android.flagsredux

import androidx.recyclerview.widget.DiffUtil

object FlagDiff : DiffUtil.ItemCallback<Flag>() {
    override fun areItemsTheSame(old: Flag, new: Flag): Boolean {
        return old == new
    }

    override fun areContentsTheSame(old: Flag, new: Flag): Boolean {
        return old == new
    }
}

