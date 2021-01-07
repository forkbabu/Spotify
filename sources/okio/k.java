package okio;

import java.util.concurrent.TimeUnit;

public class k extends x {
    private x e;

    public k(x xVar) {
        if (xVar != null) {
            this.e = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.x
    public x a() {
        return this.e.a();
    }

    @Override // okio.x
    public x b() {
        return this.e.b();
    }

    @Override // okio.x
    public long c() {
        return this.e.c();
    }

    @Override // okio.x
    public x d(long j) {
        return this.e.d(j);
    }

    @Override // okio.x
    public boolean e() {
        return this.e.e();
    }

    @Override // okio.x
    public void f() {
        this.e.f();
    }

    @Override // okio.x
    public x g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    public final x i() {
        return this.e;
    }

    public final k j(x xVar) {
        this.e = xVar;
        return this;
    }
}
