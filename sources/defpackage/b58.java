package defpackage;

import com.spotify.music.libs.search.ondemand.editorial.EditorialOnDemandInfo;
import com.spotify.music.libs.search.ondemand.editorial.e;

/* renamed from: b58  reason: default package */
public final /* synthetic */ class b58 implements e.a {
    public final /* synthetic */ g58 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n61 c;

    public /* synthetic */ b58(g58 g58, String str, n61 n61) {
        this.a = g58;
        this.b = str;
        this.c = n61;
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.e.a
    public final void accept(Object obj) {
        this.a.a(this.b, this.c, (EditorialOnDemandInfo) obj);
    }
}
