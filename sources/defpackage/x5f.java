package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.p2f;

/* renamed from: x5f  reason: default package */
public final /* synthetic */ class x5f implements Runnable {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.q b;

    public /* synthetic */ x5f(a8f a8f, p2f.q qVar) {
        this.a = a8f;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b.a(), "", SlimoProto$ParsedQuery$Intent.PREVIOUS.name(), ClientAction.SKIP_BACKWARD.name());
    }
}
