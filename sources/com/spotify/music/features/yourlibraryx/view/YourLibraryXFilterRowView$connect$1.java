package com.spotify.music.features.yourlibraryx.view;

import com.spotify.mobius.h;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.domain.f;
import java.util.List;
import kotlin.collections.EmptyList;

public final class YourLibraryXFilterRowView$connect$1 implements h<f> {
    private List<? extends b> a;
    private List<? extends b> b;
    final /* synthetic */ YourLibraryXFilterRowView c;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    YourLibraryXFilterRowView$connect$1(YourLibraryXFilterRowView yourLibraryXFilterRowView) {
        this.c = yourLibraryXFilterRowView;
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }

    @Override // com.spotify.mobius.h, defpackage.da2
    public void accept(Object obj) {
        f fVar = (f) obj;
        kotlin.jvm.internal.h.e(fVar, "model");
        List<b> b2 = fVar.c().b();
        List<b> c2 = fVar.c().c();
        if ((!kotlin.jvm.internal.h.a(c2, this.a)) || (!kotlin.jvm.internal.h.a(b2, this.b))) {
            this.a = c2;
            this.b = b2;
            YourLibraryXFilterRowView.b(this.c).render(YourLibraryXFilterRowView.d(this.c, b2, c2));
        }
    }

    @Override // com.spotify.mobius.h, defpackage.w92
    public void dispose() {
        YourLibraryXFilterRowView.b(this.c).onEvent(YourLibraryXFilterRowView$connect$1$dispose$1.a);
    }
}
