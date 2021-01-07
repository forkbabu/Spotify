package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;

public abstract class t implements MotionLayout.h {
    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public abstract void onTransitionCompleted(MotionLayout motionLayout, int i);

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public abstract void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f) {
    }
}
