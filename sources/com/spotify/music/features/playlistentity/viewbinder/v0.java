package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import defpackage.pp6;
import java.util.Map;

/* access modifiers changed from: package-private */
public class v0 implements pp6.a {
    final /* synthetic */ LicenseLayout a;
    final /* synthetic */ Map b;
    final /* synthetic */ jp6 c;
    final /* synthetic */ q0 d;

    v0(q0 q0Var, LicenseLayout licenseLayout, Map map, jp6 jp6) {
        this.d = q0Var;
        this.a = licenseLayout;
        this.b = map;
        this.c = jp6;
    }

    @Override // defpackage.pp6.a
    public ToolbarConfiguration a() {
        return this.d.j.j(this.a, this.b);
    }

    @Override // defpackage.jp6
    public LicenseLayout g() {
        return this.c.g();
    }
}
