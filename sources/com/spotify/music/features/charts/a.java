package com.spotify.music.features.charts;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class a extends ana {
    private final Activity c;
    private final Picasso f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, Picasso picasso) {
        super(activity, picasso);
        h.e(activity, "context");
        h.e(picasso, "picasso");
        this.c = activity;
        this.f = picasso;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ana
    public void a(zma zma, s81 s81) {
        String str;
        h.e(zma, "row");
        h.e(s81, "data");
        x81 main = s81.images().main();
        ImageView imageView = zma.getImageView();
        Drawable l = yc0.l(this.c, SpotifyIconV2.PLAYLIST);
        Picasso picasso = this.f;
        if (main == null || (str = main.uri()) == null) {
            str = "/";
        }
        z m = picasso.m(str);
        m.t(l);
        m.g(l);
        m.n(imageView, null);
    }
}
