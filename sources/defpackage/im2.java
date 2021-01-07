package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

/* renamed from: im2  reason: default package */
public final /* synthetic */ class im2 implements Function {
    public static final /* synthetic */ im2 a = new im2();

    private /* synthetic */ im2() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).metadata();
    }
}
