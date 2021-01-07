package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.os.Bundle;

/* access modifiers changed from: package-private */
public class f extends h {
    f() {
    }

    @Override // com.spotify.mobile.android.sso.protocol.h, com.spotify.mobile.android.sso.protocol.c
    public Intent b(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.h, com.spotify.mobile.android.sso.protocol.c
    public Bundle g(String str, String str2) {
        Bundle F = je.F("CODE", str, "RESPONSE_TYPE", "code");
        F.putString("STATE", str2);
        return F;
    }
}
