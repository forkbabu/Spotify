package com.spotify.pageloader;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class a1 implements k0 {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final Button d;
    private Animator e;

    a1(View view, View.OnClickListener onClickListener) {
        this.a = view;
        this.b = (TextView) view.findViewById(C0707R.id.toast_title);
        this.c = (TextView) view.findViewById(C0707R.id.toast_text);
        Button button = (Button) view.findViewById(C0707R.id.toast_button);
        this.d = button;
        button.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        AnimatorSet animatorSet;
        Animator animator = this.e;
        if (animator != null) {
            animator.end();
        }
        View view = this.a;
        if (view.getVisibility() == 0) {
            animatorSet = null;
        } else {
            view.setTranslationY((float) view.getHeight());
            view.setAlpha(0.0f);
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, (float) nud.f(8.0f, view.getResources()), 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
            Interpolator interpolator = ta0.f;
            ofFloat.setInterpolator(interpolator);
            ofFloat2.setInterpolator(interpolator);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat, ofFloat2);
            animatorSet2.setDuration(300L);
            animatorSet2.start();
            animatorSet = animatorSet2;
        }
        this.e = animatorSet;
    }

    @Override // com.spotify.pageloader.k0
    public void b() {
        AnimatorSet animatorSet;
        Animator animator = this.e;
        if (animator != null) {
            animator.end();
        }
        View view = this.a;
        if (view.getVisibility() == 4) {
            animatorSet = null;
        } else {
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
            ofFloat.setInterpolator(ta0.d);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat);
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(new v0(view));
            animatorSet2.start();
            animatorSet = animatorSet2;
        }
        this.e = animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void c(String str, String str2, Optional<String> optional) {
        this.b.setText(str);
        this.c.setText(str2);
        if (optional.isPresent()) {
            this.d.setText(optional.get());
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
    }
}
