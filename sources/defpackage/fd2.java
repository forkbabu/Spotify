package defpackage;

import com.spotify.music.ads.voice.domain.r;
import io.reactivex.functions.g;

/* renamed from: fd2  reason: default package */
public final /* synthetic */ class fd2 implements g {
    public final /* synthetic */ cqe a;
    public final /* synthetic */ kv3 b;
    public final /* synthetic */ gl0 c;

    public /* synthetic */ fd2(cqe cqe, kv3 kv3, gl0 gl0) {
        this.a = cqe;
        this.b = kv3;
        this.c = gl0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        r.h hVar;
        jd2.h("ad_voice_speech_received", this.a, "", this.b, hVar.c(), hVar.a(), this.c, ((r.h) obj).b());
    }
}
