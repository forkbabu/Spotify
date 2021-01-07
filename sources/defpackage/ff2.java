package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ff2  reason: default package */
public abstract class ff2 {
    private static final AtomicInteger c = new AtomicInteger();
    private static final AtomicInteger d = new AtomicInteger();
    private final Set<Integer> a = new LinkedHashSet();
    private final a b;

    /* renamed from: ff2$a */
    public interface a {
        void a(int i, int i2, Object obj);
    }

    protected ff2(a aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    public boolean a(int i) {
        return this.a.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public synchronized boolean b(int i, Object obj) {
        if (!this.a.contains(Integer.valueOf(i))) {
            return false;
        }
        this.b.a(i, d.incrementAndGet(), obj);
        return true;
    }

    public synchronized void c(Object obj) {
        for (Integer num : this.a) {
            this.b.a(num.intValue(), d.incrementAndGet(), obj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public void e() {
    }

    public abstract void f(df2 df2, int i);

    public void g() {
        d();
    }

    public final synchronized void h() {
        this.a.clear();
        e();
    }

    public synchronized int i() {
        int incrementAndGet;
        incrementAndGet = c.incrementAndGet();
        this.a.add(Integer.valueOf(incrementAndGet));
        return incrementAndGet;
    }

    public void j(int i) {
        this.a.remove(Integer.valueOf(i));
    }
}
