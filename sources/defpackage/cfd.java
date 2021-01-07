package defpackage;

import com.spotify.remoteconfig.AndroidLibsSocialListeningProperties;

/* renamed from: cfd  reason: default package */
public class cfd {
    private final AndroidLibsSocialListeningProperties a;

    public cfd(AndroidLibsSocialListeningProperties androidLibsSocialListeningProperties) {
        this.a = androidLibsSocialListeningProperties;
    }

    public boolean a() {
        return this.a.a();
    }

    public boolean b() {
        return this.a.c() && !this.a.b();
    }

    public boolean c() {
        return this.a.c() && this.a.b();
    }

    public boolean d() {
        return this.a.d();
    }

    public boolean e() {
        return this.a.e();
    }

    public int f() {
        return this.a.f();
    }

    public boolean g() {
        return this.a.g();
    }

    public boolean h() {
        return this.a.h() == AndroidLibsSocialListeningProperties.PlayActionMode.SHOW_PLAY_OR_QUEUE_DIALOG;
    }
}
