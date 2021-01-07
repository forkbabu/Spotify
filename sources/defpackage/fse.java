package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.audiorecord.api.e;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.voice.api.model.k;
import io.netty.channel.j0;
import io.netty.handler.ssl.g0;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: fse  reason: default package */
public final /* synthetic */ class fse implements l {
    public final /* synthetic */ com.spotify.voice.api.model.l a;
    public final /* synthetic */ sse b;
    public final /* synthetic */ com.spotify.voice.api.l c;
    public final /* synthetic */ ObjectMapper f;
    public final /* synthetic */ g0 n;
    public final /* synthetic */ j0 o;
    public final /* synthetic */ e p;
    public final /* synthetic */ pre q;
    public final /* synthetic */ String r;

    public /* synthetic */ fse(com.spotify.voice.api.model.l lVar, sse sse, com.spotify.voice.api.l lVar2, ObjectMapper objectMapper, g0 g0Var, j0 j0Var, e eVar, pre pre, String str) {
        this.a = lVar;
        this.b = sse;
        this.c = lVar2;
        this.f = objectMapper;
        this.n = g0Var;
        this.o = j0Var;
        this.p = eVar;
        this.q = pre;
        this.r = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        com.spotify.voice.api.model.l lVar = this.a;
        sse sse = this.b;
        com.spotify.voice.api.l lVar2 = this.c;
        ObjectMapper objectMapper = this.f;
        g0 g0Var = this.n;
        j0 j0Var = this.o;
        e eVar = this.p;
        pre pre = this.q;
        String str = this.r;
        k kVar = (k) obj;
        if (kVar.a() == null || kVar.d() == null) {
            return g.B(new IllegalArgumentException("Non-null values required."));
        }
        DebugFlag debugFlag = DebugFlag.VOICE_SAVE_AUDIO;
        return g.p(new xre(kVar.a(), objectMapper, g0Var, j0Var, kVar.d(), eVar.g(), lVar.a(), pre, new yre(false, !kVar.c(), lVar.a(), sse.c(), lVar.e().get(), lVar2.c()), str), BackpressureStrategy.LATEST);
    }
}
