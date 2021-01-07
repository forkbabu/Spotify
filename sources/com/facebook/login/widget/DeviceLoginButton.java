package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.LoginBehavior;
import com.facebook.login.h;
import com.facebook.login.o;
import com.facebook.login.widget.LoginButton;

public class DeviceLoginButton extends LoginButton {
    private Uri D;

    private class b extends LoginButton.c {
        b(a aVar) {
            super();
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.login.widget.LoginButton.c
        public o a() {
            h r = h.r();
            r.n(DeviceLoginButton.this.getDefaultAudience());
            r.o(LoginBehavior.DEVICE_AUTH);
            r.s(DeviceLoginButton.this.getDeviceRedirectUri());
            return r;
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Uri getDeviceRedirectUri() {
        return this.D;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.widget.LoginButton
    public LoginButton.c getNewLoginClickListener() {
        return new b(null);
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.D = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
