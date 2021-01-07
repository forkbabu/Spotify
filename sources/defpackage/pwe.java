package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;

/* renamed from: pwe  reason: default package */
public final /* synthetic */ class pwe implements Runnable {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ pwe(t0f t0f, String str, String str2) {
        this.a = t0f;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c, SlimoProto$ParsedQuery$Intent.PLAY.name(), ClientAction.PLAY.name());
    }
}
