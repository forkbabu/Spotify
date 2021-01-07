package com.spotify.libs.onboarding.allboarding.greatpicksloading;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.c;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class GreatPicksLoadingView extends ConstraintLayout {
    private final LottieAnimationView a;
    private final FacePileView b;
    private final TextView c;

    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ GreatPicksLoadingView a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(GreatPicksLoadingView greatPicksLoadingView) {
            this.a = greatPicksLoadingView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            h.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            h.e(animator, "animation");
            this.a.c.setText(C0707R.string.allboarding_finding_music_for_you);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.e(animator, "animation");
        }
    }

    public GreatPicksLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void D(Picasso picasso, List<String> list) {
        h.e(picasso, "picasso");
        h.e(list, "artistImageUris");
        FacePileView facePileView = this.b;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c.a(it.next(), "", 0));
        }
        facePileView.setFacePile(picasso, com.spotify.libs.facepile.d.a(arrayList));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.b, ViewGroup.ALPHA, 1.0f, 0.0f).setDuration(1000L);
        h.d(duration, "ObjectAnimator.ofFloat(f…ALPHA_ANIMATION_DURATION)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.a, ViewGroup.ALPHA, 0.0f, 1.0f).setDuration(1000L);
        h.d(duration2, "ObjectAnimator.ofFloat(l…ALPHA_ANIMATION_DURATION)");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, ViewGroup.ALPHA, 1.0f, 0.0f);
        h.d(ofFloat, "ObjectAnimator.ofFloat(t…SHOWN, ALPHA_TRANSPARENT)");
        ofFloat.setDuration(500L);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.addListener(new a(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(2000);
        animatorSet.playTogether(duration, duration2, ofFloat);
        animatorSet.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GreatPicksLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        ViewGroup.inflate(context, C0707R.layout.great_picks_loading_view, this);
        View G = q4.G(this, C0707R.id.lottie_animated_icon);
        h.d(G, "ViewCompat.requireViewBy….id.lottie_animated_icon)");
        this.a = (LottieAnimationView) G;
        View G2 = q4.G(this, C0707R.id.great_picks_facepile);
        h.d(G2, "ViewCompat.requireViewBy….id.great_picks_facepile)");
        this.b = (FacePileView) G2;
        View G3 = q4.G(this, C0707R.id.update_taste_playlist_text_view);
        h.d(G3, "ViewCompat.requireViewBy…taste_playlist_text_view)");
        this.c = (TextView) G3;
    }
}
