package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.x0;
import kotlin.jvm.internal.h;

/* renamed from: kb7  reason: default package */
public final class kb7 implements jb7 {
    private final x0 a;
    private final ere b;

    public kb7(ere ere, c cVar) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(cVar, "viewUri");
        this.b = ere;
        this.a = new x0(PageIdentifiers.PODCAST_EPISODE_TRANSCRIPT.path(), cVar.toString());
    }

    @Override // defpackage.jb7
    public void a() {
        this.b.a(this.a.c().a());
    }
}
