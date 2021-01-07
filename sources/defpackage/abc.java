package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.navigation.t;
import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: abc  reason: default package */
public final class abc implements fjf<zac> {
    private final wlf<t> a;
    private final wlf<z<NetworkErrorReason>> b;
    private final wlf<s<ng0>> c;
    private final wlf<h0> d;
    private final wlf<ere> e;
    private final wlf<Optional<Runnable>> f;

    public abc(wlf<t> wlf, wlf<z<NetworkErrorReason>> wlf2, wlf<s<ng0>> wlf3, wlf<h0> wlf4, wlf<ere> wlf5, wlf<Optional<Runnable>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static abc a(wlf<t> wlf, wlf<z<NetworkErrorReason>> wlf2, wlf<s<ng0>> wlf3, wlf<h0> wlf4, wlf<ere> wlf5, wlf<Optional<Runnable>> wlf6) {
        return new abc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    public static zac b(t tVar, z<NetworkErrorReason> zVar, s<ng0> sVar, h0 h0Var, ere ere, Optional<Runnable> optional) {
        return new zac(tVar, zVar, sVar, h0Var, ere, optional);
    }

    @Override // defpackage.wlf
    public Object get() {
        return b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
