package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: ad0  reason: default package */
final class ad0 extends k62 {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    ad0(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.a.setVisibility(this.b);
    }
}
