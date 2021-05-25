package com.github.novotnyr.android.flagsredux

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
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

class FlagListAdapter(val clickListener: (Flag) -> Unit) : ListAdapter<Flag, FlagViewHolder>(FlagDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlagViewHolder {
        return LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_flag, parent, false)
            .let(::FlagViewHolder)
    }

    override fun onBindViewHolder(holder: FlagViewHolder, position: Int) {
        val flag = getItem(position)
        holder.bind(flag)
        holder.itemView.setOnClickListener {
            clickListener(flag)
        }
    }
}