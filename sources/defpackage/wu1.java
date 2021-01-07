package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.common.base.Joiner;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: wu1  reason: default package */
public final class wu1 {
    public static Uri a(AuthorizationRequest authorizationRequest) {
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder scheme = builder.scheme(Constants.SCHEME);
        DebugFlag debugFlag = DebugFlag.ACCOUNTS_STAGING;
        scheme.authority("accounts.spotify.com").appendPath(SpotifyLocale.b()).appendPath("authorize").appendQueryParameter("client_id", authorizationRequest.b()).appendQueryParameter("redirect_uri", authorizationRequest.e()).appendQueryParameter("nosignout", Boolean.TRUE.toString());
        if (authorizationRequest.j()) {
            builder.appendQueryParameter("show_dialog", "true");
        }
        if (authorizationRequest.i() != null) {
            builder.appendQueryParameter("state", authorizationRequest.i());
        }
        authorizationRequest.d();
        builder.appendQueryParameter("response_type", authorizationRequest.f().d());
        if (authorizationRequest.c() != null) {
            ClientIdentity c = authorizationRequest.c();
            builder.appendQueryParameter("client_app_id", String.format("%s:%s", c.f(), c.g()));
        }
        String[] g = authorizationRequest.g();
        if (g.length > 0) {
            builder.appendQueryParameter("scope", Joiner.on(" ").join(g));
        }
        return builder.build();
    }
}
