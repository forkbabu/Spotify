package defpackage;

import com.spotify.music.ads.voice.domain.q;
import com.spotify.music.ads.voice.domain.s;
import io.reactivex.functions.l;

/* renamed from: fc2  reason: default package */
public final /* synthetic */ class fc2 implements l {
    public static final /* synthetic */ fc2 a = new fc2();

    private /* synthetic */ fc2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        q qVar = q.c;
        StringBuilder V0 = je.V0("Voice session failure: %s");
        V0.append(((Throwable) obj).getMessage());
        qVar.b(V0.toString());
        return s.k(qVar);
    }
}
