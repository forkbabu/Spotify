package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.percentlayout.widget.a;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
    private final a a = new a(this);

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.d();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.a.a(i, i2);
        super.onMeasure(i, i2);
        if (this.a.c()) {
            super.onMeasure(i, i2);
        }
    }

    @Deprecated
    public static class LayoutParams extends RelativeLayout.LayoutParams implements a.b {
        private a.C0042a a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = a.b(context, attributeSet);
        }

        @Override // androidx.percentlayout.widget.a.b
        public a.C0042a a() {
            if (this.a == null) {
                this.a = new a.C0042a();
            }
            return this.a;
        }

        /* access modifiers changed from: protected */
        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
            ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public RelativeLayout.LayoutParams mo7generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
