package com.spotify.music.share.v2.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.e<C0341a> {
    private final List<o8e> c = new ArrayList();
    private ShareMenuLogger f;
    private final rmf<o8e, Integer, f> n;

    /* renamed from: com.spotify.music.share.v2.view.a$a  reason: collision with other inner class name */
    public final class C0341a extends RecyclerView.b0 {
        private final TextView C;
        private final ImageView D;
        final /* synthetic */ a E;

        /* access modifiers changed from: package-private */
        /* renamed from: com.spotify.music.share.v2.view.a$a$a  reason: collision with other inner class name */
        public static final class View$OnClickListenerC0342a implements View.OnClickListener {
            final /* synthetic */ C0341a a;
            final /* synthetic */ o8e b;

            View$OnClickListenerC0342a(C0341a aVar, o8e o8e) {
                this.a = aVar;
                this.b = o8e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.E.n.invoke(this.b, Integer.valueOf(this.a.w()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0341a(a aVar, View view) {
            super(view);
            h.e(view, "itemView");
            this.E = aVar;
            View G = q4.G(view, C0707R.id.title);
            h.d(G, "ViewCompat.requireViewBy…ew>(itemView, R.id.title)");
            this.C = (TextView) G;
            View G2 = q4.G(view, C0707R.id.icon);
            h.d(G2, "ViewCompat.requireViewBy…iew>(itemView, R.id.icon)");
            this.D = (ImageView) G2;
        }

        public final void h0(o8e o8e) {
            h.e(o8e, "shareDestination");
            TextView textView = this.C;
            View view = this.a;
            h.d(view, "itemView");
            textView.setText(view.getContext().getText(o8e.c()));
            this.D.setImageDrawable(o8e.icon());
            this.a.setOnClickListener(new View$OnClickListenerC0342a(this, o8e));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: rmf<? super o8e, ? super java.lang.Integer, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(rmf<? super o8e, ? super Integer, f> rmf) {
        h.e(rmf, "shareDestinationClicked");
        this.n = rmf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(C0341a aVar, int i) {
        C0341a aVar2 = aVar;
        h.e(aVar2, "holder");
        o8e o8e = this.c.get(i);
        aVar2.h0(o8e);
        ShareMenuLogger shareMenuLogger = this.f;
        if (shareMenuLogger != null) {
            shareMenuLogger.c(o8e.a(), i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public C0341a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.share_destination_item_v2, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…          false\n        )");
        return new C0341a(this, inflate);
    }

    public final void Y(List<? extends o8e> list) {
        h.e(list, "shareDestinations");
        List<o8e> list2 = this.c;
        list2.clear();
        list2.addAll(list);
        z();
    }

    public final void Z(ShareMenuLogger shareMenuLogger) {
        this.f = shareMenuLogger;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
