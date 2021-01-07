package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.AppFocusState;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: uv9  reason: default package */
public class uv9 {
    private final gl0<u> a;
    private final cqe b;
    private final s<Boolean> c;
    private final y d;
    private final p e = new p();
    private boolean f;
    private boolean g;

    public uv9(gl0<u> gl0, cqe cqe, s<Boolean> sVar, y yVar) {
        this.a = gl0;
        this.b = cqe;
        this.c = sVar;
        this.d = yVar;
    }

    private void b(String str) {
        gl0<u> gl0 = this.a;
        AppFocusState.b l = AppFocusState.l();
        l.m(str);
        l.n(this.b.d());
        gl0.c(l.build());
    }

    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            b("foreground");
            this.f = true;
            return;
        }
        if (this.g) {
            b("background-playing");
        } else {
            b("suspended");
        }
        this.f = false;
    }

    public void c() {
        if (!this.f) {
            b("background-playing");
        }
        this.g = true;
    }

    public void d() {
        if (!this.f) {
            b("suspended");
        }
        this.g = false;
    }

    public void e() {
        this.e.b(this.c.o0(this.d).subscribe(new rv9(this)));
    }

    public void f() {
        this.e.a();
    }
}
