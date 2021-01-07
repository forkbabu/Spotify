package defpackage;

import com.spotify.music.libs.fullscreen.story.domain.h;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.libs.fullscreen.story.domain.o;
import io.reactivex.functions.l;

/* renamed from: nc5  reason: default package */
public final /* synthetic */ class nc5 implements l {
    public static final /* synthetic */ nc5 a = new nc5();

    private /* synthetic */ nc5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        o oVar = (o) obj;
        if (oVar instanceof o.a) {
            return new i.w(oVar);
        }
        if (oVar instanceof o.g) {
            return new i.w(oVar);
        }
        if (oVar instanceof o.f) {
            return new i.w(oVar);
        }
        if (oVar instanceof o.d) {
            return new i.w(oVar);
        }
        if (oVar instanceof o.b) {
            return i.b.a;
        }
        if (oVar instanceof o.c) {
            return new i.h(new h.e(((o.c) oVar).a()));
        }
        if (oVar instanceof o.e) {
            return new i.h(new h.e(((o.e) oVar).a()));
        }
        throw new IllegalStateException("Unknown FullscreenStoryStoryPlayerEvent: " + oVar);
    }
}
