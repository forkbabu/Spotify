package com.spotify.mobile.android.service;

import com.spotify.mobile.android.util.Assertion;
import java.util.Locale;
import java.util.Random;

/* access modifiers changed from: package-private */
public class m {
    private final cqe a;
    private final Random b;
    private long c = 0;

    m(cqe cqe, Random random) {
        this.a = cqe;
        this.b = random;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.b.nextDouble() >= 0.99d) {
            if (this.c != 0 && this.a.b() - this.c <= 250) {
                Assertion.v(String.format(Locale.US, "SpotifyService was stopped but was restarted. This is indicative of a leak. (Throttled 99%% on release, throttled 0%% on other variants).\nStop time: %d\nElapsed time: %d", Long.valueOf(this.c), Long.valueOf(this.a.b() - this.c)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.c = this.a.b();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.c = 0;
    }
}
