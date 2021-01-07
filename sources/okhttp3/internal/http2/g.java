package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.e;

/* access modifiers changed from: package-private */
public class g extends qnf {
    final /* synthetic */ boolean b;
    final /* synthetic */ n c;
    final /* synthetic */ e.l f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(e.l lVar, String str, Object[] objArr, boolean z, n nVar) {
        super(str, objArr);
        this.f = lVar;
        this.b = z;
        this.c = nVar;
    }

    @Override // defpackage.qnf
    public void a() {
        j[] jVarArr;
        long j;
        e.l lVar = this.f;
        boolean z = this.b;
        n nVar = this.c;
        synchronized (e.this.E) {
            synchronized (e.this) {
                int d = e.this.C.d();
                if (z) {
                    e.this.C.a();
                }
                e.this.C.h(nVar);
                int d2 = e.this.C.d();
                jVarArr = null;
                if (d2 == -1 || d2 == d) {
                    j = 0;
                } else {
                    j = (long) (d2 - d);
                    if (!e.this.c.isEmpty()) {
                        jVarArr = (j[]) e.this.c.values().toArray(new j[e.this.c.size()]);
                    }
                }
            }
            try {
                e eVar = e.this;
                eVar.E.a(eVar.C);
            } catch (IOException unused) {
                e.a(e.this);
            }
        }
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                synchronized (jVar) {
                    jVar.b += j;
                    if (j > 0) {
                        jVar.notifyAll();
                    }
                }
            }
        }
        e.H.execute(new h(lVar, "OkHttp %s settings", e.this.f));
    }
}
