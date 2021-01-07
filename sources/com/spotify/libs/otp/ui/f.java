package com.spotify.libs.otp.ui;

import android.view.View;

public final /* synthetic */ class f implements View.OnFocusChangeListener {
    public final /* synthetic */ OtpInputView a;

    public /* synthetic */ f(OtpInputView otpInputView) {
        this.a = otpInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.n(view, z);
    }
}
