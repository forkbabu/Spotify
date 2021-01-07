package defpackage;

import com.spotify.music.premiummini.k;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: ywc  reason: default package */
public final class ywc implements fjf<s<Boolean>> {
    private final wlf<k> a;

    public ywc(wlf<k> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        k kVar = this.a.get();
        h.e(kVar, "premiumMiniProperties");
        s<Boolean> b = kVar.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
