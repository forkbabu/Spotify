package okio;

import java.io.IOException;

/* access modifiers changed from: package-private */
public class a implements v {
    final /* synthetic */ v a;
    final /* synthetic */ c b;

    a(c cVar, v vVar) {
        this.b = cVar;
        this.a = vVar;
    }

    @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.j();
        try {
            this.a.close();
            this.b.k(true);
        } catch (IOException e) {
            c cVar = this.b;
            if (!cVar.l()) {
                throw e;
            }
            throw cVar.m(e);
        } catch (Throwable th) {
            this.b.k(false);
            throw th;
        }
    }

    @Override // okio.v, java.io.Flushable
    public void flush() {
        this.b.j();
        try {
            this.a.flush();
            this.b.k(true);
        } catch (IOException e) {
            c cVar = this.b;
            if (!cVar.l()) {
                throw e;
            }
            throw cVar.m(e);
        } catch (Throwable th) {
            this.b.k(false);
            throw th;
        }
    }

    @Override // okio.v
    public x k() {
        return this.b;
    }

    @Override // okio.v
    public void l0(e eVar, long j) {
        y.b(eVar.b, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                t tVar = eVar.a;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (tVar.c - tVar.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    tVar = tVar.f;
                }
                this.b.j();
                try {
                    this.a.l0(eVar, j2);
                    j -= j2;
                    this.b.k(true);
                } catch (IOException e) {
                    c cVar = this.b;
                    if (!cVar.l()) {
                        throw e;
                    }
                    throw cVar.m(e);
                } catch (Throwable th) {
                    this.b.k(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AsyncTimeout.sink(");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
