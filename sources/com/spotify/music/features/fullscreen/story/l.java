package com.spotify.music.features.fullscreen.story;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.libs.fullscreen.story.domain.m;
import io.reactivex.y;

public class l {
    private final y a;
    private final rc5 b;
    private final fc5 c;

    public l(y yVar, rc5 rc5, fc5 fc5) {
        this.a = yVar;
        this.b = rc5;
        this.c = fc5;
    }

    public MobiusLoop.g<m, i> a(m mVar) {
        return z.a(com.spotify.mobius.rx2.i.c(d.a, this.c.k()).h(this.b.a()).b(new b(this)).d(new c(this)).f(b.g("Fullscreen story feature")), mVar, e.a, u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.a);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.a);
    }
}
