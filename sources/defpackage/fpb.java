package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: fpb  reason: default package */
public final /* synthetic */ class fpb implements g {
    public final /* synthetic */ ypb a;

    public /* synthetic */ fpb(ypb ypb) {
        this.a = ypb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ypb.a(this.a, (ContextTrack) obj);
    }
}
