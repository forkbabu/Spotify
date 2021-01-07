package com.spotify.music.features.profile.entity;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.profile.entity.l;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public final class m implements fjf<qsd> {
    private final wlf<t> a;

    public m(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t tVar = this.a.get();
        l.a aVar = l.a;
        h.e(tVar, "profileEntityPageParameters");
        ysd ysd = new ysd("");
        c a2 = c.a(tVar.b());
        h.d(a2, "ViewUri.create(profileEn…ageParameters.profileUri)");
        PageIdentifiers pageIdentifiers = PageIdentifiers.PROFILE;
        ifd ifd = kfd.z1;
        h.d(ifd, "FeatureIdentifiers.USER_PROFILE");
        return new qsd(ysd, a2, pageIdentifiers, ifd, tVar.b());
    }
}
