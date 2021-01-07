package defpackage;

import com.spotify.music.connection.l;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: xlb  reason: default package */
public final class xlb implements fjf<g<com.spotify.music.connection.g>> {
    private final wlf<l> a;

    public xlb(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        l lVar = this.a.get();
        h.e(lVar, "rxConnectionState");
        return lVar.a().Y0(BackpressureStrategy.LATEST);
    }
}
