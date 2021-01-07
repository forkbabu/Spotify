package com.spotify.music.features.ads.cmp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.navigation.t;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class g {
    private final t a;
    private final RxWebToken b;
    private final y c;
    private final f d;

    public g(t tVar, RxWebToken rxWebToken, y yVar, f fVar) {
        this.a = tVar;
        this.b = rxWebToken;
        this.c = yVar;
        this.d = fVar;
    }

    public boolean a(Activity activity, String str, Uri uri) {
        if (str.equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        if (l0.x(uri.toString())) {
            this.a.d(uri.toString());
        } else {
            activity.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
        this.d.b(uri.toString());
        return true;
    }

    public /* synthetic */ void b(Uri uri, Throwable th) {
        Logger.e(th, "[CMP] - Error loading webtoken for One Trust", new Object[0]);
        f fVar = this.d;
        String uri2 = uri.toString();
        StringBuilder V0 = je.V0("Error loading webtoken: ");
        V0.append(th.getLocalizedMessage());
        fVar.c(uri2, V0.toString());
    }

    public z<Uri> c(Uri uri, io.reactivex.functions.g<? super Uri> gVar) {
        return this.b.a(uri).R0(2, TimeUnit.SECONDS).o0(this.c).N0(1).A0(uri).p(gVar).m(new a(this, uri));
    }
}
