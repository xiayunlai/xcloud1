package com.ruyue.xcloud.xcloud.services;

import com.ruyue.xcloud.xcloud.model.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicenseService {
    public License getLicense(String licenseId){
        return new License()
                .withId(licenseId)
                .withProductName("LicenseService-Create")
                .withOrganizationId(UUID.randomUUID().toString())
                .withOrganizationId("Test Product Name")
                .withLicenseType("PerSeat");
    }

    public void saveLicense(License license){

    }

    public void updateLicense(License license){

    }

    public void deleteLicense(License license){

    }
}
