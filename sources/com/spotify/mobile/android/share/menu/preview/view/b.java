package com.spotify.mobile.android.share.menu.preview.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.share.menu.preview.api.a;
import com.spotify.music.C0707R;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class b extends RecyclerView.e<a> {
    private final Map<String, com.spotify.mobile.android.share.menu.preview.api.b> c;
    private final PublishSubject<a> f;
    private List<a> n;

    public b(Map map, PublishSubject publishSubject, List list, int i) {
        EmptyList emptyList = (i & 4) != 0 ? EmptyList.a : null;
        h.e(map, "shareDestinationViewDataMap");
        h.e(publishSubject, "destinationClickSubject");
        h.e(emptyList, "shareDestinations");
        this.c = map;
        this.f = publishSubject;
        this.n = emptyList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        h.e(aVar2, "viewHolder");
        aVar2.j0(this.n.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.preview_share_menu_list_item, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…      false\n            )");
        return new a(inflate, this.c, this.f);
    }

    public final void X(List<a> list) {
        h.e(list, "shareDestinations");
        this.n = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.n.size();
    }
}
