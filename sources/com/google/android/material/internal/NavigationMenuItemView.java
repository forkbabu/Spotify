package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.k0;
import androidx.core.widget.c;
import com.spotify.music.C0707R;

public class NavigationMenuItemView extends ForegroundLinearLayout implements n.a {
    private static final int[] O = {16842912};
    private int E;
    private boolean F;
    boolean G;
    private final CheckedTextView H;
    private FrameLayout I;
    private i J;
    private ColorStateList K;
    private boolean L;
    private Drawable M;
    private final z3 N;

    class a extends z3 {
        a() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.P(NavigationMenuItemView.this.G);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.I == null) {
                this.I = (FrameLayout) ((ViewStub) findViewById(C0707R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.I.removeAllViews();
            this.I.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i) {
        StateListDrawable stateListDrawable;
        this.J = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0707R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(O, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            setBackground(stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        k0.b(this, iVar.getTooltipText());
        if (!(this.J.getTitle() == null && this.J.getIcon() == null && this.J.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.H.setVisibility(8);
            FrameLayout frameLayout = this.I;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.I.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.H.setVisibility(0);
        FrameLayout frameLayout2 = this.I;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            this.I.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.J;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean h() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.J;
        if (iVar != null && iVar.isCheckable() && this.J.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    public void s() {
        FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.H.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.G != z) {
            this.G = z;
            this.N.sendAccessibilityEvent(this.H, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.H.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.L) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
                androidx.core.graphics.drawable.a.i(drawable, this.K);
            }
            int i = this.E;
            drawable.setBounds(0, 0, i, i);
        } else if (this.F) {
            if (this.M == null) {
                Drawable d = i2.d(getResources(), C0707R.drawable.navigation_empty_icon, getContext().getTheme());
                this.M = d;
                if (d != null) {
                    int i2 = this.E;
                    d.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.M;
        }
        c.g(this.H, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.H.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.E = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.K = colorStateList;
        this.L = colorStateList != null;
        i iVar = this.J;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.H.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.F = z;
    }

    public void setTextAppearance(int i) {
        c.n(this.H, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.H.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.N = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0707R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C0707R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0707R.id.design_menu_item_text);
        this.H = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        q4.I(checkedTextView, aVar);
    }
}
