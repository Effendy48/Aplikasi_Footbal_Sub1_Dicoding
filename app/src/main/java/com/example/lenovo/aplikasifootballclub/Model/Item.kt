package com.example.lenovo.aplikasifootballclub.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (val name: String?, val image: Int? , val deskripsi: String?): Parcelable

