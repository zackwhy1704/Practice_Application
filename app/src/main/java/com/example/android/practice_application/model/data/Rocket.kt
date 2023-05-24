package com.example.android.practice_application.model.data

import com.example.android.practice_application.base.ListAdapterItem
import java.io.Serializable


data class Rocket(
    val name: String,
    val images: List<String>,
    override val id: Long = 0
) : ListAdapterItem, Serializable
