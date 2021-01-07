package com.spotify.music.features.nowplayingbar.view.carousel;

import android.content.Context;
import android.text.SpannableString;
import com.google.common.base.MoreObjects;
import com.spotify.encore.mobile.utils.TextAppearanceSpanCompat;
import com.spotify.music.C0707R;

final class e {
    private static void a(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpanCompat(context, C0707R.style.res_2132083435_textappearance_nowplayingbar_singlelinetitle), i, i2, 33);
    }

    public static CharSequence b(Context context, ou5 ou5) {
        SpannableString spannableString;
        String h = ou5.h(context.getResources());
        String f = ou5.f(context.getResources());
        if (nud.m(context)) {
            boolean z = !MoreObjects.isNullOrEmpty(f);
            spannableString = SpannableString.valueOf(z ? context.getString(C0707R.string.npb_track_title_artist, f, h) : h);
            if (z) {
                spannableString.setSpan(new TextAppearanceSpanCompat(context, C0707R.style.res_2132083434_textappearance_nowplayingbar_singlelineartist), 0, spannableString.length() - h.length(), 34);
                a(context, spannableString, f.length() + 1, spannableString.length());
            } else {
                a(context, spannableString, 0, h.length());
            }
        } else {
            boolean z2 = !MoreObjects.isNullOrEmpty(f);
            spannableString = SpannableString.valueOf(z2 ? context.getString(C0707R.string.npb_track_title_artist, h, f) : h);
            if (z2) {
                a(context, spannableString, 0, h.length());
                spannableString.setSpan(new TextAppearanceSpanCompat(context, C0707R.style.res_2132083434_textappearance_nowplayingbar_singlelineartist), h.length() + 1, spannableString.length(), 34);
            } else {
                a(context, spannableString, 0, h.length());
            }
        }
        return spannableString;
    }
}
