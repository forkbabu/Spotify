package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* access modifiers changed from: package-private */
public class h extends AnimationSet implements Runnable {
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean f;
    private boolean n = true;

    h(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.n = true;
        if (this.c) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            n4.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.c || !this.n) {
            this.a.endViewTransition(this.b);
            this.f = true;
            return;
        }
        this.n = false;
        this.a.post(this);
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f2) {
        this.n = true;
        if (this.c) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.c = true;
            n4.a(this.a, this);
        }
        return true;
    }
}
