package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* access modifiers changed from: package-private */
public abstract class c {
    final Context a;
    private t1<f3, MenuItem> b;
    private t1<g3, SubMenu> c;

    c(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof f3)) {
            return menuItem;
        }
        f3 f3Var = (f3) menuItem;
        if (this.b == null) {
            this.b = new t1<>();
        }
        MenuItem orDefault = this.b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.a, f3Var);
        this.b.put(f3Var, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof g3)) {
            return subMenu;
        }
        g3 g3Var = (g3) subMenu;
        if (this.c == null) {
            this.c = new t1<>();
        }
        SubMenu subMenu2 = this.c.get(g3Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, g3Var);
        this.c.put(g3Var, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        t1<f3, MenuItem> t1Var = this.b;
        if (t1Var != null) {
            t1Var.clear();
        }
        t1<g3, SubMenu> t1Var2 = this.c;
        if (t1Var2 != null) {
            t1Var2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (i2 < this.b.size()) {
                if (this.b.i(i2).getGroupId() == i) {
                    this.b.k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i) {
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.i(i2).getItemId() == i) {
                    this.b.k(i2);
                    return;
                }
            }
        }
    }
}
