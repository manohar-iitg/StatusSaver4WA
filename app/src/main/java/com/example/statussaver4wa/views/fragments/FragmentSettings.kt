package com.example.statussaver4wa.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.statussaver4wa.R
import com.example.statussaver4wa.databinding.FragmentSettingsBinding
import com.example.statussaver4wa.models.SettingsModel
import com.example.statussaver4wa.views.adapters.SettingsAdapter

class FragmentSettings : Fragment() {
    private val binding by lazy {
        FragmentSettingsBinding.inflate(layoutInflater)
    }
    private val list = ArrayList<SettingsModel>()
    private val adapter by lazy {
        SettingsAdapter(list, requireActivity())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            settingsRecyclerView.adapter = adapter

            list.add(
                SettingsModel(
                    title = "How to use",
                    desc = "Know how to download statuses"
                )
            )
            list.add(
                SettingsModel(
                    title = "Save in Folder",
                    desc = "/internalstorage/Documents/${getString(R.string.app_name)}"
                )
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root
}