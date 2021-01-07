package com.spotify.magiclink.request;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.signup.validators.LocalEmailValidator;
import com.spotify.magiclink.request.f;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public class MagicLinkRequestFragment extends Fragment implements f.a {
    private String g0;
    private String h0;
    private Button i0;
    private ViewAnimator j0;
    private TextView k0;
    private TextView l0;
    private TextView m0;
    private EditText n0;
    private ProgressBar o0;
    private boolean p0;
    private boolean q0;
    f r0;
    LocalEmailValidator s0;
    o11 t0;

    class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!MagicLinkRequestFragment.this.p0 && !MagicLinkRequestFragment.this.q0) {
                MagicLinkRequestFragment.this.t0.a(i11.e(p11.b(), n11.a()));
                MagicLinkRequestFragment.this.p0 = true;
            }
            MagicLinkRequestFragment.this.q0 = false;
            MagicLinkRequestFragment.this.r0.f(editable.toString());
        }
    }

    public void O4(boolean z) {
        this.i0.setEnabled(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.r0.g();
    }

    public void P4(View view) {
        p11 p11;
        o11 o11 = this.t0;
        if (this.j0.getDisplayedChild() == 0) {
            p11 = p11.b();
        } else {
            p11 = p11.a();
        }
        o11.a(i11.a(p11, j11.a(), k11.d()));
        K2().v0();
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        gf0.p(this.n0);
        boolean z = false;
        if (!TextUtils.isEmpty(this.g0)) {
            this.q0 = true;
            this.n0.setText(this.g0);
            Bundle D2 = D2();
            if (D2 != null && D2.getBoolean("magiclink_show_done_screen", false)) {
                S4(true);
                z = true;
            }
        }
        if (bundle == null && !z) {
            this.t0.a(i11.g(p11.b()));
        }
    }

    public /* synthetic */ boolean Q4(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 || TextUtils.isEmpty(textView.getText())) {
            return false;
        }
        this.t0.a(i11.a(p11.b(), j11.f(), k11.d()));
        this.r0.i(this.n0.getText().toString());
        return false;
    }

    public /* synthetic */ void R4(View view) {
        this.t0.a(i11.a(p11.b(), j11.f(), k11.d()));
        this.r0.i(this.n0.getText().toString());
    }

    public void S4(boolean z) {
        Logger.d("request email was sent", new Object[0]);
        if (z) {
            this.t0.a(i11.d(p11.b(), m11.g()));
        } else {
            this.t0.a(i11.d(p11.b(), m11.f()));
        }
        gf0.h(this.n0);
        boolean z2 = q4.o(a3()) == 1;
        ViewAnimator viewAnimator = this.j0;
        viewAnimator.setInAnimation(viewAnimator.getContext(), z2 ? C0707R.anim.slide_in_left : C0707R.anim.slide_in_right);
        ViewAnimator viewAnimator2 = this.j0;
        viewAnimator2.setOutAnimation(viewAnimator2.getContext(), z2 ? C0707R.anim.slide_out_right : C0707R.anim.slide_out_left);
        this.j0.showNext();
        this.t0.a(i11.g(p11.a()));
        this.k0.setText(C0707R.string.magiclink_request_sent_heading);
        if (this.s0.a(this.n0.getText().toString()) == LocalEmailValidator.EmailValidation.VALID) {
            this.m0.setText(W2(C0707R.string.magiclink_request_sent_message, this.n0.getText()));
        } else {
            this.m0.setText(V2(C0707R.string.magiclink_request_sent_message_no_email));
        }
    }

    public void T4(boolean z) {
        int i = 0;
        this.i0.setVisibility(z ? 4 : 0);
        ProgressBar progressBar = this.o0;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    public void U4() {
        this.l0.setText(C0707R.string.magiclink_error_request_network);
    }

    public void V4() {
        this.l0.setText(C0707R.string.magiclink_error_request_generic);
    }

    public void W4() {
        this.l0.setText(C0707R.string.magiclink_error_request_user_not_found);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        Bundle D2 = D2();
        if (D2 != null) {
            this.g0 = D2.getString("magiclink_email_or_username", null);
            this.h0 = D2.getString("magiclink_initial_error_msg");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.magiclink_request_fragment_sthlm_black, viewGroup, false);
        this.r0.j(this);
        ViewAnimator viewAnimator = (ViewAnimator) inflate.findViewById(C0707R.id.view_animator);
        this.j0 = viewAnimator;
        viewAnimator.setAnimateFirstView(true);
        this.o0 = (ProgressBar) inflate.findViewById(C0707R.id.progress_bar);
        ((SpotifyIconView) inflate.findViewById(C0707R.id.back_button)).setOnClickListener(new b(this));
        this.k0 = (TextView) inflate.findViewById(C0707R.id.request_magiclink_heading);
        EditText editText = (EditText) inflate.findViewById(C0707R.id.login_password_reset_email_input);
        this.n0 = editText;
        editText.addTextChangedListener(new a());
        this.n0.setOnEditorActionListener(new d(this));
        Button button = (Button) inflate.findViewById(C0707R.id.login_password_reset_button);
        this.i0 = button;
        button.setOnClickListener(new c(this));
        ((Button) inflate.findViewById(C0707R.id.open_email_app_button)).setOnClickListener(new a(this));
        this.l0 = (TextView) inflate.findViewById(C0707R.id.login_email_info_message);
        if (!TextUtils.isEmpty(this.h0)) {
            this.l0.setText(this.h0);
            this.h0 = null;
        }
        this.m0 = (TextView) inflate.findViewById(C0707R.id.request_sent_message);
        return inflate;
    }
}
