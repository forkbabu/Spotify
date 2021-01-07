package defpackage;

import io.netty.util.concurrent.l;
import io.netty.util.concurrent.r;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: zkf  reason: default package */
public abstract class zkf<T extends SocketAddress> implements Closeable {
    private static final b b = c.b(zkf.class.getName());
    private final Map<l, ykf<T>> a = new IdentityHashMap();

    /* renamed from: zkf$a */
    class a implements Object<Object> {
        final /* synthetic */ l c;
        final /* synthetic */ ykf d;

        a(l lVar, ykf ykf) {
            this.c = lVar;
            this.d = ykf;
        }

        public void a(r<Object> rVar) {
            synchronized (zkf.this.a) {
                zkf.this.a.remove(this.c);
            }
            this.d.close();
        }
    }

    static {
        int i = c.b;
    }

    protected zkf() {
    }

    public ykf<T> b(l lVar) {
        ykf<T> ykf;
        if (lVar == null) {
            throw new NullPointerException("executor");
        } else if (!lVar.c1()) {
            synchronized (this.a) {
                ykf = this.a.get(lVar);
                if (ykf == null) {
                    try {
                        ykf = d(lVar);
                        this.a.put(lVar, ykf);
                        lVar.D().mo86d(new a(lVar, ykf));
                    } catch (Exception e) {
                        throw new IllegalStateException("failed to create a new resolver", e);
                    }
                }
            }
            return ykf;
        } else {
            throw new IllegalStateException("executor not accepting a task");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ykf[] ykfArr;
        synchronized (this.a) {
            ykfArr = (ykf[]) this.a.values().toArray(new ykf[this.a.size()]);
            this.a.clear();
        }
        for (ykf ykf : ykfArr) {
            try {
                ykf.close();
            } catch (Throwable th) {
                b.j("Failed to close a resolver:", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract ykf<T> d(l lVar);
}
