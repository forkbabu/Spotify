package com.spotify.music.features.profile.profilelist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.features.profile.model.e;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import defpackage.mt7;
import kotlin.jvm.internal.h;

public class ProfileListFragment extends Fragment implements s, mfd, c.a, dt7 {
    public static final /* synthetic */ int l0 = 0;
    gl7 g0;
    zac h0;
    t i0;
    private t0<io.reactivex.s<e>> j0;
    private s k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(ProfileListMetadataResolver.g.i(x()));
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.j0.stop();
    }

    public /* synthetic */ s0 K4(mt7 mt7, io.reactivex.s sVar) {
        s b = this.i0.b(mt7, sVar);
        this.k0 = b;
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.j0.start();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return ProfileListMetadataResolver.g.e(x());
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        String x = x();
        h.e(x, "pageUri");
        c a = c.a(x);
        h.d(a, "ViewUri.create(pageUri)");
        return a;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        super.p3(context);
        dagger.android.support.a.a(this);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ProfileListMetadataResolver.g.f(x());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fl7 a = ((hl7) this.g0).a(x());
        this.j0 = this.h0.a(ObservableLoadable.a(a.a(e.a).N(c.a).Q(b.a)));
        PageLoaderView.a b = this.h0.b(getViewUri(), u0());
        mt7.a e = mt7.a.e();
        e.d(a.title());
        Bundle D2 = D2();
        if (D2 == null) {
            D2 = new Bundle();
            r4(D2);
        }
        String string = D2.getString("current-user");
        MoreObjects.checkNotNull(string, "current-user argument missing");
        e.b(string);
        b.e(new a(this, e.a()));
        PageLoaderView a2 = b.a(l4());
        a2.j0(b3(), this.j0);
        return a2;
    }

    @Override // defpackage.dt7
    public String x() {
        Bundle D2 = D2();
        if (D2 == null) {
            D2 = new Bundle();
            r4(D2);
        }
        String string = D2.getString("uri");
        MoreObjects.checkNotNull(string, "uri argument missing");
        return string;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.A1;
        h.d(ifd, "FeatureIdentifiers.USER_PROFILES");
        return ifd;
    }
}
