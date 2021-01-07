package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

/* renamed from: re3  reason: default package */
public final /* synthetic */ class re3 implements Function {
    public static final /* synthetic */ re3 a = new re3();

    private /* synthetic */ re3() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
