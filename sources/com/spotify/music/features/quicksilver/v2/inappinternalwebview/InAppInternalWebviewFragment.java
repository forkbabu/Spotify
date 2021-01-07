package com.spotify.music.features.quicksilver.v2.inappinternalwebview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.features.checkout.web.g;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import dagger.android.support.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

public class InAppInternalWebviewFragment extends WebViewFragment {
    public static final /* synthetic */ int y0 = 0;
    private b w0 = EmptyDisposable.INSTANCE;
    RxWebToken x0;

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public int Y4() {
        return C0707R.layout.fragment_inapp_internal_webview;
    }

    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean b() {
        return g.b(Z4()).a();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        if (Z4() == null) {
            Assertion.g("Attempted to render url while view was detached.");
            return;
        }
        String string = D2().getString("KEY_IN_APP_INTERNAL_WEBVIEW_URI");
        Uri parse = Uri.parse(string);
        String scheme = parse.getScheme();
        boolean z = false;
        if ("http".equals(scheme) || Constants.SCHEME.equals(scheme)) {
            String host = parse.getHost();
            if ("spotify.com".equals(host) || "www.spotify.com".equals(host)) {
                z = true;
            }
        }
        if (!z) {
            g5(string);
        } else {
            this.w0 = this.x0.a(Uri.parse(string)).subscribe(new c(this));
        }
    }

    public /* synthetic */ void k5(Uri uri) {
        g5(uri.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View w3 = super.w3(layoutInflater, viewGroup, bundle);
        SpotifyIconView spotifyIconView = (SpotifyIconView) w3.findViewById(C0707R.id.btn_close);
        spotifyIconView.setOnClickListener(new b(this));
        spotifyIconView.setIcon(SpotifyIconV2.X);
        return w3;
    }

    @Override // androidx.fragment.app.Fragment
    public void z3() {
        super.z3();
        this.w0.dispose();
    }
}
