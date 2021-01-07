package com.spotify.mobile.android.storytelling.controls.stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import defpackage.ex1;
import defpackage.jx1;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StoriesForegroundView extends ConstraintLayout {
    private final StoriesProgressBar a;
    private final View b;
    private final View c;
    private final View f;
    private final View n;
    private nmf<? super Integer, f> o;
    private cmf<f> p;
    private nmf<? super Boolean, f> q;
    private cmf<f> r;
    private Animator s;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                nmf<Boolean, f> muteListener$libs_storytelling = ((StoriesForegroundView) this.b).getMuteListener$libs_storytelling();
                if (muteListener$libs_storytelling != null) {
                    muteListener$libs_storytelling.invoke(Boolean.TRUE);
                }
            } else if (i == 1) {
                nmf<Boolean, f> muteListener$libs_storytelling2 = ((StoriesForegroundView) this.b).getMuteListener$libs_storytelling();
                if (muteListener$libs_storytelling2 != null) {
                    muteListener$libs_storytelling2.invoke(Boolean.FALSE);
                }
            } else if (i == 2) {
                cmf<f> shareListener$libs_storytelling = ((StoriesForegroundView) this.b).getShareListener$libs_storytelling();
                if (shareListener$libs_storytelling != null) {
                    shareListener$libs_storytelling.invoke();
                }
            } else if (i == 3) {
                cmf<f> closeListener$libs_storytelling = ((StoriesForegroundView) this.b).getCloseListener$libs_storytelling();
                if (closeListener$libs_storytelling != null) {
                    closeListener$libs_storytelling.invoke();
                }
            } else {
                throw null;
            }
        }
    }

    /* compiled from: java-style lambda group */
    static final class b implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public b(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                nmf<Boolean, f> muteListener$libs_storytelling = ((StoriesForegroundView) this.b).getMuteListener$libs_storytelling();
                if (muteListener$libs_storytelling != null) {
                    muteListener$libs_storytelling.invoke(Boolean.TRUE);
                }
            } else if (i == 1) {
                nmf<Boolean, f> muteListener$libs_storytelling2 = ((StoriesForegroundView) this.b).getMuteListener$libs_storytelling();
                if (muteListener$libs_storytelling2 != null) {
                    muteListener$libs_storytelling2.invoke(Boolean.FALSE);
                }
            } else if (i == 2) {
                cmf<f> shareListener$libs_storytelling = ((StoriesForegroundView) this.b).getShareListener$libs_storytelling();
                if (shareListener$libs_storytelling != null) {
                    shareListener$libs_storytelling.invoke();
                }
            } else {
                throw null;
            }
        }
    }

    /* compiled from: java-style lambda group */
    static final class c implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public c(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                nmf<Boolean, f> muteListener$libs_storytelling = ((StoriesForegroundView) this.b).getMuteListener$libs_storytelling();
                if (muteListener$libs_storytelling != null) {
                    muteListener$libs_storytelling.invoke(Boolean.TRUE);
                }
            } else if (i == 1) {
                nmf<Boolean, f> muteListener$libs_storytelling2 = ((StoriesForegroundView) this.b).getMuteListener$libs_storytelling();
                if (muteListener$libs_storytelling2 != null) {
                    muteListener$libs_storytelling2.invoke(Boolean.FALSE);
                }
            } else if (i == 2) {
                cmf<f> shareListener$libs_storytelling = ((StoriesForegroundView) this.b).getShareListener$libs_storytelling();
                if (shareListener$libs_storytelling != null) {
                    shareListener$libs_storytelling.invoke();
                }
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ StoriesForegroundView a;
        final /* synthetic */ kx1 b;

        d(StoriesForegroundView storiesForegroundView, kx1 kx1) {
            this.a = storiesForegroundView;
            this.b = kx1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StoriesProgressBar storiesProgressBar = this.a.a;
            int b2 = this.b.b();
            h.d(valueAnimator, "it");
            storiesProgressBar.b(b2, valueAnimator.getAnimatedFraction());
        }
    }

    public static final class e extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ StoriesForegroundView b;
        final /* synthetic */ kx1 c;

        e(StoriesForegroundView storiesForegroundView, kx1 kx1) {
            this.b = storiesForegroundView;
            this.c = kx1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            h.e(animator, "animation");
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            nmf<Integer, f> storyEndListener$libs_storytelling;
            if (!this.a && (storyEndListener$libs_storytelling = this.b.getStoryEndListener$libs_storytelling()) != null) {
                storyEndListener$libs_storytelling.invoke(Integer.valueOf(this.c.b()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesForegroundView(Context context) {
        super(context);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.stories_foreground_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.stories_progress_bar);
        h.d(G, "requireViewById(this, R.id.stories_progress_bar)");
        this.a = (StoriesProgressBar) G;
        View G2 = q4.G(this, C0707R.id.mute);
        h.d(G2, "requireViewById<View>(this, R.id.mute)");
        G2.setOnClickListener(new b(0, this));
        this.b = G2;
        View G3 = q4.G(this, C0707R.id.unmute);
        h.d(G3, "requireViewById<View>(this, R.id.unmute)");
        G3.setOnClickListener(new b(1, this));
        this.c = G3;
        q4.G(this, C0707R.id.close).setOnClickListener(new a(3, this));
        View G4 = q4.G(this, C0707R.id.share_background);
        h.d(G4, "requireViewById<View>(this, R.id.share_background)");
        this.n = G4;
        View G5 = q4.G(this, C0707R.id.share_button);
        h.d(G5, "requireViewById<View>(this, R.id.share_button)");
        G5.setOnClickListener(new b(2, this));
        this.f = G5;
    }

    private final void D() {
        Animator animator = this.s;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.s;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.s = null;
    }

    public final void E() {
        D();
    }

    public final void G() {
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    public final void J() {
        this.b.setVisibility(0);
        this.c.setVisibility(8);
    }

    public final void K(int i) {
        this.a.setStoriesCount(i);
    }

    public final void P() {
        Animator animator;
        if (Build.VERSION.SDK_INT >= 19 && (animator = this.s) != null) {
            animator.pause();
        }
    }

    public final void U() {
        Animator animator;
        if (Build.VERSION.SDK_INT >= 19 && (animator = this.s) != null) {
            animator.resume();
        }
    }

    public final void V(int i) {
        D();
        this.a.b(i, 0.0f);
        this.f.setEnabled(false);
    }

    public final void W(kx1 kx1) {
        h.e(kx1, "storyInfo");
        D();
        jx1 a2 = kx1.a();
        if (a2 instanceof jx1.b) {
            this.a.b(kx1.b(), 1.0f);
        } else if (a2 instanceof jx1.a) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            jx1.a aVar = (jx1.a) kx1.a();
            ofFloat.setDuration(aVar.b().toMillis(aVar.a()));
            ofFloat.addUpdateListener(new d(this, kx1));
            ofFloat.addListener(new e(this, kx1));
            ofFloat.start();
            this.s = ofFloat;
        }
        ex1 c2 = kx1.c();
        if (h.a(c2, ex1.b.a)) {
            this.n.setVisibility(0);
            this.f.setVisibility(0);
            this.f.setEnabled(true);
        } else if (h.a(c2, ex1.a.a)) {
            this.n.setVisibility(8);
            this.f.setVisibility(8);
        }
    }

    public final cmf<f> getCloseListener$libs_storytelling() {
        return this.p;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: nmf<? super java.lang.Boolean, kotlin.f>, nmf<java.lang.Boolean, kotlin.f> */
    public final nmf<Boolean, f> getMuteListener$libs_storytelling() {
        return this.q;
    }

    public final cmf<f> getShareListener$libs_storytelling() {
        return this.r;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: nmf<? super java.lang.Integer, kotlin.f>, nmf<java.lang.Integer, kotlin.f> */
    public final nmf<Integer, f> getStoryEndListener$libs_storytelling() {
        return this.o;
    }

    public final void setCloseListener$libs_storytelling(cmf<f> cmf) {
        this.p = cmf;
    }

    public final void setMuteListener$libs_storytelling(nmf<? super Boolean, f> nmf) {
        this.q = nmf;
    }

    public final void setShareListener$libs_storytelling(cmf<f> cmf) {
        this.r = cmf;
    }

    public final void setStoryEndListener$libs_storytelling(nmf<? super Integer, f> nmf) {
        this.o = nmf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesForegroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.stories_foreground_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.stories_progress_bar);
        h.d(G, "requireViewById(this, R.id.stories_progress_bar)");
        this.a = (StoriesProgressBar) G;
        View G2 = q4.G(this, C0707R.id.mute);
        h.d(G2, "requireViewById<View>(this, R.id.mute)");
        G2.setOnClickListener(new c(0, this));
        this.b = G2;
        View G3 = q4.G(this, C0707R.id.unmute);
        h.d(G3, "requireViewById<View>(this, R.id.unmute)");
        G3.setOnClickListener(new c(1, this));
        this.c = G3;
        q4.G(this, C0707R.id.close).setOnClickListener(new a(3, this));
        View G4 = q4.G(this, C0707R.id.share_background);
        h.d(G4, "requireViewById<View>(this, R.id.share_background)");
        this.n = G4;
        View G5 = q4.G(this, C0707R.id.share_button);
        h.d(G5, "requireViewById<View>(this, R.id.share_button)");
        G5.setOnClickListener(new c(2, this));
        this.f = G5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesForegroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.stories_foreground_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.stories_progress_bar);
        h.d(G, "requireViewById(this, R.id.stories_progress_bar)");
        this.a = (StoriesProgressBar) G;
        View G2 = q4.G(this, C0707R.id.mute);
        h.d(G2, "requireViewById<View>(this, R.id.mute)");
        G2.setOnClickListener(new a(0, this));
        this.b = G2;
        View G3 = q4.G(this, C0707R.id.unmute);
        h.d(G3, "requireViewById<View>(this, R.id.unmute)");
        G3.setOnClickListener(new a(1, this));
        this.c = G3;
        q4.G(this, C0707R.id.close).setOnClickListener(new a(3, this));
        View G4 = q4.G(this, C0707R.id.share_background);
        h.d(G4, "requireViewById<View>(this, R.id.share_background)");
        this.n = G4;
        View G5 = q4.G(this, C0707R.id.share_button);
        h.d(G5, "requireViewById<View>(this, R.id.share_button)");
        G5.setOnClickListener(new a(2, this));
        this.f = G5;
    }
}
