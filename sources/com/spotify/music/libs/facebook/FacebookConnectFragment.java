package com.spotify.music.libs.facebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;
import com.spotify.rxjava2.p;
import io.reactivex.android.schedulers.a;

public class FacebookConnectFragment extends LifecycleListenableFragment implements s {
    public static final /* synthetic */ int l0 = 0;
    private final p h0 = new p();
    @i62
    boolean i0;
    t j0;
    String k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Spotify ❤ Facebook";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.h0.a();
    }

    /* access modifiers changed from: package-private */
    public void K4() {
        o oVar = new o(l4(), this.k0);
        n.a a = n.a(ViewUris.d.toString());
        a.b(true);
        Intent b = oVar.b(a.a());
        b.addFlags(67108864);
        G4(b, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.h0.b(this.j0.a().o0(a.b()).subscribe(new a(this), b.a));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        j62.c(this, bundle);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.S0.toString();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        if (i != 102 || i2 == -1) {
            j4().finish();
        } else {
            K4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        j62.b(this, bundle);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FACEBOOK_CONNECT, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.Y;
    }
}
