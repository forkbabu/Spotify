package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;

/* renamed from: y4f  reason: default package */
public final /* synthetic */ class y4f implements Runnable {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ y4f(a8f a8f, String str, String str2) {
        this.a = a8f;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c, SlimoProto$ParsedQuery$Intent.PLAY.name(), ClientAction.PLAY.name());
    }
}
