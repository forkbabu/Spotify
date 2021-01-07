package defpackage;

import com.spotify.ubi.specification.factories.h4;
import com.spotify.voice.api.model.ClientAction;
import defpackage.u8f;

/* renamed from: y7f  reason: default package */
public class y7f {
    private final h4 a = new h4();
    private final ere b;

    public y7f(ere ere) {
        this.b = ere;
    }

    private void d(ClientAction clientAction, String str, String str2) {
        if (clientAction == null) {
            f(str, str2);
            return;
        }
        int ordinal = clientAction.ordinal();
        if (ordinal == 5) {
            this.b.a(this.a.c(str).f(str, str2).c(str, str2).a());
        } else if (ordinal != 30) {
            f(str, str2);
        } else {
            this.b.a(this.a.c(str).e(str, str2).c(str, str2).a());
        }
    }

    public void a(String str, String str2) {
        this.b.a(this.a.c(str).b(str, str2).c());
    }

    public void b(String str, String str2) {
        this.b.a(this.a.c(str).d(str, str2).b(str, str2).a());
    }

    public void c(String str, String str2) {
        this.b.a(this.a.c(str).c(str, str2).d());
    }

    public void e(u8f u8f, String str, String str2) {
        u8f.getClass();
        if (u8f instanceof u8f.d) {
            this.b.a(this.a.c(str).c(str, str2).b(str, str2).a());
        } else if (u8f instanceof u8f.a) {
            d(((u8f.a) u8f).l(), str, str2);
        } else if (u8f instanceof u8f.g) {
            d(((u8f.g) u8f).l(), str, str2);
        }
    }

    public void f(String str, String str2) {
        this.b.a(this.a.c(str).b(str, str2).b(str, str2).a());
    }

    public void g(String str, String str2) {
        this.b.a(this.a.e(str, str2).a());
    }

    public void h(String str, String str2) {
        this.b.a(this.a.c(str).e(str, str2).b());
    }

    public void i(String str, String str2) {
        this.b.a(this.a.f(str, str2).a());
    }

    public void j(String str, String str2) {
        this.b.a(this.a.c(str).c(str, str2).c(str, str2).a());
    }

    public void k(String str, String str2) {
        this.b.a(this.a.c(str).f(str, str2).b());
    }
}
