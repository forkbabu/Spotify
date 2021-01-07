package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.p2f;

/* renamed from: n5f  reason: default package */
public final /* synthetic */ class n5f implements Runnable {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.h b;

    public /* synthetic */ n5f(a8f a8f, p2f.h hVar) {
        this.a = a8f;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b.a(), "", SlimoProto$ParsedQuery$Intent.NEXT.name(), ClientAction.SKIP_FORWARD.name());
    }
}
