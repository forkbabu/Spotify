package defpackage;

import io.netty.util.concurrent.l;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.y;
import java.io.Closeable;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;>Ljava/lang/Object;Lelf<TT;>; */
/* renamed from: elf  reason: default package */
public abstract class elf<T> implements Closeable {
    private final l a;

    protected elf(l lVar) {
        if (lVar != null) {
            this.a = lVar;
            return;
        }
        throw new NullPointerException("executor");
    }

    /* access modifiers changed from: protected */
    public l a() {
        return this.a;
    }

    public final r<T> b(String str) {
        y q = this.a.q();
        if (str == null) {
            throw new NullPointerException("inetHost");
        } else if (q != null) {
            try {
                q.v(InetAddress.getByName(str));
                return q;
            } catch (UnknownHostException e) {
                try {
                    q.mo85g(e);
                    return q;
                } catch (Exception e2) {
                    return q.mo85g(e2);
                }
            }
        } else {
            throw new NullPointerException("promise");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
