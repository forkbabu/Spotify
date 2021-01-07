package defpackage;

import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.stream.b;
import com.google.gson.t;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j20  reason: default package */
public final class j20 extends b {
    private static final Writer x = new a();
    private static final t y = new t("closed");
    private final List<p> u = new ArrayList();
    private String v;
    private p w = q.a;

    /* renamed from: j20$a */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public j20() {
        super(x);
    }

    private p b0() {
        List<p> list = this.u;
        return list.get(list.size() - 1);
    }

    private void c0(p pVar) {
        if (this.v != null) {
            if (!(pVar instanceof q) || i()) {
                ((r) b0()).f(this.v, pVar);
            }
            this.v = null;
        } else if (this.u.isEmpty()) {
            this.w = pVar;
        } else {
            p b0 = b0();
            if (b0 instanceof m) {
                ((m) b0).f(pVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.b
    public b I(long j) {
        c0(new t(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.b
    public b J(Boolean bool) {
        if (bool == null) {
            c0(q.a);
            return this;
        }
        c0(new t(bool));
        return this;
    }

    @Override // com.google.gson.stream.b
    public b M(Number number) {
        if (number == null) {
            c0(q.a);
            return this;
        }
        if (!m()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c0(new t(number));
        return this;
    }

    @Override // com.google.gson.stream.b
    public b O(String str) {
        if (str == null) {
            c0(q.a);
            return this;
        }
        c0(new t(str));
        return this;
    }

    @Override // com.google.gson.stream.b
    public b Q(boolean z) {
        c0(new t(Boolean.valueOf(z)));
        return this;
    }

    public p W() {
        if (this.u.isEmpty()) {
            return this.w;
        }
        StringBuilder V0 = je.V0("Expected one JSON element but was ");
        V0.append(this.u);
        throw new IllegalStateException(V0.toString());
    }

    @Override // com.google.gson.stream.b
    public b b() {
        m mVar = new m();
        c0(mVar);
        this.u.add(mVar);
        return this;
    }

    @Override // com.google.gson.stream.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.u.isEmpty()) {
            this.u.add(y);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.b
    public b d() {
        r rVar = new r();
        c0(rVar);
        this.u.add(rVar);
        return this;
    }

    @Override // com.google.gson.stream.b, java.io.Flushable
    public void flush() {
    }

    @Override // com.google.gson.stream.b
    public b g() {
        if (this.u.isEmpty() || this.v != null) {
            throw new IllegalStateException();
        } else if (b0() instanceof m) {
            List<p> list = this.u;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.b
    public b h() {
        if (this.u.isEmpty() || this.v != null) {
            throw new IllegalStateException();
        } else if (b0() instanceof r) {
            List<p> list = this.u;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.b
    public b p(String str) {
        if (this.u.isEmpty() || this.v != null) {
            throw new IllegalStateException();
        } else if (b0() instanceof r) {
            this.v = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.b
    public b r() {
        c0(q.a);
        return this;
    }
}
