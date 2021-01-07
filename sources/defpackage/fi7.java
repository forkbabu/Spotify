package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.features.premiumdestination.domain.j;
import com.spotify.music.features.premiumdestination.j;
import io.reactivex.functions.l;

/* renamed from: fi7  reason: default package */
public final /* synthetic */ class fi7 implements l {
    public final /* synthetic */ j a;
    public final /* synthetic */ ObjectMapper b;

    public /* synthetic */ fi7(j jVar, ObjectMapper objectMapper) {
        this.a = jVar;
        this.b = objectMapper;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(((j.a) obj).a()).A(new zh7(this.b)).A(yh7.a).E(xh7.a);
    }
}
