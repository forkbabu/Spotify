package com.spotify.music.nowplaying.drivingmode.view.seekbar;

import android.animation.Animator;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class d implements Animator.AnimatorListener {
    final /* synthetic */ DrivingSeekbarView a;

    d(DrivingSeekbarView drivingSeekbarView) {
        this.a = drivingSeekbarView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.F.findViewById(C0707R.id.driving_player_controls).bringToFront();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
