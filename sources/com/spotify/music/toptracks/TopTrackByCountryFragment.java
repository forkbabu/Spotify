package com.spotify.music.toptracks;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;

public class TopTrackByCountryFragment extends LifecycleListenableFragment implements s {
    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Top Track By Country";
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "golden-path-toptracks";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.DEBUG, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.n0;
    }
}
