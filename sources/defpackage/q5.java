package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: q5  reason: default package */
public class q5 {
    public static final ThreadLocal<q5> g = new ThreadLocal<>();
    private final t1<b, Long> a = new t1<>();
    final ArrayList<b> b = new ArrayList<>();
    private final a c = new a();
    private c d;
    long e = 0;
    private boolean f = false;

    /* access modifiers changed from: package-private */
    /* renamed from: q5$a */
    public class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            q5.this.e = SystemClock.uptimeMillis();
            q5 q5Var = q5.this;
            q5Var.b(q5Var.e);
            if (q5.this.b.size() > 0) {
                q5.this.d().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q5$b */
    public interface b {
        boolean a(long j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q5$c */
    public static abstract class c {
        final a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    /* access modifiers changed from: private */
    /* renamed from: q5$d */
    public static class d extends c {
        private final Choreographer b = Choreographer.getInstance();
        private final Choreographer.FrameCallback c = new a();

        /* renamed from: q5$d$a */
        class a implements Choreographer.FrameCallback {
            a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                d.this.a.a();
            }
        }

        d(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.q5.c
        public void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    q5() {
    }

    public static q5 c() {
        ThreadLocal<q5> threadLocal = g;
        if (threadLocal.get() == null) {
            threadLocal.set(new q5());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j) {
        if (this.b.size() == 0) {
            if (this.d == null) {
                int i = Build.VERSION.SDK_INT;
                this.d = new d(this.c);
            }
            this.d.a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j > 0) {
            this.a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            b bVar = this.b.get(i);
            if (bVar != null) {
                Long orDefault = this.a.getOrDefault(bVar, null);
                boolean z = true;
                if (orDefault != null) {
                    if (orDefault.longValue() < uptimeMillis) {
                        this.a.remove(bVar);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    bVar.a(j);
                }
            }
        }
        if (this.f) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.f = false;
                    return;
                } else if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public c d() {
        if (this.d == null) {
            int i = Build.VERSION.SDK_INT;
            this.d = new d(this.c);
        }
        return this.d;
    }

    public void e(b bVar) {
        this.a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.f = true;
        }
    }
}
