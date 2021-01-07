package com.spotify.music.features.profile.profilelist;

import com.spotify.instrumentation.a;
import com.spotify.music.features.profile.profilelist.n;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public final class o implements fjf<qsd> {
    private final wlf<u> a;
    private final wlf<ProfileListMetadataResolver> b;

    public o(wlf<u> wlf, wlf<ProfileListMetadataResolver> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static qsd a(u uVar, ProfileListMetadataResolver profileListMetadataResolver) {
        n.a aVar = n.a;
        h.e(uVar, "profileListPageParameters");
        h.e(profileListMetadataResolver, "profileListMetadataResolver");
        xsd xsd = new xsd(profileListMetadataResolver.d());
        c e = profileListMetadataResolver.e();
        a c = profileListMetadataResolver.c();
        ifd ifd = kfd.A1;
        h.d(ifd, "FeatureIdentifiers.USER_PROFILES");
        return new qsd(xsd, e, c, ifd, uVar.getUri());
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
