package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.g;

/* renamed from: jp4  reason: default package */
public final /* synthetic */ class jp4 implements g {
    public final /* synthetic */ op4 a;

    public /* synthetic */ jp4(op4 op4) {
        this.a = op4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((OfflineState) obj);
    }
}
