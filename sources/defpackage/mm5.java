package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.languagepicker.model.f;

/* renamed from: mm5  reason: default package */
public final class mm5 implements fjf<f> {
    private final wlf<u> a;

    public mm5(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f fVar = (f) this.a.get().c(f.class);
        yif.g(fVar, "Cannot return null from a non-@Nullable @Provides method");
        return fVar;
    }
}
