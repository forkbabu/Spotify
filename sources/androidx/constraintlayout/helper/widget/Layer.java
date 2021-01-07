package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

public class Layer extends ConstraintHelper {
    protected float A = Float.NaN;
    protected float B = Float.NaN;
    protected float C = Float.NaN;
    boolean D = true;
    View[] E = null;
    private float F = 0.0f;
    private float G = 0.0f;
    private boolean H;
    private boolean I;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    ConstraintLayout u;
    private float v = 1.0f;
    private float w = 1.0f;
    protected float x = Float.NaN;
    protected float y = Float.NaN;
    protected float z = Float.NaN;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void r() {
        int i;
        if (!(this.u == null || (i = this.b) == 0)) {
            View[] viewArr = this.E;
            if (viewArr == null || viewArr.length != i) {
                this.E = new View[i];
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                this.E[i2] = this.u.getViewById(this.a[i2]);
            }
        }
    }

    private void s() {
        if (this.u != null) {
            if (this.E == null) {
                r();
            }
            q();
            double radians = Float.isNaN(this.t) ? 0.0d : Math.toRadians((double) this.t);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.v;
            float f2 = f * cos;
            float f3 = this.w;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.b; i++) {
                View view = this.E[i];
                int left = view.getLeft();
                int top = view.getTop();
                float right = ((float) ((view.getRight() + left) / 2)) - this.x;
                float bottom = ((float) ((view.getBottom() + top) / 2)) - this.y;
                view.setTranslationX((((f4 * bottom) + (f2 * right)) - right) + this.F);
                view.setTranslationY((((f6 * bottom) + (right * f5)) - bottom) + this.G);
                view.setScaleY(this.w);
                view.setScaleX(this.v);
                if (!Float.isNaN(this.t)) {
                    view.setRotation(this.t);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.H = true;
                } else if (index == 13) {
                    this.I = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void k(ConstraintLayout constraintLayout) {
        r();
        this.x = Float.NaN;
        this.y = Float.NaN;
        ConstraintWidget a = ((ConstraintLayout.LayoutParams) getLayoutParams()).a();
        a.G0(0);
        a.o0(0);
        q();
        layout(((int) this.B) - getPaddingLeft(), ((int) this.C) - getPaddingTop(), getPaddingRight() + ((int) this.z), getPaddingBottom() + ((int) this.A));
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void m(ConstraintLayout constraintLayout) {
        this.u = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.t = rotation;
        } else if (!Float.isNaN(this.t)) {
            this.t = rotation;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = (ConstraintLayout) getParent();
        if (this.H || this.I) {
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.b; i++) {
                View viewById = this.u.getViewById(this.a[i]);
                if (viewById != null) {
                    if (this.H) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.I && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        if (this.u != null) {
            if (!(this.D || Float.isNaN(this.x) || Float.isNaN(this.y))) {
                return;
            }
            if (Float.isNaN(this.r) || Float.isNaN(this.s)) {
                View[] g = g(this.u);
                int left = g[0].getLeft();
                int top = g[0].getTop();
                int right = g[0].getRight();
                int bottom = g[0].getBottom();
                for (int i = 0; i < this.b; i++) {
                    View view = g[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.z = (float) right;
                this.A = (float) bottom;
                this.B = (float) left;
                this.C = (float) top;
                if (Float.isNaN(this.r)) {
                    this.x = (float) ((left + right) / 2);
                } else {
                    this.x = this.r;
                }
                if (Float.isNaN(this.s)) {
                    this.y = (float) ((top + bottom) / 2);
                } else {
                    this.y = this.s;
                }
            } else {
                this.y = this.s;
                this.x = this.r;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.r = f;
        s();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.s = f;
        s();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.t = f;
        s();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.v = f;
        s();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.w = f;
        s();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.F = f;
        s();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.G = f;
        s();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
