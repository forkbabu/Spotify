package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import defpackage.p2f;

/* renamed from: e3f  reason: default package */
public final /* synthetic */ class e3f implements Runnable {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.v b;

    public /* synthetic */ e3f(a8f a8f, p2f.v vVar) {
        this.a = a8f;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b.b(), "", SlimoProto$ParsedQuery$Intent.RESUME.name(), ClientAction.RESUME.name());
    }
}
