package com.spotify.libs.otp.ui;

import android.animation.Animator;
import com.spotify.libs.otp.ui.AnimatorHelper;

public final /* synthetic */ class l implements AnimatorHelper.AnimatorEndListener {
    public final /* synthetic */ j0 a;

    public /* synthetic */ l(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener, android.animation.Animator.AnimatorListener
    public /* synthetic */ void onAnimationCancel(Animator animator) {
        z.$default$onAnimationCancel(this, animator);
    }

    @Override // com.spotify.libs.otp.ui.AnimatorHelper.AnimatorEndListener
    public final void onAnimationEnd() {
        this.a.m();
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
