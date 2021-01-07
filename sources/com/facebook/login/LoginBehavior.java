package com.facebook.login;

public enum LoginBehavior {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    
    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    private LoginBehavior(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.allowsGetTokenAuth = z;
        this.allowsKatanaAuth = z2;
        this.allowsWebViewAuth = z3;
        this.allowsDeviceAuth = z4;
        this.allowsCustomTabAuth = z5;
        this.allowsFacebookLiteAuth = z6;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.allowsCustomTabAuth;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.allowsDeviceAuth;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.allowsFacebookLiteAuth;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.allowsGetTokenAuth;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.allowsKatanaAuth;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.allowsWebViewAuth;
    }
}
