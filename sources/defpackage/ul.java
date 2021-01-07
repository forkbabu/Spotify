package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.Collections;
import java.util.List;

/* renamed from: ul  reason: default package */
public final class ul implements vl {
    private final List<om.a> a;
    private final zj[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public ul(List<om.a> list) {
        this.a = list;
        this.b = new zj[list.size()];
    }

    private boolean a(v vVar, int i) {
        if (vVar.a() == 0) {
            return false;
        }
        if (vVar.x() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.vl
    public void b(v vVar) {
        if (!this.c) {
            return;
        }
        if (this.d != 2 || a(vVar, 32)) {
            if (this.d != 1 || a(vVar, 0)) {
                int b2 = vVar.b();
                int a2 = vVar.a();
                zj[] zjVarArr = this.b;
                for (zj zjVar : zjVarArr) {
                    vVar.K(b2);
                    zjVar.b(vVar, a2);
                }
                this.e += a2;
            }
        }
    }

    @Override // defpackage.vl
    public void c() {
        this.c = false;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            om.a aVar = this.a.get(i);
            dVar.a();
            zj s = rjVar.s(dVar.c(), 3);
            s.c(d0.q(dVar.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.b), aVar.a, null));
            this.b[i] = s;
        }
    }

    @Override // defpackage.vl
    public void e() {
        if (this.c) {
            for (zj zjVar : this.b) {
                zjVar.d(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.vl
    public void f(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }
}
