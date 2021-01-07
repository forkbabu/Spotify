package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.a;
import com.spotify.music.libs.viewuri.c;

public abstract class b {

    public static abstract class a {
        public abstract b a();

        public abstract a b(Intent intent);
    }

    public static b a(String str, c cVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(cVar.toString()));
        a.b bVar = new a.b();
        bVar.c(str);
        bVar.b(intent);
        return bVar.a();
    }

    public abstract Intent b();

    public abstract String c();
}
