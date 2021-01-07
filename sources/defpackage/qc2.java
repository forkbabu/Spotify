package defpackage;

import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: qc2  reason: default package */
public final /* synthetic */ class qc2 implements l {
    public final /* synthetic */ sd2 a;

    public /* synthetic */ qc2(sd2 sd2) {
        this.a = sd2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        sd2 sd2 = this.a;
        String b = ((r.k) obj).a().b();
        String cVar = ViewUris.h0.toString();
        sd2.getClass();
        return a.m(new rd2(sd2, b, cVar)).O(od2.a).m(qd2.a).P();
    }
}
