package defpackage;

import java.io.IOException;
import okio.e;
import okio.i;
import okio.v;

/* access modifiers changed from: package-private */
/* renamed from: ynf  reason: default package */
public class ynf extends i {
    private boolean b;

    ynf(v vVar) {
        super(vVar);
    }

    /* access modifiers changed from: protected */
    public void a(IOException iOException) {
        throw null;
    }

    @Override // okio.i, okio.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.b) {
            try {
                super.close();
            } catch (IOException e) {
                this.b = true;
                a(e);
            }
        }
    }

    @Override // okio.i, okio.v, java.io.Flushable
    public void flush() {
        if (!this.b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.b = true;
                a(e);
            }
        }
    }

    @Override // okio.i, okio.v
    public void l0(e eVar, long j) {
        if (this.b) {
            eVar.skip(j);
            return;
        }
        try {
            super.l0(eVar, j);
        } catch (IOException e) {
            this.b = true;
            a(e);
        }
    }
}
