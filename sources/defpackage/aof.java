package defpackage;

import java.util.List;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.l;
import okhttp3.m;
import okhttp3.t;
import okhttp3.v;
import okhttp3.w;
import okio.o;

/* renamed from: aof  reason: default package */
public final class aof implements v {
    private final m a;

    public aof(m mVar) {
        this.a = mVar;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        boolean z;
        fof fof = (fof) aVar;
        a0 i = fof.i();
        a0.a h = i.h();
        c0 a2 = i.a();
        if (a2 != null) {
            w b = a2.b();
            if (b != null) {
                h.e("Content-Type", b.toString());
            }
            long a3 = a2.a();
            if (a3 != -1) {
                h.e("Content-Length", Long.toString(a3));
                h.h("Transfer-Encoding");
            } else {
                h.e("Transfer-Encoding", "chunked");
                h.h("Content-Length");
            }
        }
        if (i.c("Host") == null) {
            h.e("Host", rnf.p(i.k(), false));
        }
        if (i.c("Connection") == null) {
            h.e("Connection", "Keep-Alive");
        }
        if (i.c("Accept-Encoding") == null && i.c("Range") == null) {
            h.e("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<l> a4 = this.a.a(i.k());
        if (!a4.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = a4.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                l lVar = a4.get(i2);
                sb.append(lVar.b());
                sb.append('=');
                sb.append(lVar.e());
            }
            h.e("Cookie", sb.toString());
        }
        if (i.c("User-Agent") == null) {
            h.e("User-Agent", "okhttp/3.12.10");
        }
        d0 f = fof.f(h.b());
        eof.d(this.a, i.k(), f.l());
        d0.a s = f.s();
        s.p(i);
        if (z && "gzip".equalsIgnoreCase(f.h("Content-Encoding")) && eof.b(f)) {
            okio.m mVar = new okio.m(f.a().l());
            t.a e = f.l().e();
            e.g("Content-Encoding");
            e.g("Content-Length");
            s.i(e.e());
            s.b(new gof(f.h("Content-Type"), -1, o.d(mVar)));
        }
        return s.c();
    }
}
