package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.k;

public abstract class c {
    public static c c(Intent intent) {
        String c = n.c(intent);
        if ("1".equals(c)) {
            return new h();
        }
        if ("sonos-v1".equals(c)) {
            return new f();
        }
        if ("google-assistant-v1".equals(c)) {
            return new d();
        }
        if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            return new e();
        }
        if (intent.getDataString() == null || !n.d(intent.getDataString())) {
            return null;
        }
        return new g();
    }

    public abstract Intent a(ErrorMessage errorMessage, String str, String str2);

    public abstract Intent b(Bundle bundle);

    public abstract Uri d(Uri uri, ErrorMessage errorMessage, String str);

    public abstract Uri e(Uri uri, k.b bVar);

    public abstract Bundle f(String str, int i, String str2);

    public abstract Bundle g(String str, String str2);
}
