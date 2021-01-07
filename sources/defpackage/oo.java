package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.io.IOException;

/* renamed from: oo  reason: default package */
public final class oo extends ho {
    private static final wj l = new wj();
    private final io i;
    private long j;
    private volatile boolean k;

    public oo(k kVar, m mVar, d0 d0Var, int i2, Object obj, io ioVar) {
        super(kVar, mVar, 2, d0Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = ioVar;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        y yVar;
        int i2;
        m d = this.a.d(this.j);
        try {
            y yVar2 = this.h;
            nj njVar = new nj(yVar2, d.e, yVar2.a(d));
            if (this.j == 0) {
                this.i.b(null, -9223372036854775807L, -9223372036854775807L);
            }
            try {
                qj qjVar = this.i.a;
                boolean z = false;
                int i3 = 0;
                while (i3 == 0 && !this.k) {
                    i3 = qjVar.a(njVar, l);
                }
                if (i3 != 1) {
                    z = true;
                }
                g.m(z);
                this.j = njVar.e() - this.a.e;
            } catch (Throwable th) {
                this.j = njVar.e() - this.a.e;
                throw th;
            }
        } finally {
            yVar = this.h;
            i2 = f0.a;
            if (yVar != null) {
                try {
                    yVar.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.k = true;
    }
}
