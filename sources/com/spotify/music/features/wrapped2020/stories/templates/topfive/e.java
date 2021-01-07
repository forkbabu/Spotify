package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import defpackage.jx1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class e extends d {
    private h j;
    private List<TopFiveRowView> k = EmptyList.a;
    private List<Animator> l = new ArrayList();
    private final f m;
    private final ez8 n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Activity activity, f fVar, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(fVar.a(), TimeUnit.SECONDS), C0707R.layout.story_template_top_five, fVar.c(), fVar.e(), list);
        h.e(activity, "activity");
        h.e(fVar, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.m = fVar;
        this.n = ez8;
    }

    private final void k(View view, int i) {
        long j2 = (long) i;
        this.l.add(wz8.h(view, 30.0f, 0.0f, 800, j2 * 600));
        this.l.add(wz8.d(view, 1.0f, 600, j2 * 700));
    }

    private final AnimatorSet l() {
        AnimatorSet animatorSet = new AnimatorSet();
        h hVar = this.j;
        if (hVar != null) {
            animatorSet.playTogether(wz8.e(hVar.d(), 1.0f, 300, 0, 8), wz8.e(hVar.c(), 1.0f, 300, 0, 8), wz8.i(hVar.d(), 0.0f, -30.0f, 500, 0, 16), wz8.i(hVar.c(), 0.0f, -30.0f, 500, 0, 16), wz8.d(hVar.d(), 0.0f, 300, 3800), wz8.d(hVar.c(), 0.0f, 300, 3800), wz8.h(hVar.d(), -30.0f, -60.0f, 500, 3800), wz8.h(hVar.c(), -30.0f, -60.0f, 500, 3800));
        }
        animatorSet.setStartDelay(200);
        return animatorSet;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0057: APUT  (r2v1 android.animation.Animator[]), (2 ??[int, float, short, byte, char]), (r5v2 android.animation.AnimatorSet) */
    private final AnimatorSet m() {
        AnimatorSet animatorSet = new AnimatorSet();
        h hVar = this.j;
        if (hVar != null) {
            Animator[] animatorArr = new Animator[3];
            animatorArr[0] = wz8.e(hVar.j(), 1.0f, 400, 0, 8);
            animatorArr[1] = wz8.i(hVar.j(), 0.0f, -30.0f, 500, 0, 16);
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (this.j != null) {
                Iterator<Animator> it = this.l.iterator();
                while (it.hasNext()) {
                    animatorSet2.playTogether(it.next());
                }
            }
            animatorArr[2] = animatorSet2;
            animatorSet.playTogether(animatorArr);
        }
        return animatorSet;
    }

    private final AnimatorSet n() {
        AnimatorSet animatorSet = new AnimatorSet();
        h hVar = this.j;
        if (hVar != null) {
            animatorSet.playTogether(wz8.e(hVar.g(), 0.0f, 600, 0, 8), wz8.i(hVar.g(), 0.0f, -30.0f, 1000, 0, 16), wz8.e(hVar.i(), 0.0f, 600, 0, 8), wz8.i(hVar.i(), 0.0f, -30.0f, 1000, 0, 16), wz8.e(hVar.h(), 0.0f, 600, 0, 8), wz8.i(hVar.h(), 0.0f, -30.0f, 1000, 0, 16), wz8.e(hVar.f(), 0.0f, 600, 0, 8), wz8.i(hVar.f(), 0.0f, -30.0f, 1000, 0, 16), wz8.e(hVar.e(), 0.0f, 600, 0, 8), wz8.i(hVar.e(), 0.0f, -30.0f, 1000, 0, 16), wz8.e(hVar.j(), 0.0f, 600, 0, 8), wz8.i(hVar.j(), -30.0f, -60.0f, 1000, 0, 16));
        }
        animatorSet.setStartDelay(4000);
        return animatorSet;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        this.j = null;
        this.k = EmptyList.a;
        this.l.clear();
        super.dispose();
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x008a: APUT  (r7v0 android.animation.Animator[]), (3 ??[int, float, short, byte, char]), (r8v3 android.animation.AnimatorSet) */
    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        AnimatorSet animatorSet;
        if (this.m.d().size() == 3) {
            animatorSet = new AnimatorSet();
            if (this.j != null) {
                Animator[] animatorArr = new Animator[4];
                animatorArr[0] = l();
                animatorArr[1] = m();
                animatorArr[2] = n();
                AnimatorSet animatorSet2 = new AnimatorSet();
                h hVar = this.j;
                if (hVar != null) {
                    animatorSet2.playTogether(wz8.e(hVar.b(), 1.0f, 300, 0, 8), wz8.i(hVar.b(), 0.0f, -30.0f, 500, 0, 16), wz8.d(hVar.b(), 0.0f, 300, 2800), wz8.h(hVar.b(), -30.0f, -60.0f, 500, 2800));
                }
                animatorSet2.setStartDelay(200);
                animatorArr[3] = animatorSet2;
                animatorSet.playSequentially(animatorArr);
            }
        } else {
            animatorSet = new AnimatorSet();
            if (this.j != null) {
                animatorSet.playSequentially(l(), m(), n());
            }
        }
        return animatorSet;
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
        View G4 = q4.G(view, C0707R.id.title);
        h.d(G4, "requireViewById(view, R.id.title)");
        TextView textView3 = (TextView) G4;
        View G5 = q4.G(view, C0707R.id.row_one);
        h.d(G5, "requireViewById(view, R.id.row_one)");
        TopFiveRowView topFiveRowView = (TopFiveRowView) G5;
        View G6 = q4.G(view, C0707R.id.row_two);
        h.d(G6, "requireViewById(view, R.id.row_two)");
        TopFiveRowView topFiveRowView2 = (TopFiveRowView) G6;
        View G7 = q4.G(view, C0707R.id.row_three);
        h.d(G7, "requireViewById(view, R.id.row_three)");
        TopFiveRowView topFiveRowView3 = (TopFiveRowView) G7;
        View G8 = q4.G(view, C0707R.id.row_four);
        h.d(G8, "requireViewById(view, R.id.row_four)");
        TopFiveRowView topFiveRowView4 = (TopFiveRowView) G8;
        View G9 = q4.G(view, C0707R.id.row_five);
        h.d(G9, "requireViewById(view, R.id.row_five)");
        View G10 = q4.G(view, C0707R.id.final_text);
        h.d(G10, "requireViewById(view, R.id.final_text)");
        h hVar = new h(G, textView, textView2, textView3, topFiveRowView, topFiveRowView2, topFiveRowView3, topFiveRowView4, (TopFiveRowView) G9, (TextView) G10);
        this.k = kotlin.collections.d.u(hVar.g(), hVar.i(), hVar.h(), hVar.f(), hVar.e());
        hVar.a().setBackgroundColor(this.m.b());
        int size = this.m.d().size();
        List<a> d = this.m.d();
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(d, 10));
        int i = 0;
        for (T t : d) {
            int i2 = i + 1;
            CharSequence charSequence = null;
            if (i >= 0) {
                T t2 = t;
                boolean z = t2 instanceof b;
                if (z && size == 3 && i == 2) {
                    hVar.b().setText(t2.b().b());
                } else if (z) {
                    T t3 = t2;
                    hVar.d().setText(t3.b().b());
                    TextView c = hVar.c();
                    a09 a = t3.a();
                    if (a != null) {
                        charSequence = a.b();
                    }
                    c.setText(charSequence);
                } else if (t2 instanceof d) {
                    T t4 = t2;
                    hVar.j().setText(t4.a().b());
                    int i3 = 0;
                    for (T t5 : t4.b()) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            T t6 = t5;
                            if (i3 % 2 == 0) {
                                this.k.get(i3).C(t6, false);
                                this.k.get(i3).setVisibility(0);
                                k(this.k.get(i3), i3);
                            } else {
                                this.k.get(i3).C(t6, true);
                                this.k.get(i3).setVisibility(0);
                                k(this.k.get(i3), i3);
                            }
                            hVar.j().setTextColor(t6.b());
                            i3 = i4;
                        } else {
                            kotlin.collections.d.L();
                            throw null;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                arrayList.add(f.a);
                i = i2;
            } else {
                kotlin.collections.d.L();
                throw null;
            }
        }
        this.j = hVar;
        this.n.b(this.m.e());
    }
}
