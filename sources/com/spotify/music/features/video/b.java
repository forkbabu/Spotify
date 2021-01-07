package com.spotify.music.features.video;

import com.spotify.mobile.android.video.drm.g;
import com.spotify.mobile.android.video.drm.h;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class b implements y62 {
    public final /* synthetic */ h a;
    public final /* synthetic */ j72 b;
    public final /* synthetic */ o72 c;

    public /* synthetic */ b(h hVar, j72 j72, o72 o72) {
        this.a = hVar;
        this.b = j72;
        this.c = o72;
    }

    @Override // defpackage.y62
    public final List a(p62 p62) {
        h hVar = this.a;
        j72 j72 = this.b;
        o72 o72 = this.c;
        ArrayList arrayList = new ArrayList(3);
        g b2 = hVar.b(p62.b());
        arrayList.add(j72.b(b2, p62));
        arrayList.add(o72.b(b2));
        arrayList.add(new f72());
        return arrayList;
    }
}
