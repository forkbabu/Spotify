package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class z extends AnimatorListenerAdapter implements Transition.d {
    private final View a;
    private final View b;
    private final int c;
    private final int f;
    private int[] n;
    private float o;
    private float p;
    private final float q;
    private final float r;

    z(View view, View view2, int i, int i2, float f2, float f3) {
        this.b = view;
        this.a = view2;
        this.c = i - Math.round(view.getTranslationX());
        this.f = i2 - Math.round(view.getTranslationY());
        this.q = f2;
        this.r = f3;
        int[] iArr = (int[]) view2.getTag(C0707R.id.transition_position);
        this.n = iArr;
        if (iArr != null) {
            view2.setTag(C0707R.id.transition_position, null);
        }
    }

    @Override // androidx.transition.Transition.d
    public void a(Transition transition) {
    }

    @Override // androidx.transition.Transition.d
    public void b(Transition transition) {
    }

    @Override // androidx.transition.Transition.d
    public void c(Transition transition) {
    }

    @Override // androidx.transition.Transition.d
    public void d(Transition transition) {
        this.b.setTranslationX(this.q);
        this.b.setTranslationY(this.r);
        transition.P(this);
    }

    @Override // androidx.transition.Transition.d
    public void e(Transition transition) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.n == null) {
            this.n = new int[2];
        }
        this.n[0] = Math.round(this.b.getTranslationX() + ((float) this.c));
        this.n[1] = Math.round(this.b.getTranslationY() + ((float) this.f));
        this.a.setTag(C0707R.id.transition_position, this.n);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        this.o = this.b.getTranslationX();
        this.p = this.b.getTranslationY();
        this.b.setTranslationX(this.q);
        this.b.setTranslationY(this.r);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        this.b.setTranslationX(this.o);
        this.b.setTranslationY(this.p);
    }
}
