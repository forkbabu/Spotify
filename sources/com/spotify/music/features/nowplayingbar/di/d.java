package com.spotify.music.features.nowplayingbar.di;

import com.spotify.player.model.ContextTrack;
import defpackage.ifd;
import kotlin.jvm.internal.h;

public final class d implements fjf<String> {
    private final wlf<ifd.b> a;

    public d(wlf<ifd.b> wlf) {
        this.a = wlf;
    }

    public static String a(ifd.b bVar) {
        h.e(bVar, ContextTrack.Metadata.KEY_PROVIDER);
        ifd z1 = bVar.z1();
        h.d(z1, "provider.featureIdentifier");
        String name = z1.getName();
        yif.g(name, "Cannot return null from a non-@Nullable @Provides method");
        return name;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
