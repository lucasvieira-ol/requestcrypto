package br.com.requestcrypto.core.domain.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable

@Introspected
@Serdeable.Deserializable
data class ResponseEncodedDTO(
    @field:JsonProperty("content") val content: String,
    @field:JsonProperty("encoded-key") val encodedKey: String
)
