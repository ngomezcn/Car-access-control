package ngz.alpr.backend.models.api

import ngz.alpr.backend.interfaces.IApiResponse
import org.springframework.http.HttpStatus

data class ApiStatus(override val status: HttpStatus?, override val message: String?) : IApiResponse;
