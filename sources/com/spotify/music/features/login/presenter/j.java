package com.spotify.music.features.login.presenter;

import com.spotify.music.features.login.presenter.LoginPresenter;
import defpackage.f11;

/* access modifiers changed from: package-private */
public class j implements f11.a {
    final /* synthetic */ LoginPresenter.b a;
    final /* synthetic */ LoginPresenter b;

    j(LoginPresenter loginPresenter, LoginPresenter.b bVar) {
        this.b = loginPresenter;
        this.a = bVar;
    }

    @Override // defpackage.f11.a
    public void a() {
        ((d) this.a).a(false);
    }

    @Override // defpackage.f11.a
    public void b(int i) {
        ((d) this.a).a(false);
    }

    @Override // defpackage.f11.a
    public void c() {
        LoginPresenter.a(this.b);
        ((d) this.a).a(true);
    }

    @Override // defpackage.f11.a
    public void d() {
        ((d) this.a).a(false);
    }

    @Override // defpackage.f11.a
    public void e() {
        ((d) this.a).a(false);
    }
}
