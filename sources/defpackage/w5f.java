package defpackage;

import com.spotify.voice.api.model.AsrResponse;
import com.spotify.voice.api.model.m;

/* renamed from: w5f  reason: default package */
public final /* synthetic */ class w5f implements ti0 {
    public static final /* synthetic */ w5f a = new w5f();

    private /* synthetic */ w5f() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        AsrResponse g = ((m.a) obj).g();
        return q2f.k(g.transcript(), g.isFinal());
    }
}
