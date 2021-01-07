package defpackage;

import com.spotify.music.libs.podcast.presentationcommons.description.step.html.a;
import java.util.LinkedHashSet;

/* renamed from: k77  reason: default package */
public final class k77 implements fjf<eoa> {
    private final wlf<moa> a;
    private final wlf<a> b;
    private final wlf<ooa> c;
    private final wlf<koa> d;

    public k77(wlf<moa> wlf, wlf<a> wlf2, wlf<ooa> wlf3, wlf<koa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(4);
        linkedHashSet.add(this.a.get());
        linkedHashSet.add(this.b.get());
        linkedHashSet.add(this.c.get());
        linkedHashSet.add(this.d.get());
        return new ioa(linkedHashSet);
    }
}
