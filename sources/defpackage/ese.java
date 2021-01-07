package defpackage;

import com.spotify.audiorecord.api.e;
import com.spotify.voice.api.model.l;
import io.reactivex.functions.g;

/* renamed from: ese  reason: default package */
public final /* synthetic */ class ese implements g {
    public final /* synthetic */ l a;
    public final /* synthetic */ sse b;
    public final /* synthetic */ mte c;
    public final /* synthetic */ e f;

    public /* synthetic */ ese(l lVar, sse sse, mte mte, e eVar) {
        this.a = lVar;
        this.b = sse;
        this.c = mte;
        this.f = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        l lVar = this.a;
        sse sse = this.b;
        mte mte = this.c;
        e eVar = this.f;
        vpf vpf = (vpf) obj;
        if (!lVar.a().c()) {
            new jte(sse.a, lVar.b().name(), mte).a(eVar.c());
        }
    }
}
