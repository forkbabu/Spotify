package io.netty.util.concurrent;

import io.netty.util.concurrent.r;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;

public class a0<V, F extends r<V>> implements s<F> {
    private static final b e = c.b(a0.class.getName());
    private final y<? super V>[] c;
    private final boolean d;

    static {
        int i = c.b;
    }

    @SafeVarargs
    public a0(boolean z, y<? super V>... yVarArr) {
        if (yVarArr != null) {
            for (y<? super V> yVar : yVarArr) {
                if (yVar == null) {
                    throw new IllegalArgumentException("promises contains null Promise");
                }
            }
            this.c = (y[]) yVarArr.clone();
            this.d = z;
            return;
        }
        throw new NullPointerException("promises");
    }

    @Override // io.netty.util.concurrent.s
    public void a(F f) {
        b bVar = this.d ? e : null;
        int i = 0;
        if (f.x()) {
            Object obj = f.get();
            y<? super V>[] yVarArr = this.c;
            int length = yVarArr.length;
            while (i < length) {
                yif.Y(yVarArr[i], obj, bVar);
                i++;
            }
        } else if (f.isCancelled()) {
            y<? super V>[] yVarArr2 = this.c;
            for (y<? super V> yVar : yVarArr2) {
                if (!yVar.cancel(false) && bVar != null) {
                    Throwable r = yVar.r();
                    if (r == null) {
                        bVar.l("Failed to cancel promise because it has succeeded already: {}", yVar);
                    } else {
                        bVar.g("Failed to cancel promise because it has failed already: {}, unnotified cause:", yVar, r);
                    }
                }
            }
        } else {
            Throwable r2 = f.r();
            y<? super V>[] yVarArr3 = this.c;
            int length2 = yVarArr3.length;
            while (i < length2) {
                yif.X(yVarArr3[i], r2, bVar);
                i++;
            }
        }
    }
}
