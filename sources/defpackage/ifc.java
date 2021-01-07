package defpackage;

import com.spotify.playlist.endpoints.d;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: ifc  reason: default package */
public final class ifc<T> implements g<Integer> {
    final /* synthetic */ gfc a;
    final /* synthetic */ d.b b;

    ifc(gfc gfc, d.b bVar) {
        this.a = gfc;
        this.b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Integer num) {
        this.a.c.c(num.intValue());
        gfc.n(this.a);
        gfc gfc = this.a;
        gfc.p(this.b, gfc.c);
    }
}
