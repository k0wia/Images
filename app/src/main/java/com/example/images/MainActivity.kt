package com.example.images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val imagesList = ArrayList<images>()
        imagesList.add(images(1, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Mercury_in_color_-_Prockter07-edit1.jpg/1200px-Mercury_in_color_-_Prockter07-edit1.jpg"))
        imagesList.add(images(2, "https://upload.wikimedia.org/wikipedia/commons/a/a9/PIA23791-Venus-NewlyProcessedView-20200608.jpg"))
        imagesList.add(images(3, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/The_Earth_seen_from_Apollo_17.jpg/1200px-The_Earth_seen_from_Apollo_17.jpg"))
        imagesList.add(images(4, "https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg"))
        imagesList.add(images(5, "https://upload.wikimedia.org/wikipedia/commons/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg"))
        imagesList.add(images(6, "https://upload.wikimedia.org/wikipedia/commons/c/c7/Saturn_during_Equinox.jpg"))
        imagesList.add(images(7, "https://www.weatherboy.com/wp-content/uploads/2017/10/Uranus.jpg"))
        imagesList.add(images(8, "https://upload.wikimedia.org/wikipedia/commons/6/63/Neptune_-_Voyager_2_%2829347980845%29_flatten_crop.jpg"))

        val imagesAdapter = ImagesAdapter(imagesList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)


        recyclerView.adapter = imagesAdapter

    }
}