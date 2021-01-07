package com.spotify.music.features.podcast.episode;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import defpackage.urc;

public class c0 implements urc.b {
    private final mc7 a;

    c0(mc7 mc7) {
        this.a = mc7;
    }

    @Override // defpackage.urc.b
    public void a(Drawable drawable) {
        this.a.j0(drawable);
        this.a.U0(-11316397);
    }

    @Override // defpackage.urc.b
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
        this.a.w0(bitmap);
        this.a.U0(wrc.b(e7Var));
    }

    @Override // defpackage.urc.b
    public void onPrepareLoad(Drawable drawable) {
        this.a.j0(drawable);
        this.a.U0(-11316397);
    }
}
