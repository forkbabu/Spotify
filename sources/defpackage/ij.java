package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.a0;
import okhttp3.d;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.u;

/* renamed from: ij  reason: default package */
public class ij extends g implements HttpDataSource {
    private static final byte[] r = new byte[4096];
    private final e.a e;
    private final HttpDataSource.b f = new HttpDataSource.b();
    private final String g;
    private final d h;
    private final HttpDataSource.b i;
    private m j;
    private d0 k;
    private InputStream l;
    private boolean m;
    private long n;
    private long o;
    private long p;
    private long q;

    static {
        c0.a("goog.exo.okhttp");
    }

    public ij(e.a aVar, String str, d dVar, HttpDataSource.b bVar) {
        super(true);
        aVar.getClass();
        this.e = aVar;
        this.g = str;
        this.h = dVar;
        this.i = bVar;
    }

    private void h() {
        d0 d0Var = this.k;
        if (d0Var != null) {
            e0 a = d0Var.a();
            a.getClass();
            a.close();
            this.k = null;
        }
        this.l = null;
    }

    private void i() {
        if (this.p != this.n) {
            while (true) {
                long j2 = this.p;
                long j3 = this.n;
                if (j2 != j3) {
                    long j4 = j3 - j2;
                    byte[] bArr = r;
                    int min = (int) Math.min(j4, (long) bArr.length);
                    InputStream inputStream = this.l;
                    int i2 = f0.a;
                    int read = inputStream.read(bArr, 0, min);
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.p += (long) read;
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
        this.j = mVar;
        long j2 = 0;
        this.q = 0;
        this.p = 0;
        f(mVar);
        long j3 = mVar.f;
        long j4 = mVar.g;
        u p2 = u.p(mVar.a.toString());
        if (p2 != null) {
            a0.a aVar = new a0.a();
            aVar.k(p2);
            d dVar = this.h;
            if (dVar != null) {
                aVar.c(dVar);
            }
            HashMap hashMap = new HashMap();
            HttpDataSource.b bVar = this.i;
            if (bVar != null) {
                hashMap.putAll(bVar.a());
            }
            hashMap.putAll(this.f.a());
            hashMap.putAll(mVar.d);
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.e((String) entry.getKey(), (String) entry.getValue());
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
            if (!mVar.c(1)) {
                aVar.a("Accept-Encoding", "identity");
            }
            byte[] bArr = mVar.c;
            okhttp3.c0 c0Var = null;
            if (bArr != null) {
                c0Var = okhttp3.c0.e(null, bArr);
            } else if (mVar.b == 2) {
                c0Var = okhttp3.c0.e(null, f0.f);
            }
            aVar.g(mVar.a(), c0Var);
            try {
                d0 h2 = this.e.b(aVar.b()).h();
                this.k = h2;
                e0 a = h2.a();
                a.getClass();
                this.l = a.a();
                int f2 = h2.f();
                if (!h2.p()) {
                    Map<String, List<String>> h3 = h2.l().h();
                    h();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(f2, h2.q(), h3, mVar);
                    if (f2 == 416) {
                        invalidResponseCodeException.initCause(new DataSourceException(0));
                    }
                    throw invalidResponseCodeException;
                }
                a.g();
                if (f2 == 200) {
                    long j6 = mVar.f;
                    if (j6 != 0) {
                        j2 = j6;
                    }
                }
                this.n = j2;
                long j7 = mVar.g;
                if (j7 != -1) {
                    this.o = j7;
                } else {
                    long f3 = a.f();
                    if (f3 != -1) {
                        j5 = f3 - this.n;
                    }
                    this.o = j5;
                }
                this.m = true;
                g(mVar);
                return this.o;
            } catch (IOException e2) {
                StringBuilder V02 = je.V0("Unable to connect to ");
                V02.append(mVar.a);
                throw new HttpDataSource.HttpDataSourceException(V02.toString(), e2, mVar, 1);
            }
        } else {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", mVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.g, com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        d0 d0Var = this.k;
        return d0Var == null ? Collections.emptyMap() : d0Var.l().h();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        if (this.m) {
            this.m = false;
            e();
            h();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        d0 d0Var = this.k;
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
            long j2 = this.o;
            if (j2 != -1) {
                long j3 = j2 - this.q;
                if (j3 != 0) {
                    i3 = (int) Math.min((long) i3, j3);
                }
                return -1;
            }
            InputStream inputStream = this.l;
            int i4 = f0.a;
            int read = inputStream.read(bArr, i2, i3);
            if (read != -1) {
                this.q += (long) read;
                d(read);
                return read;
            } else if (this.o == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            m mVar = this.j;
            mVar.getClass();
            throw new HttpDataSource.HttpDataSourceException(e2, mVar, 2);
        }
    }
}
