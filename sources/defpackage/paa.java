package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

/* renamed from: paa  reason: default package */
public class paa {
    private final ConnectAccessButton a;
    private final AnimatorSet b;
    private Integer c;
    int d = 0;
    Runnable e;

    public paa(ConnectAccessButton connectAccessButton) {
        this.a = connectAccessButton;
        View viewToBeAnimated = connectAccessButton.getViewToBeAnimated();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewToBeAnimated, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewToBeAnimated, "scaleY", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setStartDelay(750);
        animatorSet.addListener(new naa(connectAccessButton));
        ofFloat.addListener(new oaa(connectAccessButton));
        this.b = animatorSet;
    }

    public void e(int i) {
        if (this.b.isStarted()) {
            this.c = Integer.valueOf(i);
        } else {
            int i2 = this.d;
            if (i2 != 0 || i == i2) {
                if (5 == i || 4 == i) {
                    this.a.post(new laa(this, 5000));
                }
            } else {
                this.d = i;
                this.b.addListener(new maa(this));
                this.b.start();
            }
        }
        this.d = i;
    }

    public void f() {
        this.a.post(new laa(this, 5000));
    }

    public /* synthetic */ void g(long j) {
        this.a.D();
        this.a.removeCallbacks(this.e);
        ConnectAccessButton connectAccessButton = this.a;
        connectAccessButton.getClass();
        jaa jaa = new jaa(connectAccessButton);
        this.e = jaa;
        this.a.postDelayed(jaa, j);
    }

    public void h() {
        this.a.postDelayed(new laa(this, 7000), 1000);
    }
}
