package defpackage;

import com.spotify.music.premiummini.k;
import com.spotify.music.premiummini.l;
import com.spotify.remoteconfig.ia;
import kotlin.jvm.internal.h;

/* renamed from: axc  reason: default package */
public final class axc implements fjf<k> {
    private final wlf<ia> a;

    public axc(wlf<ia> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ia iaVar = this.a.get();
        h.e(iaVar, "androidLibsPremiumMiniProperties");
        return new l(iaVar);
    }
}
