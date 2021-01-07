package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.behindthelyrics.view.i;
import java.util.ArrayList;
import java.util.List;

public class b extends c {
    private final ViewGroup b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final d f;

    public b(View view, d dVar) {
        super(dVar);
        this.b = (ViewGroup) view.findViewById(C0707R.id.verified_artist_annotation_card);
        this.d = (TextView) view.findViewById(C0707R.id.artist_name);
        this.c = (ImageView) view.findViewById(C0707R.id.artist_image);
        this.e = (TextView) view.findViewById(C0707R.id.artist_quote);
        this.f = dVar;
    }

    @Override // com.spotify.music.behindthelyrics.view.e
    public ViewGroup a() {
        return this.b;
    }

    public Animator c(String str) {
        return this.f.c(this.e, new i.d(this.e, str), this.e);
    }

    public Animator d(String str, f fVar, String str2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.f.c(this.d, new i.d(this.d, str), this.d), this.f.c(this.e, new i.d(this.e, str2), this.e), this.f.c(this.c, new i.c(this.c, fVar), this.c), this.f.b(this.b));
        return animatorSet;
    }

    public i.e e(String str, f fVar, String str2) {
        return new i.e(new i.d(this.d, str), new i.c(this.c, fVar), new i.d(this.e, str2));
    }

    public Animator f() {
        return this.f.a(this.b);
    }

    public Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.f.a(this.d), this.f.a(this.c), this.f.a(this.e));
        return animatorSet;
    }

    public List<Animator> h() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f.b(this.d));
        arrayList.add(this.f.b(this.c));
        arrayList.add(this.f.b(this.e));
        return arrayList;
    }
}
