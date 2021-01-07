package com.spotify.music.features.playlistwebview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.encore.foundation.R;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.rxjava2.q;
import io.reactivex.y;

public class PlaylistWebViewFragment extends WebViewFragment implements s, mfd {
    public static final /* synthetic */ int A0 = 0;
    final q w0 = new q();
    WebgateTokenProvider x0;
    y y0;
    e z0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.w0.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        this.w0.a(io.reactivex.s.c0(new a(this)).o0(this.y0).subscribe(new b(this)));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_WEBVIEW;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-feature-playlist-web-view";
    }

    public void k5(String str) {
        StringBuilder sb = new StringBuilder();
        String a = this.z0.a();
        if (!a.isEmpty()) {
            sb.append(a);
            sb.append("?accessToken=");
            sb.append(str);
            sb.append("&playlistUri=");
            sb.append(D2() != null ? D2().getString("PLAYLIST_ARGUMENT") : "");
            String sb2 = sb.toString();
            if (Z4() != null) {
                h5(sb2, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("URL is null or empty");
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PLAYLIST_WEBVIEW, ViewUris.W0.toString());
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View w3 = super.w3(layoutInflater, viewGroup, bundle);
        Z4().setBackgroundColor(R2().getColor(R.color.black));
        return w3;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.Q0;
    }
}
