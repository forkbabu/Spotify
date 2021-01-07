package com.spotify.music.podcastinteractivity.qna.carousel;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.e<C0334a> {
    private List<ReplyCardEpisodePage.Model> c;
    private final ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration> f;
    private final fvc n;

    /* renamed from: com.spotify.music.podcastinteractivity.qna.carousel.a$a  reason: collision with other inner class name */
    public final class C0334a extends RecyclerView.b0 {
        private final Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events> C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0334a(a aVar, Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events> component) {
            super(component.getView());
            h.e(component, "component");
            this.C = component;
        }

        public final void h0(ReplyCardEpisodePage.Model model) {
            h.e(model, "response");
            this.C.render(model);
        }
    }

    public a(ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration> componentFactory, fvc fvc) {
        h.e(componentFactory, "replyCardEpisodePageFactory");
        h.e(fvc, "replyCardEpisodePageMapper");
        this.f = componentFactory;
        this.n = fvc;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(C0334a aVar, int i) {
        C0334a aVar2 = aVar;
        h.e(aVar2, "holder");
        List<ReplyCardEpisodePage.Model> list = this.c;
        if (list != null) {
            aVar2.h0(list.get(i));
        } else {
            h.k("listReplyCardEpisodePageModel");
            throw null;
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public C0334a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        return new C0334a(this, this.f.make());
    }

    public final void X(List<Response> list) {
        h.e(list, "responseList");
        fvc fvc = this.n;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fvc.a(it.next()));
        }
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        List<ReplyCardEpisodePage.Model> list = this.c;
        if (list != null) {
            return list.size();
        }
        h.k("listReplyCardEpisodePageModel");
        throw null;
    }
}
