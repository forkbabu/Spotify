package com.spotify.music.features.freetierartist;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.http.u;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.libs.common.presenter.AbstractViewBinderFragment;
import com.spotify.music.libs.common.presenter.BaseViewBinderFragment;
import com.spotify.music.libs.common.presenter.f;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

public abstract class ArtistAboutFragment extends AbstractViewBinderFragment<ArtistModel> {
    private c l0;
    private ArtistUri m0;
    protected dj2 n0;
    protected xj2 o0;
    ys2 p0;
    jz1 q0;
    h r0;
    u s0;
    yn1 t0;
    y u0;
    BaseViewBinderFragment.a v0;
    cqe w0;

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public f<ArtistModel> K4() {
        y yVar = this.u0;
        s<ArtistModel> a = this.o0.a(this.m0.a());
        g<SessionState> a2 = this.t0.a();
        a2.getClass();
        return new f<>(yVar, a, new v(a2));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public Parcelable O4() {
        Bundle D2 = D2();
        if (D2 == null) {
            return null;
        }
        D2.setClassLoader(ArtistAboutFragment.class.getClassLoader());
        return (ArtistModel) D2.getParcelable("artist_model");
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        if (bundle == null) {
            this.n0.b();
        }
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public BaseViewBinderFragment.a Q4() {
        return this.v0;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.l0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.l0 = (c) k4().getParcelable("artist_uri");
        this.m0 = new ArtistUri(this.l0.toString());
        this.o0 = new xj2(this.s0);
        this.n0 = new dj2(kfd.e, this, this.q0, this.w0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.r0.a();
    }
}
