package com.spotify.music.moderation;

import android.net.Uri;
import com.google.common.base.Joiner;
import com.spotify.mobile.android.util.t;

public class i {
    private final t a;

    public i(t tVar) {
        this.a = tVar;
    }

    public String a(yjb yjb) {
        Uri.Builder buildUpon = Uri.parse("https://app-report.spotify.com/").buildUpon();
        String c = this.a.c();
        return buildUpon.appendQueryParameter("version", "android-" + c).appendQueryParameter("platform", "Android").appendQueryParameter("view_uri", yjb.c().toString()).appendQueryParameter("uris", Joiner.on(",").join(yjb.b())).build().toString();
    }
}
