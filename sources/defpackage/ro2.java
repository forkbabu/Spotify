package defpackage;

import com.spotify.music.connection.l;
import io.reactivex.s;

/* renamed from: ro2  reason: default package */
public final class ro2 implements fjf<s<Boolean>> {
    private final wlf<l> a;

    public ro2(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b();
    }
}
