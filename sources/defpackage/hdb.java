package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.ubi.specification.factories.q1;
import defpackage.gdb;
import kotlin.jvm.internal.h;

/* renamed from: hdb  reason: default package */
public final class hdb implements fjf<edb> {
    private final wlf<LegacyPlayerState> a;
    private final wlf<ere> b;
    private final wlf<q1> c;
    private final wlf<gl0<u>> d;

    public hdb(wlf<LegacyPlayerState> wlf, wlf<ere> wlf2, wlf<q1> wlf3, wlf<gl0<u>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static edb a(wlf<LegacyPlayerState> wlf, ere ere, q1 q1Var, gl0<u> gl0) {
        gdb.a aVar = gdb.a;
        h.e(wlf, "playerStateProvider");
        h.e(ere, "userBehaviourEventLogger");
        h.e(q1Var, "mobileLyricsEventFactory");
        h.e(gl0, "eventPublisher");
        return new fdb(wlf, ere, q1Var, gl0);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a, this.b.get(), this.c.get(), this.d.get());
    }
}
