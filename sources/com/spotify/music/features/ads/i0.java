package com.spotify.music.features.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.w;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.webbrowser.AdWebViewActivity;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.p;
import io.reactivex.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;
import okhttp3.y;

public class i0 {
    private final RxWebToken a;
    private final AndroidLibsAdsCommonProperties b;
    private final gl0<u> c;
    private final cqe d;
    private final w e;
    private final p f = new p();
    private Handler g;

    class a implements f {
        a(i0 i0Var) {
        }

        @Override // okhttp3.f
        public void onFailure(e eVar, IOException iOException) {
            Logger.e(iOException, "request.failed: %s", iOException.getMessage());
        }

        @Override // okhttp3.f
        public void onResponse(e eVar, d0 d0Var) {
            int f = d0Var.f();
            if (f < 200 || f >= 300) {
                Logger.d("Request failed: %s", d0Var);
            } else {
                Logger.b("Success", new Object[0]);
            }
        }
    }

    public i0(RxWebToken rxWebToken, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties, gl0<u> gl0, cqe cqe, w wVar) {
        this.a = rxWebToken;
        this.b = androidLibsAdsCommonProperties;
        this.c = gl0;
        this.d = cqe;
        this.e = wVar;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            y a2 = this.e.a();
            a0.a aVar = new a0.a();
            aVar.d();
            aVar.j(str);
            a2.b(aVar.b()).h1(new a(this));
        }
    }

    public void b(Activity activity, i80 i80, String str, boolean z, Uri uri) {
        if (!(this.b.i() == AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid.ENABLED) || !z) {
            activity.startActivity(new Intent("android.intent.action.VIEW", uri));
            return;
        }
        u1 u1Var = new u1(activity, i80, uri, this.c, this.d);
        if (u1Var.c()) {
            Handler handler = new Handler();
            this.g = handler;
            u1Var.f(handler);
            u1Var.e();
            return;
        }
        Intent intent = new Intent(activity, AdWebViewActivity.class);
        intent.putExtra("advertiser", str);
        intent.putExtra("url", uri.toString());
        activity.startActivity(intent);
    }

    public void c(Activity activity, i80 i80, String str, Uri uri, boolean z) {
        g gVar = new g(this, activity, i80, str, z);
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.g = null;
            }
            this.f.a();
            this.f.b(z.z(uri).A(e.a).s(new d(this.a.a(uri).R0(2, TimeUnit.SECONDS).o0(io.reactivex.android.schedulers.a.b()).N0(1).A0(uri).p(new b(i80, activity)).m(new c(activity, uri)), z.z(uri).p(gVar))).B(io.reactivex.android.schedulers.a.b()).subscribe(h.a, new f(uri)));
        } catch (ActivityNotFoundException unused) {
            Assertion.g("Ad External Actions - Could not open ad URI: " + uri);
        }
    }
}
