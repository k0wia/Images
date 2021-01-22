package com.example.images

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImagesAdapter(private val images: List<images>)
    : RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>() {

    class ImagesViewHolder(itemVieW: View) : RecyclerView.ViewHolder(itemVieW) {
        val imageView: ImageView = itemVieW.findViewById(R.id.imageView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.images_item, parent, false)

        return ImagesViewHolder(view)

    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {

        val p = images[position]

        val currentUrl: String?= p.url

        Glide.with(holder.imageView.context)
            .load(currentUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(holder.imageView)

    }



    override fun getItemCount(): Int = images.size

}