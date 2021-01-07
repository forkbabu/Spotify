package com.spotify.music.features.login;

import android.view.KeyEvent;
import android.widget.TextView;

public final /* synthetic */ class f implements TextView.OnEditorActionListener {
    public final /* synthetic */ LoginFragment a;

    public /* synthetic */ f(LoginFragment loginFragment) {
        this.a = loginFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        LoginFragment loginFragment = this.a;
        loginFragment.getClass();
        boolean z = keyEvent != null && keyEvent.getKeyCode() == 66;
        boolean z2 = i == 6;
        if (!z && !z2) {
            return false;
        }
        bd0.h(loginFragment.g0);
        return true;
    }
}
