package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import androidx.swiperefreshlayout.widget.d;

/* access modifiers changed from: package-private */
public class c implements Animator.AnimatorListener {
    final /* synthetic */ d.a a;
    final /* synthetic */ d b;

    c(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        d.a aVar = this.a;
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        d dVar = this.b;
        if (dVar.o) {
            dVar.o = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.b(false);
            return;
        }
        dVar.n += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.b.n = 0.0f;
    }
}
