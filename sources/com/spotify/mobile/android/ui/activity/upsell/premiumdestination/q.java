package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import io.reactivex.z;

public interface q {
    @zqf("offers-api/v2/promotions/premium-destination-android")
    z<l02> a(@nrf("country") String str, @nrf("locale") String str2, @nrf("device_id") String str3, @nrf("partner_id") String str4, @nrf("referrer_id") String str5, @nrf("build_model") String str6);
}
