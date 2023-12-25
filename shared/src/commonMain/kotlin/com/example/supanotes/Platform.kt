package com.example.supanotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform