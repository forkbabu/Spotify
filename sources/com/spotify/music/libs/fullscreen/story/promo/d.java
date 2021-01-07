package com.spotify.music.libs.fullscreen.story.promo;

import com.spotify.rxjava2.q;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class d implements a71 {
    private final vfa a;
    private final z<p62> b;
    private final q c;

    public d(vfa vfa, z<p62> zVar, q qVar) {
        h.e(vfa, "fullscreenStoryNavigator");
        h.e(zVar, "betamaxConfiguration");
        h.e(qVar, "disposable");
        this.a = vfa;
        this.b = zVar;
        this.c = qVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        h.e(o81, "command");
        h.e(n61, "event");
        if (h.a(o81.name(), "storyClick")) {
            String string = o81.data().string("uri");
            if (string != null) {
                this.c.a(this.b.subscribe(new b(this, o81, n61, string), c.a));
                return;
            }
            StringBuilder V0 = je.V0("uri is missing in ");
            V0.append(o81.data());
            throw new IllegalArgumentException(V0.toString().toString());
        }
        throw new IllegalStateException(("Unsupported command " + o81).toString());
    }
}
