package com.nexora.tenant.controller;

import com.nexora.tenant.controller.dto.CreateTenantRequest;
import com.nexora.tenant.controller.dto.TenantResponse;
import com.nexora.tenant.service.TenantService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/tenants")
public class TenantController {

    private final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping
    public ResponseEntity<TenantResponse> createTenant(
            @Valid @RequestBody CreateTenantRequest request
    ) {
        TenantResponse response = tenantService.createTenant(request);

        return ResponseEntity
                .created(URI.create("/api/v1/tenants/" + response.getId()))
                .body(response);
    }
}