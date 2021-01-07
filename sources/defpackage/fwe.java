package defpackage;

import com.spotify.voice.api.model.AsrResponse;
import com.spotify.voice.api.model.m;

/* renamed from: fwe  reason: default package */
public final /* synthetic */ class fwe implements ti0 {
    public static final /* synthetic */ fwe a = new fwe();

    private /* synthetic */ fwe() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        int i = yye.b;
        AsrResponse g = ((m.a) obj).g();
        return vue.k(g.transcript(), g.isFinal());
    }
}
