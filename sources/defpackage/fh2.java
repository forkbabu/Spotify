package defpackage;

import com.spotify.music.appprotocol.superbird.setup.model.SetupAppProtocol$SetupEvent;
import io.reactivex.functions.g;

/* renamed from: fh2  reason: default package */
public final /* synthetic */ class fh2 implements g {
    public final /* synthetic */ gh2 a;

    public /* synthetic */ fh2(gh2 gh2) {
        this.a = gh2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((SetupAppProtocol$SetupEvent) obj);
    }
}
