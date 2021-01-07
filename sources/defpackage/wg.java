package defpackage;

import com.google.android.datatransport.b;
import com.google.android.datatransport.c;
import com.google.android.datatransport.d;
import com.google.android.datatransport.e;
import com.google.android.datatransport.g;
import defpackage.kg;

/* renamed from: wg  reason: default package */
final class wg<T> implements e<T> {
    private final tg a;
    private final String b;
    private final b c;
    private final d<T, byte[]> d;
    private final xg e;

    wg(tg tgVar, String str, b bVar, d<T, byte[]> dVar, xg xgVar) {
        this.a = tgVar;
        this.b = str;
        this.c = bVar;
        this.d = dVar;
        this.e = xgVar;
    }

    @Override // com.google.android.datatransport.e
    public void a(c<T> cVar, g gVar) {
        xg xgVar = this.e;
        kg.b bVar = new kg.b();
        bVar.e(this.a);
        bVar.c(cVar);
        bVar.f(this.b);
        bVar.d(this.d);
        bVar.b(this.c);
        ((yg) xgVar).e(bVar.a(), gVar);
    }

    @Override // com.google.android.datatransport.e
    public void b(c<T> cVar) {
        a(cVar, vg.b());
    }
}
