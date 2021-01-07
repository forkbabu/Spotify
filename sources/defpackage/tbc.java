package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: tbc  reason: default package */
public final class tbc {
    private final s<Boolean> a;
    private final s<Boolean> b;
    private final s<Boolean> c;

    public tbc(s<Boolean> sVar, s<Boolean> sVar2, s<Boolean> sVar3) {
        this.a = sVar;
        this.b = sVar2;
        this.c = sVar3;
    }

    public z<NetworkErrorReason> a() {
        return s.m(this.a, this.b, this.c, lbc.a).T();
    }
}
