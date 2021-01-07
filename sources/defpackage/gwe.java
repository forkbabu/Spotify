package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.uue;

/* renamed from: gwe  reason: default package */
public final /* synthetic */ class gwe implements Runnable {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.p b;

    public /* synthetic */ gwe(t0f t0f, uue.p pVar) {
        this.a = t0f;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b.a(), "", SlimoProto$ParsedQuery$Intent.PREVIOUS.name(), ClientAction.SKIP_BACKWARD.name());
    }
}
