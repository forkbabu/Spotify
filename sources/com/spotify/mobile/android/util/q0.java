package com.spotify.mobile.android.util;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.rxjava2.p;

@Deprecated
public class q0 {
    private a a;
    private final RxWebToken b;
    private final p c = new p();

    public interface a {
        void n1(Uri uri);
    }

    public q0(RxWebToken rxWebToken) {
        this.b = rxWebToken;
    }

    public static void a(q0 q0Var, Uri uri) {
        a aVar = q0Var.a;
        if (aVar != null) {
            aVar.n1(uri);
        }
    }

    public synchronized void b(String str, a aVar) {
        this.a = aVar;
        this.c.b(this.b.a(Uri.parse(str)).subscribe(new m(this), new l(this)));
    }

    public synchronized void c() {
        this.c.a();
        this.a = null;
    }
}
