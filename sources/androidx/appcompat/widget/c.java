package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import com.spotify.music.C0707R;
import defpackage.a4;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class c extends androidx.appcompat.view.menu.b implements a4.a {
    private boolean A;
    private int B;
    private final SparseBooleanArray C = new SparseBooleanArray();
    e D;
    a E;
    RunnableC0019c F;
    private b G;
    final f H = new f();
    int I;
    d s;
    private Drawable t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    /* access modifiers changed from: private */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, C0707R.attr.actionOverflowMenuStyle, 0);
            if (!((i) rVar.getItem()).k()) {
                View view2 = c.this.s;
                e(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).q : view2);
            }
            i(c.this.H);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void d() {
            c cVar = c.this;
            cVar.E = null;
            cVar.I = 0;
            super.d();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p a() {
            a aVar = c.this.E;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class RunnableC0019c implements Runnable {
        private e a;

        public RunnableC0019c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).c != null) {
                ((androidx.appcompat.view.menu.b) c.this).c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).q;
            if (!(view == null || view.getWindowToken() == null || !this.a.k())) {
                c.this.D = this.a;
            }
            c.this.F = null;
        }
    }

    /* access modifiers changed from: private */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends t {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.t
            public p b() {
                e eVar = c.this.D;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // androidx.appcompat.widget.t
            public boolean c() {
                c.this.I();
                return true;
            }

            @Override // androidx.appcompat.widget.t
            public boolean d() {
                c cVar = c.this;
                if (cVar.F != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C0707R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            k0.b(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.I();
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* access modifiers changed from: private */
    public class e extends l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, C0707R.attr.actionOverflowMenuStyle, 0);
            g(8388613);
            i(c.this.H);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void d() {
            if (((androidx.appcompat.view.menu.b) c.this).c != null) {
                ((androidx.appcompat.view.menu.b) c.this).c.e(true);
            }
            c.this.D = null;
            super.d();
        }
    }

    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.q().e(false);
            }
            m.a n = c.this.n();
            if (n != null) {
                n.c(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).c) {
                return false;
            }
            c.this.I = ((i) ((r) gVar).getItem()).getItemId();
            m.a n = c.this.n();
            if (n != null) {
                return n.d(gVar);
            }
            return false;
        }
    }

    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int a;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }

        g(Parcel parcel) {
            this.a = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, C0707R.layout.abc_action_menu_layout, C0707R.layout.abc_action_menu_item_layout);
    }

    public Drawable A() {
        d dVar = this.s;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.u) {
            return this.t;
        }
        return null;
    }

    public boolean B() {
        n nVar;
        RunnableC0019c cVar = this.F;
        if (cVar == null || (nVar = this.q) == null) {
            e eVar = this.D;
            if (eVar == null) {
                return false;
            }
            eVar.a();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.F = null;
        return true;
    }

    public boolean C() {
        e eVar = this.D;
        return eVar != null && eVar.c();
    }

    public void D() {
        this.z = p0.b(this.b).d();
        androidx.appcompat.view.menu.g gVar = this.c;
        if (gVar != null) {
            gVar.x(true);
        }
    }

    public void E(boolean z2) {
        this.A = z2;
    }

    public void F(ActionMenuView actionMenuView) {
        this.q = actionMenuView;
        actionMenuView.a(this.c);
    }

    public void G(Drawable drawable) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.u = true;
        this.t = drawable;
    }

    public void H(boolean z2) {
        this.v = z2;
        this.w = true;
    }

    public boolean I() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.v || C() || (gVar = this.c) == null || this.q == null || this.F != null || gVar.p().isEmpty()) {
            return false;
        }
        RunnableC0019c cVar = new RunnableC0019c(new e(this.b, this.c, this.s, true));
        this.F = cVar;
        ((View) this.q).post(cVar);
        return true;
    }

    @Override // defpackage.a4.a
    public void a(boolean z2) {
        if (z2) {
            super.i(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.c;
        if (gVar != null) {
            gVar.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public void b(i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.q);
        if (this.G == null) {
            this.G = new b();
        }
        actionMenuItemView.setPopupCallback(this.G);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z2) {
        z();
        super.c(gVar, z2);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean d(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.s) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        g gVar = new g();
        gVar.a = this.I;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).a) > 0 && (findItem = this.c.findItem(i)) != null) {
            i((r) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.S() != this.c) {
            rVar2 = (r) rVar2.S();
        }
        MenuItem item = rVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.q;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == item) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.I = ((i) rVar.getItem()).getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item2 = rVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.b, rVar, view);
        this.E = aVar;
        aVar.f(z2);
        if (this.E.k()) {
            super.i(rVar);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void j(boolean z2) {
        n nVar;
        super.j(z2);
        ((View) this.q).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.c;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<i> l = gVar.l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                a4 a2 = l.get(i).a();
                if (a2 != null) {
                    a2.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.c;
        ArrayList<i> p = gVar2 != null ? gVar2.p() : null;
        if (this.v && p != null) {
            int size2 = p.size();
            if (size2 == 1) {
                z3 = !p.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.s == null) {
                this.s = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.s.getParent();
            if (viewGroup != this.q) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.s);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.q;
                d dVar = this.s;
                ActionMenuView.LayoutParams t2 = actionMenuView.j();
                t2.c = true;
                actionMenuView.addView(dVar, t2);
            }
        } else {
            d dVar2 = this.s;
            if (dVar2 != null && dVar2.getParent() == (nVar = this.q)) {
                ((ViewGroup) nVar).removeView(this.s);
            }
        }
        ((ActionMenuView) this.q).setOverflowReserved(this.v);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k() {
        int i;
        ArrayList<i> arrayList;
        boolean z2;
        androidx.appcompat.view.menu.g gVar = this.c;
        View view = null;
        if (gVar != null) {
            arrayList = gVar.r();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.z;
        int i3 = this.y;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.q;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z2 = true;
            if (i4 >= i) {
                break;
            }
            i iVar = arrayList.get(i4);
            if (iVar.n()) {
                i5++;
            } else if (iVar.m()) {
                i6++;
            } else {
                z3 = true;
            }
            if (this.A && iVar.isActionViewExpanded()) {
                i2 = 0;
            }
            i4++;
        }
        if (this.v && (z3 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.C;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            i iVar2 = arrayList.get(i8);
            if (iVar2.n()) {
                View o = o(iVar2, view, viewGroup);
                o.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = o.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z2);
                }
                iVar2.s(z2);
            } else if (iVar2.m()) {
                int groupId2 = iVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i7 > 0 || z4) && i3 > 0;
                if (z5) {
                    View o2 = o(iVar2, view, viewGroup);
                    o2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = o2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z5 &= i3 + i9 > 0;
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z2);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i10 = 0; i10 < i8; i10++) {
                        i iVar3 = arrayList.get(i10);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.k()) {
                                i7++;
                            }
                            iVar3.s(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                iVar2.s(z5);
            } else {
                iVar2.s(false);
                i8++;
                view = null;
                z2 = true;
            }
            i8++;
            view = null;
            z2 = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void m(Context context, androidx.appcompat.view.menu.g gVar) {
        super.m(context, gVar);
        Resources resources = context.getResources();
        p0 b2 = p0.b(context);
        if (!this.w) {
            this.v = b2.h();
        }
        this.x = b2.c();
        this.z = b2.d();
        int i = this.x;
        if (this.v) {
            if (this.s == null) {
                d dVar = new d(this.a);
                this.s = dVar;
                if (this.u) {
                    dVar.setImageDrawable(this.t);
                    this.t = null;
                    this.u = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.s.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.s.getMeasuredWidth();
        } else {
            this.s = null;
        }
        this.y = i;
        this.B = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public View o(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.i()) {
            actionView = super.o(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public n p(ViewGroup viewGroup) {
        n nVar = this.q;
        n p = super.p(viewGroup);
        if (nVar != p) {
            ((ActionMenuView) p).setPresenter(this);
        }
        return p;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean r(int i, i iVar) {
        return iVar.k();
    }

    public boolean z() {
        boolean z2;
        boolean B2 = B();
        a aVar = this.E;
        if (aVar != null) {
            aVar.a();
            z2 = true;
        } else {
            z2 = false;
        }
        return B2 | z2;
    }
}
