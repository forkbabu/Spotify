package com.spotify.facebook.authentication.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.credentials.store.b;
import com.spotify.glue.dialogs.g;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.C0707R;
import dagger.android.support.a;

public class FacebookSSOFragment extends Fragment implements n {
    m g0;
    g h0;
    o i0;
    b j0;
    xd0 k0;
    tl0 l0;
    d m0;
    boolean n0;
    private boolean o0;
    private View p0;

    private boolean L4() {
        if (D2() != null) {
            return D2().getBoolean("popOnReturn");
        }
        return false;
    }

    public void K4() {
        this.p0.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (this.o0 || L4()) {
            this.i0.v0();
            this.o0 = false;
        }
    }

    public void M4() {
        this.j0.a();
        if (k3()) {
            this.i0.v0();
        } else {
            this.o0 = true;
        }
    }

    public void N4() {
        if (B2() != null && e3()) {
            this.k0.d(new b(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.g0.d(this);
    }

    public void O4() {
        this.p0.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        if (bundle == null && !L4()) {
            this.l0.b(this, this.g0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        this.l0.a(i, i2, intent);
        if (B2() != null && i2 == 0) {
            M4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.o0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_sso_login, viewGroup, false);
        inflate.getClass();
        this.p0 = inflate.findViewById(C0707R.id.logging_in);
        return inflate;
    }
}
