package com.spotify.mobile.android.sso;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.sso.k;
import com.spotify.mobile.android.sso.util.b;
import com.spotify.mobius.MobiusLoop;

public final class h {
    public static k a(Uri uri) {
        ErrorMessage errorMessage = ErrorMessage.UNKNOWN_RESPONSE_TYPE_ERROR;
        if (uri == null) {
            return new k.c(errorMessage);
        }
        String queryParameter = uri.getQueryParameter("state");
        String queryParameter2 = uri.getQueryParameter(AppProtocol.LogMessage.SEVERITY_ERROR);
        String str = null;
        if (queryParameter2 == null) {
            String queryParameter3 = uri.getQueryParameter("code");
            if (queryParameter3 != null) {
                return new k.b(queryParameter3, uri.toString(), queryParameter);
            }
            String encodedFragment = uri.getEncodedFragment();
            if (encodedFragment != null && !encodedFragment.isEmpty()) {
                String str2 = null;
                for (String str3 : encodedFragment.split("&")) {
                    String[] split = str3.split("=");
                    if (split.length == 2) {
                        if (split[0].startsWith("access_token")) {
                            str2 = Uri.decode(split[1]);
                        }
                        if (split[0].startsWith("expires_in")) {
                            str = Uri.decode(split[1]);
                        }
                        if (split[0].startsWith("state")) {
                            queryParameter = Uri.decode(split[1]);
                        }
                    }
                }
                if (!(str == null || str2 == null)) {
                    try {
                        return new k.a(str2, uri.toString(), Integer.parseInt(str), queryParameter);
                    } catch (NumberFormatException e) {
                        Logger.e(e, "Could not parse expiresIn parameter", new Object[0]);
                        return new k.d(errorMessage, "Could not parse expiresIn parameter", queryParameter);
                    }
                }
            }
            return new k.e(ErrorMessage.ACCOUNTS_UNKNOWN_ERROR, uri.toString(), queryParameter);
        } else if ("access_denied".equals(queryParameter2)) {
            return new k.d(ErrorMessage.ACCOUNTS_USER_DENIED, null, queryParameter);
        } else {
            return new k.d(ErrorMessage.ACCOUNTS_SERVICE_ERROR, queryParameter2, queryParameter);
        }
    }

    public static void b(AuthorizationActivity authorizationActivity, i iVar) {
        authorizationActivity.P = iVar;
    }

    public static void c(AuthorizationActivity authorizationActivity, MobiusLoop.g<tv1, rv1> gVar) {
        authorizationActivity.O = gVar;
    }

    public static void d(AuthorizationActivity authorizationActivity, nhd nhd) {
        authorizationActivity.Q = nhd;
    }

    public static void e(AuthorizationActivity authorizationActivity, b bVar) {
        authorizationActivity.N = bVar;
    }
}
