package com.spotify.magiclink.setpassword;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import dagger.android.a;
import defpackage.ij9;

public class MagiclinkSetPasswordActivity extends jd0 implements ij9.b {
    public static final /* synthetic */ int F = 0;
    q C;
    n D;
    private MobiusLoop.g<t21, r21> E;

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.D.b(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        a.a(this);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_magiclink_set_password);
        t21 h = t21.a.h(getIntent().getStringExtra("t"));
        h31 h31 = new h31(this);
        MobiusLoop.g<t21, r21> a = this.C.a(h31, h);
        this.E = a;
        a.c(h31);
    }

    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.E.d();
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.E.stop();
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.E.start();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.LOGIN_ACCOUNTRECOVERY_RESETPASSWORD, null);
    }
}
