package defpackage;

import com.spotify.audiorecord.api.e;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: gse  reason: default package */
public final /* synthetic */ class gse implements l {
    public final /* synthetic */ g a;
    public final /* synthetic */ e b;

    public /* synthetic */ gse(g gVar, e eVar) {
        this.a = gVar;
        this.b = eVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return g.P(this.a.O(new ose(this.b)), (g) obj);
    }
}
