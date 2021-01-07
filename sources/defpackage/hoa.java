package defpackage;

import com.spotify.music.libs.podcast.presentationcommons.description.step.html.a;
import defpackage.foa;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.h;

/* renamed from: hoa  reason: default package */
public final class hoa implements fjf<eoa> {
    private final wlf<moa> a;
    private final wlf<a> b;
    private final wlf<ooa> c;
    private final wlf<koa> d;

    public hoa(wlf<moa> wlf, wlf<a> wlf2, wlf<ooa> wlf3, wlf<koa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        moa moa = this.a.get();
        a aVar = this.b.get();
        ooa ooa = this.c.get();
        koa koa = this.d.get();
        foa.a aVar2 = foa.a;
        h.e(moa, "sanitizerParsingStep");
        h.e(aVar, "htmlDescriptionParsingStep");
        h.e(ooa, "externalLinksParsingStep");
        h.e(koa, "postSanitizerParsingStep");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(moa);
        linkedHashSet.add(aVar);
        linkedHashSet.add(ooa);
        linkedHashSet.add(koa);
        return new ioa(linkedHashSet);
    }
}
