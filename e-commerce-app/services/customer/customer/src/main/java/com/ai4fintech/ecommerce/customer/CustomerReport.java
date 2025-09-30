package com.ai4fintech.ecommerce.customer;

import jakarta.validation.constraints.NotNull;

public record CustomerReport(

        String id,

        @NotNull(message = "Customer firstName is required")
        String firstName,

        @NotNull(message = "Customer lastName is required")
        String lastName,

        @NotNull(message = "Customer email is required")
        @NotNull(message = "Customer email is not a valid email address")
        String email,

        Address address
) {
}
