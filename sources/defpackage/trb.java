package defpackage;

import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import io.reactivex.functions.g;

/* renamed from: trb  reason: default package */
public final /* synthetic */ class trb implements g {
    public final /* synthetic */ wrb a;

    public /* synthetic */ trb(wrb wrb) {
        this.a = wrb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        wrb.a(this.a, (OverlayDisplayMode) obj);
    }
}
