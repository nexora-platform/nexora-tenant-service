package com.nexora.tenant.exception;

public class DomainAlreadyExistsException extends RuntimeException {

    public DomainAlreadyExistsException(String domain) {
        super("Domain already exists: " + domain);
    }
}