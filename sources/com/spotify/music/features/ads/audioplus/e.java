package com.spotify.music.features.ads.audioplus;

import android.text.TextUtils;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.Image;
import java.util.List;

public class e {
    private final k a;

    public e(k kVar) {
        this.a = kVar;
    }

    public d a(Ad ad) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List<Image> images = ad.getImages();
        if (!TextUtils.isEmpty(ad.advertiser())) {
            str = ad.advertiser();
        } else {
            str = this.a.d();
        }
        if (!TextUtils.isEmpty(ad.getButtonText())) {
            str2 = ad.getButtonText();
        } else {
            str2 = this.a.e();
        }
        if (!images.isEmpty()) {
            String url = images.get(0).getUrl();
            if (url == null) {
                url = "";
            }
            str3 = url;
        } else {
            str3 = "";
        }
        if (ad.metadata().get(Ad.METADATA_PROMO_TYPE) == null) {
            str4 = "";
        } else {
            str4 = ad.metadata().get(Ad.METADATA_PROMO_TYPE);
        }
        if (ad.metadata().get(Ad.METADATA_PROMO_NAME) == null) {
            str5 = "";
        } else {
            str5 = ad.metadata().get(Ad.METADATA_PROMO_NAME);
        }
        if (ad.metadata().get(Ad.METADATA_PROMO_ENTITY) == null) {
            str6 = "";
        } else {
            str6 = ad.metadata().get(Ad.METADATA_PROMO_ENTITY);
        }
        if (ad.metadata().get(Ad.METADATA_PROMO_DETAILS) == null) {
            str7 = "";
        } else {
            str7 = ad.metadata().get(Ad.METADATA_PROMO_DETAILS);
        }
        return new b(ad.id(), str3, str, str2, ad.clickUrl(), str5, str6, str7, str4, ad.isBookmarkable(), ad.isBookmarked());
    }
}
