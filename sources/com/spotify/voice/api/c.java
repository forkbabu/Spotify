package com.spotify.voice.api;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import com.spotify.voice.api.model.m;
import io.reactivex.functions.l;
import io.reactivex.g;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ sg0 a;
    public final /* synthetic */ sse b;
    public final /* synthetic */ g c;
    public final /* synthetic */ mte f;
    public final /* synthetic */ com.spotify.voice.api.model.l n;
    public final /* synthetic */ WebgateTokenProvider o;

    public /* synthetic */ c(sg0 sg0, sse sse, g gVar, mte mte, com.spotify.voice.api.model.l lVar, WebgateTokenProvider webgateTokenProvider) {
        this.a = sg0;
        this.b = sse;
        this.c = gVar;
        this.f = mte;
        this.n = lVar;
        this.o = webgateTokenProvider;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        sg0 sg0 = this.a;
        sse sse = this.b;
        g gVar = this.c;
        mte mte = this.f;
        com.spotify.voice.api.model.l lVar = this.n;
        WebgateTokenProvider webgateTokenProvider = this.o;
        Boolean bool = (Boolean) obj;
        if (!((Boolean) sg0.apply(ng0.a())).booleanValue()) {
            return g.B(new VoiceSessionException(ErrorDomain.MIC_PERMISSION, i.h, new IllegalArgumentException("No mic permissions")));
        }
        if (!bool.booleanValue()) {
            return g.B(new VoiceSessionException(ErrorDomain.OFFLINE, i.i, new IllegalStateException("Cannot start voice session if app is offline")));
        }
        String c2 = sse.c();
        return gVar.W(1, new f(webgateTokenProvider)).i0(j.a).b0(m.c(c2)).w(new d(lVar, mte, c2)).y(new e(lVar, mte, c2));
    }
}
