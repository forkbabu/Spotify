package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.app.Activity;
import android.net.Uri;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.i;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import java.lang.ref.WeakReference;

public class k {
    private final a02 a;
    private final WeakReference<Activity> b;
    private final jz1 c;
    private final zk4 d;

    public k(Activity activity, a02 a02, jz1 jz1, zk4 zk4) {
        this.b = new WeakReference<>(activity);
        this.a = a02;
        this.c = jz1;
        this.d = zk4;
    }

    private void c(ViewUris.SubView subView, Uri uri) {
        Activity activity = this.b.get();
        if (activity != null) {
            this.d.d(activity, uri, subView);
        }
    }

    public void a(Offer offer, c cVar, ViewUris.SubView subView) {
        if (offer == null) {
            c(subView, Uri.parse(String.format("https://www.spotify.com/redirect/generic?redirect_key=android_%s&utm_source=spotify&utm_medium=premium_destination", "premium")));
            return;
        }
        Uri parse = Uri.parse(String.format("https://www.spotify.com/redirect/generic?redirect_key=android_%s&utm_source=spotify&utm_medium=premium_destination", "premium"));
        if (Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equals(offer.adTargetingKey())) {
            Activity activity = this.b.get();
            if (activity != null) {
                this.a.getClass();
                new zz1(activity).a();
            }
        } else if (Offer.AD_TARGETING_KEY_INTRO.equals(offer.adTargetingKey())) {
            c(subView, parse.buildUpon().appendQueryParameter("utm_campaign", "intro").appendQueryParameter("intro-offer", "1").build());
        } else if (Offer.AD_TARGETING_KEY_WINBACK.equals(offer.adTargetingKey())) {
            c(subView, parse.buildUpon().appendQueryParameter("utm_campaign", Offer.AD_TARGETING_KEY_WINBACK).build());
        } else if ("premium".equals(offer.adTargetingKey())) {
            c(subView, parse.buildUpon().appendQueryParameter("utm_campaign", "premium").build());
        } else if (Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(offer.adTargetingKey())) {
            c(subView, parse.buildUpon().appendQueryParameter("utm_campaign", "30dt").build());
        } else {
            c(subView, parse);
        }
    }

    public void b() {
        this.b.clear();
    }

    public void d(m91 m91) {
        this.c.a(m91);
    }

    public void e(t tVar, String str) {
        Activity activity = this.b.get();
        if (activity != null) {
            i.a c2 = i.c();
            c2.d(tVar);
            c2.h(Uri.parse(str));
            c2.e(false);
            this.d.a(activity, c2.a());
        }
    }
}
