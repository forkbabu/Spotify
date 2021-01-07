package defpackage;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: pu1  reason: default package */
public class pu1 {
    private final y a;
    private final yn1 b;
    private Runnable c = lu1.a;
    private Runnable d = ku1.a;
    private b e = EmptyDisposable.INSTANCE;
    private boolean f;

    public pu1(yn1 yn1, y yVar) {
        this.b = yn1;
        this.a = yVar;
    }

    public boolean a() {
        return this.f;
    }

    public /* synthetic */ void b(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            this.c.run();
        } else {
            this.d.run();
        }
    }

    public void c(Runnable runnable) {
        this.c = runnable;
    }

    public void d(Runnable runnable) {
        this.d = runnable;
    }

    public void e() {
        this.e = this.b.a().C(hu1.a).O(ou1.a).s().Q(this.a).subscribe(new iu1(this), ju1.a);
    }

    public void f() {
        this.e.dispose();
    }
}
