package com.spotify.voice.experiments.experience.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.voice.experiments.experience.view.listening.ListeningView;
import com.squareup.picasso.Picasso;
import defpackage.r8f;
import defpackage.u8f;
import java.util.Locale;

public final class GuessingGameVoiceViews implements g<t8f, q2f> {
    private final ViewGroup A;
    private ResultsView B = ResultsView.MIC;
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final ImageView f;
    private final TextView n;
    private final ImageView o;
    private final AnimatorSet p;
    private final AnimatorSet q;
    private final ListeningView r;
    private final Group s;
    private final Group t;
    private final Group u;
    private final y7f v;
    private t8f w = t8f.a(u8f.e(true), "", "");
    private final int x;
    private final LottieAnimationView y;
    private final Picasso z;

    /* access modifiers changed from: private */
    public enum ResultsView {
        LISTENING,
        MIC,
        MIC_NOT_ENABLED,
        ANSWER
    }

    class a implements Animator.AnimatorListener {
        final /* synthetic */ da2 a;

        a(da2 da2) {
            this.a = da2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GuessingGameVoiceViews.this.v.j(GuessingGameVoiceViews.this.w.b(), GuessingGameVoiceViews.this.w.d());
            this.a.accept(q2f.s());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    class b implements h<t8f> {
        private boolean a = true;
        final /* synthetic */ BottomSheetBehavior b;
        final /* synthetic */ d9f c;

        b(BottomSheetBehavior bottomSheetBehavior, d9f d9f) {
            this.b = bottomSheetBehavior;
            this.c = d9f;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            t8f t8f = (t8f) obj;
            GuessingGameVoiceViews.this.w = t8f;
            Logger.g("accept %s", t8f);
            t8f.c().g(new t(this), new b0(this), new u(this), new a0(this), new e0(this), new r(this), new c0(this), new s(this), new z(this), new f0(this));
        }

        public /* synthetic */ void b(u8f.f fVar) {
            if (this.a) {
                this.a = false;
                GuessingGameVoiceViews.this.v.b(GuessingGameVoiceViews.this.w.b(), GuessingGameVoiceViews.this.w.d());
            }
            GuessingGameVoiceViews.h(GuessingGameVoiceViews.this, d0.a(fVar.l(), Locale.getDefault()));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            GuessingGameVoiceViews.this.y.n();
            GuessingGameVoiceViews.this.y.g();
            GuessingGameVoiceViews.this.q.cancel();
            GuessingGameVoiceViews.this.p.cancel();
            GuessingGameVoiceViews.this.o.setOnClickListener(null);
            this.b.r(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            long j = (long) this.a;
            g0 g0Var = new g0(this);
            View[] viewArr = {GuessingGameVoiceViews.this.a, GuessingGameVoiceViews.this.b};
            g0Var.run();
            for (int i = 0; i < 2; i++) {
                View view = viewArr[i];
                view.animate().setListener(new i1(view)).setDuration(j).alpha(1.0f).start();
            }
            GuessingGameVoiceViews.this.f.setAlpha(1.0f);
            GuessingGameVoiceViews.this.u.setVisibility(8);
        }
    }

    public GuessingGameVoiceViews(ViewGroup viewGroup, y7f y7f, Picasso picasso) {
        this.a = (TextView) q4.G(viewGroup, C0707R.id.title);
        this.b = (TextView) q4.G(viewGroup, C0707R.id.description);
        this.o = (ImageView) q4.G(viewGroup, C0707R.id.icon);
        Resources resources = viewGroup.getResources();
        this.x = resources.getInteger(C0707R.integer.title_max_lines);
        int integer = resources.getInteger(17694720);
        this.p = y(1.0f, integer);
        this.q = y(0.0f, integer);
        this.r = (ListeningView) q4.G(viewGroup, C0707R.id.listeningView);
        this.y = (LottieAnimationView) q4.G(viewGroup, C0707R.id.progress_bar);
        this.s = (Group) q4.G(viewGroup, C0707R.id.icon_set);
        this.t = (Group) q4.G(viewGroup, C0707R.id.titles_set);
        this.u = (Group) q4.G(viewGroup, C0707R.id.answer_set);
        this.f = (ImageView) q4.G(viewGroup, C0707R.id.answer_icon);
        this.c = (TextView) q4.G(viewGroup, C0707R.id.answer_text);
        this.n = (TextView) q4.G(viewGroup, C0707R.id.point_total);
        this.v = y7f;
        this.z = picasso;
        this.A = (ViewGroup) viewGroup.findViewById(C0707R.id.bottom_sheet_content);
    }

    private void D(ResultsView resultsView) {
        this.r.d(0.0f);
        this.y.setProgress(1.0f);
        this.y.g();
        int ordinal = resultsView.ordinal();
        if (ordinal == 0) {
            this.t.setVisibility(0);
            this.r.setVisibility(0);
            this.s.setVisibility(8);
            this.u.setVisibility(8);
        } else if (ordinal == 1) {
            this.o.setEnabled(true);
            E();
        } else if (ordinal == 2) {
            E();
        } else if (ordinal == 3) {
            this.t.setVisibility(8);
            this.r.setVisibility(8);
            this.s.setVisibility(8);
            this.u.setVisibility(0);
        }
        this.B = resultsView;
    }

    private void E() {
        this.r.setVisibility(8);
        if (this.B == ResultsView.ANSWER) {
            int integer = this.r.getResources().getInteger(17694720);
            long j = (long) integer;
            this.f.animate().setListener(new c(integer)).setDuration(j).alpha(0.0f).start();
            this.c.animate().setDuration(j).alpha(0.0f).withEndAction(new h0(this)).start();
        } else {
            this.t.setVisibility(0);
            this.u.setVisibility(8);
        }
        this.s.setVisibility(0);
    }

    private static void F(int i, TextView textView) {
        Context context = textView.getContext();
        String quantityString = context.getResources().getQuantityString(C0707R.plurals.points_label, i, Integer.valueOf(i));
        SpannableString spannableString = new SpannableString(quantityString);
        int length = String.valueOf(i).length();
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.TextAppearance_Encore_Forte), 0, length, 33);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.TextAppearance_Encore_Cello), length, quantityString.length(), 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
    }

    static void d(GuessingGameVoiceViews guessingGameVoiceViews, u8f.b bVar) {
        guessingGameVoiceViews.getClass();
        f1.a(bVar.m(), guessingGameVoiceViews.f, guessingGameVoiceViews.z);
        guessingGameVoiceViews.c.setText(bVar.l());
        F(bVar.n(), guessingGameVoiceViews.n);
        guessingGameVoiceViews.D(ResultsView.ANSWER);
    }

    static void e(GuessingGameVoiceViews guessingGameVoiceViews, u8f.h hVar) {
        guessingGameVoiceViews.getClass();
        F(hVar.l(), guessingGameVoiceViews.n);
    }

    static void f(GuessingGameVoiceViews guessingGameVoiceViews, u8f.a aVar) {
        guessingGameVoiceViews.D(ResultsView.MIC);
        if (aVar.o() != null) {
            guessingGameVoiceViews.a.setText(d0.a(aVar.o(), Locale.getDefault()));
        }
        if (aVar.m() != null) {
            guessingGameVoiceViews.b.setText(aVar.m());
        }
    }

    static void g(GuessingGameVoiceViews guessingGameVoiceViews, String str) {
        guessingGameVoiceViews.a.setText(str);
        guessingGameVoiceViews.b.setText("");
        guessingGameVoiceViews.D(ResultsView.MIC);
    }

    static void h(GuessingGameVoiceViews guessingGameVoiceViews, String str) {
        guessingGameVoiceViews.a.setText(str);
        guessingGameVoiceViews.b.setText("");
        guessingGameVoiceViews.a.setMaxLines(guessingGameVoiceViews.x);
        guessingGameVoiceViews.D(ResultsView.LISTENING);
    }

    static void i(GuessingGameVoiceViews guessingGameVoiceViews) {
        guessingGameVoiceViews.a.setMaxLines(guessingGameVoiceViews.x);
        guessingGameVoiceViews.D(ResultsView.LISTENING);
    }

    static void j(GuessingGameVoiceViews guessingGameVoiceViews, boolean z2) {
        guessingGameVoiceViews.D(z2 ? ResultsView.MIC : ResultsView.MIC_NOT_ENABLED);
    }

    static void u(GuessingGameVoiceViews guessingGameVoiceViews, Runnable runnable) {
        guessingGameVoiceViews.q.addListener(new j1(guessingGameVoiceViews, runnable));
        guessingGameVoiceViews.q.start();
    }

    static void v(GuessingGameVoiceViews guessingGameVoiceViews, String str, String str2, int i) {
        guessingGameVoiceViews.v.g(guessingGameVoiceViews.w.b(), guessingGameVoiceViews.w.d());
        guessingGameVoiceViews.a.setText(str);
        guessingGameVoiceViews.b.setText(str2);
        guessingGameVoiceViews.o.setImageResource(i);
        guessingGameVoiceViews.o.setClickable(false);
        guessingGameVoiceViews.D(ResultsView.MIC);
    }

    static void w(GuessingGameVoiceViews guessingGameVoiceViews, r8f.a aVar) {
        guessingGameVoiceViews.a.setText(aVar.f());
        guessingGameVoiceViews.b.setText(aVar.d());
        guessingGameVoiceViews.o.setClickable(true);
        guessingGameVoiceViews.D(ResultsView.MIC);
    }

    static void x(GuessingGameVoiceViews guessingGameVoiceViews, int i) {
        guessingGameVoiceViews.o.setImageResource(C0707R.drawable.ic_mic);
        guessingGameVoiceViews.D(ResultsView.MIC);
        float f2 = (float) i;
        if (f2 <= 8.0f) {
            guessingGameVoiceViews.y.setSpeed(-(f2 / 8.0f));
        } else {
            guessingGameVoiceViews.y.setSpeed(-(8.0f / f2));
        }
        guessingGameVoiceViews.y.m();
    }

    private AnimatorSet y(float f2, int i) {
        AnimatorSet duration = new AnimatorSet().setDuration((long) i);
        duration.playTogether(ObjectAnimator.ofFloat(this.a, "alpha", f2), ObjectAnimator.ofFloat(this.b, "alpha", f2), ObjectAnimator.ofFloat(this.r, "alpha", f2), ObjectAnimator.ofFloat(this.o, "alpha", f2));
        return duration;
    }

    public /* synthetic */ void A(da2 da2, View view) {
        this.o.setEnabled(false);
        this.v.e(this.w.c(), this.w.b(), this.w.d());
        da2.accept(q2f.p());
    }

    public /* synthetic */ void C() {
        this.c.setAlpha(1.0f);
    }

    @Override // com.spotify.mobius.g
    public h<t8f> t(da2<q2f> da2) {
        d9f d9f = new d9f(this.A.getResources().getDimensionPixelSize(C0707R.dimen.std_72dp), this.o, this.r, this.y);
        d9f.c(new j0(this, da2));
        BottomSheetBehavior o2 = BottomSheetBehavior.o(this.A);
        o2.i(d9f);
        this.o.setOnClickListener(new i0(this, da2));
        this.y.n();
        this.y.f(new a(da2));
        return new b(o2, d9f);
    }

    public /* synthetic */ void z(da2 da2) {
        da2.accept(q2f.q());
        this.v.i(this.w.b(), this.w.d());
    }
}
