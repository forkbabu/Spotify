package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

/* renamed from: zl2  reason: default package */
public final /* synthetic */ class zl2 implements Function {
    public static final /* synthetic */ zl2 a = new zl2();

    private /* synthetic */ zl2() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
