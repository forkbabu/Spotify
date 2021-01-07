package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.u;
import com.spotify.music.C0707R;
import defpackage.d5;
import java.util.HashSet;

public class BottomNavigationMenuView extends ViewGroup implements n {
    private static final int[] I = {16842912};
    private static final int[] J = {-16842910};
    private int A;
    private int B;
    private Drawable C;
    private int D;
    private int[] E;
    private SparseArray<bx> F = new SparseArray<>(5);
    private b G;
    private g H;
    private final TransitionSet a;
    private final int b;
    private final int c;
    private final int f;
    private final int n;
    private final int o;
    private final View.OnClickListener p;
    private final w3<BottomNavigationItemView> q = new x3(5);
    private boolean r;
    private int s;
    private BottomNavigationItemView[] t;
    private int u = 0;
    private int v = 0;
    private ColorStateList w;
    private int x;
    private ColorStateList y;
    private final ColorStateList z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i itemData = ((BottomNavigationItemView) view).getItemData();
            if (!BottomNavigationMenuView.this.H.z(itemData, BottomNavigationMenuView.this.G, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.b = resources.getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_item_max_width);
        this.c = resources.getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_item_min_width);
        this.f = resources.getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_active_item_max_width);
        this.n = resources.getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_active_item_min_width);
        this.o = resources.getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_height);
        this.z = e(16842808);
        AutoTransition autoTransition = new AutoTransition();
        this.a = autoTransition;
        autoTransition.i0(0);
        autoTransition.g0(115);
        autoTransition.V(new y5());
        autoTransition.c0(new com.google.android.material.internal.i());
        this.p = new a();
        this.E = new int[5];
        q4.O(this, 1);
    }

    private boolean g(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView a2 = this.q.a();
        return a2 == null ? new BottomNavigationItemView(getContext(), null) : a2;
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        bx bxVar;
        int id = bottomNavigationItemView.getId();
        if ((id != -1) && (bxVar = this.F.get(id)) != null) {
            bottomNavigationItemView.setBadge(bxVar);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar) {
        this.H = gVar;
    }

    public void d() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.q.b(bottomNavigationItemView);
                    bottomNavigationItemView.g();
                }
            }
        }
        if (this.H.size() == 0) {
            this.u = 0;
            this.v = 0;
            this.t = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.H.size(); i++) {
            hashSet.add(Integer.valueOf(this.H.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            int keyAt = this.F.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.F.delete(keyAt);
            }
        }
        this.t = new BottomNavigationItemView[this.H.size()];
        boolean g = g(this.s, this.H.r().size());
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            this.G.d(true);
            this.H.getItem(i3).setCheckable(true);
            this.G.d(false);
            BottomNavigationItemView newItem = getNewItem();
            this.t[i3] = newItem;
            newItem.setIconTintList(this.w);
            newItem.setIconSize(this.x);
            newItem.setTextColor(this.z);
            newItem.setTextAppearanceInactive(this.A);
            newItem.setTextAppearanceActive(this.B);
            newItem.setTextColor(this.y);
            Drawable drawable = this.C;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.D);
            }
            newItem.setShifting(g);
            newItem.setLabelVisibilityMode(this.s);
            newItem.e((i) this.H.getItem(i3), 0);
            newItem.setItemPosition(i3);
            newItem.setOnClickListener(this.p);
            if (this.u != 0 && this.H.getItem(i3).getItemId() == this.u) {
                this.v = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.H.size() - 1, this.v);
        this.v = min;
        this.H.getItem(min).setChecked(true);
    }

    public ColorStateList e(int i) {
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
        int[] iArr = J;
        return new ColorStateList(new int[][]{iArr, I, ViewGroup.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public boolean f() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<bx> getBadgeDrawables() {
        return this.F;
    }

    public ColorStateList getIconTintList() {
        return this.w;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) {
            return this.C;
        }
        return bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.D;
    }

    public int getItemIconSize() {
        return this.x;
    }

    public int getItemTextAppearanceActive() {
        return this.B;
    }

    public int getItemTextAppearanceInactive() {
        return this.A;
    }

    public ColorStateList getItemTextColor() {
        return this.y;
    }

    public int getLabelVisibilityMode() {
        return this.s;
    }

    public int getSelectedItemId() {
        return this.u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void h(int i) {
        int size = this.H.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.H.getItem(i2);
            if (i == item.getItemId()) {
                this.u = i;
                this.v = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public void i() {
        g gVar = this.H;
        if (!(gVar == null || this.t == null)) {
            int size = gVar.size();
            if (size != this.t.length) {
                d();
                return;
            }
            int i = this.u;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.H.getItem(i2);
                if (item.isChecked()) {
                    this.u = item.getItemId();
                    this.v = i2;
                }
            }
            if (i != this.u) {
                u.a(this, this.a);
            }
            boolean g = g(this.s, this.H.r().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.G.d(true);
                this.t[i3].setLabelVisibilityMode(this.s);
                this.t[i3].setShifting(g);
                this.t[i3].e((i) this.H.getItem(i3), 0);
                this.G.d(false);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d5.v0(accessibilityNodeInfo).T(d5.b.b(1, this.H.r().size(), false, 1));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (q4.o(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.H.r().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        if (!g(this.s, size2) || !this.r) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.E;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.E[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.v);
            int i5 = this.n;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.c * i6), Math.min(i5, this.f));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.b);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.E;
                    iArr2[i9] = i9 == this.v ? min2 : min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.E[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.E[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.o, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<bx> sparseArray) {
        this.F = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.w = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.C = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.D = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.r = z2;
    }

    public void setItemIconSize(int i) {
        this.x = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.B = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.y;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.y;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.y = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.t;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.s = i;
    }

    public void setPresenter(b bVar) {
        this.G = bVar;
    }
}
