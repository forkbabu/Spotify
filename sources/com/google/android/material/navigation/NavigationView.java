package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.d;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] v = {16842912};
    private static final int[] w = {-16842910};
    private final com.google.android.material.internal.c o;
    private final d p;
    b q;
    private final int r;
    private final int[] s;
    private MenuInflater t;
    private ViewTreeObserver.OnGlobalLayoutListener u;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            b bVar = NavigationView.this.q;
            return bVar != null && bVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    public interface b {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.navigationViewStyle);
    }

    private ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = i0.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0707R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        int[] iArr = w;
        return new ColorStateList(new int[][]{iArr, v, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.t == null) {
            this.t = new v0(getContext());
        }
        return this.t;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void a(b5 b5Var) {
        this.p.b(b5Var);
    }

    public MenuItem getCheckedItem() {
        return this.p.d();
    }

    public int getHeaderCount() {
        return this.p.n();
    }

    public Drawable getItemBackground() {
        return this.p.o();
    }

    public int getItemHorizontalPadding() {
        return this.p.p();
    }

    public int getItemIconPadding() {
        return this.p.q();
    }

    public ColorStateList getItemIconTintList() {
        return this.p.t();
    }

    public int getItemMaxLines() {
        return this.p.r();
    }

    public ColorStateList getItemTextColor() {
        return this.p.s();
    }

    public Menu getMenu() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof yx) {
            zx.b(this, (yx) background);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        getViewTreeObserver().removeOnGlobalLayoutListener(this.u);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.r), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.r, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        this.o.D(cVar.c);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.c = bundle;
        this.o.F(bundle);
        return cVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.o.findItem(i);
        if (findItem != null) {
            this.p.x((i) findItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        Drawable background = getBackground();
        if (background instanceof yx) {
            ((yx) background).G(f);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.p.z(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(androidx.core.content.a.d(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.p.A(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.p.A(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.p.B(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.p.B(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.p.C(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.p.D(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.p.E(i);
    }

    public void setItemTextAppearance(int i) {
        this.p.F(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.p.G(colorStateList);
    }

    public void setNavigationItemSelectedListener(b bVar) {
        this.q = bVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        d dVar = this.p;
        if (dVar != null) {
            dVar.H(i);
        }
    }

    public static class c extends l5 {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public Bundle c;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader);
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_Design_NavigationView), attributeSet, i);
        ColorStateList colorStateList;
        boolean z;
        int i2;
        d dVar = new d();
        this.p = dVar;
        this.s = new int[2];
        Context context2 = getContext();
        com.google.android.material.internal.c cVar = new com.google.android.material.internal.c(context2);
        this.o = cVar;
        h0 g = j.g(context2, attributeSet, pw.D, i, C0707R.style.Widget_Design_NavigationView, new int[0]);
        if (g.s(0)) {
            Drawable g2 = g.g(0);
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            setBackground(g2);
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            yx yxVar = new yx();
            if (background instanceof ColorDrawable) {
                yxVar.H(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            yxVar.C(context2);
            int i5 = q4.g;
            int i6 = Build.VERSION.SDK_INT;
            setBackground(yxVar);
        }
        if (g.s(3)) {
            setElevation((float) g.f(3, 0));
        }
        setFitsSystemWindows(g.a(1, false));
        this.r = g.f(2, 0);
        if (g.s(9)) {
            colorStateList = g.c(9);
        } else {
            colorStateList = d(16842808);
        }
        if (g.s(18)) {
            i2 = g.n(18, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        if (g.s(8)) {
            setItemIconSize(g.f(8, 0));
        }
        ColorStateList colorStateList2 = g.s(19) ? g.c(19) : null;
        if (!z && colorStateList2 == null) {
            colorStateList2 = d(16842806);
        }
        Drawable g3 = g.g(5);
        if (g3 == null) {
            if (g.s(11) || g.s(12)) {
                yx yxVar2 = new yx(dy.a(getContext(), g.n(11, 0), g.n(12, 0)).m());
                yxVar2.H(jx.b(getContext(), g, 13));
                g3 = new InsetDrawable((Drawable) yxVar2, g.f(16, 0), g.f(17, 0), g.f(15, 0), g.f(14, 0));
            }
        }
        if (g.s(6)) {
            dVar.A(g.f(6, 0));
        }
        int f = g.f(7, 0);
        setItemMaxLines(g.k(10, 1));
        cVar.G(new a());
        dVar.y(1);
        dVar.m(context2, cVar);
        dVar.D(colorStateList);
        dVar.H(getOverScrollMode());
        if (z) {
            dVar.F(i2);
        }
        dVar.G(colorStateList2);
        dVar.z(g3);
        dVar.B(f);
        cVar.b(dVar);
        addView((View) dVar.u(this));
        if (g.s(20)) {
            int n = g.n(20, 0);
            dVar.I(true);
            getMenuInflater().inflate(n, cVar);
            dVar.I(false);
            dVar.j(false);
        }
        if (g.s(4)) {
            dVar.v(g.n(4, 0));
        }
        g.w();
        this.u = new a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.u);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.o.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.p.x((i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
