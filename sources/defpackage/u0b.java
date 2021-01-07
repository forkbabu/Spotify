package defpackage;

import com.spotify.libs.search.history.i;
import defpackage.xya;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: u0b  reason: default package */
public class u0b implements w<xya.i, zya> {
    private final i a;

    public u0b(i iVar) {
        iVar.getClass();
        this.a = iVar;
    }

    public /* synthetic */ xya.i a(xya.i iVar) {
        this.a.f(iVar.a());
        return iVar;
    }

    @Override // io.reactivex.w
    public v<zya> apply(s<xya.i> sVar) {
        return sVar.j0(new xza(this)).j0(yza.a);
    }
}
