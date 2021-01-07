package defpackage;

import com.spotify.libs.connect.picker.view.g;
import com.spotify.music.libs.connect.k;
import com.spotify.music.libs.connect.n;
import com.spotify.music.libs.connect.o;

/* renamed from: krb  reason: default package */
public class krb implements jrb {
    private final k a;
    private final o b;
    private g c;

    public krb(k kVar, o oVar) {
        this.a = kVar;
        this.b = oVar;
    }

    @Override // defpackage.jrb
    public void a() {
        this.c.d();
    }

    @Override // defpackage.jrb
    public void b(orb orb) {
        n b2 = this.b.b(this.a.b(orb));
        this.c = b2;
        b2.f();
    }
}
