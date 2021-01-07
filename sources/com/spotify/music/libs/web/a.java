package com.spotify.music.libs.web;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ Uri a;

    public /* synthetic */ a(Uri uri) {
        this.a = uri;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Uri uri = this.a;
        String str = ((RxWebToken.TokenResponse) obj).token();
        Uri.Builder buildUpon = uri.buildUpon();
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("oauth_token", str);
        }
        Uri build = buildUpon.build();
        Logger.b("Base Url:%s", uri);
        Logger.b("Token: %s", str);
        Logger.b("Url to open: %s", build);
        return build;
    }
}
