package com.spotify.music.features.phonenumbersignup.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.libs.otp.ui.f0;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.o;
import com.spotify.loginflow.w;
import com.spotify.music.C0707R;
import com.spotify.music.features.phonenumbersignup.d;
import com.spotify.music.features.phonenumbersignup.e;
import dagger.android.support.a;

public class PhoneNumberSignupFragment extends LifecycleListenableFragment implements e, w, o {
    d h0;
    private View i0;
    private TextView j0;
    SnackbarManager k0;
    com.spotify.loginflow.navigation.d l0;

    @Override // com.spotify.libs.otp.ui.g0
    public void O0(f0 f0Var, boolean z) {
        f0Var.c(z);
    }

    @Override // com.spotify.music.features.phonenumbersignup.e
    public void O1(String str) {
        this.l0.d(45500, new Destination.h.c(str, null, AuthenticationMetadata.AuthSource.PHONENUMBER));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.k0.dismiss();
        super.P3();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        this.h0.b();
    }

    @Override // com.spotify.libs.otp.ui.g0
    public void V(f0 f0Var, boolean z) {
        f0Var.a(z);
    }

    @Override // com.spotify.libs.otp.ui.g0
    public void V1(f0 f0Var) {
        ViewGroup viewGroup = (ViewGroup) a3().findViewById(f0Var.b());
        viewGroup.getClass();
        f0Var.d(viewGroup);
    }

    @Override // com.spotify.loginflow.o
    public boolean b() {
        return this.h0.h();
    }

    @Override // com.spotify.music.features.phonenumbersignup.e
    public void j0(SnackbarConfiguration snackbarConfiguration) {
        this.k0.getClass();
        this.k0.show(snackbarConfiguration);
    }

    @Override // com.spotify.libs.otp.ui.g0
    public void k2(boolean z) {
        View view = this.i0;
        view.getClass();
        view.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.features.phonenumbersignup.e
    public void q0(String str) {
        TextView textView = this.j0;
        textView.getClass();
        textView.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_phone_number_signup, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.spinner);
        findViewById.getClass();
        this.i0 = findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.header);
        findViewById2.getClass();
        this.j0 = (TextView) findViewById2;
        return inflate;
    }
}
