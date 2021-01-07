package com.spotify.libs.otp.ui;

import android.view.KeyEvent;
import android.widget.TextView;

public final /* synthetic */ class c implements TextView.OnEditorActionListener {
    public final /* synthetic */ b0 a;

    public /* synthetic */ c(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        b0 b0Var = this.a;
        boolean z = true;
        boolean z2 = keyEvent != null && keyEvent.getKeyCode() == 66;
        if (i != 6) {
            z = false;
        }
        if (z2 || z) {
            return b0Var.a();
        }
        return false;
    }
}
