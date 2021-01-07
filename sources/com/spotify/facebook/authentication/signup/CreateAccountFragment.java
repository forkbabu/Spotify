package com.spotify.facebook.authentication.signup;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.C0707R;
import com.spotify.termsandconditions.TermsAndConditionsView;
import com.spotify.termsandconditions.g;
import com.squareup.picasso.Picasso;
import dagger.android.support.a;

public class CreateAccountFragment extends Fragment implements t {
    public static final /* synthetic */ int p0 = 0;
    private Button g0;
    private Button h0;
    private View i0;
    private ImageView j0;
    private ProgressBar k0;
    private TermsAndConditionsView l0;
    s m0;
    xd0 n0;
    d o0;

    public void K4() {
        Q2().v0();
    }

    public void L4(String str) {
        this.j0.setVisibility(0);
        Picasso.h().m(str).o(rwd.c(this.j0));
    }

    public void M4(boolean z) {
        this.h0.setEnabled(z);
    }

    public void N4(boolean z) {
        this.g0.setEnabled(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.m0.a(this);
    }

    public void O4(boolean z) {
        if (z) {
            this.l0.k();
        }
        TermsAndConditionsView termsAndConditionsView = this.l0;
        termsAndConditionsView.post(new g(termsAndConditionsView, this.i0));
    }

    public void P4(boolean z) {
        this.k0.setVisibility(z ? 0 : 4);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_create_account, viewGroup, false);
        inflate.getClass();
        View findViewById = inflate.findViewById(C0707R.id.create_account_button);
        findViewById.getClass();
        Button button = (Button) findViewById;
        this.g0 = button;
        button.setOnClickListener(new b(this));
        View findViewById2 = inflate.findViewById(C0707R.id.confirmation_cancel_button);
        findViewById2.getClass();
        Button button2 = (Button) findViewById2;
        this.h0 = button2;
        button2.setOnClickListener(new a(this));
        this.i0 = inflate.findViewById(C0707R.id.signup_terms_placeholder);
        this.k0 = (ProgressBar) inflate.findViewById(C0707R.id.progress_spinner);
        this.j0 = (ImageView) inflate.findViewById(C0707R.id.avatar);
        this.l0 = (TermsAndConditionsView) inflate.findViewById(C0707R.id.signup_terms);
        Parcelable parcelable = k4().getParcelable("KEY_FACEBOOK_USER");
        parcelable.getClass();
        ((TextView) inflate.findViewById(C0707R.id.header_text)).setText(W2(C0707R.string.signup_confirm_fb_account_hello, ((com.spotify.loginflow.navigation.a) parcelable).c()));
        return inflate;
    }
}
