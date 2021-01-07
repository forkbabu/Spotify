package com.spotify.remoteconfig;

import com.spotify.remoteconfig.fd;

public final /* synthetic */ class u implements o0e {
    public static final /* synthetic */ u a = new u();

    private /* synthetic */ u() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-add-to-playlist", "enable_filter", false);
        int c = p0e.c("android-feature-add-to-playlist", "filter_treshold", 0, 100, 6);
        boolean a3 = p0e.a("android-feature-add-to-playlist", "use_shimmering", false);
        fd.b bVar = new fd.b();
        bVar.b(false);
        bVar.c(6);
        bVar.d(false);
        bVar.b(a2);
        bVar.c(c);
        bVar.d(a3);
        a5 a4 = bVar.a();
        if (a4.b() >= 0 && a4.b() <= 100) {
            return a4;
        }
        throw new IllegalArgumentException("Value for filterTreshold() out of bounds");
    }
}
