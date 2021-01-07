package defpackage;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* renamed from: jzb  reason: default package */
public final /* synthetic */ class jzb implements Function {
    public static final /* synthetic */ jzb a = new jzb();

    private /* synthetic */ jzb() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Collections.singletonList((ContextTrack) obj);
    }
}
