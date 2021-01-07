package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import com.spotify.music.C0707R;

public class j0 implements p {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o = 0;
    private Drawable p;

    class a extends z4 {
        private boolean a = false;
        final /* synthetic */ int b;

        a(int i) {
            this.b = i;
        }

        @Override // defpackage.z4, defpackage.y4
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.y4
        public void b(View view) {
            if (!this.a) {
                j0.this.a.setVisibility(this.b);
            }
        }

        @Override // defpackage.z4, defpackage.y4
        public void c(View view) {
            j0.this.a.setVisibility(0);
        }
    }

    public j0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        String str = null;
        h0 v = h0.v(toolbar.getContext(), null, h0.a, C0707R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.p = v.g(15);
        if (z) {
            CharSequence p2 = v.p(27);
            if (!TextUtils.isEmpty(p2)) {
                this.h = true;
                this.i = p2;
                if ((this.b & 8) != 0) {
                    this.a.setTitle(p2);
                }
            }
            CharSequence p3 = v.p(25);
            if (!TextUtils.isEmpty(p3)) {
                this.j = p3;
                if ((this.b & 8) != 0) {
                    this.a.setSubtitle(p3);
                }
            }
            Drawable g2 = v.g(20);
            if (g2 != null) {
                this.f = g2;
                x();
            }
            Drawable g3 = v.g(17);
            if (g3 != null) {
                this.e = g3;
                x();
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                w();
            }
            i(v.k(10, 0));
            int n2 = v.n(9, 0);
            if (n2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(n2, (ViewGroup) this.a, false);
                View view = this.d;
                if (!(view == null || (this.b & 16) == 0)) {
                    this.a.removeView(view);
                }
                this.d = inflate;
                if (!(inflate == null || (this.b & 16) == 0)) {
                    this.a.addView(inflate);
                }
                i(this.b | 16);
            }
            int m2 = v.m(13, 0);
            if (m2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = v.e(7, -1);
            int e3 = v.e(3, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.a.B(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n3 = v.n(28, 0);
            if (n3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.E(toolbar2.getContext(), n3);
            }
            int n4 = v.n(26, 0);
            if (n4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.D(toolbar3.getContext(), n4);
            }
            int n5 = v.n(22, 0);
            if (n5 != 0) {
                this.a.setPopupTheme(n5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        v.w();
        if (C0707R.string.abc_action_bar_up_description != this.o) {
            this.o = C0707R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i3 = this.o;
                this.k = i3 != 0 ? getContext().getString(i3) : str;
                v();
            }
        }
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new i0(this));
    }

    private void v() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.a.setNavigationContentDescription(this.o);
        } else {
            this.a.setNavigationContentDescription(this.k);
        }
    }

    private void w() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void x() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.p
    public boolean a() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.p
    public boolean b() {
        return this.a.s();
    }

    @Override // androidx.appcompat.widget.p
    public boolean c() {
        return this.a.G();
    }

    @Override // androidx.appcompat.widget.p
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.p
    public void d(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            cVar.q(C0707R.id.action_menu_presenter);
        }
        this.n.h(aVar);
        this.a.C((g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.p
    public boolean e() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.p
    public void f() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.p
    public boolean g() {
        return this.a.u();
    }

    @Override // androidx.appcompat.widget.p
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.p
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.p
    public boolean h() {
        return this.a.r();
    }

    @Override // androidx.appcompat.widget.p
    public void i(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    v();
                }
                w();
            }
            if ((i3 & 3) != 0) {
                x();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.p
    public int j() {
        return 0;
    }

    @Override // androidx.appcompat.widget.p
    public x4 k(int i2, long j2) {
        x4 a2 = q4.a(this.a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.d(j2);
        a2.f(new a(i2));
        return a2;
    }

    @Override // androidx.appcompat.widget.p
    public ViewGroup l() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.p
    public void m(boolean z) {
    }

    @Override // androidx.appcompat.widget.p
    public void n() {
    }

    @Override // androidx.appcompat.widget.p
    public void o(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.p
    public void p() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.p
    public void q(a0 a0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = null;
    }

    @Override // androidx.appcompat.widget.p
    public void r(int i2) {
        this.f = i2 != 0 ? i0.b(getContext(), i2) : null;
        x();
    }

    @Override // androidx.appcompat.widget.p
    public int s() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.p
    public void setIcon(int i2) {
        this.e = i2 != 0 ? i0.b(getContext(), i2) : null;
        x();
    }

    @Override // androidx.appcompat.widget.p
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.p
    public void setVisibility(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.p
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.p
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((this.b & 8) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.p
    public void t() {
    }

    @Override // androidx.appcompat.widget.p
    public void u(Drawable drawable) {
        this.g = drawable;
        w();
    }

    @Override // androidx.appcompat.widget.p
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        x();
    }
}
