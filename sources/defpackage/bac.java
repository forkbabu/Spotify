package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

/* renamed from: bac  reason: default package */
public final /* synthetic */ class bac implements l {
    public static final /* synthetic */ bac a = new bac();

    private /* synthetic */ bac() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (ContextTrack) ((Optional) obj).get();
    }
}
