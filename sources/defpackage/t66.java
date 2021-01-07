package defpackage;

import com.google.common.base.Function;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;

/* renamed from: t66  reason: default package */
public final /* synthetic */ class t66 implements Function {
    public static final /* synthetic */ t66 a = new t66();

    private /* synthetic */ t66() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        o oVar = (o) obj;
        int i = d76.s;
        l.a a2 = l.a();
        a2.g(oVar);
        a2.f(String.valueOf(oVar.getUri().hashCode() + oVar.hashCode()));
        return a2.b();
    }
}
