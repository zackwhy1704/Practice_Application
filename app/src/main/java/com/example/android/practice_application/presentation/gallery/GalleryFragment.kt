package com.example.android.practice_application.presentation.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.practice_application.R
import com.example.android.practice_application.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        val _binding: FragmentGalleryBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_gallery, container, false
        )

        val textView: TextView = _binding.textGallery
        mViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return _binding.root
    }

}
