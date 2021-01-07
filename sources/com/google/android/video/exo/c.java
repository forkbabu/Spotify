package com.google.android.video.exo;

import android.net.Uri;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.x;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.exo.InvalidResponseCodeException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.a0;
import okhttp3.d;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.u;
import okhttp3.w;

public class c extends g implements HttpDataSource {
    private static final byte[] s = new byte[4096];
    private final e.a e;
    private final HttpDataSource.b f;
    private final String g;
    private final x<String> h = null;
    private final d i;
    private final HttpDataSource.b j;
    private m k;
    private d0 l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;

    static {
        c0.a("goog.exo.okhttp");
    }

    public c(e.a aVar, String str, x<String> xVar, d dVar, HttpDataSource.b bVar) {
        super(true);
        aVar.getClass();
        this.e = aVar;
        this.g = str;
        this.i = dVar;
        this.j = bVar;
        this.f = new HttpDataSource.b();
    }

    private void h() {
        d0 d0Var = this.l;
        if (d0Var != null) {
            e0 a = d0Var.a();
            a.getClass();
            a.close();
            this.l = null;
        }
        this.m = null;
    }

    private void i() {
        if (this.q != this.o) {
            while (true) {
                long j2 = this.q;
                long j3 = this.o;
                if (j2 != j3) {
                    long j4 = j3 - j2;
                    byte[] bArr = s;
                    int min = (int) Math.min(j4, (long) bArr.length);
                    InputStream inputStream = this.m;
                    int i2 = f0.a;
                    int read = inputStream.read(bArr, 0, min);
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.q += (long) read;
                        d(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        okhttp3.c0 c0Var;
        this.k = mVar;
        long j2 = 0;
        this.r = 0;
        this.q = 0;
        f(mVar);
        long j3 = mVar.f;
        long j4 = mVar.g;
        boolean c = mVar.c(1);
        u p2 = u.p(mVar.a.toString());
        if (p2 != null) {
            a0.a aVar = new a0.a();
            aVar.k(p2);
            d dVar = this.i;
            if (dVar != null) {
                aVar.c(dVar);
            }
            HttpDataSource.b bVar = this.j;
            if (bVar != null) {
                for (Map.Entry<String, String> entry : bVar.a().entrySet()) {
                    aVar.e(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry<String, String> entry2 : this.f.a().entrySet()) {
                aVar.e(entry2.getKey(), entry2.getValue());
            }
            long j5 = -1;
            if (!(j3 == 0 && j4 == -1)) {
                String str = "bytes=" + j3 + "-";
                if (j4 != -1) {
                    StringBuilder V0 = je.V0(str);
                    V0.append((j3 + j4) - 1);
                    str = V0.toString();
                }
                aVar.a("Range", str);
            }
            String str2 = this.g;
            if (str2 != null) {
                aVar.a("User-Agent", str2);
            }
            if (!c) {
                aVar.a("Accept-Encoding", "identity");
            }
            byte[] bArr = mVar.c;
            String str3 = null;
            if (bArr != null) {
                c0Var = okhttp3.c0.e(null, bArr);
            } else {
                c0Var = mVar.b == 2 ? okhttp3.c0.e(null, f0.f) : null;
            }
            aVar.g(mVar.a(), c0Var);
            try {
                d0 h2 = this.e.b(aVar.b()).h();
                this.l = h2;
                e0 a = h2.a();
                a.getClass();
                this.m = a.a();
                int f2 = h2.f();
                String str4 = "";
                if (!h2.p()) {
                    try {
                        str3 = h2.a() != null ? h2.a().m() : str4;
                    } catch (IOException e2) {
                        Logger.c(e2, e2.getMessage(), new Object[0]);
                    }
                    if (f2 != 504 || !h2.C().b().i()) {
                        Map<String, List<String>> h3 = h2.l().h();
                        h();
                        HttpDataSource.HttpDataSourceException httpDataSourceException = new HttpDataSource.HttpDataSourceException(new InvalidResponseCodeException(f2, h3, mVar, str3), mVar, 1);
                        if (f2 == 416) {
                            httpDataSourceException.initCause(new DataSourceException(0));
                        }
                        throw httpDataSourceException;
                    }
                    throw new HttpDataSource.HttpDataSourceException(new NetworkAccessWhileInOfflineModeException(), mVar, 1);
                }
                w g2 = a.g();
                if (g2 != null) {
                    str4 = g2.toString();
                }
                x<String> xVar = this.h;
                if (xVar == null || ((com.google.android.exoplayer2.upstream.d) xVar).a(str4)) {
                    if (f2 == 200) {
                        long j6 = mVar.f;
                        if (j6 != 0) {
                            j2 = j6;
                        }
                    }
                    this.o = j2;
                    long j7 = mVar.g;
                    if (j7 != -1) {
                        this.p = j7;
                    } else {
                        long f3 = a.f();
                        if (f3 != -1) {
                            j5 = f3 - this.o;
                        }
                        this.p = j5;
                    }
                    this.n = true;
                    g(mVar);
                    return this.p;
                }
                h();
                throw new HttpDataSource.InvalidContentTypeException(str4, mVar);
            } catch (IOException e3) {
                StringBuilder V02 = je.V0("Unable to connect to ");
                V02.append(mVar.a);
                throw new HttpDataSource.HttpDataSourceException(V02.toString(), e3, mVar, 1);
            }
        } else {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", mVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.g, com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        d0 d0Var = this.l;
        return d0Var == null ? Collections.emptyMap() : d0Var.l().h();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        if (this.n) {
            this.n = false;
            e();
            h();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        d0 d0Var = this.l;
        if (d0Var == null) {
            return null;
        }
        return Uri.parse(d0Var.C().k().toString());
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i2, int i3) {
        try {
            i();
            if (i3 == 0) {
                return 0;
            }
            long j2 = this.p;
            if (j2 != -1) {
                long j3 = j2 - this.r;
                if (j3 != 0) {
                    i3 = (int) Math.min((long) i3, j3);
                }
                return -1;
            }
            InputStream inputStream = this.m;
            int i4 = f0.a;
            int read = inputStream.read(bArr, i2, i3);
            if (read != -1) {
                this.r += (long) read;
                d(read);
                return read;
            } else if (this.p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            m mVar = this.k;
            mVar.getClass();
            throw new HttpDataSource.HttpDataSourceException(e2, mVar, 2);
        }
    }
}
