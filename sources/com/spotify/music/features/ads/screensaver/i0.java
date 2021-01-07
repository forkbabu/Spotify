package com.spotify.music.features.ads.screensaver;

import android.app.Activity;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.libs.thestage.config.TheStageUri;
import com.spotify.music.libs.thestage.d;
import com.spotify.music.navigation.t;

public class i0 {
    private final dv3 a;
    private final com.spotify.music.features.ads.i0 b;
    private final d c;
    private final t d;
    private final i80 e;

    public i0(dv3 dv3, com.spotify.music.features.ads.i0 i0Var, d dVar, t tVar, i80 i80) {
        this.a = dv3;
        this.b = i0Var;
        this.c = dVar;
        this.d = tVar;
        this.e = i80;
    }

    /* access modifiers changed from: protected */
    public void a(Ad ad, Activity activity) {
        if (l0.x(ad.clickUrl())) {
            this.d.d(ad.clickUrl());
        } else {
            Uri parse = Uri.parse(ad.clickUrl());
            Optional<TheStageUri> a2 = this.c.a(parse);
            if (a2.isPresent()) {
                this.c.b(activity, a2.get());
            } else {
                this.b.c(activity, this.e, ad.advertiser(), parse, ad.isInAppBrowser());
            }
        }
        this.a.a("clicked", ad.id());
    }

    /* access modifiers changed from: protected */
    public void b(Ad ad) {
        this.a.a("ended", ad.id());
    }
}
