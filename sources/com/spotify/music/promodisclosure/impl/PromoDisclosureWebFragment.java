package com.spotify.music.promodisclosure.impl;

import com.spotify.music.libs.web.WebViewFragment;
import defpackage.ifd;
import kotlin.jvm.internal.h;

public final class PromoDisclosureWebFragment extends WebViewFragment implements ifd.b {
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        if (Z4() != null) {
            g5("https://about-recommendations.spotify.com/");
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.Y0;
        h.d(ifd, "FeatureIdentifiers.PROMO_DISCLOSURE");
        return ifd;
    }
}
