package defpackage;

import defpackage.xya;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: o0b  reason: default package */
public class o0b implements w<xya.f, zya> {
    private final lz0 a;
    private final y b;

    public o0b(lz0 lz0, y yVar) {
        this.a = lz0;
        this.b = yVar;
    }

    public /* synthetic */ s a(String str) {
        return this.a.a(str).A(sza.a).P();
    }

    @Override // io.reactivex.w
    public v<zya> apply(s<xya.f> sVar) {
        return sVar.z(200, TimeUnit.MILLISECONDS, this.b).j0(b0b.a).q(new h0b(new rza(this), hza.a));
    }
}
