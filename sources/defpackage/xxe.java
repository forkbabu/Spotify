package defpackage;

import com.spotify.voice.api.model.AsrResponse;
import com.spotify.voice.api.model.m;

/* renamed from: xxe  reason: default package */
public final /* synthetic */ class xxe implements ti0 {
    public static final /* synthetic */ xxe a = new xxe();

    private /* synthetic */ xxe() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        int i = yye.b;
        AsrResponse g = ((m.b) obj).g();
        return vue.k(g.transcript(), g.isFinal());
    }
}
