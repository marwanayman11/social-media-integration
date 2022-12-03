package com.example.socialmediaintegration

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("image")
fun bindImage(imageView: ImageView, url: String?) {
    url?.let {
        Picasso.get().load(url).placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(imageView)
    }
}