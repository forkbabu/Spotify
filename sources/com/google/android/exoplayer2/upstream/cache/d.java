package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d implements k {
    private final Cache a;
    private final k b;
    private final k c;
    private final k d;
    private final i e;
    private final a f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private k j;
    private boolean k;
    private Uri l;
    private Uri m;
    private int n;
    private byte[] o;
    private Map<String, String> p = Collections.emptyMap();
    private int q;
    private String r;
    private long s;
    private long t;
    private j u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;

    public interface a {
        void a(int i);

        void b(long j, long j2);
    }

    public d(Cache cache, k kVar, k kVar2, i iVar, int i2, a aVar, i iVar2) {
        this.a = cache;
        this.b = kVar2;
        if (iVar2 == null) {
            int i3 = k.a;
            iVar2 = a.a;
        }
        this.e = iVar2;
        boolean z = false;
        this.g = (i2 & 1) != 0;
        this.h = (i2 & 2) != 0;
        this.i = (i2 & 4) != 0 ? true : z;
        this.d = kVar;
        if (iVar != null) {
            this.c = new z(kVar, iVar);
        } else {
            this.c = null;
        }
        this.f = aVar;
    }

    private void d() {
        k kVar = this.j;
        if (kVar != null) {
            try {
                kVar.close();
            } finally {
                this.j = null;
                this.k = false;
                j jVar = this.u;
                if (jVar != null) {
                    this.a.f(jVar);
                    this.u = null;
                }
            }
        }
    }

    private void e(Throwable th) {
        if (f() || (th instanceof Cache.CacheException)) {
            this.v = true;
        }
    }

    private boolean f() {
        return this.j == this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(boolean r23) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.d.g(boolean):void");
    }

    private void h() {
        this.t = 0;
        if (this.j == this.c) {
            p pVar = new p();
            p.c(pVar, this.s);
            this.a.c(this.r, pVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        int i2;
        a aVar;
        try {
            String a2 = this.e.a(mVar);
            this.r = a2;
            Uri uri = mVar.a;
            this.l = uri;
            Uri uri2 = null;
            String d2 = ((q) this.a.b(a2)).d("exo_redir", null);
            if (d2 != null) {
                uri2 = Uri.parse(d2);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.m = uri;
            this.n = mVar.b;
            this.o = mVar.c;
            this.p = mVar.d;
            this.q = mVar.i;
            this.s = mVar.f;
            boolean z = true;
            if (!this.h || !this.v) {
                i2 = (!this.i || mVar.g != -1) ? -1 : 1;
            } else {
                i2 = 0;
            }
            if (i2 == -1) {
                z = false;
            }
            this.w = z;
            if (z && (aVar = this.f) != null) {
                aVar.a(i2);
            }
            long j2 = mVar.g;
            if (j2 == -1) {
                if (!this.w) {
                    long a3 = n.a(this.a.b(this.r));
                    this.t = a3;
                    if (a3 != -1) {
                        long j3 = a3 - mVar.f;
                        this.t = j3;
                        if (j3 <= 0) {
                            throw new DataSourceException(0);
                        }
                    }
                    g(false);
                    return this.t;
                }
            }
            this.t = j2;
            g(false);
            return this.t;
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void b(a0 a0Var) {
        this.b.b(a0Var);
        this.d.b(a0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        if (!f()) {
            return this.d.c();
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        this.l = null;
        this.m = null;
        this.n = 1;
        this.o = null;
        this.p = Collections.emptyMap();
        this.q = 0;
        this.s = 0;
        this.r = null;
        a aVar = this.f;
        if (aVar != null && this.x > 0) {
            aVar.b(this.a.e(), this.x);
            this.x = 0;
        }
        try {
            d();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.t == 0) {
            return -1;
        }
        try {
            if (this.s >= this.y) {
                g(true);
            }
            int read = this.j.read(bArr, i2, i3);
            if (read != -1) {
                if (f()) {
                    this.x += (long) read;
                }
                long j2 = (long) read;
                this.s += j2;
                long j3 = this.t;
                if (j3 != -1) {
                    this.t = j3 - j2;
                }
            } else if (this.k) {
                h();
            } else {
                long j4 = this.t;
                if (j4 <= 0) {
                    if (j4 == -1) {
                    }
                }
                d();
                g(false);
                return read(bArr, i2, i3);
            }
            return read;
        } catch (IOException e2) {
            if (!this.k || !k.e(e2)) {
                e(e2);
                throw e2;
            }
            h();
            return -1;
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
