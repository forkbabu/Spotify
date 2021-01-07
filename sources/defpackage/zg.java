package defpackage;

import java.io.Closeable;

/* access modifiers changed from: package-private */
/* renamed from: zg  reason: default package */
public abstract class zg implements Closeable {

    /* access modifiers changed from: package-private */
    /* renamed from: zg$a */
    public interface a {
    }

    zg() {
    }

    /* access modifiers changed from: package-private */
    public abstract nh a();

    /* access modifiers changed from: package-private */
    public abstract yg b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
