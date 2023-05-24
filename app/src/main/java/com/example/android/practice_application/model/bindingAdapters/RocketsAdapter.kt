package com.example.android.practice_application.model.bindingAdapters

import com.example.android.practice_application.R
import com.example.android.practice_application.base.BaseAdapter
import com.example.android.practice_application.databinding.ViewholderRocketsBinding
import com.example.android.practice_application.model.data.Rocket
import javax.inject.Inject

class RocketsAdapter @Inject constructor(private val rockets: MutableList<Rocket>) :
    BaseAdapter<ViewholderRocketsBinding,Rocket>(rockets) {

    override val layoutId: Int = R.layout.viewholder_rockets

    override fun getItemCount() =
        rockets.size

    override fun onBindView(binding: ViewholderRocketsBinding, item: Rocket) {
        binding.apply {
            rocket = item
            executePendingBindings()
        }
    }

}