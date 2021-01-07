package com.spotify.libs.otp.ui;

import android.view.View;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ OtpInputView a;
    public final /* synthetic */ int b;

    public /* synthetic */ e(OtpInputView otpInputView, int i) {
        this.a = otpInputView;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.q(this.b, view);
    }
}
