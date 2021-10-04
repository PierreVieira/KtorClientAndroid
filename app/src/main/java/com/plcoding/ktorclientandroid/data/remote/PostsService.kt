package com.plcoding.ktorclientandroid.data.remote

import com.plcoding.ktorclientandroid.data.remote.dto.PostRequest
import com.plcoding.ktorclientandroid.data.remote.dto.PostResponse

interface PostsService {
    suspend fun getPosts(): List<PostResponse>
    suspend fun createPost(postRequest: PostRequest): PostResponse?
}