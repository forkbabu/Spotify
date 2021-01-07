package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.podcast.loader.h;
import com.spotify.music.libs.podcast.loader.i;
import io.reactivex.functions.l;

/* renamed from: rk1  reason: default package */
public final /* synthetic */ class rk1 implements l {
    public final /* synthetic */ i a;

    public /* synthetic */ rk1(i iVar) {
        this.a = iVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        h hVar = new h(this.a, (String) obj, false);
        hVar.b().g(false, true, false);
        hVar.b().i(new SortOption("name"));
        return hVar;
    }
}
