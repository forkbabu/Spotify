package com.spotify.music.marquee.learnmore;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public class LearnMoreWebFragment extends WebViewFragment implements s, mfd {
    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        ((SpotifyIconView) view.findViewById(C0707R.id.learn_more_close_button)).setOnClickListener(new a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public int Y4() {
        return C0707R.layout.fragment_learn_more_webview;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        if (Z4() != null) {
            g5("https://sponsored-recommendations.spotify.com/");
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.ADS;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.f1.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        B4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
