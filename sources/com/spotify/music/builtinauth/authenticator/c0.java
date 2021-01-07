package com.spotify.music.builtinauth.authenticator;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.h;
import com.spotify.mobile.android.sso.util.a;
import com.spotify.music.builtinauth.authenticator.AccountsActivity;

class c0 implements a {
    final /* synthetic */ AccountsActivity.a a;

    c0(AccountsActivity.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.mobile.android.sso.util.a
    public void a(Uri uri, Uri uri2) {
        String format = String.format("Can't redirect due to mismatch. \nRequest redirect-uri: %s\nResponse redirect-uri: %s", uri, uri2);
        Logger.d(format, new Object[0]);
        AccountsActivity.a(AccountsActivity.this, format);
    }

    @Override // com.spotify.mobile.android.sso.util.a
    public void b(Uri uri) {
        AccountsActivity accountsActivity = AccountsActivity.this;
        int i = AccountsActivity.b;
        accountsActivity.getClass();
        accountsActivity.b((e0) h.a(uri).b(c.a, d.a, a.a, b.a, e.a));
        accountsActivity.finish();
    }
}
