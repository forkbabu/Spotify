package com.spotify.music.features.login;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.loginflow.w;
import com.spotify.magiclink.TooManyAttemptsBottomSheetDialog;
import com.spotify.music.C0707R;
import com.spotify.music.features.login.presenter.LoginPresenter;
import com.spotify.music.spotlets.offline.util.c;
import dagger.android.support.a;
import defpackage.ce0;
import defpackage.ge0;
import defpackage.je0;
import defpackage.tn5;

public class LoginFragment extends Fragment implements tn5, w {
    public static final /* synthetic */ int o0 = 0;
    Button g0;
    EditText h0;
    private EditText i0;
    private TextView j0;
    tn5.a k0;
    ae0 l0;
    c m0;
    g n0;

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        bd0.g(this.h0);
    }

    public void K4() {
        this.j0.setText((CharSequence) null);
    }

    public String L4() {
        return this.i0.getText().toString();
    }

    public String M4() {
        return this.h0.getText().toString();
    }

    public void N4(boolean z) {
        this.g0.setEnabled(z);
    }

    public void O4(int i) {
        this.g0.setText(i);
    }

    public void P4(int i) {
        this.j0.setText(i);
        this.j0.sendAccessibilityEvent(32768);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        this.h0.setOnEditorActionListener(new f(this));
        Bundle D2 = D2();
        String str = null;
        if (D2 != null) {
            str = D2.getString("DISPLAY_NAME", null);
        }
        boolean z = false;
        if (str != null) {
            this.i0.setVisibility(8);
            ((TextView) view.findViewById(C0707R.id.username_label)).setText(W2(C0707R.string.remember_me_login_as, str));
        }
        this.g0.setOnClickListener(new g(this, str));
        Bundle D22 = D2();
        String str2 = "";
        if (D22 != null) {
            str2 = D22.getString("EMAIL_OR_USERNAME", str2);
        }
        this.i0.setText(str2);
        if (bundle == null) {
            z = true;
        }
        ((LoginPresenter) this.k0).B(p50.a(this.i0), p50.a(this.h0), z);
    }

    public void Q4(String str) {
        this.h0.setText(str);
    }

    public void R4(String str) {
        this.i0.setText(str);
    }

    public void S4() {
        f c = this.n0.c(V2(C0707R.string.disable_offline_mode_dialog_title), V2(C0707R.string.disable_offline_mode_dialog_body));
        c.e(V2(C0707R.string.disable_offline_mode_dialog_button_cancel), null);
        c.f(V2(C0707R.string.disable_offline_mode_dialog_button_connect), new h(this));
        c.b().a();
    }

    public void T4() {
        f b = this.n0.b(V2(C0707R.string.login_error_login_abroad_restriction));
        b.f(V2(17039370), null);
        b.b().a();
    }

    public void U4(String str, DialogInterface.OnClickListener onClickListener) {
        o E2 = E2();
        TooManyAttemptsBottomSheetDialog tooManyAttemptsBottomSheetDialog = new TooManyAttemptsBottomSheetDialog();
        Bundle bundle = new Bundle();
        bundle.putString("arg_email", str);
        tooManyAttemptsBottomSheetDialog.r4(bundle);
        tooManyAttemptsBottomSheetDialog.Y4(E2, "too_many_requests_bottom_sheet_dialog");
        this.l0.a(new ce0.e(je0.g.b, ge0.g.b));
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle == null) {
            this.l0.a(new ce0.k(je0.g.b));
        } else {
            this.l0.a(new ce0.l(je0.g.b));
        }
        j4().setTitle(C0707R.string.login_title);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_login_sthlm_black, viewGroup, false);
        inflate.getClass();
        View findViewById = inflate.findViewById(C0707R.id.login_button);
        findViewById.getClass();
        this.g0 = (Button) findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.username_text);
        findViewById2.getClass();
        this.i0 = (EditText) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.password_text);
        findViewById3.getClass();
        this.h0 = (EditText) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.login_error_message);
        findViewById4.getClass();
        this.j0 = (TextView) findViewById4;
        ((Button) inflate.findViewById(C0707R.id.request_magiclink_lower_button)).setOnClickListener(new i(this));
        return inflate;
    }
}
