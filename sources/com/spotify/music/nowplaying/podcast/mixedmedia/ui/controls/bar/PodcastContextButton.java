package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class PodcastContextButton extends FrameLayout {
    private final boolean a;
    private ControlBarViewBinder.Mode b;
    private final View c;
    private final View f;
    private final int n;
    private final int o;
    private final ValueAnimator p;

    static final class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ PodcastContextButton a;

        a(PodcastContextButton podcastContextButton) {
            this.a = podcastContextButton;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.d(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float min = Math.min(1.0f, floatValue / 0.3f);
                float max = Math.max(0.0f, (floatValue - 0.3f) / 0.3f);
                if (this.a.getCurrentMode() == ControlBarViewBinder.Mode.MUSIC) {
                    this.a.c.setAlpha(max);
                    this.a.f.setAlpha(1.0f - min);
                    return;
                }
                this.a.f.setAlpha(max);
                this.a.c.setAlpha(1.0f - min);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ PodcastContextButton a;

        b(PodcastContextButton podcastContextButton) {
            this.a = podcastContextButton;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.a.c;
            ControlBarViewBinder.Mode currentMode = this.a.getCurrentMode();
            ControlBarViewBinder.Mode mode = ControlBarViewBinder.Mode.MUSIC;
            int i = 0;
            view.setVisibility(currentMode == mode ? 0 : 8);
            View view2 = this.a.f;
            if (this.a.getCurrentMode() == mode) {
                i = 8;
            }
            view2.setVisibility(i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c.setVisibility(0);
            this.a.f.setVisibility(0);
        }
    }

    public PodcastContextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e(ControlBarViewBinder.Mode mode, boolean z) {
        h.e(mode, "mode");
        this.b = mode;
        if (z) {
            int i = 8;
            this.c.setVisibility(mode == ControlBarViewBinder.Mode.MUSIC ? 0 : 8);
            View view = this.f;
            if (mode == ControlBarViewBinder.Mode.TALK) {
                i = 0;
            }
            view.setVisibility(i);
            return;
        }
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        valueAnimator.start();
    }

    public final ControlBarViewBinder.Mode getCurrentMode() {
        return this.b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PodcastContextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.b = ControlBarViewBinder.Mode.MUSIC;
        this.n = getResources().getDimensionPixelSize(C0707R.dimen.newplaying_secondary_button_size);
        this.o = getResources().getDimensionPixelSize(C0707R.dimen.newplaying_button_padding);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jyb.a, i, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.a = z;
            if (z) {
                this.c = new PreviousButton(context, attributeSet, i);
                this.f = new SeekBackwardButton(context, attributeSet, i);
            } else {
                this.c = new NextButton(context, attributeSet, i);
                this.f = new SeekForwardButton(context, attributeSet, i);
            }
            AnonymousClass2 r5 = new nmf<View, f>(this) {
                /* class com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.PodcastContextButton.AnonymousClass2 */
                final /* synthetic */ PodcastContextButton this$0;

                {
                    this.this$0 = r1;
                }

                public final void a(View view) {
                    h.e(view, "$this$applyStyle");
                    view.setPadding(this.this$0.o, this.this$0.o, this.this$0.o, this.this$0.o);
                    view.setLayoutParams(new FrameLayout.LayoutParams(this.this$0.n, this.this$0.n));
                    view.setVisibility(4);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // defpackage.nmf
                public /* bridge */ /* synthetic */ f invoke(View view) {
                    a(view);
                    return f.a;
                }
            };
            r5.a(this.c);
            r5.a(this.f);
            addView(this.c);
            addView(this.f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration(750L);
            ofFloat.addUpdateListener(new a(this));
            ofFloat.addListener(new b(this));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
