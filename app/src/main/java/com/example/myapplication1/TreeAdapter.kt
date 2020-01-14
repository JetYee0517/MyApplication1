package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TreeAdapter:RecyclerView.Adapter<TreeAdapter.ViewHolder>(){
    //not the code below
    private val images =
        intArrayOf(R.drawable.plantingtrees, R.drawable.no_plastic, R.drawable.no_straw)
    private val desc = arrayOf(
        "Plant a Tree and Get Free Oxygen",
        "Skip the straw,Save a sea turtles life",
        "Dont laminate the earth")
    private val points= arrayOf("800","900","1000")

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView =itemView.findViewById(R.id.imgViewTree)
        var itemDesc: TextView =itemView.findViewById(R.id.txtViewTree)
        var itemPoints: Button = itemView.findViewById(R.id.buttonPoints)



    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.activity_tree_display, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemImage.setImageResource(images[i])
        viewHolder.itemDesc.text = desc[i]
        viewHolder.itemPoints.setText(points[i])
    }

    override fun getItemCount(): Int {
        return desc.size
    }
}
