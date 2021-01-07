package defpackage;

import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.models.l;
import io.reactivex.functions.g;

/* renamed from: zg6  reason: default package */
public final /* synthetic */ class zg6 implements g {
    public final /* synthetic */ mh6 a;
    public final /* synthetic */ l b;
    public final /* synthetic */ String c;

    public /* synthetic */ zg6(mh6 mh6, l lVar, String str) {
        this.a = mh6;
        this.b = lVar;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.x(this.b, this.c, (d.b) obj);
    }
}
