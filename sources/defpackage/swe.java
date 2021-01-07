package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.ClientAction;
import io.reactivex.functions.g;

/* renamed from: swe  reason: default package */
public final /* synthetic */ class swe implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ swe(t0f t0f, String str, String str2) {
        this.a = t0f;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.d(this.b, this.c, SlimoProto$ParsedQuery$Intent.PLAY.name(), ClientAction.PLAY.name());
    }
}
