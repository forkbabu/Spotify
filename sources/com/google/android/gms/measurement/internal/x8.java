package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.q7;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class x8 extends p9 {
    private String d;
    private boolean e;
    private long f;

    x8(r9 r9Var) {
        super(r9Var);
    }

    @Deprecated
    private final Pair<String, Boolean> w(String str) {
        super.b();
        ((d) super.d()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.d != null && elapsedRealtime < this.f) {
            return new Pair<>(this.d, Boolean.valueOf(this.e));
        }
        qa j = super.j();
        j.getClass();
        this.f = elapsedRealtime + j.n(str, t.b);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(super.i());
            if (advertisingIdInfo != null) {
                this.d = advertisingIdInfo.getId();
                this.e = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.d == null) {
                this.d = "";
            }
        } catch (Exception e2) {
            super.l().L().b("Unable to get advertising id", e2);
            this.d = "";
        }
        return new Pair<>(this.d, Boolean.valueOf(this.e));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.p9
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> u(String str, e eVar) {
        if (!q7.b() || !super.j().r(t.Q0) || eVar.m()) {
            return w(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String v(String str) {
        super.b();
        String str2 = (String) w(str).first;
        MessageDigest D0 = z9.D0();
        if (D0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, D0.digest(str2.getBytes())));
    }
}
