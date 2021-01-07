package com.spotify.music.playlist.ui;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;

/* access modifiers changed from: package-private */
public class y<T> {
    private final Context a;
    private final c b;
    private final Picasso c;

    y(Context context, c cVar, Picasso picasso) {
        this.a = context;
        this.b = cVar;
        this.c = picasso;
    }

    public x<T> a(ajf<b4<T>> ajf) {
        return new x<>(this.a, this.b, this.c, ajf);
    }
}
