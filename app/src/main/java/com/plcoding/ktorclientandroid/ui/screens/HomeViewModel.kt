package com.plcoding.ktorclientandroid.ui.screens

import androidx.lifecycle.ViewModel
import com.plcoding.ktorclientandroid.data.remote.PostsService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val service: PostsService
) : ViewModel() {

    suspend fun getPosts() = service.getPosts()

}