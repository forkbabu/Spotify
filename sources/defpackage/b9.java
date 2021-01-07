package defpackage;

import android.content.Context;
import androidx.work.j;
import defpackage.e9;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b9  reason: default package */
public class b9 implements e9.a {
    private static final String d = j.f("WorkConstraintsTracker");
    private final a9 a;
    private final e9<?>[] b;
    private final Object c = new Object();

    public b9(Context context, na naVar, a9 a9Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = a9Var;
        this.b = new e9[]{new c9(applicationContext, naVar), new d9(applicationContext, naVar), new j9(applicationContext, naVar), new f9(applicationContext, naVar), new i9(applicationContext, naVar), new h9(applicationContext, naVar), new g9(applicationContext, naVar)};
    }

    public boolean a(String str) {
        synchronized (this.c) {
            e9<?>[] e9VarArr = this.b;
            for (e9<?> e9Var : e9VarArr) {
                if (e9Var.d(str)) {
                    j.c().a(d, String.format("Work %s constrained by %s", str, e9Var.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(List<String> list) {
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (a(str)) {
                    j.c().a(d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            a9 a9Var = this.a;
            if (a9Var != null) {
                a9Var.f(arrayList);
            }
        }
    }

    public void c(List<String> list) {
        synchronized (this.c) {
            a9 a9Var = this.a;
            if (a9Var != null) {
                a9Var.b(list);
            }
        }
    }

    public void d(Iterable<ga> iterable) {
        synchronized (this.c) {
            for (e9<?> e9Var : this.b) {
                e9Var.g(null);
            }
            for (e9<?> e9Var2 : this.b) {
                e9Var2.e(iterable);
            }
            for (e9<?> e9Var3 : this.b) {
                e9Var3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            for (e9<?> e9Var : this.b) {
                e9Var.f();
            }
        }
    }
}
