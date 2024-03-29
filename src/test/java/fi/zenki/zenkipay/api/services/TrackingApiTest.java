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
import fi.zenki.zenkipay.api.model.AddTracking;
import fi.zenki.zenkipay.api.model.AddTrackingEvent;
import fi.zenki.zenkipay.api.model.ErrorResponse;
import fi.zenki.zenkipay.api.model.Tracking;
import fi.zenki.zenkipay.api.model.TrackingEventsInner;
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
 * API tests for TrackingApi
 */
@Ignore
public class TrackingApiTest {

    private final TrackingApi api = new TrackingApi();

    /**
     * Shipping Status Update
     *
     * Based on the order id and the tracking id the delivery status is updated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEventTrackingTest() throws ApiException {
        String zenkiOrderId = null;
        String zenkiTrackId = null;
        String contentType = null;
        String accept = null;
        String X_ZENKI_PLUGIN_ID = null;
        String acceptLanguage = null;
        AddTrackingEvent addTrackingEvent = null;
        List<TrackingEventsInner> response = api.addEventTracking(zenkiOrderId, zenkiTrackId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, addTrackingEvent);

        // TODO: test validations
    }
    /**
     * Registration number for tracking
     *
     * One or more shipment tracking numbers are recorded for the order number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerTrackingOrdersTest() throws ApiException {
        String zenkiOrderId = null;
        String contentType = null;
        String accept = null;
        String X_ZENKI_PLUGIN_ID = null;
        String acceptLanguage = null;
        AddTracking addTracking = null;
        Tracking response = api.registerTrackingOrders(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, addTracking);

        // TODO: test validations
    }
}
