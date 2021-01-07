package defpackage;

import com.google.common.base.Function;
import com.google.common.primitives.Ints;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.player.model.ContextIndex;

/* renamed from: hxd  reason: default package */
public final /* synthetic */ class hxd implements Function {
    public static final /* synthetic */ hxd a = new hxd();

    private /* synthetic */ hxd() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        ContextIndex contextIndex = (ContextIndex) obj;
        return new PlayerContextIndex(Ints.checkedCast(contextIndex.page()), Ints.checkedCast(contextIndex.track()));
    }
}
