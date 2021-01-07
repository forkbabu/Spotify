package com.spotify.music.superbird.setup.steps.everythingconnected;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.SetupView;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class EverythingConnectedFragment extends DaggerFragment implements s {
    public m h0;

    public EverythingConnectedFragment() {
        super(C0707R.layout.fragment_everything_connected);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        SetupView setupView = (SetupView) view.findViewById(C0707R.id.everything_connected_setup_view);
        setupView.setOnButtonClick(new EverythingConnectedFragment$onViewCreated$$inlined$apply$lambda$1(this));
        setupView.setOnCloseClick(new EverythingConnectedFragment$onViewCreated$$inlined$apply$lambda$2(this));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_EVERYTHINGCONNECTED.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_EVERYTHINGCONNECTED, ViewUris.y2.toString());
        h.d(b, "PageViewObservable.creat…ONNECTED.toString()\n    )");
        return b;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
