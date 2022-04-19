package ru.netology.nmedia.data.impl

import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.data.PostRepository
import ru.netology.nmedia.dto.Post

class InMemoryPostRepository : PostRepository {

    override val data = MutableLiveData(
        Post(
            id = 0L,
            likes = 999,
            reposts = 9270,
            views = 2367,
        )
    )

    override fun like() {
        val currentPost = checkNotNull(data.value) {
            "Data value should not be null"
        }

        val modifiedPost = currentPost.copy(
            likedByMe = !currentPost.likedByMe,
            likes = currentPost.likes + if (!currentPost.likedByMe) 1 else -1
        )
        data.value = modifiedPost
    }

    override fun repost() {
        val currentPost = checkNotNull(data.value) {
            "Data value should not be null"
        }
        val modifiedPost = currentPost.copy(
            reposts = currentPost.reposts + 10
        )
        data.value = modifiedPost
    }

}