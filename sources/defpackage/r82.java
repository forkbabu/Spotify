package defpackage;

import com.spotify.mobile.android.video.offline.d0;
import com.spotify.mobile.android.video.offline.f0;
import com.spotify.mobile.android.video.offline.r;
import com.spotify.mobile.android.video.offline.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r82  reason: default package */
public class r82 {
    private final List<s> a;
    private final Map<d0, List<r>> b = new HashMap(3);
    private final cqe c;

    /* access modifiers changed from: package-private */
    /* renamed from: r82$a */
    public interface a {
        void a(r rVar, d0 d0Var);
    }

    public r82(List<s> list, cqe cqe) {
        this.a = new ArrayList(list);
        this.c = cqe;
    }

    private long b() {
        return this.c.d();
    }

    private Map.Entry<d0, List<r>> c(String str) {
        for (Map.Entry<d0, List<r>> entry : this.b.entrySet()) {
            if (entry.getKey().b().equals(str)) {
                return entry;
            }
        }
        return null;
    }

    private void e(String str, a aVar) {
        Map.Entry<d0, List<r>> c2 = c(str);
        if (c2 != null) {
            for (r rVar : c2.getValue()) {
                aVar.a(rVar, c2.getKey());
            }
        }
    }

    private void m(String str) {
        Map.Entry<d0, List<r>> c2 = c(str);
        if (c2 != null) {
            this.b.remove(c2.getKey());
        }
    }

    public void a(s sVar) {
        this.a.add(sVar);
    }

    public void d(d0 d0Var, f0 f0Var) {
        ArrayList arrayList = new ArrayList(3);
        for (s sVar : this.a) {
            arrayList.add(sVar.a(d0Var, f0Var));
        }
        this.b.put(d0Var, arrayList);
    }

    public void f(String str, long j) {
        e(str, new o82(j, b()));
        m(str);
    }

    public void g(String str, long j) {
        e(str, new m82(j, b()));
        m(str);
    }

    public void h(String str) {
        e(str, new n82(b()));
    }

    public void i(String str, long j, Throwable th) {
        e(str, new p82(j, th, b()));
        m(str);
    }

    public void j(String str, long j) {
        e(str, new l82(j, b()));
    }

    public void k(String str, long j) {
        e(str, new k82(j, b()));
        m(str);
    }

    public void l(s sVar) {
        this.a.remove(sVar);
    }
}
