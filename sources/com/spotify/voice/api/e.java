package com.spotify.voice.api;

import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import com.spotify.voice.api.model.l;
import defpackage.ute;
import io.reactivex.functions.g;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ l a;
    public final /* synthetic */ mte b;
    public final /* synthetic */ String c;

    public /* synthetic */ e(l lVar, mte mte, String str) {
        this.a = lVar;
        this.b = mte;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str;
        String str2;
        l lVar = this.a;
        mte mte = this.b;
        String str3 = this.c;
        Throwable th = (Throwable) obj;
        if (!lVar.a().c() && !(th instanceof TimeoutException)) {
            if (th instanceof VoiceSessionException) {
                VoiceSessionException voiceSessionException = (VoiceSessionException) th;
                ute.a a2 = ute.a();
                a2.b(str3);
                a2.a(lVar.b().name());
                a2.c(voiceSessionException.a());
                a2.d(voiceSessionException.b());
                if (th.getMessage() == null) {
                    str2 = i.a.toString();
                } else {
                    str2 = th.getMessage();
                }
                a2.n(str2);
                mte.b(a2.build());
                return;
            }
            ute.a a3 = ute.a();
            a3.b(str3);
            a3.a(lVar.b().name());
            a3.c(ErrorDomain.UNKNOWN);
            i iVar = i.a;
            a3.d(iVar);
            if (th.getMessage() == null) {
                str = iVar.toString();
            } else {
                str = th.getMessage();
            }
            a3.n(str);
            mte.b(a3.build());
        }
    }
}
