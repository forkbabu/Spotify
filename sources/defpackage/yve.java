package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.uue;

/* renamed from: yve  reason: default package */
public final /* synthetic */ class yve implements Runnable {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.g b;

    public /* synthetic */ yve(t0f t0f, uue.g gVar) {
        this.a = t0f;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b.a(), "", SlimoProto$ParsedQuery$Intent.NEXT.name(), ClientAction.SKIP_FORWARD.name());
    }
}
