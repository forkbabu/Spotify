package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: z4c  reason: default package */
public final /* synthetic */ class z4c implements g {
    public final /* synthetic */ c5c a;

    public /* synthetic */ z4c(c5c c5c) {
        this.a = c5c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((ContextTrack) obj);
    }
}
