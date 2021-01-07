package android.support.wearable.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;

@Deprecated
public class CardScrollView extends FrameLayout {
    private CardFrame a;
    private boolean b;
    private final int c = ((int) (getResources().getDisplayMetrics().density * 8.0f));

    public CardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private boolean a() {
        return this.a != null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0 || !(view instanceof CardFrame)) {
            throw new IllegalStateException("CardScrollView may contain only a single CardFrame.");
        }
        super.addView(view, i, layoutParams);
        this.a = (CardFrame) view;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return false;
    }

    public int getCardGravity() {
        if (a()) {
            return ((FrameLayout.LayoutParams) this.a.getLayoutParams()).gravity;
        }
        return 0;
    }

    public int getExpansionDirection() {
        if (a()) {
            return this.a.getExpansionDirection();
        }
        return 0;
    }

    public float getExpansionFactor() {
        if (a()) {
            return this.a.getExpansionFactor();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        CardFrame cardFrame;
        boolean isRound = windowInsets.isRound();
        if (this.b != isRound) {
            this.b = isRound;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
            int i = this.c;
            layoutParams.leftMargin = -i;
            layoutParams.rightMargin = -i;
            layoutParams.bottomMargin = -i;
            this.a.setLayoutParams(layoutParams);
        }
        if (windowInsets.getSystemWindowInsetBottom() > 0) {
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = systemWindowInsetBottom;
            }
        }
        if (this.b && (cardFrame = this.a) != null) {
            cardFrame.onApplyWindowInsets(windowInsets);
        }
        requestLayout();
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 0) {
            boolean z = getChildAt(0) instanceof CardFrame;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CardFrame cardFrame = this.a;
        if (cardFrame != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cardFrame.getLayoutParams();
            int measuredHeight = this.a.getMeasuredHeight();
            int measuredWidth = this.a.getMeasuredWidth();
            int i5 = i4 - i2;
            boolean z2 = true;
            if (getPaddingTop() + measuredHeight + layoutParams.topMargin > i5 ? this.a.getExpansionDirection() != -1 : (layoutParams.gravity & 112) != 80) {
                z2 = false;
            }
            int paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
            int paddingTop = getPaddingTop() + layoutParams.topMargin;
            int i6 = measuredWidth + paddingLeft;
            int i7 = paddingTop + measuredHeight;
            if (z2) {
                i7 = i5 - (getPaddingBottom() + layoutParams.bottomMargin);
                paddingTop = i7 - measuredHeight;
            }
            this.a.layout(paddingLeft, paddingTop, i6, i7);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CardFrame cardFrame = this.a;
        if (cardFrame != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cardFrame.getLayoutParams();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int size = View.MeasureSpec.getSize(i2) - (getPaddingBottom() + getPaddingTop());
            this.a.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - paddingRight) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin), 1073741824), View.MeasureSpec.makeMeasureSpec(size - (marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), Integer.MIN_VALUE));
        }
        setMeasuredDimension(FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i), FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i2));
    }

    public void setCardGravity(int i) {
        int i2;
        Log.isLoggable("CardScrollView", 3);
        if (a() && ((FrameLayout.LayoutParams) this.a.getLayoutParams()).gravity != (i2 = i & 112)) {
            this.a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, i2));
            requestLayout();
        }
    }

    public void setExpansionDirection(int i) {
        Log.isLoggable("CardScrollView", 3);
        if (a() && i != this.a.getExpansionDirection()) {
            this.a.setExpansionDirection(i);
            if (i == 1 && getScrollY() < 0) {
                scrollTo(0, 0);
            } else if (i == -1 && getScrollY() > 0) {
                scrollTo(0, 0);
            }
            requestLayout();
        }
    }

    public void setExpansionEnabled(boolean z) {
        Log.isLoggable("CardScrollView", 3);
        if (a() && z != this.a.b()) {
            this.a.setExpansionEnabled(z);
            if (!z) {
                scrollTo(0, 0);
            }
        }
    }

    public void setExpansionFactor(float f) {
        Log.isLoggable("CardScrollView", 3);
        if (a()) {
            this.a.setExpansionFactor(f);
        }
    }
}
