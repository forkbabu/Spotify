package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private m.a G;
    ViewTreeObserver H;
    private PopupWindow.OnDismissListener I;
    boolean J;
    private final Context b;
    private final int c;
    private final int f;
    private final int n;
    private final boolean o;
    final Handler p;
    private final List<g> q = new ArrayList();
    final List<C0017d> r = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener s = new a();
    private final View.OnAttachStateChangeListener t = new b();
    private final v u = new c();
    private int v;
    private int w;
    private View x;
    View y;
    private int z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d.this.b() && d.this.r.size() > 0 && !d.this.r.get(0).a.w()) {
                View view = d.this.y;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0017d dVar : d.this.r) {
                    dVar.a.a();
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
            ViewTreeObserver viewTreeObserver = d.this.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.H = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.H.removeGlobalOnLayoutListener(dVar.s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements v {

        class a implements Runnable {
            final /* synthetic */ C0017d a;
            final /* synthetic */ MenuItem b;
            final /* synthetic */ g c;

            a(C0017d dVar, MenuItem menuItem, g gVar) {
                this.a = dVar;
                this.b = menuItem;
                this.c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0017d dVar = this.a;
                if (dVar != null) {
                    d.this.J = true;
                    dVar.b.e(false);
                    d.this.J = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.y(this.b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.v
        public void d(g gVar, MenuItem menuItem) {
            C0017d dVar = null;
            d.this.p.removeCallbacksAndMessages(null);
            int size = d.this.r.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.r.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.r.size()) {
                    dVar = d.this.r.get(i2);
                }
                d.this.p.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.v
        public void n(g gVar, MenuItem menuItem) {
            d.this.p.removeCallbacksAndMessages(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    public static class C0017d {
        public final w a;
        public final g b;
        public final int c;

        public C0017d(w wVar, g gVar, int i) {
            this.a = wVar;
            this.b = gVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.o();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z2) {
        int i3 = 0;
        this.v = 0;
        this.w = 0;
        this.b = context;
        this.x = view;
        this.f = i;
        this.n = i2;
        this.o = z2;
        this.E = false;
        this.z = q4.o(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0707R.dimen.abc_config_prefDialogWidth));
        this.p = new Handler();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        if (((r7.getWidth() + r8[0]) + r2) > r10.right) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
        if ((r8[0] - r2) < 0) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012a, code lost:
        r7 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A(androidx.appcompat.view.menu.g r15) {
        /*
        // Method dump skipped, instructions count: 495
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.A(androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (!b()) {
            for (g gVar : this.q) {
                A(gVar);
            }
            this.q.clear();
            View view = this.x;
            this.y = view;
            if (view != null) {
                boolean z2 = this.H == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.H = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.s);
                }
                this.y.addOnAttachStateChangeListener(this.t);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.r.size() > 0 && this.r.get(0).a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z2) {
        int size = this.r.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gVar == this.r.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.r.size()) {
                this.r.get(i2).b.e(false);
            }
            C0017d remove = this.r.remove(i);
            remove.b.B(this);
            if (this.J) {
                remove.a.J(null);
                remove.a.y(0);
            }
            remove.a.dismiss();
            int size2 = this.r.size();
            if (size2 > 0) {
                this.z = this.r.get(size2 - 1).c;
            } else {
                this.z = q4.o(this.x) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.G;
                if (aVar != null) {
                    aVar.c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.H;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.H.removeGlobalOnLayoutListener(this.s);
                    }
                    this.H = null;
                }
                this.y.removeOnAttachStateChangeListener(this.t);
                this.I.onDismiss();
            } else if (z2) {
                this.r.get(0).b.e(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void d(g gVar) {
        gVar.c(this, this.b);
        if (b()) {
            A(gVar);
        } else {
            this.q.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.r.size();
        if (size > 0) {
            C0017d[] dVarArr = (C0017d[]) this.r.toArray(new C0017d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0017d dVar = dVarArr[i];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
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
        this.G = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        for (C0017d dVar : this.r) {
            if (rVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.c(this, this.b);
        if (b()) {
            A(rVar);
        } else {
            this.q.add(rVar);
        }
        m.a aVar = this.G;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z2) {
        for (C0017d dVar : this.r) {
            ListAdapter adapter = dVar.a().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.k
    public boolean n() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView o() {
        if (this.r.isEmpty()) {
            return null;
        }
        List<C0017d> list = this.r;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0017d dVar;
        int size = this.r.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.r.get(i);
            if (!dVar.a.b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.x != view) {
            this.x = view;
            this.w = e2.h(this.v, q4.o(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(boolean z2) {
        this.E = z2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(int i) {
        if (this.v != i) {
            this.v = i;
            this.w = e2.h(i, q4.o(this.x));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i) {
        this.A = true;
        this.C = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.I = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(boolean z2) {
        this.F = z2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void y(int i) {
        this.B = true;
        this.D = i;
    }
}
