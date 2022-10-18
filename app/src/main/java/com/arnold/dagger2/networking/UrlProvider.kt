package com.arnold.dagger2.networking

import com.arnold.dagger2.Constants

class UrlProvider {

    fun getBaseUrl1(): String {
        return Constants.BASE_URL
    }

    fun getBaseUrl2(): String {
        return "base_url"
    }
}