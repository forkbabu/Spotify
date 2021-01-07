package defpackage;

import android.os.Bundle;
import com.spotify.music.features.ads.audioplus.d;

/* renamed from: in3  reason: default package */
public final class in3 implements fjf<d> {
    private final wlf<Bundle> a;

    public in3(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    public static d a(Bundle bundle) {
        d dVar = (d) bundle.getParcelable("ad");
        yif.g(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
