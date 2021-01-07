package defpackage;

import com.spotify.voice.api.model.m;
import com.spotify.voice.api.n;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: xaf  reason: default package */
public final /* synthetic */ class xaf implements l {
    public final /* synthetic */ n a;

    public /* synthetic */ xaf(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.u uVar = (kef.u) obj;
        g<m> a2 = this.a.a();
        return je.Z(a2, a2).j0(daf.a).r0(tdf.a);
    }
}
