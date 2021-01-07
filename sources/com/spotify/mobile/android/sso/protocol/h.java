package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.sso.k;
import com.spotify.voiceassistant.player.models.SearchResponse;

public class h extends c {
    @Override // com.spotify.mobile.android.sso.protocol.c
    public Intent a(ErrorMessage errorMessage, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra(SearchResponse.RESULT_ERROR, errorMessage.d());
        intent.putExtra("STATE", str2);
        if (!MoreObjects.isNullOrEmpty(str)) {
            intent.putExtra("ERROR_DESCRIPTION", str);
        }
        return intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Intent b(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("REPLY", bundle);
        return intent;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Uri d(Uri uri, ErrorMessage errorMessage, String str) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Uri e(Uri uri, k.b bVar) {
        return null;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Bundle f(String str, int i, String str2) {
        Bundle F = je.F("ACCESS_TOKEN", str, "RESPONSE_TYPE", "token");
        F.putInt("EXPIRES_IN", i);
        F.putString("STATE", str2);
        return F;
    }

    @Override // com.spotify.mobile.android.sso.protocol.c
    public Bundle g(String str, String str2) {
        Bundle F = je.F("AUTHORIZATION_CODE", str, "RESPONSE_TYPE", "code");
        F.putString("STATE", str2);
        return F;
    }
}
