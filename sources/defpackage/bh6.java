package defpackage;

import com.spotify.playlist.models.l;
import io.reactivex.functions.g;

/* renamed from: bh6  reason: default package */
public final /* synthetic */ class bh6 implements g {
    public final /* synthetic */ mh6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ l f;

    public /* synthetic */ bh6(mh6 mh6, String str, String str2, l lVar) {
        this.a = mh6;
        this.b = str;
        this.c = str2;
        this.f = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.v(this.b, this.c, this.f, (uo6) obj);
    }
}
