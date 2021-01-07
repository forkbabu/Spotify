package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

public class MotionHelper extends ConstraintHelper implements MotionLayout.h {
    private boolean r = false;
    private boolean s = false;
    private float t;
    protected View[] u;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(attributeSet);
    }

    public float getProgress() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.r = obtainStyledAttributes.getBoolean(index, this.r);
                } else if (index == 0) {
                    this.s = obtainStyledAttributes.getBoolean(index, this.s);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionStarted(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public boolean q() {
        return this.s;
    }

    public boolean r() {
        return this.r;
    }

    public void s() {
    }

    public void setProgress(float f) {
        this.t = f;
        int i = 0;
        if (this.b > 0) {
            this.u = g((ConstraintLayout) getParent());
            while (i < this.b) {
                View view = this.u[i];
                s();
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            if (!(viewGroup.getChildAt(i) instanceof MotionHelper)) {
                s();
            }
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(attributeSet);
    }
}
