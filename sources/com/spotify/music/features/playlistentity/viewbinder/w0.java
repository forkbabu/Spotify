package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import defpackage.ep6;
import java.util.Map;

/* access modifiers changed from: package-private */
public class w0 implements ep6.b {
    final /* synthetic */ LicenseLayout a;
    final /* synthetic */ Map b;
    final /* synthetic */ jp6 c;
    final /* synthetic */ q0 d;

    w0(q0 q0Var, LicenseLayout licenseLayout, Map map, jp6 jp6) {
        this.d = q0Var;
        this.a = licenseLayout;
        this.b = map;
        this.c = jp6;
    }

    @Override // defpackage.ep6.b
    public c f() {
        return this.d.j.a(this.a, this.b);
    }

    @Override // defpackage.jp6
    public LicenseLayout g() {
        return this.c.g();
    }
}
