package com.ky.blogmultiplatform.data

import com.ky.blogmultiplatform.models.User

interface MongoRepository {
    suspend fun checkUserExistence(user: User): User?
}