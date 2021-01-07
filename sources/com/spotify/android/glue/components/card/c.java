package com.spotify.android.glue.components.card;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.android.glue.components.card.glue.a;
import com.spotify.android.glue.components.card.glue.b;
import com.spotify.music.C0707R;

public class c {
    private final b a = new b();

    public Card a(Context context, ViewGroup viewGroup) {
        Card e = this.a.e(context);
        ((a) e).getView().setTag(C0707R.id.glue_viewholder_tag, e);
        return e;
    }

    public Card b(Context context, ViewGroup viewGroup) {
        Card f = this.a.f(context);
        ((a) f).getView().setTag(C0707R.id.glue_viewholder_tag, f);
        return f;
    }

    public Card c(Context context, ViewGroup viewGroup) {
        Card g = this.a.g(context);
        ((a) g).getView().setTag(C0707R.id.glue_viewholder_tag, g);
        return g;
    }

    public Card d(Context context, ViewGroup viewGroup) {
        Card a2 = this.a.a(context, viewGroup);
        ((a) a2).getView().setTag(C0707R.id.glue_viewholder_tag, a2);
        return a2;
    }

    public b e(Context context, ViewGroup viewGroup) {
        b b = this.a.b(context);
        ((a) b).getView().setTag(C0707R.id.glue_viewholder_tag, b);
        return b;
    }

    public b f(Context context, ViewGroup viewGroup) {
        b c = this.a.c(context);
        ((a) c).getView().setTag(C0707R.id.glue_viewholder_tag, c);
        return c;
    }

    public a g(Context context, ViewGroup viewGroup) {
        a d = this.a.d(context);
        ((a) d).getView().setTag(C0707R.id.glue_viewholder_tag, d);
        return d;
    }
}
