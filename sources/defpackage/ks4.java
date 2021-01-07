package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.g;

/* renamed from: ks4  reason: default package */
public final /* synthetic */ class ks4 implements g {
    public final /* synthetic */ us4 a;

    public /* synthetic */ ks4(us4 us4) {
        this.a = us4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.w((OfflineState) obj);
    }
}
