package com.ruyue.xcloud.xcloud.controllers;

import com.ruyue.xcloud.xcloud.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://127.0.0.1:8080/v1/organizations/123/licenses/abc-456
 */
@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicense(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId) {
        return new License().withId(licenseId).withProductName("Teleco").withLicenseType("Seat").withOrganizationId(organizationId);
    }
}
