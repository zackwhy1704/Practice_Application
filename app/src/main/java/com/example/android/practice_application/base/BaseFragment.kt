package com.example.android.practice_application.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.createViewModelLazy
import androidx.lifecycle.ViewModel
import kotlin.reflect.KClass

abstract class BaseFragment<VM : ViewModel, DB : ViewDataBinding> : Fragment() {
    //view model
    @Suppress("LeakingThis")
    protected val viewModel by createViewModelLazy(getViewModelCLass(), { this.viewModelStore })

    //data binding related to fragment
    protected val dataBinding: DB
        get() = binding!!

    //internal databinding
    private var binding: DB? = null

    //the view model [KClass], e.g. RocketsViewModel::class
    protected abstract fun getViewModelCLass(): KClass<VM>

    @LayoutRes
    protected abstract fun getContentLayoutId(): Int

    //anything needed to execute in onCreateView will be done here
    protected abstract fun onBindView()

    //Do not extend [onCreateView], do it in [onBindView]
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, getContentLayoutId(), container, false)
        dataBinding.lifecycleOwner = this
        onBindView()
        return dataBinding.root
    }

}