package defpackage;

import com.spotify.remoteconfig.ua;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: s2e  reason: default package */
public final class s2e implements r2e {
    private final List<o8e> a;
    private final f3e b;
    private final q7e c;
    private final w7e d;
    private final l9e e;
    private final ua f;
    private final u8e g;
    private List<o8e> h;

    public s2e(List<o8e> list, f3e f3e, q7e q7e, w7e w7e, l9e l9e, ua uaVar, u8e u8e) {
        this.a = list;
        this.b = f3e;
        this.c = q7e;
        this.d = w7e;
        this.e = l9e;
        this.f = uaVar;
        this.g = u8e;
    }

    private List<o8e> c() {
        List<o8e> list = this.h;
        if (!(list == null || list.isEmpty())) {
            return this.h;
        }
        ArrayList arrayList = new ArrayList();
        for (o8e o8e : this.a) {
            if (this.b.a(o8e) && this.c.a(o8e)) {
                arrayList.add(o8e);
            }
        }
        this.h = arrayList;
        return arrayList;
    }

    @Override // defpackage.r2e
    public List<o8e> a() {
        return c();
    }

    @Override // defpackage.r2e
    public z<List<o8e>> b(String str) {
        if (!this.f.a()) {
            return z.z(c());
        }
        if (this.d.a(str)) {
            return this.e.a(str, c()).p(new n2e(this, str)).m(new o2e(this, str)).F(c());
        }
        throw new IllegalArgumentException("Illegal integration id");
    }

    public /* synthetic */ void d(String str, List list) {
        this.g.b(str, list);
    }

    public /* synthetic */ void e(String str, Throwable th) {
        this.g.b(str, c());
    }
}
