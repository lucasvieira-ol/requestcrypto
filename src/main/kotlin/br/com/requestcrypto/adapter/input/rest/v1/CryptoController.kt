package br.com.requestcrypto.adapter.input.rest.v1

import br.com.requestcrypto.core.domain.dto.RequestDecodedDTO
import br.com.requestcrypto.core.domain.dto.RequestEncodedDTO
import br.com.requestcrypto.core.domain.dto.ResponseDecodedDTO
import br.com.requestcrypto.core.domain.dto.ResponseEncodedDTO
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Post

@Controller("v1")
class CryptoController {

    @Post("decrypt")
    fun decrypt(
        @Body requestEncoded: RequestEncodedDTO,
        @Header("encoded-key") encodedKey: String,
        @Header("token") token: String
    ): ResponseDecodedDTO {
        return ResponseDecodedDTO(requestEncoded)
    }

    @Post("encrypt")
    fun encrypt(@Body requestDecoded: RequestDecodedDTO): ResponseEncodedDTO {
        return ResponseEncodedDTO("", "")
    }
}