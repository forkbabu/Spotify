package com.spotify.music.features.tasteonboarding;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.remoteconfig.v5;

public final class f implements tw0, q9c {
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("com.spotify.music.spotlets.tracker.adjust.adjustUri");
    private final l0e a;
    private final SpSharedPreferences<Object> b;

    public f(l0e l0e, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = l0e;
        this.b = spSharedPreferences;
    }

    @Override // defpackage.tw0
    public void a(Uri uri) {
        boolean z;
        String uri2 = uri.toString();
        if (MoreObjects.isNullOrEmpty(uri2)) {
            z = false;
        } else {
            z = l0.x(uri2);
        }
        if (z) {
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.f(c, uri2);
            b2.i();
        }
    }

    public void b() {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.h(c);
        b2.i();
    }

    public String c() {
        String n = this.b.n(c, "");
        if (MoreObjects.isNullOrEmpty(n)) {
            return n;
        }
        String B = l0.z(n).B();
        if (MoreObjects.isNullOrEmpty(B)) {
            return "";
        }
        return B;
    }

    public boolean d(c cVar, l0 l0Var) {
        boolean b2 = ((v5) this.a.a(b.a)).b();
        if (MoreObjects.isNullOrEmpty(this.b.n(c, "")) && !l0Var.u() && !l0Var.w()) {
            return false;
        }
        if ((cVar != null && "enabled".equals(cVar.M0(hq8.c))) || b2) {
            return true;
        }
        return false;
    }
}
