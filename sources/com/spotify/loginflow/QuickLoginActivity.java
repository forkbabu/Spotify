package com.spotify.loginflow;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.music.C0707R;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.a;
import dagger.android.b;
import dagger.android.h;
import io.reactivex.disposables.d;
import io.reactivex.z;

public class QuickLoginActivity extends jd0 implements h {
    public static final /* synthetic */ int I = 0;
    SessionClient C;
    DispatchingAndroidInjector<Object> D;
    u E;
    BootstrapHandler F;
    kx0 G;
    private final d H = new d();

    @Override // dagger.android.h
    public b<Object> C() {
        return this.D;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C0707R.style.res_2132083506_theme_glue_noactionbar);
        a.a(this);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.H.dispose();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.E.start();
        Intent intent = getIntent();
        LoginCredentials password = LoginCredentials.password(intent.getStringExtra("username"), intent.getStringExtra("password"));
        LoginOptions.Builder builder = LoginOptions.builder();
        builder.preAuthenticationSetting(LoginOptions.PreAuthenticationSetting.REQUIRESUCCESS);
        builder.bootstrapRequired(Boolean.TRUE);
        LoginRequest create = LoginRequest.create(password, builder.build());
        this.G.b("-1");
        Logger.b("QuickLoginActivity - Logging in with request", new Object[0]);
        d dVar = this.H;
        z<LoginResponse> login = this.C.login(create);
        BootstrapHandler bootstrapHandler = this.F;
        SessionClient sessionClient = this.C;
        sessionClient.getClass();
        dVar.b(login.s(bootstrapHandler.continueWith(new g(sessionClient))).subscribe(new h(this)));
    }
}
