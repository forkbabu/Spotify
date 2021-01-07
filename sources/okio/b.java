package okio;

import java.io.IOException;

/* access modifiers changed from: package-private */
public class b implements w {
    final /* synthetic */ w a;
    final /* synthetic */ c b;

    b(c cVar, w wVar) {
        this.b = cVar;
        this.a = wVar;
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        this.b.j();
        try {
            long c2 = this.a.c2(eVar, j);
            this.b.k(true);
            return c2;
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

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // okio.w
    public x k() {
        return this.b;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AsyncTimeout.source(");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
