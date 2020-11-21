package io.magnaura.protocol

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

private const val DOMAIN = "compile"

object Command {

    const val SUBDOMAIN = "$DOMAIN/command"

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Request(
        val hash: String,
        val context: String,
        val command: String
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Response(val declarations: List<String> = emptyList())
}