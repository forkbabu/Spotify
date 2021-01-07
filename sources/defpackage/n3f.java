package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.p2f;

/* renamed from: n3f  reason: default package */
public final /* synthetic */ class n3f implements Runnable {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.y b;

    public /* synthetic */ n3f(a8f a8f, p2f.y yVar) {
        this.a = a8f;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a8f a8f = this.a;
        p2f.y yVar = this.b;
        a8f.c(yVar.b(), yVar.a(), SlimoProto$ParsedQuery$Intent.SHUFFLE_ON.name(), ClientAction.SHUFFLE_ON.name());
    }
}
