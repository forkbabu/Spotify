package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okio.f;
import okio.g;
import okio.o;
import okio.v;
import okio.w;

/* renamed from: wnf  reason: default package */
public final class wnf implements Closeable, Flushable {
    static final Pattern D = Pattern.compile("[a-z0-9_-]{1,120}");
    private long A = 0;
    private final Executor B;
    private final Runnable C = new a();
    final lof a;
    final File b;
    private final File c;
    private final File f;
    private final File n;
    private final int o;
    private long p;
    final int q;
    private long r = 0;
    f s;
    final LinkedHashMap<String, c> t = new LinkedHashMap<>(0, 0.75f, true);
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    /* renamed from: wnf$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (wnf.this) {
                wnf wnf = wnf.this;
                if (!(!wnf.w) && !wnf.x) {
                    try {
                        wnf.B();
                    } catch (IOException unused) {
                        wnf.this.y = true;
                    }
                    try {
                        if (wnf.this.m()) {
                            wnf.this.s();
                            wnf.this.u = 0;
                        }
                    } catch (IOException unused2) {
                        wnf wnf2 = wnf.this;
                        wnf2.z = true;
                        wnf2.s = o.c(o.b());
                    }
                }
            }
        }
    }

    /* renamed from: wnf$b */
    public final class b {
        final c a;
        final boolean[] b;
        private boolean c;

        /* access modifiers changed from: package-private */
        /* renamed from: wnf$b$a */
        public class a extends ynf {
            a(v vVar) {
                super(vVar);
            }

            /* access modifiers changed from: protected */
            @Override // defpackage.ynf
            public void a(IOException iOException) {
                synchronized (wnf.this) {
                    b.this.c();
                }
            }
        }

        b(c cVar) {
            this.a = cVar;
            this.b = cVar.e ? null : new boolean[wnf.this.q];
        }

        public void a() {
            synchronized (wnf.this) {
                if (!this.c) {
                    if (this.a.f == this) {
                        wnf.this.b(this, false);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void b() {
            synchronized (wnf.this) {
                if (!this.c) {
                    if (this.a.f == this) {
                        wnf.this.b(this, true);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.a.f == this) {
                int i = 0;
                while (true) {
                    wnf wnf = wnf.this;
                    if (i < wnf.q) {
                        try {
                            wnf.a.h(this.a.d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.a.f = null;
                        return;
                    }
                }
            }
        }

        public v d(int i) {
            synchronized (wnf.this) {
                if (!this.c) {
                    c cVar = this.a;
                    if (cVar.f != this) {
                        return o.b();
                    }
                    if (!cVar.e) {
                        this.b[i] = true;
                    }
                    try {
                        return new a(wnf.this.a.f(cVar.d[i]));
                    } catch (FileNotFoundException unused) {
                        return o.b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: wnf$c */
    public final class c {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        b f;
        long g;

        c(String str) {
            this.a = str;
            int i = wnf.this.q;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < wnf.this.q; i2++) {
                sb.append(i2);
                this.c[i2] = new File(wnf.this.b, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(wnf.this.b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) {
            StringBuilder V0 = je.V0("unexpected journal line: ");
            V0.append(Arrays.toString(strArr));
            throw new IOException(V0.toString());
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            if (strArr.length == wnf.this.q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        a(strArr);
                        throw null;
                    }
                }
                return;
            }
            a(strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public d c() {
            if (Thread.holdsLock(wnf.this)) {
                w[] wVarArr = new w[wnf.this.q];
                long[] jArr = (long[]) this.b.clone();
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        wnf wnf = wnf.this;
                        if (i2 >= wnf.q) {
                            return new d(this.a, this.g, wVarArr, jArr);
                        }
                        wVarArr[i2] = wnf.a.e(this.c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            wnf wnf2 = wnf.this;
                            if (i >= wnf2.q || wVarArr[i] == null) {
                                try {
                                    wnf2.w(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                rnf.g(wVarArr[i]);
                                i++;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f fVar) {
            for (long j : this.b) {
                fVar.writeByte(32).N0(j);
            }
        }
    }

    /* renamed from: wnf$d */
    public final class d implements Closeable {
        private final String a;
        private final long b;
        private final w[] c;

        d(String str, long j, w[] wVarArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = wVarArr;
        }

        public b a() {
            return wnf.this.g(this.a, this.b);
        }

        public w b(int i) {
            return this.c[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (w wVar : this.c) {
                rnf.g(wVar);
            }
        }
    }

    wnf(lof lof, File file, int i, int i2, long j, Executor executor) {
        this.a = lof;
        this.b = file;
        this.o = i;
        this.c = new File(file, "journal");
        this.f = new File(file, "journal.tmp");
        this.n = new File(file, "journal.bkp");
        this.q = i2;
        this.p = j;
        this.B = executor;
    }

    private void C(String str) {
        if (!D.matcher(str).matches()) {
            throw new IllegalArgumentException(je.y0("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    private synchronized void a() {
        synchronized (this) {
        }
        if (this.x) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static wnf d(lof lof, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new wnf(lof, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), rnf.z("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void p() {
        this.a.h(this.f);
        Iterator<c> it = this.t.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.q) {
                    this.r += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.q) {
                    this.a.h(next.c[i]);
                    this.a.h(next.d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    private void q() {
        g d2 = o.d(this.a.e(this.c));
        try {
            String y0 = d2.y0();
            String y02 = d2.y0();
            String y03 = d2.y0();
            String y04 = d2.y0();
            String y05 = d2.y0();
            if (!"libcore.io.DiskLruCache".equals(y0) || !"1".equals(y02) || !Integer.toString(this.o).equals(y03) || !Integer.toString(this.q).equals(y04) || !"".equals(y05)) {
                throw new IOException("unexpected journal header: [" + y0 + ", " + y02 + ", " + y04 + ", " + y05 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    r(d2.y0());
                    i++;
                } catch (EOFException unused) {
                    this.u = i - this.t.size();
                    if (!d2.l1()) {
                        s();
                    } else {
                        this.s = o.c(new xnf(this, this.a.c(this.c)));
                    }
                    return;
                }
            }
        } finally {
            rnf.g(d2);
        }
    }

    private void r(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.t.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            c cVar = this.t.get(str2);
            if (cVar == null) {
                cVar = new c(str2);
                this.t.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.e = true;
                cVar.f = null;
                cVar.b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f = new b(cVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(je.x0("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(je.x0("unexpected journal line: ", str));
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        while (this.r > this.p) {
            w(this.t.values().iterator().next());
        }
        this.y = false;
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(b bVar, boolean z2) {
        c cVar = bVar.a;
        if (cVar.f == bVar) {
            if (z2 && !cVar.e) {
                for (int i = 0; i < this.q; i++) {
                    if (!bVar.b[i]) {
                        bVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!this.a.b(cVar.d[i])) {
                        bVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.q; i2++) {
                File file = cVar.d[i2];
                if (!z2) {
                    this.a.h(file);
                } else if (this.a.b(file)) {
                    File file2 = cVar.c[i2];
                    this.a.g(file, file2);
                    long j = cVar.b[i2];
                    long d2 = this.a.d(file2);
                    cVar.b[i2] = d2;
                    this.r = (this.r - j) + d2;
                }
            }
            this.u++;
            cVar.f = null;
            if (cVar.e || z2) {
                cVar.e = true;
                this.s.e0("CLEAN").writeByte(32);
                this.s.e0(cVar.a);
                cVar.d(this.s);
                this.s.writeByte(10);
                if (z2) {
                    long j2 = this.A;
                    this.A = 1 + j2;
                    cVar.g = j2;
                }
            } else {
                this.t.remove(cVar.a);
                this.s.e0("REMOVE").writeByte(32);
                this.s.e0(cVar.a);
                this.s.writeByte(10);
            }
            this.s.flush();
            if (this.r > this.p || m()) {
                this.B.execute(this.C);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.w) {
            if (!this.x) {
                for (c cVar : (c[]) this.t.values().toArray(new c[this.t.size()])) {
                    b bVar = cVar.f;
                    if (bVar != null) {
                        bVar.a();
                    }
                }
                B();
                this.s.close();
                this.s = null;
                this.x = true;
                return;
            }
        }
        this.x = true;
    }

    public b f(String str) {
        return g(str, -1);
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.w) {
            a();
            B();
            this.s.flush();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized b g(String str, long j) {
        l();
        a();
        C(str);
        c cVar = this.t.get(str);
        if (j != -1 && (cVar == null || cVar.g != j)) {
            return null;
        }
        if (cVar != null && cVar.f != null) {
            return null;
        }
        if (this.y || this.z) {
            this.B.execute(this.C);
            return null;
        }
        this.s.e0("DIRTY").writeByte(32).e0(str).writeByte(10);
        this.s.flush();
        if (this.v) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(str);
            this.t.put(str, cVar);
        }
        b bVar = new b(cVar);
        cVar.f = bVar;
        return bVar;
    }

    public synchronized void h() {
        l();
        for (c cVar : (c[]) this.t.values().toArray(new c[this.t.size()])) {
            w(cVar);
        }
        this.y = false;
    }

    public synchronized d i(String str) {
        l();
        a();
        C(str);
        c cVar = this.t.get(str);
        if (cVar != null) {
            if (cVar.e) {
                d c2 = cVar.c();
                if (c2 == null) {
                    return null;
                }
                this.u++;
                this.s.e0("READ").writeByte(32).e0(str).writeByte(10);
                if (m()) {
                    this.B.execute(this.C);
                }
                return c2;
            }
        }
        return null;
    }

    public synchronized void l() {
        if (!this.w) {
            if (this.a.b(this.n)) {
                if (this.a.b(this.c)) {
                    this.a.h(this.n);
                } else {
                    this.a.g(this.n, this.c);
                }
            }
            if (this.a.b(this.c)) {
                try {
                    q();
                    p();
                    this.w = true;
                    return;
                } catch (IOException e) {
                    sof h = sof.h();
                    h.m(5, "DiskLruCache " + this.b + " is corrupt: " + e.getMessage() + ", removing", e);
                    close();
                    this.a.a(this.b);
                    this.x = false;
                } catch (Throwable th) {
                    this.x = false;
                    throw th;
                }
            }
            s();
            this.w = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int i = this.u;
        return i >= 2000 && i >= this.t.size();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public synchronized void s() {
        f fVar = this.s;
        if (fVar != null) {
            fVar.close();
        }
        f c2 = o.c(this.a.f(this.f));
        try {
            c2.e0("libcore.io.DiskLruCache").writeByte(10);
            c2.e0("1").writeByte(10);
            c2.N0((long) this.o).writeByte(10);
            c2.N0((long) this.q).writeByte(10);
            c2.writeByte(10);
            for (c cVar : this.t.values()) {
                if (cVar.f != null) {
                    c2.e0("DIRTY").writeByte(32);
                    c2.e0(cVar.a);
                    c2.writeByte(10);
                } else {
                    c2.e0("CLEAN").writeByte(32);
                    c2.e0(cVar.a);
                    cVar.d(c2);
                    c2.writeByte(10);
                }
            }
            c2.close();
            if (this.a.b(this.c)) {
                this.a.g(this.c, this.n);
            }
            this.a.g(this.f, this.c);
            this.a.h(this.n);
            this.s = o.c(new xnf(this, this.a.c(this.c)));
            this.v = false;
            this.z = false;
        } catch (Throwable th) {
            c2.close();
            throw th;
        }
    }

    public synchronized boolean v(String str) {
        l();
        a();
        C(str);
        c cVar = this.t.get(str);
        if (cVar == null) {
            return false;
        }
        w(cVar);
        if (this.r <= this.p) {
            this.y = false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean w(c cVar) {
        b bVar = cVar.f;
        if (bVar != null) {
            bVar.c();
        }
        for (int i = 0; i < this.q; i++) {
            this.a.h(cVar.c[i]);
            long j = this.r;
            long[] jArr = cVar.b;
            this.r = j - jArr[i];
            jArr[i] = 0;
        }
        this.u++;
        this.s.e0("REMOVE").writeByte(32).e0(cVar.a).writeByte(10);
        this.t.remove(cVar.a);
        if (m()) {
            this.B.execute(this.C);
        }
        return true;
    }
}
