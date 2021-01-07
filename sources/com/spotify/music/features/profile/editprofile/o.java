package com.spotify.music.features.profile.editprofile;

import com.spotify.music.features.profile.editprofile.permissions.EditProfilePermissionsManager;
import com.spotify.music.features.profile.editprofile.utils.a;
import io.reactivex.y;

public final class o implements fjf<n> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<po7> d;
    private final wlf<EditProfilePermissionsManager> e;
    private final wlf<hn7> f;
    private final wlf<a> g;
    private final wlf<gu7> h;
    private final wlf<p> i;

    public o(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<po7> wlf4, wlf<EditProfilePermissionsManager> wlf5, wlf<hn7> wlf6, wlf<a> wlf7, wlf<gu7> wlf8, wlf<p> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
