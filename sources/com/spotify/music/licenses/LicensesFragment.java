package com.spotify.music.licenses;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;

public class LicensesFragment extends Fragment implements s {
    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.licenses_title);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "internal:licenses";
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        u4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SETTINGS_THIRD_PARTY_LIBRARIES, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = (WebView) layoutInflater.inflate(C0707R.layout.fragment_show_licenses, viewGroup, false);
        webView.loadUrl("file:///android_asset/licenses.xhtml");
        return webView;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.y0;
    }
}
