package com.spotify.music.libs.connect.access;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.connect.access.r;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

public class n {
    final u1<Runnable> a;
    private final ConnectAccessButton b;
    private final r c;
    private String d;

    public n(ConnectAccessButton connectAccessButton, r rVar) {
        this.b = connectAccessButton;
        this.c = rVar;
        u1<Runnable> u1Var = new u1<>(10);
        this.a = u1Var;
        u1Var.b(0, new c(this));
        u1Var.b(1, new e(this));
        u1Var.b(2, new f(this));
        u1Var.b(3, new d(this));
        u1Var.b(4, new b(this));
        u1Var.b(5, new a(this));
    }

    private String a(String str) {
        return this.b.getResources().getString(C0707R.string.connect_access_button_connected_accessibility, str);
    }

    private String b(String str) {
        return this.b.getResources().getString(C0707R.string.connect_access_button_connecting_accessibility, str);
    }

    public void c() {
        this.b.setText((CharSequence) null);
        this.b.setIcon(null);
        ConnectAccessButton connectAccessButton = this.b;
        connectAccessButton.setContentDescription(connectAccessButton.getResources().getString(C0707R.string.connect_access_button_normal_accessibility));
        this.b.setVisibility(8);
    }

    public void d() {
        this.b.setText(C0707R.string.connect_access_button_available);
        this.b.setIcon(this.c.f());
        this.b.setActive(false);
        ConnectAccessButton connectAccessButton = this.b;
        connectAccessButton.setContentDescription(connectAccessButton.getResources().getString(C0707R.string.connect_access_button_normal_accessibility));
        this.b.C();
    }

    public /* synthetic */ void e() {
        r.a d2 = this.c.d();
        this.b.setText((CharSequence) null);
        this.b.setIcon(d2.b());
        this.b.setActive(false);
        this.b.setContentDescription(b(this.d));
        this.b.C();
        d2.a().start();
    }

    public /* synthetic */ void f() {
        r.a c2 = this.c.c();
        this.b.setText((CharSequence) null);
        this.b.setIcon(c2.b());
        this.b.setActive(false);
        this.b.setContentDescription(b(this.d));
        this.b.C();
        c2.a().start();
    }

    public /* synthetic */ void g() {
        this.b.setText(this.d);
        this.b.setIcon(this.c.e());
        this.b.setActive(true);
        this.b.setContentDescription(a(this.d));
        this.b.C();
    }

    public /* synthetic */ void h() {
        this.b.setText(this.d);
        this.b.setIcon(this.c.b());
        this.b.setActive(true);
        this.b.setContentDescription(a(this.d));
        this.b.C();
    }

    /* access modifiers changed from: package-private */
    public void i(int i, String str) {
        Runnable g = this.a.g(i, null);
        if (g == null) {
            Assertion.g(String.format("Unknown state %s", Integer.valueOf(i)));
            return;
        }
        this.d = str;
        this.b.post(g);
        Logger.b("State updated to %d", Integer.valueOf(i));
    }
}
