package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class a {
    final Executor a = a();
    final Executor b = a();
    final s c;
    final i d;
    final androidx.work.impl.a e;
    final int f;
    final int g;
    final int h;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    public static final class C0052a {
        public a a() {
            return new a(this);
        }
    }

    public interface b {
        a a();
    }

    a(C0052a aVar) {
        int i = s.b;
        this.c = new r();
        this.d = new h();
        this.e = new androidx.work.impl.a();
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }

    private Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public Executor b() {
        return this.a;
    }

    public i c() {
        return this.d;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.h / 2;
        }
        return this.h;
    }

    public int f() {
        return this.f;
    }

    public androidx.work.impl.a g() {
        return this.e;
    }

    public Executor h() {
        return this.b;
    }

    public s i() {
        return this.c;
    }
}
