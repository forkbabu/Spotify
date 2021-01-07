package com.spotify.music.deeplinktracker;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.music.MainActivity;
import com.spotify.music.libs.facebook.q;

public class d {
    private final shd a;
    private final q b;

    public d(q qVar, shd shd) {
        this.a = shd;
        this.b = qVar;
    }

    public String a(Intent intent) {
        String str;
        Uri c1 = ((MainActivity) this.a).c1();
        if (c1 == null) {
            str = null;
        } else {
            str = c1.toString();
        }
        if (this.b.b(intent)) {
            str = "com.facebook.katana";
        }
        String stringExtra = intent.getStringExtra("com.spotify.music.intent.extra.EXTRA_SPOTIFY_INTERNAL_REFERRER_NAME");
        if (!TextUtils.isEmpty(stringExtra)) {
            str = stringExtra;
        }
        return str == null ? "" : str;
    }

    public boolean b(Intent intent) {
        return "android.intent.action.SEARCH".equals(intent.getAction()) && a(intent).contains("com.google.android.googlequicksearchbox");
    }
}
