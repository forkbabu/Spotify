package com.google.android.gms.auth.api.signin;

import android.content.Context;

public final class a {
    public static c a(Context context, GoogleSignInOptions googleSignInOptions) {
        if (googleSignInOptions != null) {
            return new c(context, googleSignInOptions);
        }
        throw new NullPointerException("null reference");
    }
}
