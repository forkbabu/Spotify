package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.uue;

/* renamed from: ove  reason: default package */
public final /* synthetic */ class ove implements Runnable {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.v b;

    public /* synthetic */ ove(t0f t0f, uue.v vVar) {
        this.a = t0f;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t0f t0f = this.a;
        uue.v vVar = this.b;
        t0f.d(vVar.b(), vVar.a(), SlimoProto$ParsedQuery$Intent.SHUFFLE_ON.name(), ClientAction.SHUFFLE_ON.name());
    }
}
