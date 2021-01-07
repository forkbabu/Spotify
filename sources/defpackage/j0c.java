package defpackage;

import com.spotify.nowplaying.core.orientation.Orientation;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

/* renamed from: j0c  reason: default package */
public final /* synthetic */ class j0c implements l {
    public final /* synthetic */ Orientation a;

    public /* synthetic */ j0c(Orientation orientation) {
        this.a = orientation;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        boolean z = false;
        boolean z2 = this.a == Orientation.LANDSCAPE;
        if (kxd.l(contextTrack) && z2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
