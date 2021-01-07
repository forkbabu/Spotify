package defpackage;

import android.view.KeyEvent;
import com.spotify.mobile.android.service.media.t1;
import com.spotify.mobile.android.service.media.w2;
import com.spotify.music.playback.api.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.a;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: xha  reason: default package */
public class xha {
    private final String a;
    private final pc1 b;
    private final yda c;
    private final g<PlayerState> d;
    private final t1 e;
    private final e f;
    private final pea g;
    private b h;
    private boolean i;

    public xha(pc1 pc1, w2 w2Var, yda yda, g<PlayerState> gVar, e eVar, pea pea) {
        this.b = pc1;
        this.c = yda;
        this.d = gVar;
        String a2 = w2Var.a();
        this.a = a2;
        this.e = new t1(pc1, a2, yda);
        this.f = eVar;
        this.g = pea;
    }

    public a a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 126) {
            if (keyCode != 127) {
                switch (keyCode) {
                    case 85:
                        if (this.f.a()) {
                            z<String> u = this.g.u(this.c);
                            u.getClass();
                            return new i(u);
                        }
                        z<String> h2 = this.g.h(this.c);
                        h2.getClass();
                        return new i(h2);
                    case 86:
                        break;
                    case 87:
                        z<String> s = this.g.s(this.c);
                        s.getClass();
                        return new i(s);
                    case 88:
                        z<String> f2 = this.g.f(this.c);
                        f2.getClass();
                        return new i(f2);
                    default:
                        return io.reactivex.internal.operators.completable.b.a;
                }
            }
            z<String> u2 = this.g.u(this.c);
            u2.getClass();
            return new i(u2);
        }
        z<String> h3 = this.g.h(this.c);
        h3.getClass();
        return new i(h3);
    }

    public void b() {
        if (!this.i) {
            this.b.e(this.a, 0, this.c);
            g<PlayerState> gVar = this.d;
            t1 t1Var = this.e;
            t1Var.getClass();
            this.h = gVar.subscribe(new uha(t1Var));
            this.i = true;
        }
    }

    public boolean c() {
        return this.i;
    }

    public void d(boolean z) {
        if (this.i) {
            b bVar = this.h;
            if (bVar != null && !bVar.d()) {
                this.h.dispose();
            }
            if (z) {
                this.e.a();
                this.b.c(this.a, 0, this.c);
            }
            this.i = false;
        }
    }
}
