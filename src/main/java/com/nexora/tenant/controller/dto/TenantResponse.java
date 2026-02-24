package com.nexora.tenant.controller.dto;

import com.nexora.tenant.entity.TenantStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class TenantResponse {

    private UUID id;
    private String name;
    private String domain;
    private TenantStatus status;
    private LocalDateTime createdAt;

    public TenantResponse(UUID id, String name, String domain, TenantStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.status = status;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public TenantStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}