package es.sebastian.Ds6Proy2Android.data.model

import com.google.gson.annotations.SerializedName

data class Product(
    val id: Int,
    @SerializedName("name") val nombre: String,
    @SerializedName("description") val descripcion: String?,
    @SerializedName("price") val precio: Double,
    @SerializedName("image") val imagenUrl: String?,
    @SerializedName("category_id") val categoriaId: Int?,
    @SerializedName("category") val categoria: String?
)
