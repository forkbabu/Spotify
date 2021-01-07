package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.k;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends i0 {
    private static final String x = l.class.getName();
    private boolean w;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    l.super.cancel();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private l(Context context, String str, String str2) {
        super(context, str);
        t(str2);
    }

    public static l x(Context context, String str, String str2) {
        i0.l(context);
        return new l(context, str, str2);
    }

    @Override // com.facebook.internal.i0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView k = k();
        if (!n() || m() || k == null || !k.isShown()) {
            super.cancel();
        } else if (!this.w) {
            this.w = true;
            k.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1500);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i0
    public Bundle p(String str) {
        Bundle J = f0.J(Uri.parse(str).getQuery());
        String string = J.getString("bridge_args");
        J.remove("bridge_args");
        if (!f0.C(string)) {
            try {
                J.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", d.a(new JSONObject(string)));
            } catch (JSONException unused) {
                boolean z = k.n;
            }
        }
        String string2 = J.getString("method_results");
        J.remove("method_results");
        if (!f0.C(string2)) {
            if (f0.C(string2)) {
                string2 = "{}";
            }
            try {
                J.putBundle("com.facebook.platform.protocol.RESULT_ARGS", d.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                boolean z2 = k.n;
            }
        }
        J.remove("version");
        J.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", a0.p());
        return J;
    }
}
