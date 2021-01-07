package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.e0;
import com.spotify.mobile.android.service.j;
import com.spotify.mobile.android.ui.fragments.logic.q;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q0;
import com.spotify.music.libs.web.WebViewFragment;
import dagger.android.support.a;

public class NotificationWebViewFragment extends WebViewFragment implements q0.a {
    q0 w0;

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean a5(Uri uri) {
        if (!l0.x(uri.toString())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        G4(intent, null);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        c B2 = B2();
        e0 a = j.a(B2.getIntent().getData());
        Uri uri = a.b;
        if (!q.a(uri)) {
            Assertion.g("Initial uri is not deemed secure, aborting. " + uri);
            B2.finish();
        } else if (a.a) {
            this.w0.b(uri.toString(), this);
        } else {
            g5(uri.toString());
        }
    }

    public /* synthetic */ void k5(Uri uri) {
        g5(uri.toString());
    }

    @Override // com.spotify.mobile.android.util.q0.a
    public void n1(Uri uri) {
        q0 q0Var = this.w0;
        if (q0Var != null) {
            q0Var.c();
            this.w0 = null;
        }
        if (uri == null) {
            Logger.g("Not ready to load web, web token null", new Object[0]);
        } else if (B2() != null) {
            B2().runOnUiThread(new i(this, uri));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        B4(true);
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        q0 q0Var = this.w0;
        if (q0Var != null) {
            q0Var.c();
            this.w0 = null;
        }
    }
}
