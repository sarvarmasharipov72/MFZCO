package com.example.mfzco.ui.auth_check

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mfzco.R

class AuthCheckFragment : Fragment() {

    companion object {
        fun newInstance() = AuthCheckFragment()
    }

    private lateinit var viewModel: AuthCheckViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_auth_check, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthCheckViewModel::class.java)
        // TODO: Use the ViewModel
    }

}