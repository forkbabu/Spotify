package com.spotify.music.features.video;

import com.spotify.mobile.android.video.drm.g;
import java.util.ArrayList;
import java.util.List;
import okhttp3.y;

public final /* synthetic */ class a implements y62 {
    public final /* synthetic */ y a;
    public final /* synthetic */ j72 b;
    public final /* synthetic */ o72 c;

    public /* synthetic */ a(y yVar, j72 j72, o72 o72) {
        this.a = yVar;
        this.b = j72;
        this.c = o72;
    }

    @Override // defpackage.y62
    public final List a(p62 p62) {
        y yVar = this.a;
        j72 j72 = this.b;
        o72 o72 = this.c;
        ArrayList arrayList = new ArrayList(2);
        g gVar = new g(yVar, p62.b());
        arrayList.add(j72.b(gVar, p62));
        arrayList.add(o72.b(gVar));
        return arrayList;
    }
}
