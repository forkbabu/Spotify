package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import com.spotify.music.features.wrapped2020.stories.views.blobs.BlobView;
import com.spotify.music.features.wrapped2020.stories.views.diamond.DiamondView;
import defpackage.jx1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class GenrelustStory extends d {
    private g j;
    private final b k;
    private final ez8 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenrelustStory(Activity activity, b bVar, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(19500, TimeUnit.MILLISECONDS), C0707R.layout.story_genrelust, bVar.g(), bVar.h(), list);
        h.e(activity, "activity");
        h.e(bVar, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.k = bVar;
        this.l = ez8;
    }

    public static final void k(GenrelustStory genrelustStory, View view, int i) {
        genrelustStory.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            e2.t(marginLayoutParams, i);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final AnimatorSet l(BlobView blobView, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, long j3) {
        AnimatorSet k2 = wz8.k(wz8.j(q(this, blobView, i, 500, 0, 4), q(this, blobView, i2, 0, 0, 6), q(this, blobView, i3, 0, 0, 6), q(this, blobView, i4, 0, j3, 2)), wz8.j(r(this, blobView, i5, 500, 0, false, 12), r(this, blobView, i6, 0, 0, false, 14), r(this, blobView, i7, 0, 0, false, 14), r(this, blobView, i8, 0, j3, true, 2)));
        k2.setStartDelay(j2);
        return k2;
    }

    private final Animator m(View view, long j2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.0f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.0f);
        ofFloat2.setInterpolator(b09.a());
        ofFloat2.setDuration(500L);
        animatorSet.playTogether(o(this, view, 0, 0, 6), ofFloat, ofFloat2);
        animatorSet.setStartDelay(j2);
        return animatorSet;
    }

    private final AnimatorSet n(TextView textView, TextView textView2, BlobView blobView, long j2) {
        AnimatorSet k2 = wz8.k(s(this, textView, 800, 0, 4), s(this, textView2, 800, 0, 4), o(this, textView, 500, 0, 4), o(this, textView2, 500, 0, 4));
        k2.setStartDelay(j2);
        k2.addListener(new e(new GenrelustStory$blobLabelIntro$$inlined$apply$lambda$1(this, j2, textView2, blobView, textView)));
        return k2;
    }

    static Animator o(GenrelustStory genrelustStory, View view, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 300;
        }
        if ((i & 4) != 0) {
            j3 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
        return ofFloat;
    }

    private final Animator p(View view, long j2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.1f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.addListener(new d(new GenrelustStory$fadeOut$$inlined$apply$lambda$1(view)));
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…bility = GONE }\n        }");
        return ofFloat;
    }

    static Animator q(GenrelustStory genrelustStory, BlobView blobView, int i, long j2, long j3, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 600;
        }
        if ((i2 & 4) != 0) {
            j3 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(blobView, "growSpec", i);
        h.d(ofInt, "this");
        ofInt.setDuration(j2);
        ofInt.setStartDelay(j3);
        b09 b09 = b09.d;
        ofInt.setInterpolator(b09.a());
        h.d(ofInt, "ObjectAnimator.ofInt(thi…dCurves.advance\n        }");
        return ofInt;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0033: APUT  (r1v0 int[]), (0 ??[int, short, byte, char]), (r4v1 int) */
    static Animator r(GenrelustStory genrelustStory, BlobView blobView, int i, long j2, long j3, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 600;
        }
        if ((i2 & 4) != 0) {
            j3 = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = true;
        int[] iArr = new int[1];
        if (z) {
            Resources resources = genrelustStory.f().getResources();
            h.d(resources, "activity.resources");
            if (z42.q(resources.getConfiguration()) != 1) {
                z2 = false;
            }
            if (z2) {
                i = -i;
            }
        }
        iArr[0] = i;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(blobView, "offsetSpec", iArr);
        h.d(ofInt, "this");
        ofInt.setDuration(j2);
        ofInt.setStartDelay(j3);
        b09 b09 = b09.d;
        ofInt.setInterpolator(b09.a());
        h.d(ofInt, "ObjectAnimator.ofInt(\n  …dCurves.advance\n        }");
        return ofInt;
    }

    static Animator s(GenrelustStory genrelustStory, View view, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 500;
        }
        if ((i & 4) != 0) {
            j3 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f.a(view, 30), 0.0f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
        return ofFloat;
    }

    private final void t(BlobView blobView, int i) {
        if (this.k.a().size() > i) {
            blobView.setBlobColor(this.k.a().get(i).b());
        }
    }

    private final void u(TextView textView, int i) {
        if (this.k.a().size() > i) {
            yy8.a(textView, this.k.a().get(i).a());
        }
    }

    private final void v(TextView textView, int i) {
        if (this.k.a().size() > i) {
            yy8.a(textView, this.k.a().get(i).c());
        }
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        this.j = null;
        super.dispose();
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        int i;
        int i2;
        char c;
        Animator[] animatorArr;
        char c2;
        char c3;
        char c4;
        char c5;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (this.j == null) {
            return animatorSet3;
        }
        Animator[] animatorArr2 = new Animator[7];
        AnimatorSet animatorSet4 = new AnimatorSet();
        g gVar = this.j;
        if (gVar != null) {
            i2 = 1;
            i = 2;
            animatorSet4.playTogether(o(this, gVar.t(), 300, 0, 4), s(this, gVar.t(), 0, 0, 6), o(this, gVar.s(), 300, 0, 4), s(this, gVar.s(), 0, 0, 6));
            animatorSet4.setStartDelay(200);
        } else {
            i2 = 1;
            i = 2;
        }
        animatorArr2[0] = animatorSet4;
        AnimatorSet animatorSet5 = new AnimatorSet();
        g gVar2 = this.j;
        if (gVar2 != null) {
            Animator[] animatorArr3 = new Animator[6];
            animatorArr3[0] = p(gVar2.t(), 300);
            animatorArr3[i2] = p(gVar2.s(), 300);
            float[] fArr = new float[i];
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gVar2.r(), "diamondProgress", fArr);
            b09 b09 = b09.d;
            ofFloat.setInterpolator(b09.b());
            ofFloat.setDuration(1000L);
            h.d(ofFloat, "ObjectAnimator.ofFloat(d…duration = 1000\n        }");
            animatorArr3[i] = ofFloat;
            animatorArr3[3] = o(this, gVar2.r(), 600, 0, 4);
            animatorArr3[4] = o(this, gVar2.q(), 0, 300, 2);
            animatorArr3[5] = s(this, gVar2.q(), 0, 300, 2);
            animatorSet5.playTogether(animatorArr3);
            animatorSet5.setStartDelay(TimeUnit.SECONDS.toMillis(2));
        }
        animatorArr2[i2] = animatorSet5;
        AnimatorSet animatorSet6 = new AnimatorSet();
        g gVar3 = this.j;
        if (gVar3 != null) {
            Animator[] animatorArr4 = new Animator[2];
            animatorArr4[0] = p(gVar3.q(), 300);
            TextView q = gVar3.q();
            float[] fArr2 = new float[2];
            fArr2[0] = 0.0f;
            fArr2[i2] = f.a(q, -30);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(q, "translationY", fArr2);
            b09 b092 = b09.d;
            ofFloat2.setInterpolator(b09.b());
            ofFloat2.setDuration(500L);
            ofFloat2.setStartDelay(0);
            h.d(ofFloat2, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
            animatorArr4[i2] = ofFloat2;
            animatorSet6.playTogether(animatorArr4);
        }
        animatorSet6.setStartDelay(TimeUnit.SECONDS.toMillis(2));
        animatorArr2[2] = animatorSet6;
        AnimatorSet animatorSet7 = new AnimatorSet();
        g gVar4 = this.j;
        if (gVar4 != null) {
            Animator[] animatorArr5 = new Animator[3];
            animatorArr5[0] = o(this, gVar4.u(), 1000, 0, 4);
            animatorArr5[i2] = p(gVar4.r(), 1000);
            TextView u = gVar4.u();
            float[] fArr3 = new float[i2];
            fArr3[0] = 0.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u, "translationY", fArr3);
            ofFloat3.setDuration(500L);
            ofFloat3.setStartDelay(1500);
            b09 b093 = b09.d;
            ofFloat3.setInterpolator(b09.b());
            animatorArr5[2] = ofFloat3;
            animatorSet7.playTogether(animatorArr5);
            animatorSet7.addListener(new e(new GenrelustStory$topFiveIntroAnimation$$inlined$apply$lambda$1(gVar4, animatorSet7, this)));
        }
        animatorArr2[3] = animatorSet7;
        AnimatorSet animatorSet8 = new AnimatorSet();
        g gVar5 = this.j;
        if (gVar5 != null) {
            Animator[] animatorArr6 = new Animator[5];
            animatorArr6[0] = m(gVar5.n(), 0);
            animatorArr6[i2] = m(gVar5.k(), 100);
            animatorArr6[2] = m(gVar5.h(), 200);
            animatorArr6[3] = m(gVar5.e(), 300);
            c = 4;
            animatorArr6[4] = m(gVar5.b(), 400);
            animatorSet8.playTogether(animatorArr6);
        } else {
            c = 4;
        }
        animatorArr2[c] = animatorSet8;
        AnimatorSet animatorSet9 = new AnimatorSet();
        g gVar6 = this.j;
        if (gVar6 != null) {
            c5 = 2;
            c4 = 1;
            c3 = 6;
            c2 = 4;
            animatorSet2 = animatorSet9;
            animatorSet = animatorSet3;
            animatorArr = animatorArr2;
            animatorSet2.playTogether(l(gVar6.b(), 165, 148, 208, 208, 47, -60, -13, -108, 0, 0), l(gVar6.e(), 152, 245, 128, 208, -45, 28, -92, -132, 100, 100), l(gVar6.h(), 88, 120, 208, 208, -12, -13, 3, -156, 200, 200), l(gVar6.k(), 104, 180, 120, 208, 20, 46, 0, -180, 300, 300), l(gVar6.n(), 112, 184, 112, 208, -24, 19, -84, -204, 400, 400));
        } else {
            animatorArr = animatorArr2;
            animatorSet2 = animatorSet9;
            animatorSet = animatorSet3;
            c3 = 6;
            c5 = 2;
            c4 = 1;
            c2 = 4;
        }
        animatorArr[5] = animatorSet2;
        AnimatorSet animatorSet10 = new AnimatorSet();
        g gVar7 = this.j;
        if (gVar7 != null) {
            Animator[] animatorArr7 = new Animator[5];
            animatorArr7[0] = n(gVar7.d(), gVar7.c(), gVar7.b(), 0);
            animatorArr7[c4] = n(gVar7.g(), gVar7.f(), gVar7.e(), 700);
            animatorArr7[c5] = n(gVar7.j(), gVar7.i(), gVar7.h(), 1400);
            animatorArr7[3] = n(gVar7.m(), gVar7.l(), gVar7.k(), 2100);
            animatorArr7[c2] = n(gVar7.p(), gVar7.o(), gVar7.n(), 2800);
            animatorSet10.playTogether(animatorArr7);
        }
        animatorArr[c3] = animatorSet10;
        animatorSet.playSequentially(animatorArr);
        animatorSet.setStartDelay(200);
        return animatorSet;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        View G = q4.G(view, C0707R.id.story_background);
        h.d(G, "requireViewById(view, R.id.story_background)");
        View G2 = q4.G(view, C0707R.id.intro_title);
        h.d(G2, "requireViewById(view, R.id.intro_title)");
        View G3 = q4.G(view, C0707R.id.intro_message);
        h.d(G3, "requireViewById(view, R.id.intro_message)");
        View G4 = q4.G(view, C0707R.id.intro_data_background);
        h.d(G4, "requireViewById(view, R.id.intro_data_background)");
        View G5 = q4.G(view, C0707R.id.intro_data);
        h.d(G5, "requireViewById(view, R.id.intro_data)");
        View G6 = q4.G(view, C0707R.id.top_five_title);
        h.d(G6, "requireViewById(view, R.id.top_five_title)");
        View G7 = q4.G(view, C0707R.id.blob_1);
        h.d(G7, "requireViewById(view, R.id.blob_1)");
        View G8 = q4.G(view, C0707R.id.blob_1_top_label);
        h.d(G8, "requireViewById(view, R.id.blob_1_top_label)");
        View G9 = q4.G(view, C0707R.id.blob_1_bottom_label);
        h.d(G9, "requireViewById(view, R.id.blob_1_bottom_label)");
        View G10 = q4.G(view, C0707R.id.blob_2);
        h.d(G10, "requireViewById(view, R.id.blob_2)");
        View G11 = q4.G(view, C0707R.id.blob_2_top_label);
        h.d(G11, "requireViewById(view, R.id.blob_2_top_label)");
        View G12 = q4.G(view, C0707R.id.blob_2_bottom_label);
        h.d(G12, "requireViewById(view, R.id.blob_2_bottom_label)");
        View G13 = q4.G(view, C0707R.id.blob_3);
        h.d(G13, "requireViewById(view, R.id.blob_3)");
        BlobView blobView = (BlobView) G13;
        View G14 = q4.G(view, C0707R.id.blob_3_top_label);
        h.d(G14, "requireViewById(view, R.id.blob_3_top_label)");
        TextView textView = (TextView) G14;
        View G15 = q4.G(view, C0707R.id.blob_3_bottom_label);
        h.d(G15, "requireViewById(view, R.id.blob_3_bottom_label)");
        TextView textView2 = (TextView) G15;
        View G16 = q4.G(view, C0707R.id.blob_4);
        h.d(G16, "requireViewById(view, R.id.blob_4)");
        BlobView blobView2 = (BlobView) G16;
        View G17 = q4.G(view, C0707R.id.blob_4_top_label);
        h.d(G17, "requireViewById(view, R.id.blob_4_top_label)");
        TextView textView3 = (TextView) G17;
        View G18 = q4.G(view, C0707R.id.blob_4_bottom_label);
        h.d(G18, "requireViewById(view, R.id.blob_4_bottom_label)");
        TextView textView4 = (TextView) G18;
        View G19 = q4.G(view, C0707R.id.blob_5);
        h.d(G19, "requireViewById(view, R.id.blob_5)");
        BlobView blobView3 = (BlobView) G19;
        View G20 = q4.G(view, C0707R.id.blob_5_top_label);
        h.d(G20, "requireViewById(view, R.id.blob_5_top_label)");
        TextView textView5 = (TextView) G20;
        View G21 = q4.G(view, C0707R.id.blob_5_bottom_label);
        h.d(G21, "requireViewById(view, R.id.blob_5_bottom_label)");
        g gVar = new g(G, (TextView) G2, (TextView) G3, (DiamondView) G4, (TextView) G5, (TextView) G6, (BlobView) G7, (TextView) G8, (TextView) G9, (BlobView) G10, (TextView) G11, (TextView) G12, blobView, textView, textView2, blobView2, textView3, textView4, blobView3, textView5, (TextView) G21);
        gVar.a().setBackgroundColor(this.k.b());
        yy8.a(gVar.t(), this.k.f());
        yy8.a(gVar.s(), this.k.e());
        gVar.r().setDiamondColor(this.k.d());
        gVar.q().setText(this.k.c().b());
        yy8.a(gVar.u(), this.k.i());
        t(gVar.b(), 0);
        t(gVar.e(), 1);
        t(gVar.h(), 2);
        t(gVar.k(), 3);
        t(gVar.n(), 4);
        v(gVar.d(), 0);
        v(gVar.g(), 1);
        v(gVar.j(), 2);
        v(gVar.m(), 3);
        v(gVar.p(), 4);
        u(gVar.c(), 0);
        u(gVar.f(), 1);
        u(gVar.i(), 2);
        u(gVar.l(), 3);
        u(gVar.o(), 4);
        gVar.t().setAlpha(0.0f);
        gVar.s().setAlpha(0.0f);
        gVar.r().setDiamondProgress(0.0f);
        gVar.r().setAlpha(0.0f);
        gVar.q().setAlpha(0.0f);
        gVar.u().setAlpha(0.0f);
        gVar.b().setAlpha(0.0f);
        gVar.d().setAlpha(0.0f);
        gVar.c().setAlpha(0.0f);
        gVar.e().setAlpha(0.0f);
        gVar.g().setAlpha(0.0f);
        gVar.f().setAlpha(0.0f);
        gVar.h().setAlpha(0.0f);
        gVar.j().setAlpha(0.0f);
        gVar.i().setAlpha(0.0f);
        gVar.k().setAlpha(0.0f);
        gVar.m().setAlpha(0.0f);
        gVar.l().setAlpha(0.0f);
        gVar.n().setAlpha(0.0f);
        gVar.p().setAlpha(0.0f);
        gVar.o().setAlpha(0.0f);
        this.j = gVar;
        this.l.b(this.k.h());
    }
}
