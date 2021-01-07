package defpackage;

import com.spotify.voice.api.l;
import defpackage.q2f;
import io.reactivex.functions.g;

/* renamed from: o6f  reason: default package */
public final /* synthetic */ class o6f implements g {
    public final /* synthetic */ l a;

    public /* synthetic */ o6f(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        q2f.c cVar = (q2f.c) obj;
        this.a.d(cVar.w(), cVar.v());
    }
}
