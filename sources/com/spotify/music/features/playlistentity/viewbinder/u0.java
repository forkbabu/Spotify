package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.e;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.configuration.h;
import defpackage.lp6;

/* access modifiers changed from: package-private */
public class u0 implements lp6.a {
    final /* synthetic */ LicenseLayout a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jp6 c;
    final /* synthetic */ q0 d;

    u0(q0 q0Var, LicenseLayout licenseLayout, boolean z, jp6 jp6) {
        this.d = q0Var;
        this.a = licenseLayout;
        this.b = z;
        this.c = jp6;
    }

    @Override // defpackage.lp6.a
    public h b() {
        return this.d.j.i(this.a);
    }

    @Override // defpackage.lp6.a
    public e c() {
        return this.d.j.e(this.a);
    }

    @Override // defpackage.lp6.a
    public g e() {
        return this.d.j.h(this.a, this.b);
    }

    @Override // defpackage.jp6
    public LicenseLayout g() {
        return this.c.g();
    }
}
