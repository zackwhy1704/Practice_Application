package com.example.android.practice_application.presentation.gallery

import com.example.android.practice_application.R
import com.example.android.practice_application.base.BaseFragment
import com.example.android.practice_application.databinding.FragmentGalleryBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlin.reflect.KClass

@AndroidEntryPoint
class GalleryFragment : BaseFragment<GalleryViewModel, FragmentGalleryBinding>() {

    override fun getViewModelCLass(): KClass<GalleryViewModel> = GalleryViewModel::class

    override fun getContentLayoutId(): Int = R.layout.fragment_gallery

    override fun onBindView() {
        with(dataBinding) {
            viewModel = this@GalleryFragment.viewModel
            executePendingBindings()
        }
    }

}
