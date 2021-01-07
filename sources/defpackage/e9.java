package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e9  reason: default package */
public abstract class e9<T> implements y8<T> {
    private final List<String> a = new ArrayList();
    private T b;
    private n9<T> c;
    private a d;

    /* renamed from: e9$a */
    public interface a {
    }

    e9(n9<T> n9Var) {
        this.c = n9Var;
    }

    private void h(a aVar, T t) {
        if (!this.a.isEmpty() && aVar != null) {
            if (t == null || c(t)) {
                ((b9) aVar).c(this.a);
                return;
            }
            ((b9) aVar).b(this.a);
        }
    }

    @Override // defpackage.y8
    public void a(T t) {
        this.b = t;
        h(this.d, t);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(ga gaVar);

    /* access modifiers changed from: package-private */
    public abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.b;
        return t != null && c(t) && this.a.contains(str);
    }

    public void e(Iterable<ga> iterable) {
        this.a.clear();
        for (ga gaVar : iterable) {
            if (b(gaVar)) {
                this.a.add(gaVar.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h(this.d, this.b);
    }

    public void f() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            h(aVar, this.b);
        }
    }
}
