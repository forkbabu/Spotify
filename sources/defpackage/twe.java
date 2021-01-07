package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.l;
import com.spotify.voice.api.n;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: twe  reason: default package */
public final /* synthetic */ class twe implements w {
    public final /* synthetic */ n a;
    public final /* synthetic */ ObjectMapper b;
    public final /* synthetic */ k0f c;
    public final /* synthetic */ l d;

    public /* synthetic */ twe(n nVar, ObjectMapper objectMapper, k0f k0f, l lVar) {
        this.a = nVar;
        this.b = objectMapper;
        this.c = k0f;
        this.d = lVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new pxe(this.a, this.c, this.b, this.d), false, Integer.MAX_VALUE);
    }
}
