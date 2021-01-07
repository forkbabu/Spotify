package com.spotify.music.libs.voice;

import android.content.Context;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import io.reactivex.functions.h;

public final class c implements h<ImageView, String, String, ng0> {
    private final Picasso a;

    c(Picasso picasso) {
        this.a = picasso;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.h
    public ng0 a(ImageView imageView, String str, String str2) {
        boolean z;
        ImageView imageView2 = imageView;
        String str3 = str;
        String str4 = str2;
        Context context = imageView2.getContext();
        if (MoreObjects.isNullOrEmpty(str4)) {
            imageView2.setImageDrawable(yc0.r(context));
            return ng0.a();
        }
        l0 z2 = l0.z(str3);
        z m = this.a.m(str4);
        if (x.i(z2)) {
            m.t(yc0.f(context));
            m.m(imageView2);
            return ng0.a();
        }
        LinkType q = z2.q();
        switch (q.ordinal()) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 28:
                z = true;
                break;
            case 25:
            case 27:
            default:
                z = false;
                break;
        }
        if (z) {
            m.t(yc0.a(context));
            m.o(rwd.c(imageView2));
            return ng0.a();
        } else if (q == LinkType.SHOW_SHOW) {
            m.t(yc0.g(context));
            m.o(rwd.g(imageView2, d.a((float) imageView2.getResources().getDimensionPixelSize(C0707R.dimen.std_8dp)), null));
            return ng0.a();
        } else if (x.e(q)) {
            int i = yc0.b;
            m.t(yc0.c(context, SpotifyIcon.ALBUM_32, Float.NaN, true, false));
            m.m(imageView2);
            return ng0.a();
        } else {
            m.t(yc0.r(context));
            m.m(imageView2);
            return ng0.a();
        }
    }
}
