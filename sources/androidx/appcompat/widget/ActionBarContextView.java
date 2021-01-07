package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.c;
import com.spotify.music.C0707R;

public class ActionBarContextView extends a {
    private boolean A;
    private int B;
    private CharSequence r;
    private CharSequence s;
    private View t;
    private View u;
    private LinearLayout v;
    private TextView w;
    private TextView x;
    private int y;
    private int z;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {
        final /* synthetic */ q0 a;

        a(ActionBarContextView actionBarContextView, q0 q0Var) {
            this.a = q0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.actionModeStyle);
    }

    private void g() {
        if (this.v == null) {
            LayoutInflater.from(getContext()).inflate(C0707R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.v = linearLayout;
            this.w = (TextView) linearLayout.findViewById(C0707R.id.action_bar_title);
            this.x = (TextView) this.v.findViewById(C0707R.id.action_bar_subtitle);
            if (this.y != 0) {
                this.w.setTextAppearance(getContext(), this.y);
            }
            if (this.z != 0) {
                this.x.setTextAppearance(getContext(), this.z);
            }
        }
        this.w.setText(this.r);
        this.x.setText(this.s);
        boolean z2 = !TextUtils.isEmpty(this.r);
        boolean z3 = !TextUtils.isEmpty(this.s);
        int i = 0;
        this.x.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.v;
        if (!z2 && !z3) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.v.getParent() == null) {
            addView(this.v);
        }
    }

    public void e() {
        if (this.t == null) {
            i();
        }
    }

    public void f(q0 q0Var) {
        View view = this.t;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.B, (ViewGroup) this, false);
            this.t = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.t);
        }
        this.t.findViewById(C0707R.id.action_mode_close_button).setOnClickListener(new a(this, q0Var));
        g gVar = (g) q0Var.e();
        c cVar = this.f;
        if (cVar != null) {
            cVar.z();
        }
        c cVar2 = new c(getContext());
        this.f = cVar2;
        cVar2.H(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f, this.b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f.p(this);
        this.c = actionMenuView;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.s;
    }

    public CharSequence getTitle() {
        return this.r;
    }

    public boolean h() {
        return this.A;
    }

    public void i() {
        removeAllViews();
        this.u = null;
        this.c = null;
    }

    public x4 j(int i, long j) {
        x4 x4Var = this.o;
        if (x4Var != null) {
            x4Var.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            x4 a2 = q4.a(this);
            a2.a(1.0f);
            a2.d(j);
            a.C0018a aVar = this.a;
            a.this.o = a2;
            aVar.b = i;
            a2.f(aVar);
            return a2;
        }
        x4 a3 = q4.a(this);
        a3.a(0.0f);
        a3.d(j);
        a.C0018a aVar2 = this.a;
        a.this.o = a3;
        aVar2.b = i;
        a3.f(aVar2);
        return a3;
    }

    public boolean k() {
        c cVar = this.f;
        if (cVar != null) {
            return cVar.I();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f;
        if (cVar != null) {
            cVar.B();
            c.a aVar = this.f.E;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.r);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean b = o0.b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.t;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = b ? paddingRight - i5 : paddingRight + i5;
            int d = i7 + d(this.t, i7, paddingTop, paddingTop2, b);
            paddingRight = b ? d - i6 : d + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.v;
        if (!(linearLayout == null || this.u != null || linearLayout.getVisibility() == 8)) {
            i8 += d(this.v, i8, paddingTop, paddingTop2, b);
        }
        View view2 = this.u;
        if (view2 != null) {
            d(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.n;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.t;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.v;
            if (linearLayout != null && this.u == null) {
                if (this.A) {
                    this.v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.v.getMeasuredWidth();
                    boolean z2 = measuredWidth <= paddingLeft;
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    this.v.setVisibility(z2 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.u;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.n <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i) {
        this.n = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.u;
        if (view2 != null) {
            removeView(view2);
        }
        this.u = view;
        if (!(view == null || (linearLayout = this.v) == null)) {
            removeView(linearLayout);
            this.v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.s = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.r = charSequence;
        g();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.A) {
            requestLayout();
        }
        this.A = z2;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h0 v2 = h0.v(context, attributeSet, h0.d, i, 0);
        Drawable g = v2.g(0);
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(g);
        this.y = v2.n(5, 0);
        this.z = v2.n(4, 0);
        this.n = v2.m(3, 0);
        this.B = v2.n(2, C0707R.layout.abc_action_mode_close_item_material);
        v2.w();
    }
}
