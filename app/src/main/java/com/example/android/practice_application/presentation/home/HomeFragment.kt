package com.example.android.practice_application.presentation.home

import android.widget.Toast
import com.example.android.practice_application.R
import com.example.android.practice_application.base.BaseFragment
import com.example.android.practice_application.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlin.reflect.KClass

@AndroidEntryPoint
class HomeFragment : actionCallBack,BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override fun getViewModelCLass(): KClass<HomeViewModel> = HomeViewModel::class

    override fun getContentLayoutId(): Int = R.layout.fragment_home

    override fun onBindView() {
        with(dataBinding) {
            viewModel = this@HomeFragment.viewModel
            executePendingBindings()
        }
        binding.textHome.setOnClickListener {
            onActionSuccess("scue")
        }

    }

    override fun onActionSuccess(result: String) {
        Toast.makeText(context,result,Toast.LENGTH_SHORT)
    }

}

interface actionCallBack {
    fun onActionSuccess(result: String)
}