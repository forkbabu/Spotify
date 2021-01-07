package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import defpackage.jx1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StoryOfYourSong extends d {
    private f j;
    private final b k;
    private final ez8 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryOfYourSong(Activity activity, b bVar, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a((long) 18.1d, TimeUnit.SECONDS), C0707R.layout.story_of_your_song, bVar.d(), bVar.f(), list);
        h.e(activity, "activity");
        h.e(bVar, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.k = bVar;
        this.l = ez8;
    }

    static Animator k(StoryOfYourSong storyOfYourSong, View view, long j2, long j3, int i) {
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

    private final Animator l(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.1f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        ofFloat.setDuration(300L);
        ofFloat.addListener(new c(new StoryOfYourSong$fadeOut$$inlined$apply$lambda$1(view)));
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…bility = GONE }\n        }");
        return ofFloat;
    }

    private final Animator m(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, d.a(view, -20));
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(0);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…startDelay = 0L\n        }");
        return ofFloat;
    }

    private final Animator n(View view, float f, float f2, long j2, long j3, Interpolator interpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f, f2);
        h.d(ofFloat, "this");
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(j2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f, f2);
        h.d(ofFloat2, "this");
        ofFloat2.setInterpolator(interpolator);
        ofFloat2.setDuration(j2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setStartDelay(j3);
        return animatorSet;
    }

    static /* synthetic */ Animator o(StoryOfYourSong storyOfYourSong, View view, float f, float f2, long j2, long j3, Interpolator interpolator, int i) {
        Interpolator interpolator2;
        long j4 = (i & 16) != 0 ? 0 : j3;
        if ((i & 32) != 0) {
            b09 b09 = b09.d;
            interpolator2 = b09.a();
        } else {
            interpolator2 = null;
        }
        return storyOfYourSong.n(view, f, f2, j2, j4, interpolator2);
    }

    private final AnimatorSet p(View view, View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.j != null) {
            animatorSet.playTogether(m(view), l(view), wz8.i(view2, 20.0f, 0.0f, 600, 0, 16), k(this, view2, 0, 200, 2));
        }
        animatorSet.setStartDelay(2500);
        return animatorSet;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        this.j = null;
        super.dispose();
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        char c;
        long j2;
        int i;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f fVar = this.j;
        if (fVar != null) {
            Animator[] animatorArr = new Animator[6];
            AnimatorSet animatorSet3 = new AnimatorSet();
            f fVar2 = this.j;
            if (fVar2 != null) {
                TextView g = fVar2.g();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g, "translationY", d.a(g, 30), 0.0f);
                b09 b09 = b09.d;
                ofFloat.setInterpolator(b09.a());
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(0);
                h.d(ofFloat, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
                animatorSet3.playTogether(k(this, fVar2.g(), 0, 0, 6), ofFloat);
            }
            animatorArr[0] = animatorSet3;
            AnimatorSet animatorSet4 = new AnimatorSet();
            f fVar3 = this.j;
            if (fVar3 != null) {
                c = 2;
                ImageView h = fVar3.h();
                b09 b092 = b09.d;
                i = 18;
                animatorSet = animatorSet4;
                animatorSet.playTogether(l(fVar3.g()), k(this, fVar3.h(), 0, 200, 2), k(this, fVar3.d(), 0, 200, 2), k(this, fVar3.e(), 0, 200, 2), k(this, fVar3.f(), 0, 200, 2), o(this, fVar3.h(), 0.9f, 1.25f, 1000, 0, null, 48), o(this, fVar3.d(), 1.8f, 2.5f, 800, 0, null, 48), o(this, fVar3.e(), 2.7f, 3.75f, 600, 0, null, 48), o(this, fVar3.f(), 3.6f, 5.0f, 400, 0, null, 48), n(h, 1.25f, 1.0f, 500, 1200, b09.c()), n(fVar3.d(), 2.5f, 1.0f, 500, 1200, b09.c()), n(fVar3.e(), 3.75f, 1.0f, 500, 1200, b09.c()), n(fVar3.f(), 5.0f, 1.0f, 500, 1200, b09.c()), n(fVar3.c(), 0.75f, 1.0f, 500, 1400, b09.c()), k(this, fVar3.c(), 0, 1400, 2), k(this, fVar3.a(), 0, 1400, 2), k(this, fVar3.m(), 0, 1400, 2), wz8.h(fVar3.j(), 20.0f, 0.0f, 600, 1800), k(this, fVar3.j(), 0, 1800, 2));
                j2 = 2500;
                animatorSet.setStartDelay(2500);
            } else {
                animatorSet = animatorSet4;
                i = 18;
                j2 = 2500;
                c = 2;
            }
            animatorArr[1] = animatorSet;
            animatorArr[c] = p(fVar.j(), fVar.l());
            animatorArr[3] = p(fVar.l(), fVar.k());
            animatorArr[4] = p(fVar.k(), fVar.i());
            AnimatorSet animatorSet5 = new AnimatorSet();
            f fVar4 = this.j;
            if (fVar4 != null) {
                Animator[] animatorArr2 = new Animator[i];
                animatorArr2[0] = m(fVar4.i());
                animatorArr2[1] = l(fVar4.i());
                animatorArr2[c] = m(fVar4.c());
                animatorArr2[3] = l(fVar4.c());
                animatorArr2[4] = m(fVar4.i());
                animatorArr2[5] = l(fVar4.i());
                animatorArr2[6] = m(fVar4.m());
                animatorArr2[7] = l(fVar4.m());
                animatorArr2[8] = m(fVar4.a());
                animatorArr2[9] = l(fVar4.a());
                animatorArr2[10] = m(fVar4.h());
                animatorArr2[11] = l(fVar4.h());
                animatorArr2[12] = m(fVar4.d());
                animatorArr2[13] = l(fVar4.d());
                animatorArr2[14] = m(fVar4.e());
                animatorArr2[15] = l(fVar4.e());
                animatorArr2[16] = m(fVar4.f());
                animatorArr2[17] = l(fVar4.f());
                animatorSet5.playTogether(animatorArr2);
            }
            animatorSet5.setStartDelay(j2);
            animatorArr[5] = animatorSet5;
            animatorSet2.playSequentially(animatorArr);
        }
        return animatorSet2;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        View G = q4.G(view, C0707R.id.story_background);
        h.d(G, "requireViewById(view, R.id.story_background)");
        View G2 = q4.G(view, C0707R.id.intro);
        h.d(G2, "requireViewById(view, R.id.intro)");
        TextView textView = (TextView) G2;
        View G3 = q4.G(view, C0707R.id.circle_gradient);
        h.d(G3, "requireViewById(view, R.id.circle_gradient)");
        WrappedGradientView wrappedGradientView = (WrappedGradientView) G3;
        View G4 = q4.G(view, C0707R.id.main_image);
        h.d(G4, "requireViewById(view, R.id.main_image)");
        ImageView imageView = (ImageView) G4;
        View G5 = q4.G(view, C0707R.id.image_a);
        h.d(G5, "requireViewById(view, R.id.image_a)");
        ImageView imageView2 = (ImageView) G5;
        View G6 = q4.G(view, C0707R.id.image_b);
        h.d(G6, "requireViewById(view, R.id.image_b)");
        ImageView imageView3 = (ImageView) G6;
        View G7 = q4.G(view, C0707R.id.image_c);
        h.d(G7, "requireViewById(view, R.id.image_c)");
        ImageView imageView4 = (ImageView) G7;
        View G8 = q4.G(view, C0707R.id.track);
        h.d(G8, "requireViewById(view, R.id.track)");
        TextView textView2 = (TextView) G8;
        View G9 = q4.G(view, C0707R.id.artist);
        h.d(G9, "requireViewById(view, R.id.artist)");
        TextView textView3 = (TextView) G9;
        View G10 = q4.G(view, C0707R.id.statistic_one);
        h.d(G10, "requireViewById(view, R.id.statistic_one)");
        StatisticView statisticView = (StatisticView) G10;
        View G11 = q4.G(view, C0707R.id.statistic_two);
        h.d(G11, "requireViewById(view, R.id.statistic_two)");
        StatisticView statisticView2 = (StatisticView) G11;
        View G12 = q4.G(view, C0707R.id.statistic_three);
        h.d(G12, "requireViewById(view, R.id.statistic_three)");
        View G13 = q4.G(view, C0707R.id.statistic_four);
        h.d(G13, "requireViewById(view, R.id.statistic_four)");
        f fVar = new f(G, textView, wrappedGradientView, imageView, imageView2, imageView3, imageView4, textView2, textView3, statisticView, statisticView2, (StatisticView) G12, (StatisticView) G13);
        fVar.b().setBackgroundColor(this.k.a());
        fVar.g().setText(this.k.c().b());
        fVar.c().getGradient();
        fVar.c().a().start();
        fVar.h().setImageBitmap(this.k.b());
        fVar.d().setImageBitmap(this.k.b());
        fVar.e().setImageBitmap(this.k.b());
        fVar.f().setImageBitmap(this.k.b());
        fVar.m().setText(this.k.h().b());
        yy8.a(fVar.m(), this.k.h());
        yy8.a(fVar.a(), this.k.g());
        int i = 0;
        List u = kotlin.collections.d.u(fVar.j(), fVar.l(), fVar.k(), fVar.i());
        List<a> e = this.k.e();
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(e, 10));
        for (T t : e) {
            int i2 = i + 1;
            if (i >= 0) {
                ((StatisticView) u.get(i)).setUpView(t);
                arrayList.add(f.a);
                i = i2;
            } else {
                kotlin.collections.d.L();
                throw null;
            }
        }
        this.j = fVar;
        this.l.b(this.k.f());
    }
}
