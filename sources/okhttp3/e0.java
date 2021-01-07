package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okio.e;
import okio.g;

public abstract class e0 implements Closeable {
    private Reader a;

    /* access modifiers changed from: package-private */
    public class a extends e0 {
        final /* synthetic */ w b;
        final /* synthetic */ long c;
        final /* synthetic */ g f;

        a(w wVar, long j, g gVar) {
            this.b = wVar;
            this.c = j;
            this.f = gVar;
        }

        @Override // okhttp3.e0
        public long f() {
            return this.c;
        }

        @Override // okhttp3.e0
        public w g() {
            return this.b;
        }

        @Override // okhttp3.e0
        public g l() {
            return this.f;
        }
    }

    static final class b extends Reader {
        private final g a;
        private final Charset b;
        private boolean c;
        private Reader f;

        b(g gVar, Charset charset) {
            this.a = gVar;
            this.b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c = true;
            Reader reader = this.f;
            if (reader != null) {
                reader.close();
            } else {
                this.a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            if (!this.c) {
                Reader reader = this.f;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.a.m2(), rnf.c(this.a, this.b));
                    this.f = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public static e0 h(w wVar, long j, g gVar) {
        return new a(wVar, j, gVar);
    }

    public static e0 i(w wVar, String str) {
        Charset charset = rnf.i;
        if (wVar != null) {
            Charset a2 = wVar.a();
            if (a2 == null) {
                wVar = w.d(wVar + "; charset=utf-8");
            } else {
                charset = a2;
            }
        }
        e W = new e().W(str, 0, str.length(), charset);
        return h(wVar, W.size(), W);
    }

    public final InputStream a() {
        return l().m2();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] b() {
        long f = f();
        if (f <= 2147483647L) {
            g l = l();
            try {
                byte[] j1 = l.j1();
                rnf.g(l);
                if (f == -1 || f == ((long) j1.length)) {
                    return j1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Content-Length (");
                sb.append(f);
                sb.append(") and stream length (");
                throw new IOException(je.B0(sb, j1.length, ") disagree"));
            } catch (Throwable th) {
                rnf.g(l);
                throw th;
            }
        } else {
            throw new IOException(je.t0("Cannot buffer entire body for content length: ", f));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        rnf.g(l());
    }

    public final Reader d() {
        Reader reader = this.a;
        if (reader == null) {
            g l = l();
            w g = g();
            reader = new b(l, g != null ? g.b(rnf.i) : rnf.i);
            this.a = reader;
        }
        return reader;
    }

    public abstract long f();

    public abstract w g();

    public abstract g l();

    public final String m() {
        g l = l();
        try {
            w g = g();
            return l.E1(rnf.c(l, g != null ? g.b(rnf.i) : rnf.i));
        } finally {
            rnf.g(l);
        }
    }
}
