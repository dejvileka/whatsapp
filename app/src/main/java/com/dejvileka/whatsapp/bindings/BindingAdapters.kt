package com.dejvileka.whatsapp.bindings

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("image")
fun ImageView.setImage(uri: String?) {
    if (!uri.isNullOrEmpty())
        Glide.with(this.context).load(uri).into(this)
}