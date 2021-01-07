package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.sso.ErrorMessage;

/* access modifiers changed from: package-private */
public final class d extends h {
    d() {
    }

    @Override // com.spotify.mobile.android.sso.protocol.h, com.spotify.mobile.android.sso.protocol.c
    public Intent a(ErrorMessage errorMessage, String str, String str2) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.h, com.spotify.mobile.android.sso.protocol.c
    public Intent b(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.h, com.spotify.mobile.android.sso.protocol.c
    public Bundle f(String str, int i, String str2) {
        throw new UnsupportedOperationException("Google Assistant linking does not support access tokens");
    }

    @Override // com.spotify.mobile.android.sso.protocol.h, com.spotify.mobile.android.sso.protocol.c
    public Bundle g(String str, String str2) {
        return je.E("extra_token", str);
    }
}
