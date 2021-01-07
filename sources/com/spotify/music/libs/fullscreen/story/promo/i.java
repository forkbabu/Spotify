package com.spotify.music.libs.fullscreen.story.promo;

import android.app.Activity;
import android.graphics.Color;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.libs.fullscreen.story.promo.encore.b;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class i implements sg0<s81, Pair<b.a, String>> {
    private static final int b = R.color.gray_15;
    private static final String c = SpotifyIconV2.PLAYLIST.name();
    private static final String d = SpotifyIconV2.VIDEO.name();
    private final Activity a;

    public i(Activity activity) {
        h.e(activity, "activity");
        this.a = activity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public Pair<b.a, String> apply(s81 s81) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        p81 custom;
        s81 s812 = s81;
        h.e(s812, "model");
        String str5 = "";
        String string = s812.custom().string("itemInfo", str5);
        String title = s812.text().title();
        String str6 = title != null ? title : str5;
        String subtitle = s812.text().subtitle();
        String str7 = subtitle != null ? subtitle : str5;
        Activity activity = this.a;
        String string2 = s812.custom().string("backgroundColor");
        if (string2 == null) {
            i = a.b(activity, b);
        } else if (string2.charAt(0) == '#') {
            i = Color.parseColor(string2);
        } else {
            i = Color.parseColor('#' + string2);
        }
        x81 main = s812.images().main();
        if (main == null || (str = main.uri()) == null) {
            str = c;
        }
        x81 main2 = s812.images().main();
        if (main2 == null || (str2 = main2.placeholder()) == null) {
            str2 = c;
        }
        x81 x81 = (x81) s812.images().custom().get("storyImage");
        if (x81 == null || (str3 = x81.uri()) == null) {
            str3 = d;
        }
        x81 x812 = (x81) s812.images().custom().get("storyImage");
        if (x812 == null || (str4 = x812.placeholder()) == null) {
            str4 = d;
        }
        b.a aVar = new b.a(string, str6, str7, i, str, str2, "", str4, str3);
        x81 x813 = (x81) s812.images().custom().get("storyImage");
        String string3 = (x813 == null || (custom = x813.custom()) == null) ? null : custom.string("videoUrl");
        if (string3 != null) {
            str5 = string3;
        }
        return new Pair<>(aVar, str5);
    }
}
