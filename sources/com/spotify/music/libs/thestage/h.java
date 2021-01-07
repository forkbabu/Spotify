package com.spotify.music.libs.thestage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.navigation.t;
import io.reactivex.functions.g;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class h {
    private final t a;
    private final RxWebToken b;
    private final y c;
    private final g d;

    public h(t tVar, RxWebToken rxWebToken, y yVar, g gVar) {
        this.a = tVar;
        this.b = rxWebToken;
        this.c = yVar;
        this.d = gVar;
    }

    public boolean a(Activity activity, String str, Uri uri) {
        if (str.equalsIgnoreCase(uri.getHost()) || "accounts.spotify.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        if (l0.x(uri.toString())) {
            this.a.d(uri.toString());
            return true;
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "Error loading webtoken for The Stage", new Object[0]);
        g gVar = this.d;
        StringBuilder V0 = je.V0("Error loading webtoken: ");
        V0.append(th.getLocalizedMessage());
        gVar.b(V0.toString());
    }

    public z<Uri> c(Uri uri, g<? super Uri> gVar) {
        return this.b.a(uri).R0(2, TimeUnit.SECONDS).o0(this.c).N0(1).A0(uri).p(gVar).m(new c(this));
    }
}
