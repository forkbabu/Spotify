package defpackage;

import android.content.Context;
import androidx.work.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: n9  reason: default package */
public abstract class n9<T> {
    private static final String f = j.f("ConstraintTracker");
    protected final na a;
    protected final Context b;
    private final Object c = new Object();
    private final Set<y8<T>> d = new LinkedHashSet();
    T e;

    /* access modifiers changed from: package-private */
    /* renamed from: n9$a */
    public class a implements Runnable {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (y8 y8Var : this.a) {
                y8Var.a(n9.this.e);
            }
        }
    }

    n9(Context context, na naVar) {
        this.b = context.getApplicationContext();
        this.a = naVar;
    }

    public void a(y8<T> y8Var) {
        synchronized (this.c) {
            if (this.d.add(y8Var)) {
                if (this.d.size() == 1) {
                    this.e = b();
                    j.c().a(f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.e), new Throwable[0]);
                    e();
                }
                ((e9) y8Var).a(this.e);
            }
        }
    }

    public abstract T b();

    public void c(y8<T> y8Var) {
        synchronized (this.c) {
            if (this.d.remove(y8Var) && this.d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 != t) {
                if (t2 == null || !t2.equals(t)) {
                    this.e = t;
                    ((oa) this.a).c().execute(new a(new ArrayList(this.d)));
                }
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
