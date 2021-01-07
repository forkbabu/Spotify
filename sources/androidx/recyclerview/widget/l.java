package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

/* access modifiers changed from: package-private */
public class l extends AnimatorListenerAdapter {
    final /* synthetic */ g.d a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ g f;

    l(g gVar, g.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f = gVar;
        this.a = dVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.f.h(this.a.b);
        this.f.r.remove(this.a.b);
        this.f.B();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        g gVar = this.f;
        RecyclerView.b0 b0Var = this.a.b;
        gVar.getClass();
    }
}
