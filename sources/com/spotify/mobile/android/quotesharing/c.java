package com.spotify.mobile.android.quotesharing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class c extends v<b, C0184c> {
    private final Picasso n;
    private final e o;

    public interface a {
    }

    public static final class b extends m.d<b> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            h.e(bVar3, "oldItem");
            h.e(bVar4, "newItem");
            return h.a(bVar3, bVar4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            h.e(bVar3, "oldItem");
            h.e(bVar4, "newItem");
            return h.a(bVar3.b(), bVar4.b());
        }
    }

    /* renamed from: com.spotify.mobile.android.quotesharing.c$c  reason: collision with other inner class name */
    public static final class C0184c extends RecyclerView.b0 {
        private final ImageView C;
        public String D;

        /* access modifiers changed from: package-private */
        /* renamed from: com.spotify.mobile.android.quotesharing.c$c$a */
        public static final class a implements View.OnClickListener {
            final /* synthetic */ e a;
            final /* synthetic */ b b;

            a(e eVar, b bVar) {
                this.a = eVar;
                this.b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a(this.b.c());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0184c(View view) {
            super(view);
            h.e(view, "itemView");
            View G = q4.G(view, C0707R.id.background);
            h.d(G, "requireViewById<ImageVie…temView, R.id.background)");
            this.C = (ImageView) G;
        }

        public final void h0(b bVar, Picasso picasso, e eVar) {
            h.e(bVar, "model");
            h.e(picasso, "picasso");
            h.e(eVar, "quoteShareActionHandler");
            this.D = bVar.b();
            picasso.m(bVar.a()).n(this.C, null);
            this.a.setOnClickListener(new a(eVar, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Picasso picasso, e eVar) {
        super(new b());
        h.e(picasso, "picasso");
        h.e(eVar, "quoteShareActionHandler");
        this.n = picasso;
        this.o = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        C0184c cVar = (C0184c) b0Var;
        h.e(cVar, "holder");
        Object Y = Y(i);
        h.d(Y, "getItem(position)");
        cVar.h0((b) Y, this.n, this.o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.list_item_quote_card, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…uote_card, parent, false)");
        return new C0184c(inflate);
    }
}
