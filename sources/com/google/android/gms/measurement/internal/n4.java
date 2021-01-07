package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.d;

/* access modifiers changed from: package-private */
public final class n4 extends b6 {
    static final Pair<String, Long> D = new Pair<>("", 0L);
    public final t4 A = new t4(this, "deferred_attribution_cache");
    public final r4 B = new r4(this, "deferred_attribution_cache_timestamp", 0);
    public final o4 C = new o4(this, "default_event_parameters");
    private SharedPreferences c;
    public q4 d;
    public final r4 e = new r4(this, "last_upload", 0);
    public final r4 f = new r4(this, "last_upload_attempt", 0);
    public final r4 g = new r4(this, "backoff", 0);
    public final r4 h = new r4(this, "last_delete_stale", 0);
    public final r4 i = new r4(this, "midnight_offset", 0);
    public final r4 j = new r4(this, "first_open_time", 0);
    public final r4 k = new r4(this, "app_install_time", 0);
    public final t4 l = new t4(this, "app_instance_id");
    private String m;
    private boolean n;
    private long o;
    public final r4 p = new r4(this, "time_before_start", 10000);
    public final r4 q = new r4(this, "session_timeout", 1800000);
    public final p4 r = new p4(this, "start_new_session", true);
    public final t4 s = new t4(this, "non_personalized_ads");
    public final p4 t = new p4(this, "allow_remote_dynamite", false);
    public final r4 u = new r4(this, "last_pause_time", 0);
    public boolean v;
    public p4 w = new p4(this, "app_backgrounded", false);
    public p4 x = new p4(this, "deep_link_retrieval_complete", false);
    public r4 y = new r4(this, "deep_link_retrieval_attempts", 0);
    public final t4 z = new t4(this, "firebase_feature_rollouts");

    n4(f5 f5Var) {
        super(f5Var);
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        return this.c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final void m() {
        SharedPreferences sharedPreferences = i().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.v = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new q4(this, "health_monitor", Math.max(0L, t.c.a(null).longValue()), null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> t(String str) {
        b();
        ((d) d()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.m != null && elapsedRealtime < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        qa j2 = j();
        j2.getClass();
        this.o = elapsedRealtime + j2.n(str, t.b);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(i());
            if (advertisingIdInfo != null) {
                this.m = advertisingIdInfo.getId();
                this.n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.m == null) {
                this.m = "";
            }
        } catch (Exception e2) {
            l().L().b("Unable to get advertising id", e2);
            this.m = "";
        }
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    /* access modifiers changed from: package-private */
    public final void u(Boolean bool) {
        b();
        SharedPreferences.Editor edit = x().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean v(long j2) {
        return j2 - this.q.a() > this.u.a();
    }

    /* access modifiers changed from: package-private */
    public final void w(boolean z2) {
        b();
        l().M().b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = x().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences x() {
        b();
        n();
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final Boolean y() {
        b();
        if (x().contains("measurement_enabled")) {
            return Boolean.valueOf(x().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final e z() {
        b();
        return e.b(x().getString("consent_settings", "G1"));
    }
}
