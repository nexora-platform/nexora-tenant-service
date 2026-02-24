package com.nexora.tenant.controller.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateTenantRequest {

    @NotBlank(message = "Tenant name is required")
    private String name;

    @NotBlank(message = "Domain is required")
    private String domain;

    public CreateTenantRequest() {
    }

    public CreateTenantRequest(String name, String domain) {
        this.name = name;
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}