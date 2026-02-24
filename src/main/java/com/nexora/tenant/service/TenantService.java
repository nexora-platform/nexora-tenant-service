package com.nexora.tenant.service;

import com.nexora.tenant.controller.dto.CreateTenantRequest;
import com.nexora.tenant.controller.dto.TenantResponse;
import com.nexora.tenant.entity.Tenant;
import com.nexora.tenant.entity.TenantStatus;
import com.nexora.tenant.exception.DomainAlreadyExistsException;
import com.nexora.tenant.repository.TenantRepository;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

    private final TenantRepository tenantRepository;

    public TenantService(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    public TenantResponse createTenant(CreateTenantRequest request) {

        if (tenantRepository.existsByDomain(request.getDomain())) {
            throw new DomainAlreadyExistsException(request.getDomain());
        }

        Tenant tenant = new Tenant();
        tenant.setName(request.getName());
        tenant.setDomain(request.getDomain());
        tenant.setStatus(TenantStatus.ACTIVE);

        Tenant savedTenant = tenantRepository.save(tenant);

        return new TenantResponse(
                savedTenant.getId(),
                savedTenant.getName(),
                savedTenant.getDomain(),
                savedTenant.getStatus(),
                savedTenant.getCreatedAt()
        );
    }
}