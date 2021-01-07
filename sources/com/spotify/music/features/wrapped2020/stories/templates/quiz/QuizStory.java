package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import defpackage.jx1;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.l;

public final class QuizStory extends d {
    private i j;
    private Animator k;
    private boolean l;
    private final b m;
    private final ez8 n;

    static final class a implements View.OnClickListener {
        final /* synthetic */ QuizStory a;

        a(QuizStory quizStory, View view) {
            this.a = quizStory;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.d(view, "view");
            Context context = view.getContext();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.a.m.i().c()));
            int i = androidx.core.content.a.b;
            int i2 = Build.VERSION.SDK_INT;
            context.startActivity(intent, null);
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ int a;
        final /* synthetic */ i b;
        final /* synthetic */ Ref$IntRef c;
        final /* synthetic */ QuizStory f;

        b(int i, i iVar, Ref$IntRef ref$IntRef, QuizStory quizStory, View view) {
            this.a = i;
            this.b = iVar;
            this.c = ref$IntRef;
            this.f = quizStory;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f.n.f(this.f.m.l());
            if (this.a == this.c.element) {
                this.b.g().setText(this.f.m.h().a());
                this.f.n.g(this.f.m.l());
            } else {
                this.b.g().setText(this.f.m.h().b());
                this.f.n.d(this.f.m.l());
            }
            int i = 0;
            for (T t : this.b.b()) {
                int i2 = i + 1;
                if (i >= 0) {
                    T t2 = t;
                    if (i == this.a) {
                        t2.G();
                        t2.D();
                    } else {
                        t2.setClickable(false);
                        t2.J();
                        t2.setAlpha(0.4f);
                        t2.D();
                    }
                    i = i2;
                } else {
                    kotlin.collections.d.L();
                    throw null;
                }
            }
            QuizStory.p(this.f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuizStory(Activity activity, b bVar, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(35, TimeUnit.SECONDS), bVar.b().size() == 3 ? C0707R.layout.story_template_quiz_3 : C0707R.layout.story_template_quiz, bVar.e(), bVar.l(), list);
        h.e(activity, "activity");
        h.e(bVar, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.m = bVar;
        this.n = ez8;
    }

    public static final void n(QuizStory quizStory) {
        ix1 g = quizStory.g();
        if (g != null) {
            g.a(ox1.c.a);
        }
    }

    public static final void o(QuizStory quizStory) {
        String uri = quizStory.m.j().toString();
        h.d(uri, "viewData.secondPreviewUri.toString()");
        if (uri.length() > 0) {
            quizStory.j(quizStory.m.j());
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0113: APUT  (r10v0 android.animation.Animator[]), (0 ??[int, short, byte, char]), (r11v0 android.animation.AnimatorSet) */
    public static final void p(QuizStory quizStory) {
        Animator animator = quizStory.k;
        if (animator != null) {
            wz8.b(animator);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int i = 2;
        Animator[] animatorArr = new Animator[2];
        AnimatorSet animatorSet2 = new AnimatorSet();
        i iVar = quizStory.j;
        if (iVar != null) {
            l lVar = new l(7);
            lVar.a(w(quizStory, iVar.f(), 300, 0, 4));
            lVar.a(s(quizStory, iVar.f(), 200, 0, 4));
            List<ChoiceViewWithGradient> b2 = iVar.b();
            ArrayList arrayList = new ArrayList();
            for (T t : b2) {
                Animator[] animatorArr2 = new Animator[i];
                animatorArr2[0] = w(quizStory, t, 300, 0, 4);
                animatorArr2[1] = s(quizStory, t, 200, 0, 4);
                kotlin.collections.d.a(arrayList, kotlin.collections.d.u(animatorArr2));
                arrayList = arrayList;
                i = 2;
            }
            Object[] array = arrayList.toArray(new Animator[0]);
            if (array != null) {
                lVar.b(array);
                Animator u = u(quizStory, iVar.g(), 300, 0, 200, 4);
                e.c(u, new QuizStory$transitionToResultAnimation$$inlined$apply$lambda$1(animatorSet2, quizStory));
                lVar.a(u);
                lVar.a(wz8.d(iVar.g(), 1.0f, 200, 200));
                lVar.a(quizStory.v(iVar.g(), 300, 5500));
                lVar.a(wz8.d(iVar.g(), 0.0f, 200, 3600));
                animatorSet2.playTogether((Animator[]) lVar.d(new Animator[lVar.c()]));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        animatorSet2.setStartDelay(2000);
        animatorArr[0] = animatorSet2;
        animatorArr[1] = quizStory.t(5700);
        animatorSet.playTogether(animatorArr);
        animatorSet.start();
        quizStory.k = animatorSet;
    }

    private final Animator q(View view, long j2, long j3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
        return ofFloat;
    }

    private final Animator r(View view, long j2, long j3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        e.b(ofFloat, new QuizStory$fadeOut$$inlined$apply$lambda$1(view));
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…y = View.GONE }\n        }");
        return ofFloat;
    }

    static /* synthetic */ Animator s(QuizStory quizStory, View view, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 300;
        }
        if ((i & 4) != 0) {
            j3 = 0;
        }
        return quizStory.r(view, j2, j3);
    }

    private final Animator t(long j2) {
        AnimatorSet animatorSet;
        if (this.l) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            i iVar = this.j;
            if (iVar != null) {
                Animator a2 = iVar.c().a();
                a2.setStartDelay(j2);
                long j3 = j2 + 100;
                long j4 = j2 + 1100;
                long j5 = j2 + 5300;
                long j6 = j2 + 5900;
                long j7 = j2 + ((long) 6500);
                long j8 = j2 + ((long) 6700);
                Animator q = q(iVar.k(), 600, j8);
                e.b(q, new QuizStory$$special$$inlined$apply$lambda$2(iVar));
                Animator h = wz8.h(iVar.k(), -78.0f, -108.0f, 1000, j8);
                e.c(h, new QuizStory$$special$$inlined$apply$lambda$3(iVar));
                long j9 = j2 + ((long) 10500);
                Animator h2 = wz8.h(iVar.k(), -108.0f, -138.0f, 1000, j9);
                animatorSet = animatorSet2;
                e.b(h2, new QuizStory$finalStoryFrameAnimation$$inlined$apply$lambda$1(animatorSet, this, j2));
                animatorSet.playTogether(x(iVar.c(), 5.0f, 1200, j2), q(iVar.c(), 600, j2), a2, x(iVar.i(), 0.8f, 800, j3), q(iVar.i(), 500, j3), q(iVar.j(), 200, j4), q(iVar.h(), 200, j4), q(iVar.m(), 200, j4), r(iVar.j(), 600, j5), r(iVar.h(), 600, j5), r(iVar.m(), 600, j5), wz8.h(iVar.i(), 0.0f, -108.0f, 600, j6), wz8.h(iVar.c(), 0.0f, -108.0f, 600, j6), q(iVar.l(), 600, j7), wz8.h(iVar.l(), -78.0f, -108.0f, 1000, j7), q, h, r(iVar.i(), 600, j9), r(iVar.c(), 600, j9), r(iVar.l(), 600, j9), r(iVar.k(), 600, j9), wz8.h(iVar.i(), -108.0f, -138.0f, 1000, j9), wz8.h(iVar.c(), -108.0f, -138.0f, 1000, j9), wz8.h(iVar.l(), -108.0f, -138.0f, 1000, j9), h2);
            } else {
                animatorSet = animatorSet2;
            }
            return animatorSet;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        i iVar2 = this.j;
        if (iVar2 != null) {
            Animator a3 = iVar2.c().a();
            a3.setStartDelay(j2);
            long j10 = j2 + 100;
            long j11 = j2 + 1100;
            long j12 = j2 + 5300;
            Animator s = s(this, iVar2.c(), 0, j12, 2);
            e.b(s, new QuizStory$finalStoryFrameAnimation$$inlined$apply$lambda$2(animatorSet3, this, j2));
            animatorSet3.playTogether(x(iVar2.c(), 5.0f, 1200, j2), q(iVar2.c(), 600, j2), a3, x(iVar2.i(), 0.8f, 800, j10), q(iVar2.i(), 500, j10), q(iVar2.j(), 200, j11), q(iVar2.h(), 200, j11), q(iVar2.m(), 200, j11), v(iVar2.i(), 500, j12), v(iVar2.j(), 500, j12), v(iVar2.h(), 500, j12), v(iVar2.m(), 500, j12), s(this, iVar2.i(), 0, j12, 2), s(this, iVar2.j(), 0, j12, 2), s(this, iVar2.h(), 0, j12, 2), s(this, iVar2.m(), 0, j12, 2), v(iVar2.c(), 500, j12), s);
        }
        return animatorSet3;
    }

    static Animator u(QuizStory quizStory, View view, long j2, int i, long j3, int i2) {
        if ((i2 & 4) != 0) {
            i = 30;
        }
        if ((i2 & 8) != 0) {
            j3 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", e.a(view, i), 0.0f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
        return ofFloat;
    }

    private final Animator v(View view, long j2, long j3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, e.a(view, -30));
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        h.d(ofFloat, "this");
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…rtDelay = delay\n        }");
        return ofFloat;
    }

    static /* synthetic */ Animator w(QuizStory quizStory, View view, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 300;
        }
        if ((i & 4) != 0) {
            j3 = 0;
        }
        return quizStory.v(view, j2, j3);
    }

    private final Animator x(View view, float f, long j2, long j3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f, 1.0f);
        h.d(ofFloat, "this");
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        ofFloat.setDuration(j2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f, 1.0f);
        h.d(ofFloat2, "this");
        ofFloat2.setInterpolator(b09.b());
        ofFloat2.setDuration(j2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setStartDelay(j3);
        return animatorSet;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        super.dispose();
        this.j = null;
        Animator animator = this.k;
        if (animator != null) {
            wz8.b(animator);
        }
        this.k = null;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0064: APUT  (r10v0 android.animation.Animator[]), (0 ??[int, short, byte, char]), (r1v1 android.animation.AnimatorSet) */
    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        String str;
        if (this.j != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[4];
            AnimatorSet animatorSet2 = new AnimatorSet();
            i iVar = this.j;
            if (iVar != null) {
                animatorSet2.playTogether(wz8.i(iVar.e(), 30.0f, 0.0f, 500, 0, 16), wz8.e(iVar.e(), 1.0f, 300, 0, 8), wz8.i(iVar.d(), 30.0f, 0.0f, 500, 0, 16), wz8.e(iVar.d(), 1.0f, 300, 0, 8));
            }
            animatorArr[0] = animatorSet2;
            AnimatorSet animatorSet3 = new AnimatorSet();
            i iVar2 = this.j;
            if (iVar2 != null) {
                List u = kotlin.collections.d.u(900L, 700L, 600L, 800L);
                l lVar = new l(7);
                lVar.a(wz8.i(iVar2.e(), 0.0f, -160.0f, 800, 0, 16));
                lVar.a(s(this, iVar2.e(), 500, 0, 4));
                lVar.a(wz8.i(iVar2.d(), 0.0f, -160.0f, 800, 0, 16));
                lVar.a(s(this, iVar2.d(), 500, 0, 4));
                lVar.a(u(this, iVar2.f(), 800, 160, 0, 8));
                lVar.a(q(iVar2.f(), 500, 300));
                List<ChoiceViewWithGradient> b2 = iVar2.b();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (T t : b2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        T t2 = t;
                        long longValue = ((Number) u.get(i)).longValue();
                        kotlin.collections.d.a(arrayList, kotlin.collections.d.u(x(t2, 0.0f, 300, longValue), q(t2, 200, longValue)));
                        i = i2;
                    } else {
                        kotlin.collections.d.L();
                        throw null;
                    }
                }
                Object[] array = arrayList.toArray(new Animator[0]);
                if (array != null) {
                    lVar.b(array);
                    animatorSet3.playTogether((Animator[]) lVar.d(new Animator[lVar.c()]));
                    str = "null cannot be cast to non-null type kotlin.Array<T>";
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                str = "null cannot be cast to non-null type kotlin.Array<T>";
            }
            animatorSet3.setStartDelay(3000);
            e.c(animatorSet3, new QuizStory$quizPageAnimation$$inlined$apply$lambda$1(this));
            e.b(animatorSet3, new QuizStory$quizPageAnimation$$inlined$apply$lambda$2(this));
            animatorArr[1] = animatorSet3;
            AnimatorSet animatorSet4 = new AnimatorSet();
            i iVar3 = this.j;
            if (iVar3 != null) {
                l lVar2 = new l(3);
                lVar2.a(s(this, iVar3.f(), 200, 0, 4));
                lVar2.a(w(this, iVar3.f(), 0, 0, 6));
                List<ChoiceViewWithGradient> b3 = iVar3.b();
                ArrayList arrayList2 = new ArrayList();
                for (T t3 : b3) {
                    kotlin.collections.d.a(arrayList2, kotlin.collections.d.u(s(this, t3, 200, 0, 4), w(this, t3, 0, 0, 6)));
                }
                Object[] array2 = arrayList2.toArray(new Animator[0]);
                if (array2 != null) {
                    lVar2.b(array2);
                    animatorSet4.playTogether((Animator[]) lVar2.d(new Animator[lVar2.c()]));
                } else {
                    throw new NullPointerException(str);
                }
            }
            animatorSet4.setStartDelay(15000);
            animatorArr[2] = animatorSet4;
            animatorArr[3] = t(0);
            animatorSet.playSequentially(animatorArr);
            this.k = animatorSet;
        }
        Animator animator = this.k;
        if (animator != null) {
            return (AnimatorSet) animator;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.animation.AnimatorSet");
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        View G = q4.G(view, C0707R.id.story_background);
        h.d(G, "requireViewById(view, R.id.story_background)");
        View G2 = q4.G(view, C0707R.id.intro_title);
        h.d(G2, "requireViewById(view, R.id.intro_title)");
        TextView textView = (TextView) G2;
        View G3 = q4.G(view, C0707R.id.intro_subtitle);
        h.d(G3, "requireViewById(view, R.id.intro_subtitle)");
        TextView textView2 = (TextView) G3;
        View G4 = q4.G(view, C0707R.id.prompt);
        h.d(G4, "requireViewById(view, R.id.prompt)");
        TextView textView3 = (TextView) G4;
        View G5 = q4.G(view, C0707R.id.choice_one);
        h.d(G5, "requireViewById(view, R.id.choice_one)");
        ChoiceViewWithGradient choiceViewWithGradient = (ChoiceViewWithGradient) G5;
        View G6 = q4.G(view, C0707R.id.choice_two);
        h.d(G6, "requireViewById(view, R.id.choice_two)");
        ChoiceViewWithGradient choiceViewWithGradient2 = (ChoiceViewWithGradient) G6;
        View G7 = q4.G(view, C0707R.id.choice_three);
        h.d(G7, "requireViewById(view, R.id.choice_three)");
        ChoiceViewWithGradient choiceViewWithGradient3 = (ChoiceViewWithGradient) G7;
        ChoiceViewWithGradient choiceViewWithGradient4 = (ChoiceViewWithGradient) view.findViewById(C0707R.id.choice_four);
        View G8 = q4.G(view, C0707R.id.response_text);
        h.d(G8, "requireViewById(view, R.id.response_text)");
        TextView textView4 = (TextView) G8;
        View G9 = q4.G(view, C0707R.id.result_title);
        h.d(G9, "requireViewById(view, R.id.result_title)");
        TextView textView5 = (TextView) G9;
        View G10 = q4.G(view, C0707R.id.result_answer);
        h.d(G10, "requireViewById(view, R.id.result_answer)");
        TextView textView6 = (TextView) G10;
        View G11 = q4.G(view, C0707R.id.result_gradient);
        h.d(G11, "requireViewById(view, R.id.result_gradient)");
        WrappedGradientView wrappedGradientView = (WrappedGradientView) G11;
        View G12 = q4.G(view, C0707R.id.result_image);
        h.d(G12, "requireViewById(view, R.id.result_image)");
        ImageView imageView = (ImageView) G12;
        View G13 = q4.G(view, C0707R.id.statistic);
        h.d(G13, "requireViewById(view, R.id.statistic)");
        TextView textView7 = (TextView) G13;
        View G14 = q4.G(view, C0707R.id.say_thanks_statistic);
        h.d(G14, "requireViewById(view, R.id.say_thanks_statistic)");
        TextView textView8 = (TextView) G14;
        View G15 = q4.G(view, C0707R.id.say_thanks_button);
        h.d(G15, "requireViewById(view, R.id.say_thanks_button)");
        i iVar = new i(G, textView, textView2, textView3, choiceViewWithGradient, choiceViewWithGradient2, choiceViewWithGradient3, choiceViewWithGradient4, textView4, textView5, textView6, wrappedGradientView, imageView, textView7, textView8, (TextView) G15);
        iVar.a().setBackgroundColor(this.m.a());
        iVar.e().setText(this.m.d());
        iVar.e().setTextColor(this.m.f());
        iVar.d().setText(this.m.c());
        iVar.d().setTextColor(this.m.k());
        iVar.f().setText(this.m.g());
        iVar.f().setTextColor(this.m.f());
        iVar.j().setText(this.m.h().d());
        iVar.j().setTextColor(this.m.f());
        iVar.g().setTextColor(this.m.f());
        iVar.h().setTextColor(this.m.k());
        iVar.m().setText(this.m.h().c().b());
        if (this.m.i() != null) {
            this.l = true;
            this.n.c(this.m.l(), this.m.i().c());
            iVar.l().setText(this.m.i().b().b());
            iVar.k().setText(this.m.i().a());
            Context context = view.getContext();
            h.d(context, "view.context");
            Drawable drawable = context.getResources().getDrawable(C0707R.drawable.twitter);
            drawable.setBounds(0, 0, 60, 60);
            iVar.k().setCompoundDrawables(drawable, null, null, null);
            iVar.k().setOnClickListener(new a(this, view));
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        int i = 0;
        for (T t : this.m.b()) {
            int i2 = i + 1;
            if (i >= 0) {
                T t2 = t;
                iVar.b().get(i).setEnabled(false);
                iVar.b().get(i).E(t2, this.m.a(), this.m.f());
                if (t2.c()) {
                    iVar.h().setText(t2.b());
                    iVar.i().setImageBitmap(t2.a());
                    ref$IntRef.element = i;
                }
                iVar.b().get(i).setOnClickListener(new b(i, iVar, ref$IntRef, this, view));
                i = i2;
                iVar = iVar;
            } else {
                kotlin.collections.d.L();
                throw null;
            }
        }
        this.j = iVar;
        this.n.b(this.m.l());
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void pause() {
        Animator animator;
        if (Build.VERSION.SDK_INT >= 19 && (animator = this.k) != null) {
            animator.pause();
        }
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void resume() {
        Animator animator;
        if (Build.VERSION.SDK_INT >= 19 && (animator = this.k) != null) {
            animator.resume();
        }
    }
}
