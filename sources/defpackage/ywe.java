package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.uue;

/* renamed from: ywe  reason: default package */
public final /* synthetic */ class ywe implements Runnable {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.t b;

    public /* synthetic */ ywe(t0f t0f, uue.t tVar) {
        this.a = t0f;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b.a(), "", SlimoProto$ParsedQuery$Intent.RESUME.name(), ClientAction.RESUME.name());
    }
}
