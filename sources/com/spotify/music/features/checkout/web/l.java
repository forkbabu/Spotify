package com.spotify.music.features.checkout.web;

import androidx.fragment.app.c;

public class l {
    private final a a;
    private final k b;

    public interface a {
    }

    public l(a aVar, k kVar) {
        this.a = aVar;
        this.b = kVar;
    }

    public boolean a() {
        boolean n5 = ((PremiumSignupFragment) this.a).n5();
        if (n5) {
            this.b.d();
        } else {
            this.b.b();
            c B2 = ((PremiumSignupFragment) this.a).B2();
            if (B2 != null) {
                B2.finish();
            }
        }
        return n5;
    }

    public void b() {
        this.b.b();
        c B2 = ((PremiumSignupFragment) this.a).B2();
        if (B2 != null) {
            B2.finish();
        }
    }

    public void c() {
        this.b.c();
    }
}
