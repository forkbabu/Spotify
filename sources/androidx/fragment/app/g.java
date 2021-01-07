package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
public class g {
    public final Animation a;
    public final Animator b;

    g(Animation animation) {
        this.a = animation;
        this.b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    g(Animator animator) {
        this.a = null;
        this.b = animator;
    }
}
