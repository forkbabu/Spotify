package defpackage;

import com.adjust.sdk.Constants;
import okhttp3.u;
import okhttp3.y;
import retrofit2.adapter.rxjava2.g;
import retrofit2.w;

/* renamed from: z3e  reason: default package */
public final class z3e implements fjf<i4e> {
    private final wlf<y> a;
    private final wlf<String> b;

    public z3e(wlf<y> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static i4e a(y yVar, String str) {
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f(str);
        u c = aVar.c();
        w.b bVar = new w.b();
        bVar.g(yVar);
        bVar.d(c);
        bVar.b(gqf.c());
        bVar.a(g.e());
        i4e i4e = (i4e) bVar.e().d(i4e.class);
        yif.g(i4e, "Cannot return null from a non-@Nullable @Provides method");
        return i4e;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
