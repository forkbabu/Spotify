package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.behindthelyrics.view.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BehindTheLyricsViewStateManager implements cl2 {
    private final g a;
    private final b b;
    private final Map<State, ViewGroup> c;
    private final d f;
    private final h n;
    private final Resources o;
    private State p;
    private Animator q;

    /* access modifiers changed from: package-private */
    public enum State {
        INTRODUCTION,
        LYRICS,
        INSIGHT,
        ARTIST_ANNOTATION,
        CREDITS
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ Animator a;

        a(BehindTheLyricsViewStateManager behindTheLyricsViewStateManager, Animator animator) {
            this.a = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.start();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements f {
        private final int a;

        b(int i) {
            this.a = i;
        }

        @Override // com.spotify.music.behindthelyrics.view.f
        public void a(ImageView imageView) {
            imageView.setImageResource(this.a);
        }
    }

    public BehindTheLyricsViewStateManager(Map<State, ViewGroup> map, g gVar, b bVar, d dVar, h hVar, Resources resources) {
        this.a = gVar;
        this.b = bVar;
        this.c = map;
        this.f = dVar;
        this.n = hVar;
        this.o = resources;
    }

    private void l(Animator animator) {
        Animator animator2 = this.q;
        if (animator2 == null || !animator2.isRunning()) {
            this.q = animator;
            animator.start();
            return;
        }
        this.q.addListener(new a(this, animator));
        this.q = animator;
    }

    private void m(TextView textView, TextView textView2, State state, int i, int i2, String str) {
        String string = this.o.getString(i2);
        i.d c2 = this.a.c(string);
        i.d dVar = new i.d(textView, this.n.apply(str));
        b bVar = new b(i);
        i.c d = this.a.d(bVar);
        ArrayList arrayList = new ArrayList(o(state));
        Logger.b("Transitioning to: %s", state.toString());
        State state2 = this.p;
        if (state2 == null) {
            Logger.b("No current state", new Object[0]);
            ArrayList arrayList2 = new ArrayList(5);
            arrayList2.add(this.a.k(bVar));
            arrayList2.add(this.a.l(string));
            arrayList2.add(this.f.c(textView, dVar, textView));
            arrayList2.add(this.a.i());
            arrayList2.add(this.f.a(textView2));
            arrayList.addAll(arrayList2);
        } else if (state2 == State.ARTIST_ANNOTATION) {
            Logger.b("Transitioning from artist state to %s", state);
            ArrayList arrayList3 = new ArrayList(4);
            arrayList3.add(this.a.b(this.b, new i.e(c2, d, dVar)));
            arrayList3.add(this.f.b(textView));
            arrayList3.add(this.a.j());
            arrayList3.add(this.b.g());
            arrayList.addAll(arrayList3);
        } else if (state2 == state) {
            Logger.b("Transitioning to self", new Object[0]);
            arrayList.add(this.f.c(textView, dVar, textView));
        } else {
            Logger.b("Transitioning from %s state to %s state", state2, state);
            ArrayList arrayList4 = new ArrayList(4);
            arrayList4.add(this.a.l(string));
            arrayList4.add(this.a.k(bVar));
            arrayList4.add(this.f.c(textView2, dVar, textView));
            arrayList4.add(this.a.i());
            arrayList.addAll(arrayList4);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new i.b(new a(this, state)));
        l(animatorSet);
    }

    private void n(State state) {
        if (this.p != state) {
            ArrayList arrayList = new ArrayList(o(state));
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(this.b.f());
            arrayList2.add(this.b.g());
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(this.a.g());
            arrayList3.add(this.a.h());
            arrayList.addAll(arrayList3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new i.b(new a(this, state)));
            animatorSet.playTogether(arrayList);
            l(animatorSet);
        }
    }

    private List<Animator> o(State state) {
        State state2 = this.p;
        if (state2 == null) {
            Logger.b("Revealing container for %s state", state.toString());
            return ImmutableList.of(this.f.b(this.c.get(state)));
        } else if (this.c.get(state2) == this.c.get(state)) {
            return Collections.emptyList();
        } else {
            Logger.b("Transitioning containers of %s state to %s state", this.p.toString(), state.toString());
            return ImmutableList.of(this.f.c(this.c.get(this.p), i.a, this.c.get(state)));
        }
    }

    @Override // defpackage.cl2
    public void a(String str, f fVar, String str2) {
        String str3;
        String spannableStringBuilder = ((SpannableStringBuilder) this.n.apply(str2)).toString();
        AnimatorSet animatorSet = new AnimatorSet();
        State state = State.ARTIST_ANNOTATION;
        ArrayList arrayList = new ArrayList(o(state));
        State state2 = this.p;
        if (state2 == state) {
            Logger.b("Staying within artist state", new Object[0]);
            arrayList.add(this.b.d(str, fVar, spannableStringBuilder));
        } else {
            if (state2 == null) {
                str3 = "none";
            } else {
                str3 = state2.toString();
            }
            Logger.b("Transitioning from %s state to %s state", str3, state);
            arrayList.add(this.b.b(this.a, this.b.e(str, fVar, spannableStringBuilder)));
            arrayList.addAll(this.b.h());
            arrayList.add(this.a.h());
        }
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new i.b(new a(this, state)));
        l(animatorSet);
    }

    @Override // defpackage.cl2
    public void e(String str) {
        m(this.a.e(), this.a.f(), State.INSIGHT, C0707R.drawable.icon_insights, C0707R.string.btl_info_card_insight, str);
    }

    @Override // defpackage.cl2
    public void f(String str) {
        Animator c2 = this.b.c(((SpannableStringBuilder) this.n.apply(str)).toString());
        c2.addListener(new i.b(new a(this, State.ARTIST_ANNOTATION)));
        l(c2);
    }

    @Override // defpackage.cl2
    public void g() {
        n(State.INTRODUCTION);
    }

    @Override // defpackage.cl2
    public void i() {
        n(State.CREDITS);
    }

    @Override // defpackage.cl2
    public void j(String str) {
        m(this.a.f(), this.a.e(), State.LYRICS, C0707R.drawable.icon_lyrics, C0707R.string.btl_info_card_lyrics, str);
    }

    public /* synthetic */ void k(State state) {
        Logger.b("Setting current state to: %s", state.toString());
        this.p = state;
    }
}
