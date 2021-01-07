package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.external.experience.domain.model.b;
import defpackage.lef;

/* renamed from: jef  reason: default package */
public final /* synthetic */ class jef implements ti0 {
    public final /* synthetic */ ObjectMapper a;
    public final /* synthetic */ b b;

    public /* synthetic */ jef(ObjectMapper objectMapper, b bVar) {
        this.a = objectMapper;
        this.b = bVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return mef.e(this.a, this.b, (lef.a) obj);
    }
}
