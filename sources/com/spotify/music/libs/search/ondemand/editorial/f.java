package com.spotify.music.libs.search.ondemand.editorial;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.search.ondemand.editorial.e;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

public class f implements e {
    private final boolean a;
    private final h b;
    private final sxd c;
    private final y d;
    private final y e;
    private final q f;

    public f(boolean z, h hVar, sxd sxd, y yVar, y yVar2, q qVar) {
        this.a = z;
        this.b = hVar;
        this.c = sxd;
        this.d = yVar;
        this.e = yVar2;
        this.f = qVar;
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.e
    public void a(EditorialOnDemandInfo editorialOnDemandInfo, e.a<EditorialOnDemandInfo> aVar, e.a<EditorialOnDemandInfo> aVar2) {
        this.f.a(s.c0(new c(this, editorialOnDemandInfo)).J0(new b(this, editorialOnDemandInfo)).o0(this.d).I0(this.e).subscribe(new d(editorialOnDemandInfo, aVar, aVar2), new a(aVar2, editorialOnDemandInfo)));
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.e
    public boolean b(EditorialOnDemandInfo editorialOnDemandInfo) {
        return this.a && l0.b(editorialOnDemandInfo.c(), LinkType.TRACK) && this.b.b(editorialOnDemandInfo.b());
    }

    public /* synthetic */ v c(EditorialOnDemandInfo editorialOnDemandInfo, Boolean bool) {
        if (bool.booleanValue()) {
            return this.c.d(editorialOnDemandInfo.b()).g(s.i0(Boolean.TRUE));
        }
        return s.i0(Boolean.FALSE);
    }

    public /* synthetic */ Boolean d(EditorialOnDemandInfo editorialOnDemandInfo) {
        return Boolean.valueOf(this.b.a(editorialOnDemandInfo.b()));
    }
}
