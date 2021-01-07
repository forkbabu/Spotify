package defpackage;

import androidx.fragment.app.c;
import com.google.common.base.Optional;
import defpackage.ij9;

/* renamed from: ozc  reason: default package */
public final class ozc implements fjf<jzc> {
    private final wlf<kzc> a;
    private final wlf<c> b;
    private final wlf<com.spotify.music.libs.viewuri.c> c;
    private final wlf<ij9.b> d;
    private final wlf<Optional<qzc>> e;

    public ozc(wlf<kzc> wlf, wlf<c> wlf2, wlf<com.spotify.music.libs.viewuri.c> wlf3, wlf<ij9.b> wlf4, wlf<Optional<qzc>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static ozc a(wlf<kzc> wlf, wlf<c> wlf2, wlf<com.spotify.music.libs.viewuri.c> wlf3, wlf<ij9.b> wlf4, wlf<Optional<qzc>> wlf5) {
        return new ozc(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    public static jzc b(kzc kzc, c cVar, com.spotify.music.libs.viewuri.c cVar2, ij9.b bVar, Optional<qzc> optional) {
        jzc a2 = kzc.a(cVar, cVar2, bVar, optional.orNull());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
