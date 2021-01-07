package com.spotify.voice.experiments.experience.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.consumer.elements.heart.AnimatedHeartButton;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.experiments.experience.view.listening.ListeningView;
import com.squareup.picasso.Picasso;
import defpackage.u8f;
import io.reactivex.disposables.d;
import java.util.Locale;

public class k1 implements g<t8f, q2f> {
    private final Picasso A;
    private final d B = new d();
    private final TextView a;
    private final TextView b;
    private final ImageView c;
    private final AnimatorSet f;
    private final AnimatorSet n;
    private final ListeningView o;
    private final ImageView p;
    private final TextView q;
    private final z7f r;
    private final Group s;
    private final Group t;
    private final Button u;
    private final Button v;
    private final AnimatedHeartButton w;
    private t8f x = t8f.a(u8f.e(true), "", "");
    private final boolean y;
    private final int z;

    class a implements h<t8f> {
        private boolean a = true;

        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            t8f t8f = (t8f) obj;
            k1.this.x = t8f;
            u8f c = t8f.c();
            Logger.g("Processing %s", t8f);
            c.g(new t0(this), new n0(this), new x0(this), new v0(this), new o0(this), y0.a, m0.a, p0.a, new u0(this), new l0(this));
        }

        public /* synthetic */ void b(u8f.f fVar) {
            if (this.a) {
                this.a = false;
                k1.this.r.a(k1.this.x.b(), k1.this.x.d());
            }
            k1.g(k1.this, d0.a(fVar.l(), Locale.getDefault()));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            k1.this.B.dispose();
            k1.this.n.cancel();
            k1.this.f.cancel();
            k1.this.c.setOnClickListener(null);
            k1.this.v.setOnClickListener(null);
            k1.this.u.setOnClickListener(null);
        }
    }

    public k1(ViewGroup viewGroup, z7f z7f, Picasso picasso, boolean z2) {
        this.a = (TextView) q4.G(viewGroup, C0707R.id.title);
        this.b = (TextView) q4.G(viewGroup, C0707R.id.description);
        ImageView imageView = (ImageView) q4.G(viewGroup, 16908294);
        this.c = imageView;
        Resources resources = viewGroup.getResources();
        this.z = resources.getInteger(C0707R.integer.title_max_lines);
        int integer = resources.getInteger(17694720);
        this.f = q(1.0f, integer);
        this.n = q(0.0f, integer);
        ListeningView listeningView = (ListeningView) q4.G(viewGroup, C0707R.id.listeningView);
        this.o = listeningView;
        this.s = (Group) q4.G(viewGroup, C0707R.id.preview_set);
        this.t = (Group) q4.G(viewGroup, C0707R.id.titles_set);
        ImageView imageView2 = (ImageView) q4.G(viewGroup, C0707R.id.artist_icon);
        this.p = imageView2;
        TextView textView = (TextView) q4.G(viewGroup, C0707R.id.artist_title);
        this.q = textView;
        Button button = (Button) q4.G(viewGroup, C0707R.id.accept_button);
        this.u = button;
        Button button2 = (Button) q4.G(viewGroup, C0707R.id.reject_button);
        this.v = button2;
        AnimatedHeartButton animatedHeartButton = (AnimatedHeartButton) q4.G(viewGroup, C0707R.id.heart_button);
        this.w = animatedHeartButton;
        this.r = z7f;
        this.A = picasso;
        View findViewById = viewGroup.findViewById(C0707R.id.bottom_sheet_content);
        int i = 4;
        d9f d9f = new d9f(resources.getDimensionPixelSize(C0707R.dimen.std_72dp), imageView, listeningView, imageView2, textView, button, button2);
        d9f.c(new b1(this));
        BottomSheetBehavior.o(findViewById).i(d9f);
        this.y = z2;
        animatedHeartButton.setVisibility(z2 ? 0 : i);
        animatedHeartButton.render(new Heart.Model(false, null));
        w(true);
    }

    static void d(k1 k1Var, String str, String str2, int i) {
        k1Var.a.setText(str);
        k1Var.b.setText(str2);
        k1Var.c.setVisibility(0);
        k1Var.c.setImageResource(i);
        k1Var.c.setClickable(true);
        k1Var.o.d(0.0f);
        k1Var.o.setVisibility(8);
        k1Var.w(true);
    }

    static void e(k1 k1Var, u8f.a aVar) {
        if (k1Var.y) {
            k1Var.w.render(new Heart.Model(false, null));
        }
        k1Var.w(false);
        k1Var.o.setVisibility(8);
        if (!aVar.n().isEmpty()) {
            VoiceInteractionResponse.Display.Result result = aVar.n().get(0);
            String image = result.image();
            image.getClass();
            f1.a(image, k1Var.p, k1Var.A);
            k1Var.q.setText(result.title());
            return;
        }
        throw new AssertionError("Empty result set for introducer dialog state");
    }

    static void f(k1 k1Var, String str) {
        k1Var.a.setText(str);
        k1Var.c.setVisibility(8);
        k1Var.o.d(0.0f);
        k1Var.o.setVisibility(0);
    }

    static void g(k1 k1Var, String str) {
        k1Var.a.setText(str);
        k1Var.b.setText("");
        k1Var.a.setMaxLines(k1Var.z);
        k1Var.c.setVisibility(8);
        k1Var.o.setVisibility(0);
        k1Var.w(true);
    }

    static void h(k1 k1Var) {
        k1Var.B.b(null);
        k1Var.a.setText("");
        k1Var.b.setText("");
        k1Var.c.setVisibility(8);
        k1Var.o.d(0.0f);
        k1Var.o.setVisibility(8);
    }

    static void o(k1 k1Var, Runnable runnable) {
        k1Var.n.addListener(new l1(k1Var, runnable));
        k1Var.n.start();
    }

    static void p(k1 k1Var, String str, String str2, int i) {
        k1Var.r.b(k1Var.x.b(), k1Var.x.d());
        k1Var.a.setText(str);
        k1Var.b.setText(str2);
        k1Var.c.setVisibility(0);
        k1Var.c.setImageResource(i);
        k1Var.c.setClickable(false);
        k1Var.o.d(0.0f);
        k1Var.o.setVisibility(8);
    }

    private AnimatorSet q(float f2, int i) {
        AnimatorSet duration = new AnimatorSet().setDuration((long) i);
        duration.playTogether(ObjectAnimator.ofFloat(this.a, "alpha", f2), ObjectAnimator.ofFloat(this.b, "alpha", f2), ObjectAnimator.ofFloat(this.o, "alpha", f2), ObjectAnimator.ofFloat(this.c, "alpha", f2));
        return duration;
    }

    private void w(boolean z2) {
        if (z2) {
            this.t.setVisibility(0);
            this.s.setVisibility(8);
            if (this.y) {
                this.w.setVisibility(8);
                return;
            }
            return;
        }
        this.t.setVisibility(8);
        this.s.setVisibility(0);
        if (this.y) {
            this.w.setVisibility(0);
        }
    }

    public /* synthetic */ void r(da2 da2, View view) {
        this.r.c(this.x.b(), this.x.d());
        da2.accept(q2f.a(true));
    }

    public /* synthetic */ void s(da2 da2, View view) {
        this.r.f(this.x.b(), this.x.d());
        da2.accept(q2f.a(false));
    }

    @Override // com.spotify.mobius.g
    public h<t8f> t(da2<q2f> da2) {
        d1 d1Var = new d1(da2);
        this.u.setOnClickListener(new k0(this, da2));
        this.v.setOnClickListener(new c1(this, da2));
        this.w.setOnClickListener(new a1(this, da2));
        this.c.setOnClickListener(d1Var);
        return new a();
    }

    public /* synthetic */ void u(da2 da2, View view) {
        this.w.render(new Heart.Model(true, null));
        da2.accept(q2f.m());
    }

    public /* synthetic */ void v() {
        this.r.e(this.x.b(), this.x.d());
    }
}
