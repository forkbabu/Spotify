package defpackage;

import com.adjust.sdk.Constants;
import okhttp3.u;
import okhttp3.y;
import retrofit2.adapter.rxjava2.g;
import retrofit2.w;

/* renamed from: m9e  reason: default package */
public final class m9e implements fjf<o9e> {
    private final wlf<y> a;
    private final wlf<String> b;

    public m9e(wlf<y> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static o9e a(y yVar, String str) {
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f(str);
        u c = aVar.c();
        w.b bVar = new w.b();
        bVar.g(yVar);
        bVar.d(c);
        bVar.b(dqf.c());
        bVar.a(g.e());
        o9e o9e = (o9e) bVar.e().d(o9e.class);
        yif.g(o9e, "Cannot return null from a non-@Nullable @Provides method");
        return o9e;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
