package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;

public class BottomNavigationView extends FrameLayout {
    private final g a;
    final BottomNavigationMenuView b;
    private final b c;
    private ColorStateList f;
    private MenuInflater n;
    private c o;
    private b p;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            if (BottomNavigationView.this.p != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                BottomNavigationView.this.p.a(menuItem);
                return true;
            } else if (BottomNavigationView.this.o == null || BottomNavigationView.this.o.a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    public interface b {
        void a(MenuItem menuItem);
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    static class d extends l5 {
        public static final Parcelable.Creator<d> CREATOR = new a();
        Bundle c;

        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.bottomNavigationStyle);
    }

    private MenuInflater getMenuInflater() {
        if (this.n == null) {
            this.n = new v0(getContext());
        }
        return this.n;
    }

    public Drawable getItemBackground() {
        return this.b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.b.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f;
    }

    public int getItemTextAppearanceActive() {
        return this.b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.b.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.a;
    }

    public int getSelectedItemId() {
        return this.b.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof yx) {
            zx.b(this, (yx) background);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.a.D(dVar.c);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.c = bundle;
        this.a.F(bundle);
        return dVar;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof yx) {
            ((yx) background).G(f2);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.b.setItemBackground(drawable);
        this.f = null;
    }

    public void setItemBackgroundResource(int i) {
        this.b.setItemBackgroundRes(i);
        this.f = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.b.f() != z) {
            this.b.setItemHorizontalTranslationEnabled(z);
            this.c.j(false);
        }
    }

    public void setItemIconSize(int i) {
        this.b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.b.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            if (colorStateList == null) {
                this.b.setItemBackground(null);
                return;
            }
            ColorStateList a2 = ox.a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.b.setItemBackground(new RippleDrawable(a2, null, null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable l = androidx.core.graphics.drawable.a.l(gradientDrawable);
            androidx.core.graphics.drawable.a.i(l, a2);
            this.b.setItemBackground(l);
        } else if (colorStateList == null && this.b.getItemBackground() != null) {
            this.b.setItemBackground(null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.b.getLabelVisibilityMode() != i) {
            this.b.setLabelVisibilityMode(i);
            this.c.j(false);
        }
    }

    public void setOnNavigationItemReselectedListener(b bVar) {
        this.p = bVar;
    }

    public void setOnNavigationItemSelectedListener(c cVar) {
        this.o = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.a.findItem(i);
        if (findItem != null && !this.a.z(findItem, this.c, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_Design_BottomNavigationView), attributeSet, i);
        b bVar = new b();
        this.c = bVar;
        Context context2 = getContext();
        g aVar = new a(context2);
        this.a = aVar;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2, null);
        this.b = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bVar.a(bottomNavigationMenuView);
        bVar.b(1);
        bottomNavigationMenuView.setPresenter(bVar);
        aVar.b(bVar);
        bVar.m(getContext(), aVar);
        h0 g = j.g(context2, attributeSet, pw.e, i, C0707R.style.Widget_Design_BottomNavigationView, 8, 7);
        if (g.s(5)) {
            bottomNavigationMenuView.setIconTintList(g.c(5));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.e(16842808));
        }
        setItemIconSize(g.f(4, getResources().getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_icon_size)));
        if (g.s(8)) {
            setItemTextAppearanceInactive(g.n(8, 0));
        }
        if (g.s(7)) {
            setItemTextAppearanceActive(g.n(7, 0));
        }
        if (g.s(9)) {
            setItemTextColor(g.c(9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            yx yxVar = new yx();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                yxVar.H(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            yxVar.C(context2);
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            setBackground(yxVar);
        }
        if (g.s(1)) {
            q4.N(this, (float) g.f(1, 0));
        }
        androidx.core.graphics.drawable.a.i(getBackground().mutate(), jx.b(context2, g, 0));
        setLabelVisibilityMode(g.l(10, -1));
        setItemHorizontalTranslationEnabled(g.a(3, true));
        int n2 = g.n(2, 0);
        if (n2 != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(n2);
        } else {
            setItemRippleColor(jx.b(context2, g, 6));
        }
        if (g.s(11)) {
            int n3 = g.n(11, 0);
            bVar.d(true);
            getMenuInflater().inflate(n3, aVar);
            bVar.d(false);
            bVar.j(true);
        }
        g.w();
        addView(bottomNavigationMenuView, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context2);
            view.setBackgroundColor(androidx.core.content.a.b(context2, C0707R.color.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        aVar.G(new a());
        o.b(this, new c(this));
    }
}
