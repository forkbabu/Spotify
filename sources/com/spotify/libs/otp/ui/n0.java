package com.spotify.libs.otp.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.otp.ui.OtpInputView;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;

public class n0<H extends Parcelable, V> implements f0 {
    private l0<H, V> a;
    private ViewGroup b;
    private OtpInputView c;
    private TextView d;
    private TextView e;
    private View f;
    private TextView g;
    private TextView h;

    class a implements OtpInputView.b {
        a() {
        }

        @Override // com.spotify.libs.otp.ui.OtpInputView.b
        public boolean a() {
            View view = n0.this.f;
            view.getClass();
            return bd0.h(view);
        }

        @Override // com.spotify.libs.otp.ui.OtpInputView.b
        public void b(boolean z) {
            View view = n0.this.f;
            view.getClass();
            view.setEnabled(z);
        }

        @Override // com.spotify.libs.otp.ui.OtpInputView.b
        public void c() {
            n0.this.n(false);
        }
    }

    private class b extends m {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            OtpInputView otpInputView = n0.this.c;
            otpInputView.getClass();
            otpInputView.r(bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            if (bundle != null) {
                OtpInputView otpInputView = n0.this.c;
                otpInputView.getClass();
                if (bundle.containsKey("key-otp")) {
                    int i = bundle.getInt("num-digits");
                    String[] stringArray = bundle.getStringArray("key-otp");
                    otpInputView.setNumDigits(i);
                    MoreObjects.checkState(stringArray.length == i);
                    for (int i2 = 0; i2 < i; i2++) {
                        otpInputView.s(i2, stringArray[i2]);
                    }
                }
            }
        }
    }

    public n0(k kVar) {
        kVar.y0(new b(null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if ((r1.getVisibility() == 0) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p() {
        /*
            r4 = this;
            android.view.View r0 = r4.f
            r0.getClass()
            com.spotify.libs.otp.ui.OtpInputView r1 = r4.c
            r1.getClass()
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002e
            com.spotify.libs.otp.ui.OtpInputView r1 = r4.c
            r1.getClass()
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x002e
            android.widget.TextView r1 = r4.e
            r1.getClass()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.otp.ui.n0.p():void");
    }

    @Override // com.spotify.libs.otp.ui.f0
    public void a(boolean z) {
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        otpInputView.f();
        ViewGroup viewGroup = this.b;
        viewGroup.getClass();
        AnimatorHelper.f(viewGroup, z, new u(this));
        l0<H, V> l0Var = this.a;
        l0Var.getClass();
        OtpInputView otpInputView2 = this.c;
        otpInputView2.getClass();
        l0Var.g(otpInputView2.getObservable());
    }

    @Override // com.spotify.libs.otp.ui.f0
    public int b() {
        return C0707R.id.validate_otp;
    }

    @Override // com.spotify.libs.otp.ui.f0
    public void c(boolean z) {
        l0<H, V> l0Var = this.a;
        l0Var.getClass();
        l0Var.h();
        ViewGroup viewGroup = this.b;
        viewGroup.getClass();
        AnimatorHelper.c(viewGroup, z);
    }

    @Override // com.spotify.libs.otp.ui.f0
    public void d(ViewGroup viewGroup) {
        this.a.getClass();
        this.b = viewGroup;
        View findViewById = viewGroup.findViewById(C0707R.id.otp_input);
        findViewById.getClass();
        this.c = (OtpInputView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0707R.id.otp_description);
        findViewById2.getClass();
        this.d = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0707R.id.otp_mismatch);
        findViewById3.getClass();
        this.e = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0707R.id.validate_otp_button);
        findViewById4.getClass();
        this.f = findViewById4;
        View findViewById5 = viewGroup.findViewById(C0707R.id.resend_sms);
        findViewById5.getClass();
        this.g = (TextView) findViewById5;
        View findViewById6 = viewGroup.findViewById(C0707R.id.edit_phone_number);
        findViewById6.getClass();
        this.h = (TextView) findViewById6;
        TextView textView = this.g;
        textView.getClass();
        AnimatorHelper.e(textView, SpotifyIconV2.MESSAGES);
        TextView textView2 = this.h;
        textView2.getClass();
        AnimatorHelper.e(textView2, SpotifyIconV2.EDIT);
        View view = this.f;
        view.getClass();
        view.setEnabled(false);
        this.f.setOnClickListener(new w(this));
        TextView textView3 = this.g;
        textView3.getClass();
        textView3.setOnClickListener(new x(this));
        TextView textView4 = this.h;
        textView4.getClass();
        textView4.setOnClickListener(new v(this));
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        otpInputView.setListener(new a());
    }

    public void g(View view) {
        l0<H, V> l0Var = this.a;
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        String otp = otpInputView.getOtp();
        otp.getClass();
        l0Var.k(otp);
    }

    public void h(View view) {
        l0<H, V> l0Var = this.a;
        l0Var.getClass();
        l0Var.j();
    }

    public void i(View view) {
        l0<H, V> l0Var = this.a;
        l0Var.getClass();
        l0Var.i();
    }

    public void j() {
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        otpInputView.h();
    }

    public void k(int i) {
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        otpInputView.setNumDigits(i);
    }

    public void l(String str, String str2) {
        TextView textView = this.d;
        textView.getClass();
        textView.setText(str);
        TextView textView2 = this.e;
        textView2.getClass();
        textView2.setText(str2);
    }

    public void m(boolean z) {
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        otpInputView.setEnabled(z);
        TextView textView = this.g;
        textView.getClass();
        textView.setEnabled(z);
        TextView textView2 = this.h;
        textView2.getClass();
        textView2.setEnabled(z);
        p();
    }

    public void n(boolean z) {
        OtpInputView otpInputView = this.c;
        otpInputView.getClass();
        otpInputView.setOtpMismatch(z);
        TextView textView = this.e;
        textView.getClass();
        int i = 0;
        textView.setVisibility(z ? 0 : 8);
        TextView textView2 = this.d;
        textView2.getClass();
        if (z) {
            i = 8;
        }
        textView2.setVisibility(i);
        p();
    }

    public void o(l0<H, V> l0Var) {
        this.a = l0Var;
    }
}
