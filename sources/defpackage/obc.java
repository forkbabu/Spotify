package defpackage;

import com.spotify.music.connection.OfflineReason;
import com.spotify.music.connection.g;

/* renamed from: obc  reason: default package */
public final /* synthetic */ class obc implements ti0 {
    public static final /* synthetic */ obc a = new obc();

    private /* synthetic */ obc() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((g.b) obj).d() == OfflineReason.FORCED_OFFLINE);
    }
}
