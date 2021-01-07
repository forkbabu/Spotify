package com.spotify.music.features.connect.dialogs;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.instrumentation.b;
import com.spotify.libs.connect.l;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

public class j implements i, hg0<ConnectManager> {
    private final k a;
    private final l b;
    private final zr0 c;
    private final wlf<y> f;
    private final b n;
    private boolean o;
    private boolean p;
    private GaiaDevice q;
    private io.reactivex.disposables.b r = EmptyDisposable.INSTANCE;

    public j(l lVar, zr0 zr0, k kVar, wlf<y> wlf, b bVar) {
        this.b = lVar;
        this.c = zr0;
        this.a = kVar;
        this.f = wlf;
        this.n = bVar;
    }

    public static void d(j jVar, GaiaDevice gaiaDevice) {
        if (((SwitchDeviceActivity) jVar.a).U0() && jVar.o && gaiaDevice != null) {
            if (gaiaDevice.isSelf()) {
                ((SwitchDeviceActivity) jVar.a).finish();
            } else if (!gaiaDevice.equals(jVar.q)) {
                jVar.h(gaiaDevice);
            }
        }
    }

    private void h(GaiaDevice gaiaDevice) {
        Assertion.e(gaiaDevice);
        this.q = gaiaDevice;
        ((SwitchDeviceActivity) this.a).a1(gaiaDevice.getName());
        if (((SwitchDeviceActivity) this.a).getResources().getBoolean(C0707R.bool.connect_dialog_has_image)) {
            ((SwitchDeviceActivity) this.a).X0(this.q);
        }
        ((bt0) ((ct0) this.n).a()).b();
    }

    public void a() {
        if (this.q != null && this.p && this.b.l()) {
            this.c.a(this.q.getAttachId());
        }
    }

    public void b() {
        this.b.p(this);
        this.b.i();
    }

    public void c() {
        if (this.b.l()) {
            this.b.j();
        }
        this.r.dispose();
    }

    public void e() {
        this.p = true;
        ((SwitchDeviceActivity) this.a).finish();
        ((et0) ((ct0) this.n).b()).e();
    }

    public void f(String str) {
        this.p = true;
        ((SwitchDeviceActivity) this.a).finish();
        ((et0) ((ct0) this.n).b()).b(str);
    }

    public void g(String str) {
        this.p = false;
        if (this.b.l()) {
            this.c.d();
        }
        ((SwitchDeviceActivity) this.a).finish();
        ((et0) ((ct0) this.n).b()).f(str);
    }

    public void i(GaiaDevice gaiaDevice) {
        if (gaiaDevice == null || gaiaDevice.getCosmosIdentifier().isEmpty()) {
            ((SwitchDeviceActivity) this.a).finish();
        } else {
            h(gaiaDevice);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.hg0
    public void l(ConnectManager connectManager) {
        this.o = true;
        this.r = this.b.r().p(j.class.getSimpleName()).o0(this.f.get()).subscribe(new e(this), f.a);
    }

    @Override // defpackage.hg0
    public void onDisconnected() {
        this.o = false;
    }
}
