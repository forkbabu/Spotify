package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.l;

/* renamed from: m7d  reason: default package */
public final /* synthetic */ class m7d implements l {
    public static final /* synthetic */ m7d a = new m7d();

    private /* synthetic */ m7d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return i6d.i(!((OfflineState) obj).offline());
    }
}
