package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import defpackage.q0;
import java.util.ArrayList;

/* renamed from: u0  reason: default package */
public class u0 extends ActionMode {
    final Context a;
    final q0 b;

    /* renamed from: u0$a */
    public static class a implements q0.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<u0> c = new ArrayList<>();
        final t1<Menu, Menu> d = new t1<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.b, (e3) menu);
            this.d.put(menu, oVar);
            return oVar;
        }

        @Override // defpackage.q0.a
        public void a(q0 q0Var) {
            this.a.onDestroyActionMode(e(q0Var));
        }

        @Override // defpackage.q0.a
        public boolean b(q0 q0Var, Menu menu) {
            return this.a.onCreateActionMode(e(q0Var), f(menu));
        }

        @Override // defpackage.q0.a
        public boolean c(q0 q0Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(q0Var), new j(this.b, (f3) menuItem));
        }

        @Override // defpackage.q0.a
        public boolean d(q0 q0Var, Menu menu) {
            return this.a.onPrepareActionMode(e(q0Var), f(menu));
        }

        public ActionMode e(q0 q0Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                u0 u0Var = this.c.get(i);
                if (u0Var != null && u0Var.b == q0Var) {
                    return u0Var;
                }
            }
            u0 u0Var2 = new u0(this.b, q0Var);
            this.c.add(u0Var2);
            return u0Var2;
        }
    }

    public u0(Context context, q0 q0Var) {
        this.a = context;
        this.b = q0Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.a, (e3) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
