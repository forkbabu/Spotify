package com.spotify.music.features.radiohub.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.a48;

public class RadioHubFragment extends LifecycleListenableFragment implements s, c.a, g<a48, y38> {
    m38 h0;
    e i0;
    private MobiusLoop.g<a48, y38> j0;

    /* access modifiers changed from: package-private */
    public class a implements h<a48> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            ((a48) obj).b().a(new a(this), new c(this), new b(this));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.radio_title);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putParcelable("com.spotify.music.features.radiohub.view.RadioHubFragment.KEY_STATE", HubsImmutableViewModel.immutable(this.i0.c()));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.c;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "radio";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        b91 b91;
        super.s3(bundle);
        a48.a a2 = a48.a();
        if (bundle != null) {
            bundle.setClassLoader(b91.class.getClassLoader());
            b91 = (b91) bundle.getParcelable("com.spotify.music.features.radiohub.view.RadioHubFragment.KEY_STATE");
        } else {
            b91 = null;
        }
        if (b91 != null) {
            a2.a(w38.b(b91));
        }
        MobiusLoop.g<a48, y38> a3 = this.h0.a(a2.build());
        this.j0 = a3;
        a3.c(this);
        this.j0.start();
    }

    @Override // com.spotify.mobius.g
    public h<a48> t(da2<y38> da2) {
        return new a();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.RADIO, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.i0.b();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.j0.stop();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a1;
    }
}
