package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.model.m;
import com.spotify.voice.api.n;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: pxe  reason: default package */
public final /* synthetic */ class pxe implements l {
    public final /* synthetic */ n a;
    public final /* synthetic */ k0f b;
    public final /* synthetic */ ObjectMapper c;
    public final /* synthetic */ com.spotify.voice.api.l f;

    public /* synthetic */ pxe(n nVar, k0f k0f, ObjectMapper objectMapper, com.spotify.voice.api.l lVar) {
        this.a = nVar;
        this.b = k0f;
        this.c = objectMapper;
        this.f = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n nVar = this.a;
        k0f k0f = this.b;
        ObjectMapper objectMapper = this.c;
        com.spotify.voice.api.l lVar = this.f;
        uue.y yVar = (uue.y) obj;
        g<m> a2 = nVar.a();
        return je.Z(a2, a2).W(new sye(k0f), false, Integer.MAX_VALUE).j0(new uve(objectMapper, lVar)).r0(fve.a);
    }
}
