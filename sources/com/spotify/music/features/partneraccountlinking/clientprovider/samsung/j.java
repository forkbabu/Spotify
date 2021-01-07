package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;

public class j {
    private static final String[] b = {"api_server_url", "auth_server_url"};
    private final Context a;

    public j(Context context) {
        this.a = context;
    }

    private static Intent b(String str) {
        Intent intent = new Intent(str);
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        return intent;
    }

    /* access modifiers changed from: package-private */
    public Intent a() {
        Intent b2 = b("com.samsung.android.samsungaccount.action.REQUEST_AUTHCODE");
        b2.putExtra("additional", b);
        b2.putExtra("progress_theme", "dark");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        Intent b2 = b("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT");
        b2.putExtra("progress_theme", "dark");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public Intent d() {
        String packageName = this.a.getPackageName();
        Intent b2 = b("com.osp.app.signin.action.ADD_SAMSUNG_ACCOUNT");
        b2.putExtra("mypackage", packageName);
        b2.putExtra("osp_ver", "OSP_02");
        b2.putExtra("mode", "ADD_ACCOUNT");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public Intent e(Optional<String> optional) {
        Intent b2 = b("com.msc.action.samsungaccount.REQUEST_ACCESSTOKEN");
        if (optional.isPresent()) {
            b2.putExtra("expired_access_token", optional.get());
        }
        b2.putExtra("additional", b);
        b2.putExtra("progress_theme", "dark");
        return b2;
    }
}
