package defpackage;

import defpackage.p2f;
import io.reactivex.functions.l;
import java.util.Set;

/* renamed from: e7f  reason: default package */
public final /* synthetic */ class e7f implements l {
    public final /* synthetic */ com.spotify.voice.api.l a;
    public final /* synthetic */ p7f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Set f;

    public /* synthetic */ e7f(com.spotify.voice.api.l lVar, p7f p7f, String str, Set set) {
        this.a = lVar;
        this.b = p7f;
        this.c = str;
        this.f = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return k7f.b(this.a, this.b, this.c, this.f, (p2f.a) obj);
    }
}
