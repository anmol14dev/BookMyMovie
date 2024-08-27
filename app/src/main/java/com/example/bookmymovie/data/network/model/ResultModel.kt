package com.example.bookmymovie.data.network.model

data class ResultModel<T>(
    val data: T? = null,
    val status: Status,
    val message: String? = null
) {
    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }
}
