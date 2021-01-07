package defpackage;

import com.spotify.voice.api.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Set;

/* renamed from: o5f  reason: default package */
public final /* synthetic */ class o5f implements w {
    public final /* synthetic */ l a;
    public final /* synthetic */ p7f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Set d;

    public /* synthetic */ o5f(l lVar, p7f p7f, String str, Set set) {
        this.a = lVar;
        this.b = p7f;
        this.c = str;
        this.d = set;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new e7f(this.a, this.b, this.c, this.d));
    }
}
