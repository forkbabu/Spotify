package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

/* renamed from: gn6  reason: default package */
public final /* synthetic */ class gn6 implements Function {
    public static final /* synthetic */ gn6 a = new gn6();

    private /* synthetic */ gn6() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
