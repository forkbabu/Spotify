package defpackage;

import defpackage.h1e;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.k;
import java.util.Map;

/* renamed from: z68  reason: default package */
public final /* synthetic */ class z68 implements l {
    public final /* synthetic */ g a;
    public final /* synthetic */ wlf b;
    public final /* synthetic */ wlf c;

    public /* synthetic */ z68(g gVar, wlf wlf, wlf wlf2) {
        this.a = gVar;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        g gVar = this.a;
        wlf wlf = this.b;
        wlf wlf2 = this.c;
        Map map = (Map) obj;
        boolean b2 = uxc.b(map);
        boolean e = uxc.e(map);
        h1e.a aVar = new h1e.a();
        if (b2 && e) {
            aVar.a((k) wlf2.get());
            aVar.a((k) wlf.get());
        }
        return gVar.l(aVar.b());
    }
}
