package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;
import io.reactivex.functions.a;

/* renamed from: tm2  reason: default package */
public final /* synthetic */ class tm2 implements a {
    public final /* synthetic */ o a;
    public final /* synthetic */ b b;

    public /* synthetic */ tm2(o oVar, b bVar) {
        this.a = oVar;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        vn2.a(ViewUris.d.toString(), this.a, this.b, false);
    }
}
