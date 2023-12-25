package com.hieuvu.supanotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform