package defpackage;

import com.spotify.voice.api.model.AsrResponse;
import com.spotify.voice.api.model.m;

/* renamed from: q6f  reason: default package */
public final /* synthetic */ class q6f implements ti0 {
    public static final /* synthetic */ q6f a = new q6f();

    private /* synthetic */ q6f() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        AsrResponse g = ((m.b) obj).g();
        return q2f.k(g.transcript(), g.isFinal());
    }
}
