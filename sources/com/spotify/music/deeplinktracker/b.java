package com.spotify.music.deeplinktracker;

import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.l0;
import com.spotify.remoteconfig.sa;

public class b {
    private final sa a;
    private final r4e b;
    private final e c;
    private final s3e d;
    private final d e;

    public b(r4e r4e, sa saVar, e eVar, s3e s3e, d dVar) {
        this.a = saVar;
        this.b = r4e;
        this.c = eVar;
        this.d = s3e;
        this.e = dVar;
    }

    public void a(Intent intent, l0 l0Var) {
        String str;
        if (this.a.c()) {
            Assertion.e(intent);
            Assertion.e(l0Var);
            boolean z = false;
            if (intent.getExtras() != null) {
                boolean z2 = ((yn0) intent.getParcelableExtra("FeatureIdentifier.InternalReferrer")) != null;
                boolean hasExtra = intent.hasExtra("extra_interaction_id");
                boolean z3 = intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER");
                if ((intent.hasExtra("is_internal_navigation") && !l0Var.u()) || z2 || hasExtra || z3) {
                    z = true;
                }
            }
            if (!z) {
                String a2 = this.e.a(intent);
                if (l0Var.w() || l0Var.v() || l0Var.u() || l0Var.t() || (this.a.a() && !MoreObjects.isNullOrEmpty(a2))) {
                    String dataString = intent.getDataString();
                    String str2 = dataString == null ? "" : dataString;
                    String B = l0Var.B();
                    if (B == null) {
                        str = "";
                    } else {
                        str = B;
                    }
                    String a3 = this.d.a();
                    String stringExtra = intent.getStringExtra("short_link");
                    String stringExtra2 = intent.getStringExtra("shortlink_source");
                    if (stringExtra == null || stringExtra2 == null) {
                        this.b.b(str2, str, a3, a2);
                    } else {
                        this.b.d(str2, str, a3, a2, stringExtra, stringExtra2);
                    }
                    ((PlaybackFromDeeplinkTrackerImpl) this.c).f(a3);
                }
            }
        }
    }
}
