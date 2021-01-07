package defpackage;

import android.os.Bundle;
import com.spotify.music.features.ads.audioplus.d;

/* renamed from: eo3  reason: default package */
public final class eo3 implements fjf<d> {
    private final wlf<Bundle> a;

    public eo3(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = (d) this.a.get().getParcelable("ad");
        yif.g(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
