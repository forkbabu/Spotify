package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: maa  reason: default package */
public class maa extends AnimatorListenerAdapter {
    final /* synthetic */ paa a;

    maa(paa paa) {
        this.a = paa;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i;
        if (this.a.c == null) {
            i = this.a.d;
        } else {
            i = this.a.c.intValue();
            this.a.c = null;
        }
        this.a.b.removeListener(this);
        this.a.a.post(new kaa(this, i));
    }
}
