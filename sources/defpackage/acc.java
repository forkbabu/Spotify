package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.s;

/* renamed from: acc  reason: default package */
public final class acc implements fjf<s<Boolean>> {
    private final wlf<s<g>> a;

    public acc(wlf<s<g>> wlf) {
        this.a = wlf;
    }

    public static s<Boolean> a(s<g> sVar) {
        return sVar.j0(nbc.a).E();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
