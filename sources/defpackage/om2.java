package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;
import io.reactivex.functions.a;

/* renamed from: om2  reason: default package */
public final /* synthetic */ class om2 implements a {
    public final /* synthetic */ o a;
    public final /* synthetic */ b b;

    public /* synthetic */ om2(o oVar, b bVar) {
        this.a = oVar;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        vn2.a(ViewUris.n0.toString(), this.a, this.b, false);
    }
}
