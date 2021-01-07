package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import defpackage.np6;
import java.util.Map;

/* access modifiers changed from: package-private */
public class x0 implements np6.a {
    final /* synthetic */ LicenseLayout a;
    final /* synthetic */ Map b;
    final /* synthetic */ jp6 c;
    final /* synthetic */ q0 d;

    x0(q0 q0Var, LicenseLayout licenseLayout, Map map, jp6 jp6) {
        this.d = q0Var;
        this.a = licenseLayout;
        this.b = map;
        this.c = jp6;
    }

    @Override // defpackage.np6.a
    public ItemListConfiguration d() {
        return this.d.j.d(this.a, this.b);
    }

    @Override // defpackage.jp6
    public LicenseLayout g() {
        return this.c.g();
    }
}
