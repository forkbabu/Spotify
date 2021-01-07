package defpackage;

import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: f4f  reason: default package */
public final /* synthetic */ class f4f implements l {
    public final /* synthetic */ com.spotify.voice.api.l a;

    public /* synthetic */ f4f(com.spotify.voice.api.l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.d dVar = (p2f.d) obj;
        this.a.d(dVar.b(), dVar.a());
        return s.i0(q2f.c(dVar.b(), dVar.a()));
    }
}
