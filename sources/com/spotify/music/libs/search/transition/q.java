package com.spotify.music.libs.search.transition;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.transition.m;
import com.spotify.music.libs.search.view.l;
import java.util.Locale;

public class q implements m {
    private static final Property<f, Float> k = new c(Float.class, "fraction");
    private final Context b;
    private final l c;
    private final ViewGroup d;
    private final RecyclerView e;
    private final l f;
    private final m.a g;
    private final g h;
    private boolean i;
    private f j;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            q.this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            q.d(q.this);
            return true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            q.this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            q.e(q.this);
            return true;
        }
    }

    static class c extends Property<f, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(f fVar) {
            return Float.valueOf(fVar.getFraction());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(f fVar, Float f) {
            fVar.setFraction(f.floatValue());
        }
    }

    public q(Context context, l lVar, ViewGroup viewGroup, RecyclerView recyclerView, l lVar2, m.a aVar, g gVar) {
        context.getClass();
        this.b = context;
        this.c = lVar;
        viewGroup.getClass();
        this.d = viewGroup;
        recyclerView.getClass();
        this.e = recyclerView;
        lVar2.getClass();
        this.f = lVar2;
        aVar.getClass();
        this.g = aVar;
        this.h = gVar;
    }

    static void d(q qVar) {
        if (qVar.i) {
            qVar.i = false;
            qVar.f.n(true);
            int g2 = nud.g(72.0f, qVar.b.getResources());
            int round = Math.round((qVar.j.getView().getTranslationY() + ((float) com.spotify.android.goldenpath.a.d(qVar.b))) / ((float) nud.g(1.5f, qVar.b.getResources())));
            if (round < 0) {
                round = 0;
            }
            int width = qVar.j.getView().getWidth();
            int width2 = qVar.d.getWidth();
            float f2 = 1.0f;
            if (width > 0) {
                f2 = ((float) width2) / ((float) width);
            } else {
                Assertion.g(String.format(Locale.US, "Error during search transition with invalid button width: mTransitionParameters=%s, finalScaleX=%f, widthNow=%d, widthFinal=%d", qVar.c, Float.valueOf(1.0f), Integer.valueOf(width), Integer.valueOf(width2)));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qVar.e, View.ALPHA, 0.0f, 1.0f);
            long j2 = (long) round;
            ofFloat.setDuration(j2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qVar.e, View.TRANSLATION_Y, (float) g2, 0.0f);
            ofFloat2.setDuration(j2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(qVar.j.getView(), View.TRANSLATION_Y, (float) com.spotify.android.goldenpath.a.d(qVar.b));
            ofFloat3.setInterpolator(ta0.b);
            ofFloat3.setDuration(j2);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qVar.j, k, 0.0f, 1.0f);
            ofFloat4.setDuration(j2);
            float scaleX = qVar.j.getView().getScaleX();
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(qVar.j.getView(), View.SCALE_X, scaleX, f2);
            ofFloat5.setDuration(j2);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(qVar.j.getView(), View.ALPHA, 0.0f);
            ofFloat6.setDuration(j2);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(qVar.f, l.a, 0.0f, 1.0f);
            ofFloat7.setDuration(0L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ofFloat6, ofFloat7);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playSequentially(animatorSet2, animatorSet3);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(ofFloat, ofFloat2, animatorSet, animatorSet4);
            animatorSet5.addListener(new r(qVar));
            try {
                animatorSet5.start();
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(String.format(Locale.US, "Error during search transition: mTransitionParameters=%s, buttonScaleX=%f, finalScaleX=%f, widthNow=%d, widthFinal=%d, originMessage=%s", qVar.c, Float.valueOf(scaleX), Float.valueOf(f2), Integer.valueOf(width), Integer.valueOf(width2), e2.getMessage()), e2);
            }
        }
    }

    static void e(q qVar) {
        if (qVar.j != null) {
            int[] iArr = new int[2];
            qVar.d.getLocationInWindow(iArr);
            float translationX = qVar.j.getView().getTranslationX() - ((float) iArr[0]);
            float translationY = qVar.j.getView().getTranslationY() - ((float) iArr[1]);
            qVar.j.getView().setTranslationX(translationX);
            qVar.j.getView().setTranslationY(translationY);
        }
    }

    static void f(q qVar) {
        qVar.d.removeView(qVar.j.getView());
        qVar.j = null;
        qVar.g.a();
    }

    @Override // com.spotify.music.libs.search.transition.m
    public void a() {
        if (this.i) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new a());
        }
    }

    @Override // com.spotify.music.libs.search.transition.m
    public void b() {
        if (this.c != null) {
            this.i = true;
            this.f.p(0.0f);
            Rect c2 = this.c.c();
            l lVar = this.c;
            Rect c3 = lVar.c();
            f a2 = this.h.a(this.b);
            this.j = a2;
            a2.getView().setTranslationX((float) c3.left);
            this.j.getView().setTranslationY((float) c3.top);
            this.j.setText(lVar.b());
            this.j.setAccessibilityText(lVar.a());
            this.d.addView(this.j.getView(), new RelativeLayout.LayoutParams(c2.width(), c2.height()));
            this.d.getViewTreeObserver().addOnPreDrawListener(new b());
        }
    }
}
