package defpackage;

import com.spotify.music.features.premiumdestination.domain.j;
import com.spotify.music.features.premiumdestination.domain.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: bi7  reason: default package */
public final /* synthetic */ class bi7 implements l {
    public final /* synthetic */ y a;

    public /* synthetic */ bi7(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.i0(k.c()).C(((j.e) obj).a(), TimeUnit.MILLISECONDS, this.a).B0();
    }
}
