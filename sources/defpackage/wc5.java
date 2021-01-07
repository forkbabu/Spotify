package defpackage;

import com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener;
import com.spotify.music.libs.fullscreen.story.domain.i;

/* renamed from: wc5  reason: default package */
public final /* synthetic */ class wc5 implements qg0 {
    public final /* synthetic */ da2 a;

    public /* synthetic */ wc5(da2 da2) {
        this.a = da2;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        da2 da2 = this.a;
        FullscreenStoryTouchListener.TouchEvent touchEvent = (FullscreenStoryTouchListener.TouchEvent) obj;
        int ordinal = touchEvent.ordinal();
        if (ordinal == 0) {
            da2.accept(i.s.a);
        } else if (ordinal == 1) {
            da2.accept(i.k.a);
        } else if (ordinal == 2) {
            da2.accept(new i.q(false));
            da2.accept(new i.v(false));
        } else if (ordinal == 3) {
            da2.accept(new i.q(true));
            da2.accept(new i.v(true));
        } else {
            throw new IllegalStateException("Unhandled state for: ".concat(touchEvent.name()));
        }
    }
}
