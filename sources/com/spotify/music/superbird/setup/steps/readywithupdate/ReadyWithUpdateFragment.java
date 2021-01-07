package com.spotify.music.superbird.setup.steps.readywithupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.android.g;
import com.spotify.music.C0707R;
import com.spotify.music.superbird.setup.SetupView;
import com.spotify.music.superbird.setup.j;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class ReadyWithUpdateFragment extends DaggerFragment implements s {
    public j h0;

    public ReadyWithUpdateFragment() {
        super(C0707R.layout.fragment_ready_with_update);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.h0;
        if (jVar != null) {
            e0 a = new g0(j4, jVar).a(g.class);
            h.d(a, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            g gVar = (g) a;
            SetupView setupView = (SetupView) view.findViewById(C0707R.id.ready_with_update_setup_view);
            setupView.setOnButtonClick(new ReadyWithUpdateFragment$onViewCreated$$inlined$apply$lambda$1(gVar));
            setupView.setOnCloseClick(new ReadyWithUpdateFragment$onViewCreated$$inlined$apply$lambda$2(gVar));
            return;
        }
        h.k("viewModelFactory");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_READY.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_READY, null);
        h.d(b, "PageViewObservable.creat…PERBIRD_SETUP_READY\n    )");
        return b;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
