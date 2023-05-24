package com.example.android.practice_application.presentation.rockets

import com.example.android.practice_application.R
import com.example.android.practice_application.base.BaseFragment
import com.example.android.practice_application.databinding.FragmentRocketsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlin.reflect.KClass

@AndroidEntryPoint
class RocketsFragment : BaseFragment<RocketsViewModel, FragmentRocketsBinding>() {

    override fun getViewModelCLass(): KClass<RocketsViewModel> = RocketsViewModel::class

    override fun getContentLayoutId(): Int = R.layout.fragment_rockets

    override fun onBindView() {
        with(dataBinding) {
            viewModel = this@RocketsFragment.viewModel
            executePendingBindings()
        }
    }

}
