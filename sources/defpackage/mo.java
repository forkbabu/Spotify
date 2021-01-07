package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.io.IOException;

/* renamed from: mo  reason: default package */
public class mo extends eo {
    private static final wj t = new wj();
    private final int n;
    private final long o;
    private final io p;
    private long q;
    private volatile boolean r;
    private boolean s;

    public mo(k kVar, m mVar, d0 d0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, io ioVar) {
        super(kVar, mVar, d0Var, i, obj, j, j2, j3, j4, j5);
        this.n = i2;
        this.o = j6;
        this.p = ioVar;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        m d = this.a.d(this.q);
        try {
            y yVar = this.h;
            nj njVar = new nj(yVar, d.e, yVar.a(d));
            if (this.q == 0) {
                go i = i();
                i.b(this.o);
                io ioVar = this.p;
                long j = this.j;
                long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.o;
                long j3 = this.k;
                ioVar.b(i, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.o);
            }
            try {
                qj qjVar = this.p.a;
                boolean z = false;
                int i2 = 0;
                while (i2 == 0 && !this.r) {
                    i2 = qjVar.a(njVar, t);
                }
                if (i2 != 1) {
                    z = true;
                }
                g.m(z);
                this.q = njVar.e() - this.a.e;
                y yVar2 = this.h;
                int i3 = f0.a;
                if (yVar2 != null) {
                    try {
                        yVar2.close();
                    } catch (IOException unused) {
                    }
                }
                this.s = true;
            } catch (Throwable th) {
                this.q = njVar.e() - this.a.e;
                throw th;
            }
        } catch (Throwable th2) {
            y yVar3 = this.h;
            int i4 = f0.a;
            if (yVar3 != null) {
                try {
                    yVar3.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
        this.r = true;
    }

    @Override // defpackage.po
    public long f() {
        return this.i + ((long) this.n);
    }

    @Override // defpackage.po
    public boolean g() {
        return this.s;
    }
}
