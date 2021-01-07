package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a4  reason: default package */
public abstract class a4 {
    private final Context a;
    private a b;
    private b c;

    /* renamed from: a4$a */
    public interface a {
        void a(boolean z);
    }

    /* renamed from: a4$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public a4(Context context) {
        this.a = context;
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onActionProviderVisibilityChanged(c());
        }
    }

    public void j() {
        this.c = null;
        this.b = null;
    }

    public void k(a aVar) {
        this.b = aVar;
    }

    public void l(b bVar) {
        if (this.c != null) {
            getClass().getSimpleName();
        }
        this.c = bVar;
    }

    public void m(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(z);
        }
    }
}
