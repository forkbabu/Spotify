package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.qqe;

public final class f {
    private final rqe a;

    public f(String str, String str2) {
        this.a = je.Y("music", "mobile-ads-bookmark-button-android", "1.0.0", str, str2);
    }

    public nqe a(String str, String str2) {
        nqe.b f = nqe.f();
        f.e(this.a);
        qqe.b b = qqe.b();
        b.c("bookmark_ad");
        b.e(1);
        b.b("hit");
        b.d("ad_id", str);
        return (nqe) je.R(b, "ad_uri", str2, f);
    }

    public nqe b(String str, String str2) {
        nqe.b f = nqe.f();
        f.e(this.a);
        qqe.b b = qqe.b();
        b.c("remove_bookmark_ad");
        b.e(1);
        b.b("hit");
        b.d("ad_id", str);
        return (nqe) je.R(b, "ad_uri", str2, f);
    }
}
