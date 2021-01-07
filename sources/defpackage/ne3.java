package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.rxjava2.q;

/* renamed from: ne3  reason: default package */
public class ne3 implements a71 {
    private final d a;
    private final q b;

    public ne3(d dVar, q qVar) {
        this.a = dVar;
        this.b = qVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.b.a(this.a.a(c.c()).subscribe());
    }
}
