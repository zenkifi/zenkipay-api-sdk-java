/*
 * Zenkipay API
 * Definition of technical specification of the product; Zenkipay is a gateway cryptocurrency payment system that allows merchant's to receive payments on their e-commerce portals. Unlike other platforms, Zenkipay ensures customer satisfaction through its payment process. guarantee deposit (delivered product and expected quality) to settle payment to the merchant, thus avoiding the loss of client assets due to online scams.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@zenki.fi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fi.zenki.zenkipay.api.services;

import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.model.ErrorResponse;
import fi.zenki.zenkipay.api.model.Merchant;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantsApi
 */
@Ignore
public class MerchantsApiTest {

    private final MerchantsApi api = new MerchantsApi();

    /**
     * Merchant information
     *
     * The current configuration of the merchnat is obtained.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantInfoTest() throws ApiException {
        String contentType = null;
        String accept = null;
        String X_ZENKI_PLUGIN_ID = null;
        String acceptLanguage = null;
        Merchant response = api.getMerchantInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);

        // TODO: test validations
    }
}
