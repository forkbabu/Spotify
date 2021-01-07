package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import com.spotify.music.C0707R;

class b extends AnimatorListenerAdapter {
    private boolean a;
    private Matrix b = new Matrix();
    final /* synthetic */ boolean c;
    final /* synthetic */ Matrix f;
    final /* synthetic */ View n;
    final /* synthetic */ ChangeTransform.e o;
    final /* synthetic */ ChangeTransform.d p;
    final /* synthetic */ ChangeTransform q;

    b(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.e eVar, ChangeTransform.d dVar) {
        this.q = changeTransform;
        this.c = z;
        this.f = matrix;
        this.n = view;
        this.o = eVar;
        this.p = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            if (!this.c || !this.q.O) {
                this.n.setTag(C0707R.id.transition_transform, null);
                this.n.setTag(C0707R.id.parent_matrix, null);
            } else {
                this.b.set(this.f);
                this.n.setTag(C0707R.id.transition_transform, this.b);
                this.o.a(this.n);
            }
        }
        g0.e(this.n, null);
        this.o.a(this.n);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        this.b.set(this.p.a());
        this.n.setTag(C0707R.id.transition_transform, this.b);
        this.o.a(this.n);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        ChangeTransform.e0(this.n);
    }
}
