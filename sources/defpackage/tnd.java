package defpackage;

import com.google.common.base.Optional;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.v;
import com.spotify.share.sharedata.w;
import io.reactivex.functions.c;

/* renamed from: tnd  reason: default package */
public final /* synthetic */ class tnd implements c {
    public final /* synthetic */ r a;

    public /* synthetic */ tnd(r rVar) {
        this.a = rVar;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        v vVar;
        r rVar = this.a;
        ynd ynd = (ynd) obj;
        Optional of = Optional.of(((h1d) obj2).b());
        String str = ynd.b() ? "canvas-cta-exp-2" : "canvas-v1";
        v c = rVar.c();
        if (c == null) {
            v.a a2 = v.a();
            a2.d(str);
            vVar = a2.build();
        } else {
            v.a a3 = v.a();
            a3.d(str);
            a3.e(c.b());
            a3.b(c.e());
            a3.c(c.f());
            a3.a(c.g());
            vVar = a3.build();
        }
        r.a h = r.h(rVar.g());
        h.c(rVar.a());
        h.d(rVar.e());
        h.a(rVar.f());
        h.b(vVar);
        return w.j(h.build(), ynd.a(), of);
    }
}
