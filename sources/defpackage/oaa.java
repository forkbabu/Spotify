package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

/* access modifiers changed from: package-private */
/* renamed from: oaa  reason: default package */
public final class oaa extends AnimatorListenerAdapter {
    final /* synthetic */ ConnectAccessButton a;

    oaa(ConnectAccessButton connectAccessButton) {
        this.a = connectAccessButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
