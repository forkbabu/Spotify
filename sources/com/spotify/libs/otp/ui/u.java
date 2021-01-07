package com.spotify.libs.otp.ui;

import android.animation.Animator;
import com.spotify.libs.otp.ui.AnimatorHelper;

public final /* synthetic */ class u implements AnimatorHelper.AnimatorEndListener {
    public final /* synthetic */ n0 a;

    public /* synthetic */ u(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationCancel(Animator animator) {
        z.$default$onAnimationCancel(this, animator);
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener
    public final void onAnimationEnd() {
        this.a.j();
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationEnd(Animator animator) {
        z.$default$onAnimationEnd(this, animator);
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationEnd(Animator animator, boolean z) {
        z.$default$onAnimationEnd(this, animator, z);
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        z.$default$onAnimationRepeat(this, animator);
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationStart(Animator animator) {
        z.$default$onAnimationStart(this, animator);
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationStart(Animator animator, boolean z) {
        z.$default$onAnimationStart(this, animator, z);
    }
}
