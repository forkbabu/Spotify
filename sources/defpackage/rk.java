package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import defpackage.ok;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: rk  reason: default package */
public class rk implements qj {
    private static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final d0 J = d0.r(null, "application/x-emsg", Long.MAX_VALUE);
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private rj E;
    private zj[] F;
    private zj[] G;
    private boolean H;
    private final int a;
    private final List<d0> b;
    private final l c;
    private final SparseArray<b> d;
    private final v e;
    private final v f;
    private final v g;
    private final byte[] h;
    private final v i;
    private final e0 j;
    private final dn k;
    private final v l;
    private final ArrayDeque<ok.a> m;
    private final ArrayDeque<a> n;
    private int o;
    private int p;
    private long q;
    private int r;
    private v s;
    private long t;
    private int u;
    private long v;
    private long w;
    private long x;
    private b y;
    private int z;

    /* renamed from: rk$a */
    private static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: rk$b */
    public static final class b {
        public final zj a;
        public final zk b = new zk();
        public xk c;
        public qk d;
        public int e;
        public int f;
        public int g;
        public int h;
        private final v i = new v(1);
        private final v j = new v();

        public b(zj zjVar) {
            this.a = zjVar;
        }

        static void a(b bVar) {
            yk c2 = bVar.c();
            if (c2 != null) {
                v vVar = bVar.b.p;
                int i2 = c2.d;
                if (i2 != 0) {
                    vVar.L(i2);
                }
                zk zkVar = bVar.b;
                if (zkVar.l && zkVar.m[bVar.e]) {
                    vVar.L(vVar.D() * 6);
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private yk c() {
            zk zkVar = this.b;
            int i2 = zkVar.a.a;
            yk ykVar = zkVar.n;
            if (ykVar == null) {
                ykVar = this.c.a(i2);
            }
            if (ykVar == null || !ykVar.a) {
                return null;
            }
            return ykVar;
        }

        public void d(xk xkVar, qk qkVar) {
            this.c = xkVar;
            qkVar.getClass();
            this.d = qkVar;
            this.a.c(xkVar.f);
            g();
        }

        public boolean e() {
            this.e++;
            int i2 = this.f + 1;
            this.f = i2;
            int[] iArr = this.b.g;
            int i3 = this.g;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.g = i3 + 1;
            this.f = 0;
            return false;
        }

        public int f() {
            v vVar;
            yk c2 = c();
            if (c2 == null) {
                return 0;
            }
            int i2 = c2.d;
            if (i2 != 0) {
                vVar = this.b.p;
            } else {
                byte[] bArr = c2.e;
                this.j.I(bArr, bArr.length);
                v vVar2 = this.j;
                i2 = bArr.length;
                vVar = vVar2;
            }
            zk zkVar = this.b;
            boolean z = zkVar.l && zkVar.m[this.e];
            v vVar3 = this.i;
            vVar3.a[0] = (byte) ((z ? 128 : 0) | i2);
            vVar3.K(0);
            this.a.b(this.i, 1);
            this.a.b(vVar, i2);
            if (!z) {
                return i2 + 1;
            }
            v vVar4 = this.b.p;
            int D = vVar4.D();
            vVar4.L(-2);
            int i3 = (D * 6) + 2;
            this.a.b(vVar4, i3);
            return i2 + 1 + i3;
        }

        public void g() {
            zk zkVar = this.b;
            zkVar.d = 0;
            zkVar.r = 0;
            zkVar.l = false;
            zkVar.q = false;
            zkVar.n = null;
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }
    }

    public rk(int i2, e0 e0Var, xk xkVar, l lVar, List<d0> list) {
        this.a = i2 | (xkVar != null ? 8 : 0);
        this.j = e0Var;
        this.c = lVar;
        this.b = Collections.unmodifiableList(list);
        this.k = new dn();
        this.l = new v(16);
        this.e = new v(t.a);
        this.f = new v(5);
        this.g = new v();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new v(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.d = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        e();
    }

    private void e() {
        this.o = 0;
        this.r = 0;
    }

    private qk g(SparseArray<qk> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        qk qkVar = sparseArray.get(i2);
        qkVar.getClass();
        return qkVar;
    }

    private static l h(List<ok.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ok.b bVar = list.get(i2);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                UUID e2 = vk.e(bArr);
                if (e2 != null) {
                    arrayList.add(new l.b(e2, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new l(arrayList);
    }

    private void i() {
        int i2;
        if (this.F == null) {
            zj[] zjVarArr = new zj[2];
            this.F = zjVarArr;
            if ((this.a & 4) != 0) {
                zjVarArr[0] = this.E.s(this.d.size(), 4);
                i2 = 1;
            } else {
                i2 = 0;
            }
            zj[] zjVarArr2 = (zj[]) Arrays.copyOf(this.F, i2);
            this.F = zjVarArr2;
            for (zj zjVar : zjVarArr2) {
                zjVar.c(J);
            }
        }
        if (this.G == null) {
            this.G = new zj[this.b.size()];
            for (int i3 = 0; i3 < this.G.length; i3++) {
                zj s2 = this.E.s(this.d.size() + 1 + i3, 3);
                s2.c(this.b.get(i3));
                this.G[i3] = s2;
            }
        }
    }

    private static void j(v vVar, int i2, zk zkVar) {
        vVar.K(i2 + 8);
        int h2 = vVar.h() & 16777215;
        if ((h2 & 1) == 0) {
            boolean z2 = (h2 & 2) != 0;
            int B2 = vVar.B();
            if (B2 == zkVar.e) {
                Arrays.fill(zkVar.m, 0, B2, z2);
                zkVar.a(vVar.a());
                vVar.g(zkVar.p.a, 0, zkVar.o);
                zkVar.p.K(0);
                zkVar.q = false;
                return;
            }
            StringBuilder W0 = je.W0("Length mismatch: ", B2, ", ");
            W0.append(zkVar.e);
            throw new ParserException(W0.toString());
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(long r50) {
        /*
        // Method dump skipped, instructions count: 1820
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk.k(long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v21, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0281 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0200  */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(defpackage.nj r28, defpackage.wj r29) {
        /*
        // Method dump skipped, instructions count: 1769
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.E = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.valueAt(i2).g();
        }
        this.n.clear();
        this.u = 0;
        this.v = j3;
        this.m.clear();
        this.D = false;
        e();
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        return wk.a(njVar);
    }
}
