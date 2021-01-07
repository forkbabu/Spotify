package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.n;

/* renamed from: gac  reason: default package */
public final /* synthetic */ class gac implements n {
    public static final /* synthetic */ gac a = new gac();

    private /* synthetic */ gac() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !Boolean.valueOf(((ContextTrack) obj).metadata().get("is_advertisement")).booleanValue();
    }
}
