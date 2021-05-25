package com.github.novotnyr.android.flagsredux

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

object FlagDiff : DiffUtil.ItemCallback<Flag>() {
    override fun areItemsTheSame(old: Flag, new: Flag): Boolean {
        return old == new
    }

    override fun areContentsTheSame(old: Flag, new: Flag): Boolean {
        return old == new
    }
}

class FlagViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val flagImageView: ImageView = itemView.findViewById(R.id.flagImageView)
    val countryTextView: TextView = itemView.findViewById(R.id.countryTextView)

    fun bind(flag: Flag) {
        flagImageView.setImageResource(flag.flagResource)
        countryTextView.text = flag.country
    }
}