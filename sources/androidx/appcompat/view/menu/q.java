package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.w;
import com.spotify.music.C0707R;

final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private boolean A;
    private int B;
    private int C = 0;
    private boolean D;
    private final Context b;
    private final g c;
    private final f f;
    private final boolean n;
    private final int o;
    private final int p;
    private final int q;
    final w r;
    final ViewTreeObserver.OnGlobalLayoutListener s = new a();
    private final View.OnAttachStateChangeListener t = new b();
    private PopupWindow.OnDismissListener u;
    private View v;
    View w;
    private m.a x;
    ViewTreeObserver y;
    private boolean z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.b() && !q.this.r.w()) {
                View view = q.this.w;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.r.a();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.y = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.y.removeGlobalOnLayoutListener(qVar.s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i2, boolean z2) {
        this.b = context;
        this.c = gVar;
        this.n = z2;
        this.f = new f(gVar, LayoutInflater.from(context), z2, C0707R.layout.abc_popup_menu_item_layout);
        this.p = i;
        this.q = i2;
        Resources resources = context.getResources();
        this.o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0707R.dimen.abc_config_prefDialogWidth));
        this.v = view;
        this.r = new w(context, null, i, i2);
        gVar.c(this, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6  */
    @Override // androidx.appcompat.view.menu.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r7 = this;
            boolean r0 = r7.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = 1
            goto L_0x00c3
        L_0x000b:
            boolean r0 = r7.z
            if (r0 != 0) goto L_0x00c3
            android.view.View r0 = r7.v
            if (r0 != 0) goto L_0x0015
            goto L_0x00c3
        L_0x0015:
            r7.w = r0
            androidx.appcompat.widget.w r0 = r7.r
            r0.E(r7)
            androidx.appcompat.widget.w r0 = r7.r
            r0.F(r7)
            androidx.appcompat.widget.w r0 = r7.r
            r0.D(r2)
            android.view.View r0 = r7.w
            android.view.ViewTreeObserver r3 = r7.y
            if (r3 != 0) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.y = r4
            if (r3 == 0) goto L_0x003c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.s
            r4.addOnGlobalLayoutListener(r3)
        L_0x003c:
            android.view.View$OnAttachStateChangeListener r3 = r7.t
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.w r3 = r7.r
            r3.x(r0)
            androidx.appcompat.widget.w r0 = r7.r
            int r3 = r7.C
            r0.A(r3)
            boolean r0 = r7.A
            r3 = 0
            if (r0 != 0) goto L_0x0060
            androidx.appcompat.view.menu.f r0 = r7.f
            android.content.Context r4 = r7.b
            int r5 = r7.o
            int r0 = androidx.appcompat.view.menu.k.q(r0, r3, r4, r5)
            r7.B = r0
            r7.A = r2
        L_0x0060:
            androidx.appcompat.widget.w r0 = r7.r
            int r4 = r7.B
            r0.z(r4)
            androidx.appcompat.widget.w r0 = r7.r
            r4 = 2
            r0.C(r4)
            androidx.appcompat.widget.w r0 = r7.r
            android.graphics.Rect r4 = r7.p()
            r0.B(r4)
            androidx.appcompat.widget.w r0 = r7.r
            r0.a()
            androidx.appcompat.widget.w r0 = r7.r
            android.widget.ListView r0 = r0.o()
            r0.setOnKeyListener(r7)
            boolean r4 = r7.D
            if (r4 == 0) goto L_0x00b5
            androidx.appcompat.view.menu.g r4 = r7.c
            java.lang.CharSequence r4 = r4.m
            if (r4 == 0) goto L_0x00b5
            android.content.Context r4 = r7.b
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131623954(0x7f0e0012, float:1.8875074E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00af
            androidx.appcompat.view.menu.g r6 = r7.c
            java.lang.CharSequence r6 = r6.m
            r5.setText(r6)
        L_0x00af:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00b5:
            androidx.appcompat.widget.w r0 = r7.r
            androidx.appcompat.view.menu.f r1 = r7.f
            r0.m(r1)
            androidx.appcompat.widget.w r0 = r7.r
            r0.a()
            goto L_0x0008
        L_0x00c3:
            if (r1 == 0) goto L_0x00c6
            return
        L_0x00c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto L_0x00cf
        L_0x00ce:
            throw r0
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.q.a():void");
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.z && this.r.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z2) {
        if (gVar == this.c) {
            dismiss();
            m.a aVar = this.x;
            if (aVar != null) {
                aVar.c(gVar, z2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void d(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.r.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.x = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.b, rVar, this.w, this.n, this.p, this.q);
            lVar.i(this.x);
            lVar.f(k.z(rVar));
            lVar.h(this.u);
            this.u = null;
            this.c.e(false);
            int c2 = this.r.c();
            int l = this.r.l();
            if ((Gravity.getAbsoluteGravity(this.C, q4.o(this.v)) & 7) == 5) {
                c2 += this.v.getWidth();
            }
            if (lVar.l(c2, l)) {
                m.a aVar = this.x;
                if (aVar == null) {
                    return true;
                }
                aVar.d(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z2) {
        this.A = false;
        f fVar = this.f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView o() {
        return this.r.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.z = true;
        this.c.e(true);
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.y = this.w.getViewTreeObserver();
            }
            this.y.removeGlobalOnLayoutListener(this.s);
            this.y = null;
        }
        this.w.removeOnAttachStateChangeListener(this.t);
        PopupWindow.OnDismissListener onDismissListener = this.u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(View view) {
        this.v = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(boolean z2) {
        this.f.d(z2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(int i) {
        this.C = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i) {
        this.r.e(i);
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.u = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(boolean z2) {
        this.D = z2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void y(int i) {
        this.r.i(i);
    }
}
