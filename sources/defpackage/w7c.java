package defpackage;

import com.spotify.libs.connect.picker.view.g;
import com.spotify.music.libs.connect.k;
import com.spotify.music.libs.connect.n;
import com.spotify.music.libs.connect.o;

/* access modifiers changed from: package-private */
/* renamed from: w7c  reason: default package */
public class w7c implements v7c {
    private final k a;
    private final o b;
    private g c;

    public w7c(k kVar, o oVar) {
        this.a = kVar;
        this.b = oVar;
    }

    @Override // defpackage.v7c
    public void a() {
        this.c.d();
    }

    @Override // defpackage.v7c
    public void b(y7c y7c) {
        n b2 = this.b.b(this.a.b(y7c));
        this.c = b2;
        b2.f();
    }
}
