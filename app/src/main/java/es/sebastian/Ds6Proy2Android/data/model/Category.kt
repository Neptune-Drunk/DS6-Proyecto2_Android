package es.sebastian.Ds6Proy2Android.data.model

import com.google.gson.annotations.SerializedName

data class Category(
    val id: Int,
    @SerializedName("name") val nombre: String,
    @SerializedName("description") val descripcion: String?,
    @SerializedName("image") val imagen: String?
)
