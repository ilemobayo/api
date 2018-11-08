package com.openbanking.api.ng.payload.general;
import com.openbanking.api.ng.definition.BankCategory;

import lombok.Data;

@Data
public class BankMeta {
    private String bankName;
    private String headOfficeAddress;
    private String swiftCode;
    private String nibssCode;
    private String cbnBankCode;
    private String numberOfBranches;
    private String numberOfCountryCode;
    private String rc;
    private String incorporationDate;
    private String customerSupportPhone;
    private String customerSupportEmail;
    private String website;
    private BankCategory bankCategory = BankCategory.COMMERCIAL;

    private String socialMediaTypeAndAddress;
}
