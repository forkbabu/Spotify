package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

/* renamed from: if7  reason: default package */
public final /* synthetic */ class if7 implements Function {
    public static final /* synthetic */ if7 a = new if7();

    private /* synthetic */ if7() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
