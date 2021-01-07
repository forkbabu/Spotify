package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.collection.util.h;
import com.spotify.music.libs.collection.util.i;
import com.spotify.music.libs.collection.util.k;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: ow3  reason: default package */
public class ow3 implements w<b91, b91> {
    private final k a;
    private final y b;
    private final String c;

    public ow3(k kVar, y yVar, String str) {
        this.a = kVar;
        this.b = yVar;
        this.c = str;
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.n(sVar, this.a.b(this.c).j0(i.a).E0(s.i0(ImmutableList.of())).r0(h.a).o0(this.b).E(), nw3.a);
    }
}
