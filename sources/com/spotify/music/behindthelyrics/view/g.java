package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.behindthelyrics.view.i;

public class g extends c {
    private final ViewGroup b;
    private final TextView c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final d g;

    public g(View view, d dVar) {
        super(dVar);
        this.b = (ViewGroup) view.findViewById(C0707R.id.info_card);
        this.d = (ImageView) view.findViewById(C0707R.id.card_icon);
        this.c = (TextView) view.findViewById(C0707R.id.info_type);
        this.e = (TextView) view.findViewById(C0707R.id.lyrics_text);
        this.f = (TextView) view.findViewById(C0707R.id.insights_text);
        this.g = dVar;
    }

    @Override // com.spotify.music.behindthelyrics.view.e
    public ViewGroup a() {
        return this.b;
    }

    public i.d c(String str) {
        return new i.d(this.c, str);
    }

    public i.c d(f fVar) {
        return new i.c(this.d, fVar);
    }

    public TextView e() {
        return this.f;
    }

    public TextView f() {
        return this.e;
    }

    public Animator g() {
        return this.g.a(this.b);
    }

    public Animator h() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.g.a(this.e), this.g.a(this.f), this.g.a(this.d), this.g.a(this.c));
        return animatorSet;
    }

    public Animator i() {
        return this.g.b(this.b);
    }

    public Animator j() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.g.b(this.c), this.g.b(this.d));
        return animatorSet;
    }

    public Animator k(f fVar) {
        return this.g.c(this.d, new i.c(this.d, fVar), this.d);
    }

    public Animator l(String str) {
        return this.g.c(this.c, new i.d(this.c, str), this.c);
    }
}
