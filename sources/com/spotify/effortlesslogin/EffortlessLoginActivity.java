package com.spotify.effortlesslogin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.g;
import androidx.lifecycle.g0;
import com.spotify.music.C0707R;
import dagger.android.a;
import defpackage.ce0;
import defpackage.he0;
import defpackage.ie0;
import defpackage.ij9;
import defpackage.je0;

public class EffortlessLoginActivity extends g implements ij9.b {
    public static final /* synthetic */ int H = 0;
    private TextView A;
    private TextView B;
    private ProgressBar C;
    private Button D;
    q E;
    ae0 F;
    private String G;

    private void O0() {
        String str = this.G;
        if (str != null) {
            this.A.setText(getString(C0707R.string.effortless_login_logging_in, new Object[]{str}));
        } else {
            this.A.setText(C0707R.string.effortless_login_logging_in_no_username);
        }
        this.B.setVisibility(8);
        this.C.setVisibility(0);
        this.D.setVisibility(8);
    }

    public void N0(LoginState loginState) {
        int ordinal = loginState.b().ordinal();
        if (ordinal == 0) {
            this.F.a(new ce0.b(je0.j.b));
            setResult(-1);
            finish();
        } else if (ordinal == 1) {
            O0();
        } else if (ordinal == 2) {
            this.F.a(new ce0.f(je0.j.b, he0.o.b, ie0.f.b, loginState.a()));
            this.A.setText(C0707R.string.effortless_login_fail_title);
            this.B.setText(C0707R.string.effortless_login_fail_subtitle);
            this.C.setVisibility(8);
            this.B.setVisibility(0);
            this.D.setVisibility(0);
            this.D.setOnClickListener(new a(this));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        a.a(this);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_effortless_login);
        this.F.a(new ce0.k(je0.j.b));
        this.G = getIntent().getStringExtra("username");
        boolean booleanExtra = getIntent().getBooleanExtra("login_using_samsung_sign_in", false);
        this.A = (TextView) findViewById(C0707R.id.title);
        this.B = (TextView) findViewById(C0707R.id.subtitle);
        this.C = (ProgressBar) findViewById(C0707R.id.progress_bar);
        this.D = (Button) findViewById(C0707R.id.login_spotify_button);
        p pVar = (p) new g0(this, this.E).a(p.class);
        pVar.g().h(this, new b(this));
        pVar.p(booleanExtra);
        O0();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.d(getClass().getSimpleName());
    }
}
