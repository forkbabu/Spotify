package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.v;

/* renamed from: dl  reason: default package */
public class dl implements qj {
    private rj a;
    private il b;
    private boolean c;

    private boolean e(nj njVar) {
        boolean z;
        fl flVar = new fl();
        if (flVar.a(njVar, true) && (flVar.b & 2) == 2) {
            int min = Math.min(flVar.f, 8);
            v vVar = new v(min);
            njVar.f(vVar.a, 0, min, false);
            vVar.K(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.b = new cl();
            } else {
                vVar.K(0);
                try {
                    z = ll.b(1, vVar, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.b = new kl();
                } else {
                    vVar.K(0);
                    if (hl.k(vVar)) {
                        this.b = new hl();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        if (this.b == null) {
            if (e(njVar)) {
                njVar.j();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            zj s = this.a.s(0, 1);
            this.a.q();
            this.b.c(this.a, s);
            this.c = true;
        }
        return this.b.f(njVar, wjVar);
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.a = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j, long j2) {
        il ilVar = this.b;
        if (ilVar != null) {
            ilVar.i(j, j2);
        }
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        try {
            return e(njVar);
        } catch (ParserException unused) {
            return false;
        }
    }
}
