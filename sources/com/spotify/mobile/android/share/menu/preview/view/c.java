package com.spotify.mobile.android.share.menu.preview.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.music.C0707R;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class c extends RecyclerView.e<SharePayloadViewHolder> {
    private final PublishSubject<Integer> c;
    private List<? extends b> f;

    public c(PublishSubject publishSubject, List list, int i) {
        EmptyList emptyList = (i & 2) != 0 ? EmptyList.a : null;
        h.e(publishSubject, "retryClickSubject");
        h.e(emptyList, "payloadStateList");
        this.c = publishSubject;
        this.f = emptyList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(SharePayloadViewHolder sharePayloadViewHolder, int i) {
        SharePayloadViewHolder sharePayloadViewHolder2 = sharePayloadViewHolder;
        h.e(sharePayloadViewHolder2, "viewHolder");
        sharePayloadViewHolder2.j0((b) this.f.get(i), i);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public SharePayloadViewHolder M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View G = je.G(viewGroup, C0707R.layout.share_payload_page_view, viewGroup, false);
        if (G != null) {
            return new SharePayloadViewHolder((SharePayloadView) G, this.c);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.mobile.android.share.menu.preview.view.SharePayloadView");
    }

    public final void X(List<? extends b> list) {
        h.e(list, "payloadStateList");
        this.f = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }
}
