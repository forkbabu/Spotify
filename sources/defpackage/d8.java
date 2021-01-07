package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: d8  reason: default package */
public class d8 extends AnimatorListenerAdapter {
    final /* synthetic */ c8 a;

    d8(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.o);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b8) arrayList.get(i)).a(this.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.o);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b8) arrayList.get(i)).getClass();
        }
    }
}
