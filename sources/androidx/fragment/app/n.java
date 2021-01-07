package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public class n {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    private final o b;

    /* access modifiers changed from: private */
    public static final class a {
        final o.e a;
        final boolean b;

        a(o.e eVar, boolean z) {
            this.a = eVar;
            this.b = z;
        }
    }

    n(o oVar) {
        this.b = oVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, Context context, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().b(fragment, context, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, Context context, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().g(fragment, context, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.b(this.b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z) {
        Fragment e0 = this.b.e0();
        if (e0 != null) {
            e0.Q2().d0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.getClass();
            }
        }
    }

    public void o(o.e eVar, boolean z) {
        this.a.add(new a(eVar, z));
    }

    public void p(o.e eVar) {
        synchronized (this.a) {
            int i = 0;
            int size = this.a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.a.get(i).a == eVar) {
                    this.a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
