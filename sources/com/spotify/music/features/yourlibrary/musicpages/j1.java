package com.spotify.music.features.yourlibrary.musicpages;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.a;
import androidx.core.app.b;
import com.spotify.music.features.createplaylist.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;

public class j1 {
    private final t a;
    private final Activity b;
    private final d c;
    private final Bundle d;
    private final c e;
    private final kv5 f;

    public j1(Activity activity, t tVar, d dVar, c cVar, kv5 kv5) {
        this.b = activity;
        this.a = tVar;
        this.c = dVar;
        this.d = b.a(activity, 17432576, 17432577).c();
        this.e = cVar;
        this.f = kv5;
    }

    public void a() {
        Intent b2 = this.f.b(this.b);
        Activity activity = this.b;
        Bundle bundle = this.d;
        int i = a.c;
        int i2 = Build.VERSION.SDK_INT;
        activity.startActivityForResult(b2, 101, bundle);
    }

    public void b(String str) {
        this.c.c(null, this.e.toString(), str);
    }

    public void c(String str) {
        this.c.c(str, this.e.toString(), str);
    }

    public void d() {
        this.a.d("spotify:internal:hidden-content");
    }

    public void e() {
        this.a.d("spotify:internal:preferences");
    }

    public void f(String str, String str2) {
        t tVar = this.a;
        n.a a2 = n.a(str);
        a2.h(str2);
        tVar.e(a2.a());
    }
}
