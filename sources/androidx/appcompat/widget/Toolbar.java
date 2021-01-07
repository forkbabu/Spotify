package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private z C;
    private int D;
    private int E;
    private int F;
    private CharSequence G;
    private CharSequence H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList<View> M;
    private final ArrayList<View> N;
    private final int[] O;
    e P;
    private final ActionMenuView.d Q;
    private j0 R;
    private c S;
    private d T;
    private boolean U;
    private final Runnable V;
    private ActionMenuView a;
    private TextView b;
    private TextView c;
    private ImageButton f;
    private ImageView n;
    private Drawable o;
    private CharSequence p;
    ImageButton q;
    View r;
    private Context s;
    private int t;
    private int u;
    private int v;
    int w;
    private int x;
    private int y;
    private int z;

    class a implements ActionMenuView.d {
        a() {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.G();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* access modifiers changed from: private */
    public class d implements m {
        g a;
        i b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public Parcelable e() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.m
        public void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(g gVar, i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.q.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.q);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.q);
            }
            Toolbar.this.r = iVar.getActionView();
            this.b = iVar;
            ViewParent parent2 = Toolbar.this.r.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.r);
                }
                LayoutParams l = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                l.a = 8388611 | (toolbar4.w & 112);
                l.b = 2;
                toolbar4.r.setLayoutParams(l);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.r);
            }
            Toolbar.this.A();
            Toolbar.this.requestLayout();
            iVar.p(true);
            View view = Toolbar.this.r;
            if (view instanceof r0) {
                ((r0) view).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void j(boolean z) {
            if (this.b != null) {
                g gVar = this.a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.a.getItem(i) == this.b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    l(this.a, this.b);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean l(g gVar, i iVar) {
            View view = Toolbar.this.r;
            if (view instanceof r0) {
                ((r0) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.r);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.q);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.r = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            iVar.p(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void m(Context context, g gVar) {
            i iVar;
            g gVar2 = this.a;
            if (!(gVar2 == null || (iVar = this.b) == null)) {
                gVar2.f(iVar);
            }
            this.a = gVar;
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.toolbarStyle);
    }

    private boolean F(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i) {
        boolean z2 = q4.o(this) == 1;
        int childCount = getChildCount();
        int h = e2.h(i, q4.o(this));
        list.clear();
        if (z2) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.b == 0 && F(childAt) && n(layoutParams.a) == h) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && F(childAt2) && n(layoutParams2.a) == h) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.b = 1;
        if (!z2 || this.r == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.N.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new v0(getContext());
    }

    private void h() {
        if (this.C == null) {
            this.C = new z();
        }
    }

    private void i() {
        j();
        if (this.a.B() == null) {
            g gVar = (g) this.a.getMenu();
            if (this.T == null) {
                this.T = new d();
            }
            this.a.setExpandedActionViewsExclusive(true);
            gVar.c(this.T, this.s);
        }
    }

    private void j() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.t);
            this.a.setOnMenuItemClickListener(this.Q);
            this.a.C(null, null);
            LayoutParams l = generateDefaultLayoutParams();
            l.a = 8388613 | (this.w & 112);
            this.a.setLayoutParams(l);
            c(this.a, false);
        }
    }

    private void k() {
        if (this.f == null) {
            this.f = new AppCompatImageButton(getContext(), null, C0707R.attr.toolbarNavigationButtonStyle);
            LayoutParams l = generateDefaultLayoutParams();
            l.a = 8388611 | (this.w & 112);
            this.f.setLayoutParams(l);
        }
    }

    private int n(int i) {
        int o2 = q4.o(this);
        int h = e2.h(i, o2) & 7;
        if (h == 1 || h == 3 || h == 5) {
            return h;
        }
        return o2 == 1 ? 5 : 3;
    }

    private int o(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.F & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int p(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return e2.j(marginLayoutParams) + e2.k(marginLayoutParams);
    }

    private int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private boolean t(View view) {
        return view.getParent() == this || this.N.contains(view);
    }

    private int w(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int o2 = o(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, o2, max + measuredWidth, view.getMeasuredHeight() + o2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    private int x(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int o2 = o(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, o2, max, view.getMeasuredHeight() + o2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int y(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void z(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).b == 2 || childAt == this.a)) {
                removeViewAt(childCount);
                this.N.add(childAt);
            }
        }
    }

    public void B(int i, int i2) {
        h();
        this.C.g(i, i2);
    }

    public void C(g gVar, c cVar) {
        i iVar;
        if (gVar != null || this.a != null) {
            j();
            g B2 = this.a.B();
            if (B2 != gVar) {
                if (B2 != null) {
                    B2.B(this.S);
                    B2.B(this.T);
                }
                if (this.T == null) {
                    this.T = new d();
                }
                cVar.E(true);
                if (gVar != null) {
                    gVar.c(cVar, this.s);
                    gVar.c(this.T, this.s);
                } else {
                    cVar.m(this.s, null);
                    d dVar = this.T;
                    g gVar2 = dVar.a;
                    if (!(gVar2 == null || (iVar = dVar.b) == null)) {
                        gVar2.f(iVar);
                    }
                    dVar.a = null;
                    cVar.j(true);
                    this.T.j(true);
                }
                this.a.setPopupTheme(this.t);
                this.a.setPresenter(cVar);
                this.S = cVar;
            }
        }
    }

    public void D(Context context, int i) {
        this.v = i;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void E(Context context, int i) {
        this.u = i;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public boolean G() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.D();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            addView(this.N.get(size));
        }
        this.N.clear();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.a) != null && actionMenuView.z();
    }

    public void e() {
        i iVar;
        d dVar = this.T;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = dVar.b;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.s();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.q == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C0707R.attr.toolbarNavigationButtonStyle);
            this.q = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.o);
            this.q.setContentDescription(this.p);
            LayoutParams l = generateDefaultLayoutParams();
            l.a = 8388611 | (this.w & 112);
            l.b = 2;
            this.q.setLayoutParams(l);
            this.q.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        z zVar = this.C;
        if (zVar != null) {
            return zVar.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.E;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        z zVar = this.C;
        if (zVar != null) {
            return zVar.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        z zVar = this.C;
        if (zVar != null) {
            return zVar.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        z zVar = this.C;
        if (zVar != null) {
            return zVar.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.D;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        g B2;
        ActionMenuView actionMenuView = this.a;
        if ((actionMenuView == null || (B2 = actionMenuView.B()) == null || !B2.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.E, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (q4.o(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (q4.o(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.D, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.n;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.n;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        i();
        return this.a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.S;
    }

    public Drawable getOverflowIcon() {
        i();
        return this.a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.s;
    }

    public int getPopupTheme() {
        return this.t;
    }

    public CharSequence getSubtitle() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.G;
    }

    public int getTitleMarginBottom() {
        return this.B;
    }

    public int getTitleMarginEnd() {
        return this.z;
    }

    public int getTitleMarginStart() {
        return this.y;
    }

    public int getTitleMarginTop() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.b;
    }

    public p getWrapper() {
        if (this.R == null) {
            this.R = new j0(this, true);
        }
        return this.R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.L = false;
        }
        if (!this.L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.L = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e6 A[LOOP:2: B:107:0x02e4->B:108:0x02e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0338 A[LOOP:3: B:115:0x0336->B:116:0x0338, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 845
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.O;
        boolean z2 = true;
        int i10 = 0;
        if (o0.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (F(this.f)) {
            z(this.f, i, 0, i2, 0, this.x);
            i5 = this.f.getMeasuredWidth() + p(this.f);
            i4 = Math.max(0, this.f.getMeasuredHeight() + q(this.f));
            i3 = View.combineMeasuredStates(0, this.f.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (F(this.q)) {
            z(this.q, i, 0, i2, 0, this.x);
            i5 = this.q.getMeasuredWidth() + p(this.q);
            i4 = Math.max(i4, this.q.getMeasuredHeight() + q(this.q));
            i3 = View.combineMeasuredStates(i3, this.q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i5);
        if (F(this.a)) {
            z(this.a, i, max, i2, 0, this.x);
            i6 = this.a.getMeasuredWidth() + p(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + q(this.a));
            i3 = View.combineMeasuredStates(i3, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (F(this.r)) {
            max2 += y(this.r, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.r.getMeasuredHeight() + q(this.r));
            i3 = View.combineMeasuredStates(i3, this.r.getMeasuredState());
        }
        if (F(this.n)) {
            max2 += y(this.n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.n.getMeasuredHeight() + q(this.n));
            i3 = View.combineMeasuredStates(i3, this.n.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).b == 0 && F(childAt)) {
                max2 += y(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + q(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.A + this.B;
        int i13 = this.y + this.z;
        if (F(this.b)) {
            y(this.b, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.b.getMeasuredWidth() + p(this.b);
            i7 = this.b.getMeasuredHeight() + q(this.b);
            i9 = View.combineMeasuredStates(i3, this.b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (F(this.c)) {
            i8 = Math.max(i8, y(this.c, i, max2 + i13, i2, i7 + i12, iArr));
            i7 = this.c.getMeasuredHeight() + q(this.c) + i7;
            i9 = View.combineMeasuredStates(i9, this.c.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.U) {
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if (F(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i14++;
            }
        }
        z2 = false;
        if (!z2) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        ActionMenuView actionMenuView = this.a;
        g B2 = actionMenuView != null ? actionMenuView.B() : null;
        int i = fVar.c;
        if (!(i == 0 || this.T == null || B2 == null || (findItem = B2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (fVar.f) {
            removeCallbacks(this.V);
            post(this.V);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        h();
        z zVar = this.C;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        zVar.f(z2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        f fVar = new f(super.onSaveInstanceState());
        d dVar = this.T;
        if (!(dVar == null || (iVar = dVar.b) == null)) {
            fVar.c = iVar.getItemId();
        }
        ActionMenuView actionMenuView = this.a;
        fVar.f = actionMenuView != null && actionMenuView.y();
        return fVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
        }
        if (!this.K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public boolean r() {
        d dVar = this.T;
        return (dVar == null || dVar.b == null) ? false : true;
    }

    public boolean s() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.w();
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(i0.b(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.U = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.E) {
            this.E = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.D) {
            this.D = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(i0.b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(i0.b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        k();
        this.f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.P = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        i();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.t != i) {
            this.t = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.B = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.z = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.y = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public boolean u() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.x();
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.y();
    }

    public static class LayoutParams extends ActionBar.LayoutParams {
        int b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.b = layoutParams.b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = 8388627;
        this.M = new ArrayList<>();
        this.N = new ArrayList<>();
        this.O = new int[2];
        this.Q = new a();
        this.V = new b();
        Context context2 = getContext();
        int[] iArr = h0.z;
        h0 v2 = h0.v(context2, attributeSet, iArr, i, 0);
        q4.H(this, context, iArr, attributeSet, v2.r(), i, 0);
        this.u = v2.n(28, 0);
        this.v = v2.n(19, 0);
        this.F = v2.l(0, this.F);
        this.w = v2.l(2, 48);
        int e2 = v2.e(22, 0);
        e2 = v2.s(27) ? v2.e(27, e2) : e2;
        this.B = e2;
        this.A = e2;
        this.z = e2;
        this.y = e2;
        int e3 = v2.e(25, -1);
        if (e3 >= 0) {
            this.y = e3;
        }
        int e4 = v2.e(24, -1);
        if (e4 >= 0) {
            this.z = e4;
        }
        int e5 = v2.e(26, -1);
        if (e5 >= 0) {
            this.A = e5;
        }
        int e6 = v2.e(23, -1);
        if (e6 >= 0) {
            this.B = e6;
        }
        this.x = v2.f(13, -1);
        int e7 = v2.e(9, Integer.MIN_VALUE);
        int e8 = v2.e(5, Integer.MIN_VALUE);
        int f2 = v2.f(7, 0);
        int f3 = v2.f(8, 0);
        h();
        this.C.e(f2, f3);
        if (!(e7 == Integer.MIN_VALUE && e8 == Integer.MIN_VALUE)) {
            this.C.g(e7, e8);
        }
        this.D = v2.e(10, Integer.MIN_VALUE);
        this.E = v2.e(6, Integer.MIN_VALUE);
        this.o = v2.g(4);
        this.p = v2.p(3);
        CharSequence p2 = v2.p(21);
        if (!TextUtils.isEmpty(p2)) {
            setTitle(p2);
        }
        CharSequence p3 = v2.p(18);
        if (!TextUtils.isEmpty(p3)) {
            setSubtitle(p3);
        }
        this.s = getContext();
        setPopupTheme(v2.n(17, 0));
        Drawable g = v2.g(16);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p4 = v2.p(15);
        if (!TextUtils.isEmpty(p4)) {
            setNavigationContentDescription(p4);
        }
        Drawable g2 = v2.g(11);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p5 = v2.p(12);
        if (!TextUtils.isEmpty(p5)) {
            setLogoDescription(p5);
        }
        if (v2.s(29)) {
            setTitleTextColor(v2.c(29));
        }
        if (v2.s(20)) {
            setSubtitleTextColor(v2.c(20));
        }
        if (v2.s(14)) {
            getMenuInflater().inflate(v2.n(14, 0), getMenu());
        }
        v2.w();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.q.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.o);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.n == null) {
                this.n = new AppCompatImageView(getContext());
            }
            if (!t(this.n)) {
                c(this.n, true);
            }
        } else {
            ImageView imageView = this.n;
            if (imageView != null && t(imageView)) {
                removeView(this.n);
                this.N.remove(this.n);
            }
        }
        ImageView imageView2 = this.n;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.n == null) {
            this.n = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            k();
        }
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!t(this.f)) {
                c(this.f, true);
            }
        } else {
            ImageButton imageButton = this.f;
            if (imageButton != null && t(imageButton)) {
                removeView(this.f);
                this.N.remove(this.f);
            }
        }
        ImageButton imageButton2 = this.f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.v;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!t(this.c)) {
                c(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && t(textView)) {
                removeView(this.c);
                this.N.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.H = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.J = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.u;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!t(this.b)) {
                c(this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && t(textView)) {
                removeView(this.b);
                this.N.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class f extends l5 {
        public static final Parcelable.Creator<f> CREATOR = new a();
        int c;
        boolean f;

        class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new f[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.f = parcel.readInt() != 0;
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
