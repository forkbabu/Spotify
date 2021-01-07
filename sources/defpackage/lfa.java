package defpackage;

import com.spotify.remoteconfig.i7;
import defpackage.kfa;
import kotlin.jvm.internal.h;

/* renamed from: lfa  reason: default package */
public final class lfa implements fjf<Integer> {
    private final wlf<i7> a;

    public lfa(wlf<i7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        i7 i7Var = this.a.get();
        kfa.a aVar = kfa.a;
        h.e(i7Var, "androidLibFollowFeedProperties");
        return Integer.valueOf(i7Var.b());
    }
}
