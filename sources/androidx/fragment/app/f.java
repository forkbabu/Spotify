package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.o;

/* access modifiers changed from: package-private */
public final class f extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ Fragment c;
    final /* synthetic */ e0.a f;
    final /* synthetic */ a n;

    f(ViewGroup viewGroup, View view, Fragment fragment, e0.a aVar, a aVar2) {
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
        this.f = aVar;
        this.n = aVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Animator animator2;
        this.a.endViewTransition(this.b);
        Fragment fragment = this.c;
        Fragment.c cVar = fragment.S;
        if (cVar == null) {
            animator2 = null;
        } else {
            animator2 = cVar.b;
        }
        fragment.q4(null);
        if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
            ((o.b) this.f).a(this.c, this.n);
        }
    }
}
