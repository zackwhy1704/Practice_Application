package com.example.android.practice_application.presentation.home

import com.example.android.practice_application.R
import com.example.android.practice_application.base.BaseFragment
import com.example.android.practice_application.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlin.reflect.KClass

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override fun getViewModelCLass(): KClass<HomeViewModel> = HomeViewModel::class

    override fun getContentLayoutId(): Int = R.layout.fragment_home

    override fun onBindView() {
        with(dataBinding) {
            viewModel = this@HomeFragment.viewModel
            executePendingBindings()
        }
    }

}