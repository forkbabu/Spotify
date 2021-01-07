package com.spotify.music.features.yourlibrary.container.utils;

import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class AvatarLoader implements m {
    private final a a = new a();
    private final g<SessionState> b;
    private final bqa c;
    private final lqa f;
    private final y n;
    private final y o;
    private final ImageView p;

    public AvatarLoader(n nVar, g<SessionState> gVar, bqa bqa, lqa lqa, y yVar, y yVar2, ImageView imageView) {
        nVar.A().a(this);
        this.b = gVar;
        this.c = bqa;
        this.f = lqa;
        this.n = yVar;
        this.o = yVar2;
        this.p = imageView;
    }

    public static s a(AvatarLoader avatarLoader, String str) {
        u3 u3Var = new u3(str, null);
        return s.n(avatarLoader.c.a(str).j0(new c(str)).r0(new d(u3Var)).j0(a.a).G0((R) Optional.absent()), s.s(s.i0(Optional.absent()), s.i0(Optional.of(u3Var)).C(100, TimeUnit.MILLISECONDS, avatarLoader.o)), e.a).Q(b.a).j0(h.a);
    }

    public void b(u3 u3Var) {
        F f2 = u3Var.a;
        S s = u3Var.b;
        if (s == null) {
            this.f.a(this.p, null, f2, null, false, null);
        } else {
            this.f.a(this.p, dqa.d(s), s.o().i(), s.n().i(), false, null);
        }
    }

    public void c() {
        this.a.b(new v(this.b.h0(1).O(i.a)).W(new f(this), false, Integer.MAX_VALUE).o0(this.n).subscribe(new g(this)));
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void disposeSubscriptions() {
        this.a.dispose();
    }
}
