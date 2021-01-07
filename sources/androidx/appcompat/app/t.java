package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import com.spotify.music.C0707R;
import defpackage.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class t extends ActionBar implements ActionBarOverlayLayout.d {
    private static final Interpolator A = new AccelerateInterpolator();
    private static final Interpolator B = new DecelerateInterpolator();
    Context a;
    private Context b;
    ActionBarOverlayLayout c;
    ActionBarContainer d;
    p e;
    ActionBarContextView f;
    View g;
    private boolean h;
    d i;
    q0 j;
    q0.a k;
    private boolean l;
    private ArrayList<ActionBar.a> m = new ArrayList<>();
    private boolean n;
    private int o = 0;
    boolean p = true;
    boolean q;
    boolean r;
    private boolean s;
    private boolean t = true;
    w0 u;
    private boolean v;
    boolean w;
    final y4 x = new a();
    final y4 y = new b();
    final a5 z = new c();

    class a extends z4 {
        a() {
        }

        @Override // defpackage.y4
        public void b(View view) {
            View view2;
            t tVar = t.this;
            if (tVar.p && (view2 = tVar.g) != null) {
                view2.setTranslationY(0.0f);
                t.this.d.setTranslationY(0.0f);
            }
            t.this.d.setVisibility(8);
            t.this.d.setTransitioning(false);
            t tVar2 = t.this;
            tVar2.u = null;
            q0.a aVar = tVar2.k;
            if (aVar != null) {
                aVar.a(tVar2.j);
                tVar2.j = null;
                tVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = t.this.c;
            if (actionBarOverlayLayout != null) {
                q4.F(actionBarOverlayLayout);
            }
        }
    }

    class b extends z4 {
        b() {
        }

        @Override // defpackage.y4
        public void b(View view) {
            t tVar = t.this;
            tVar.u = null;
            tVar.d.requestLayout();
        }
    }

    class c implements a5 {
        c() {
        }

        @Override // defpackage.a5
        public void a(View view) {
            ((View) t.this.d.getParent()).invalidate();
        }
    }

    public class d extends q0 implements g.a {
        private final Context c;
        private final g f;
        private q0.a n;
        private WeakReference<View> o;

        public d(Context context, q0.a aVar) {
            this.c = context;
            this.n = aVar;
            g gVar = new g(context);
            gVar.H(1);
            this.f = gVar;
            gVar.G(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            q0.a aVar = this.n;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
            if (this.n != null) {
                k();
                t.this.f.k();
            }
        }

        @Override // defpackage.q0
        public void c() {
            t tVar = t.this;
            if (tVar.i == this) {
                boolean z = tVar.q;
                boolean z2 = tVar.r;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    tVar.j = this;
                    tVar.k = this.n;
                } else {
                    this.n.a(this);
                }
                this.n = null;
                t.this.q(false);
                t.this.f.e();
                t.this.e.l().sendAccessibilityEvent(32);
                t tVar2 = t.this;
                tVar2.c.setHideOnContentScrollEnabled(tVar2.w);
                t.this.i = null;
            }
        }

        @Override // defpackage.q0
        public View d() {
            WeakReference<View> weakReference = this.o;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.q0
        public Menu e() {
            return this.f;
        }

        @Override // defpackage.q0
        public MenuInflater f() {
            return new v0(this.c);
        }

        @Override // defpackage.q0
        public CharSequence g() {
            return t.this.f.getSubtitle();
        }

        @Override // defpackage.q0
        public CharSequence i() {
            return t.this.f.getTitle();
        }

        @Override // defpackage.q0
        public void k() {
            if (t.this.i == this) {
                this.f.R();
                try {
                    this.n.d(this, this.f);
                } finally {
                    this.f.Q();
                }
            }
        }

        @Override // defpackage.q0
        public boolean l() {
            return t.this.f.h();
        }

        @Override // defpackage.q0
        public void m(View view) {
            t.this.f.setCustomView(view);
            this.o = new WeakReference<>(view);
        }

        @Override // defpackage.q0
        public void n(int i) {
            t.this.f.setSubtitle(t.this.a.getResources().getString(i));
        }

        @Override // defpackage.q0
        public void o(CharSequence charSequence) {
            t.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.q0
        public void q(int i) {
            t.this.f.setTitle(t.this.a.getResources().getString(i));
        }

        @Override // defpackage.q0
        public void r(CharSequence charSequence) {
            t.this.f.setTitle(charSequence);
        }

        @Override // defpackage.q0
        public void s(boolean z) {
            super.s(z);
            t.this.f.setTitleOptional(z);
        }

        public boolean t() {
            this.f.R();
            try {
                return this.n.b(this, this.f);
            } finally {
                this.f.Q();
            }
        }
    }

    public t(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        t(decorView);
        if (!z2) {
            this.g = decorView.findViewById(16908290);
        }
    }

    private void t(View view) {
        p pVar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0707R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C0707R.id.action_bar);
        if (findViewById instanceof p) {
            pVar = (p) findViewById;
        } else if (findViewById instanceof Toolbar) {
            pVar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder V0 = je.V0("Can't make a decor toolbar out of ");
            V0.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(V0.toString());
        }
        this.e = pVar;
        this.f = (ActionBarContextView) view.findViewById(C0707R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0707R.id.action_bar_container);
        this.d = actionBarContainer;
        p pVar2 = this.e;
        if (pVar2 == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(je.m0(t.class, new StringBuilder(), " can only be used with a compatible window decor layout"));
        }
        this.a = pVar2.getContext();
        boolean z2 = (this.e.s() & 4) != 0;
        if (z2) {
            this.h = true;
        }
        p0 b2 = p0.b(this.a);
        this.e.m(b2.a() || z2);
        x(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, h0.a, C0707R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            if (this.c.m()) {
                this.w = true;
                this.c.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            q4.N(this.d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void x(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.q(null);
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.q(null);
        }
        boolean z3 = true;
        boolean z4 = this.e.j() == 2;
        this.e.o(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (this.n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    private void z(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.s || (!this.q && !this.r)) {
            if (!this.t) {
                this.t = true;
                w0 w0Var = this.u;
                if (w0Var != null) {
                    w0Var.a();
                }
                this.d.setVisibility(0);
                if (this.o != 0 || (!this.v && !z2)) {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.p && (view2 = this.g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.y.b(null);
                } else {
                    this.d.setTranslationY(0.0f);
                    float f2 = (float) (-this.d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.d.setTranslationY(f2);
                    w0 w0Var2 = new w0();
                    x4 a2 = q4.a(this.d);
                    a2.m(0.0f);
                    a2.i(this.z);
                    w0Var2.c(a2);
                    if (this.p && (view3 = this.g) != null) {
                        view3.setTranslationY(f2);
                        x4 a3 = q4.a(this.g);
                        a3.m(0.0f);
                        w0Var2.c(a3);
                    }
                    w0Var2.f(B);
                    w0Var2.e(250);
                    w0Var2.g(this.y);
                    this.u = w0Var2;
                    w0Var2.h();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    q4.F(actionBarOverlayLayout);
                }
            }
        } else if (this.t) {
            this.t = false;
            w0 w0Var3 = this.u;
            if (w0Var3 != null) {
                w0Var3.a();
            }
            if (this.o != 0 || (!this.v && !z2)) {
                this.x.b(null);
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            w0 w0Var4 = new w0();
            float f3 = (float) (-this.d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            x4 a4 = q4.a(this.d);
            a4.m(f3);
            a4.i(this.z);
            w0Var4.c(a4);
            if (this.p && (view = this.g) != null) {
                x4 a5 = q4.a(view);
                a5.m(f3);
                w0Var4.c(a5);
            }
            w0Var4.f(A);
            w0Var4.e(250);
            w0Var4.g(this.x);
            this.u = w0Var4;
            w0Var4.h();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean a() {
        p pVar = this.e;
        if (pVar == null || !pVar.h()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            int size = this.m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.m.get(i2).a(z2);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int c() {
        return this.e.s();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context d() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(C0707R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e() {
        if (!this.q) {
            this.q = true;
            z(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f(Configuration configuration) {
        x(p0.b(this.a).g());
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean g(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.i;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return ((g) e2).performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(boolean z2) {
        if (!this.h) {
            w(z2 ? 4 : 0, 4);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(boolean z2) {
        w(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(boolean z2) {
        w(z2 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k(float f2) {
        q4.N(this.d, f2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l(Drawable drawable) {
        this.e.u(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z2) {
        w0 w0Var;
        this.v = z2;
        if (!z2 && (w0Var = this.u) != null) {
            w0Var.a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public q0 p(q0.a aVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.i();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.i = dVar2;
        dVar2.k();
        this.f.f(dVar2);
        q(true);
        this.f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void q(boolean z2) {
        x4 x4Var;
        x4 x4Var2;
        if (z2) {
            if (!this.s) {
                this.s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z(false);
            }
        } else if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z(false);
        }
        if (q4.w(this.d)) {
            if (z2) {
                x4Var = this.e.k(4, 100);
                x4Var2 = this.f.j(0, 200);
            } else {
                x4Var2 = this.e.k(0, 200);
                x4Var = this.f.j(8, 100);
            }
            w0 w0Var = new w0();
            w0Var.d(x4Var, x4Var2);
            w0Var.h();
        } else if (z2) {
            this.e.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public void r(boolean z2) {
        this.p = z2;
    }

    public void s() {
        if (!this.r) {
            this.r = true;
            z(true);
        }
    }

    public void u() {
        w0 w0Var = this.u;
        if (w0Var != null) {
            w0Var.a();
            this.u = null;
        }
    }

    public void v(int i2) {
        this.o = i2;
    }

    public void w(int i2, int i3) {
        int s2 = this.e.s();
        if ((i3 & 4) != 0) {
            this.h = true;
        }
        this.e.i((i2 & i3) | ((i3 ^ -1) & s2));
    }

    public void y() {
        if (this.r) {
            this.r = false;
            z(true);
        }
    }

    public t(Dialog dialog) {
        new ArrayList();
        t(dialog.getWindow().getDecorView());
    }
}
