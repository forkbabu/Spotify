package com.spotify.music.features.yourlibraryx.bottomsheet;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.j;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class b extends RecyclerView.e<a> {
    private j c;
    private nmf<? super YourLibraryXSortOption, f> f;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        h.e(aVar2, "holder");
        j jVar = this.c;
        if (jVar != null) {
            YourLibraryXSortOption yourLibraryXSortOption = jVar.b().get(i);
            aVar2.h0(yourLibraryXSortOption, yourLibraryXSortOption == jVar.a(), new YourLibraryXSortOptionsAdapter$onBindViewHolder$$inlined$let$lambda$1(yourLibraryXSortOption, this, i, aVar2));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        bh9 b = bh9.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        h.d(b, "SortOptionItemYourLibrar…          false\n        )");
        return new a(b);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: nmf<? super com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption, kotlin.f>, nmf<com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption, kotlin.f> */
    public final nmf<YourLibraryXSortOption, f> X() {
        return this.f;
    }

    public final void Y(j jVar) {
        this.c = jVar;
        z();
    }

    public final void Z(nmf<? super YourLibraryXSortOption, f> nmf) {
        this.f = nmf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        List<YourLibraryXSortOption> b;
        j jVar = this.c;
        if (jVar == null || (b = jVar.b()) == null) {
            return 0;
        }
        return b.size();
    }
}
