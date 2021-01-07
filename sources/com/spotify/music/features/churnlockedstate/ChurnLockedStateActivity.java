package com.spotify.music.features.churnlockedstate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.checkout.web.i;

public class ChurnLockedStateActivity extends ss2 implements t {
    public static final /* synthetic */ int K = 0;
    s G;
    t H;
    private Button I;
    private TextView J;

    private void b1(String str, int i) {
        i.a c = i.c();
        c.h(Uri.parse(str));
        c.g(getString(i));
        c.d(this.H);
        startActivityForResult(PremiumSignupActivity.U0(this, c.a()), 0);
    }

    public void U0() {
        this.J.setLinksClickable(false);
        this.I.setClickable(false);
    }

    public void V0() {
        this.J.setLinksClickable(true);
        this.I.setClickable(true);
    }

    public void W0(String str) {
        b1(str, C0707R.string.churn_locked_state_cancel_title);
    }

    public void X0(String str) {
        b1(str, C0707R.string.churn_locked_state_action);
    }

    public void a1() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 0) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.G.d(i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.G.f();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.b(this);
        setContentView(C0707R.layout.activity_churn_locked_state);
        Button button = (Button) findViewById(C0707R.id.update_payment_button);
        this.I = button;
        button.setOnClickListener(new c(this));
        TextView textView = (TextView) findViewById(C0707R.id.cancel_text);
        this.J = textView;
        boolean z = true;
        Spannable spannable = (Spannable) z42.m(getString(((r) getIntent().getParcelableExtra("churn_locked_state_configuration")).a() ? C0707R.string.churn_locked_state_cancel_premium_only : C0707R.string.churn_locked_state_cancel, new Object[]{""}));
        x.l(spannable, new b(this));
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        s sVar = this.G;
        if (bundle != null) {
            z = false;
        }
        sVar.h(z);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.G.g();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        this.G.e();
        super.onStop();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CHURNLOCK, null);
    }
}
