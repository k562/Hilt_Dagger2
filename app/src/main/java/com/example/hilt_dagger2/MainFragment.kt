package com.example.hilt_dagger2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainFragment : Fragment() {


    @Inject
    lateinit var userRepository: UserRepository


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userRepository.saveUSer("kks@email.com", "123456")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

}