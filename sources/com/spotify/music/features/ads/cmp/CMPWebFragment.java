package com.spotify.music.features.ads.cmp;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.rxjava2.p;
import dagger.android.support.a;
import java.util.Locale;

public class CMPWebFragment extends WebViewFragment {
    public static final /* synthetic */ int A0 = 0;
    f w0;
    g x0;
    SpSharedPreferences<Object> y0;
    private final p z0 = new p();

    private String k5() {
        StringBuilder V0 = je.V0("https://c.spotify.com?pid=");
        V0.append(this.y0.m(k.o, ""));
        return String.format(V0.toString(), new Object[0]);
    }

    public static void l5(CMPWebFragment cMPWebFragment, Uri uri) {
        if (cMPWebFragment.Z4() != null) {
            cMPWebFragment.g5(uri.toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        SpotifyIconView spotifyIconView = (SpotifyIconView) view.findViewById(C0707R.id.btn_close);
        spotifyIconView.setOnClickListener(new b((CMPActivity) j4()));
        spotifyIconView.setIcon(SpotifyIconV2.X);
        this.w0.b(k5());
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public int Y4() {
        return C0707R.layout.fragment_one_trust;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean a5(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = Uri.parse(k5()).getHost();
        if (host != null) {
            return this.x0.a(j4(), host, uri);
        }
        throw new IllegalStateException("The URI supplied to The Stage has no host.");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        this.z0.b(this.x0.c(Uri.parse(k5()), new c(this)).subscribe());
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void c5(String str) {
        this.w0.d(str, Uri.parse(str).buildUpon().clearQuery().build().toString());
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void d5(int i, String str, String str2) {
        this.w0.c(k5(), String.format(Locale.ENGLISH, "[CMP] - web error: %d %s when loading %s", Integer.valueOf(i), str, str2));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void e5(SslError sslError) {
        f fVar = this.w0;
        String k5 = k5();
        fVar.c(k5, "[CMP] - SSL Error: " + sslError);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.z0.a();
        this.w0.a(k5());
    }
}
