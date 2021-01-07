package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.fullscreen.story.domain.g;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.v;

/* renamed from: jc5  reason: default package */
public class jc5 {
    private final CollectionStateProvider a;
    private final String b;

    public jc5(CollectionStateProvider collectionStateProvider, String str) {
        this.a = collectionStateProvider;
        this.b = str;
    }

    public /* synthetic */ v a(g.h hVar) {
        String[] strArr = new String[hVar.a().size()];
        hVar.a().toArray(strArr);
        return this.a.b(ViewUris.f.toString(), this.b, strArr).j0(vb5.a).j0(wb5.a).r0(xb5.a);
    }
}
