package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.quotesharing.b;
import com.spotify.mobile.android.quotesharing.c;
import com.spotify.mobile.android.quotesharing.d;
import com.spotify.mobile.android.quotesharing.e;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: qh7  reason: default package */
public final class qh7 implements ph7 {
    private RecyclerView a;
    private ViewGroup b;
    private final Picasso c;
    private final e d;
    private final cb1 e;

    public qh7(Picasso picasso, e eVar, cb1 cb1) {
        h.e(picasso, "picasso");
        h.e(eVar, "quoteShareActionHandler");
        h.e(cb1, "podcastQuotesLogger");
        this.c = picasso;
        this.d = eVar;
        this.e = cb1;
    }

    @Override // defpackage.ph7
    public void a(List<b> list) {
        h.e(list, "items");
        if (!list.isEmpty()) {
            RecyclerView recyclerView = this.a;
            if (recyclerView == null) {
                h.k("recyclerView");
                throw null;
            } else if (recyclerView.getAdapter() == null) {
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    RecyclerView recyclerView2 = this.a;
                    if (recyclerView2 != null) {
                        ViewGroup viewGroup2 = this.b;
                        if (viewGroup2 != null) {
                            Context context = viewGroup2.getContext();
                            h.d(context, "view.context");
                            recyclerView2.k(new d(context.getResources().getDimensionPixelOffset(C0707R.dimen.std_16dp)), -1);
                            RecyclerView recyclerView3 = this.a;
                            if (recyclerView3 != null) {
                                recyclerView3.k(new upa(this.e), -1);
                                RecyclerView recyclerView4 = this.a;
                                if (recyclerView4 != null) {
                                    c cVar = new c(this.c, this.d);
                                    cVar.b0(list);
                                    recyclerView4.setAdapter(cVar);
                                    this.e.c();
                                    return;
                                }
                                h.k("recyclerView");
                                throw null;
                            }
                            h.k("recyclerView");
                            throw null;
                        }
                        h.k("view");
                        throw null;
                    }
                    h.k("recyclerView");
                    throw null;
                }
                h.k("view");
                throw null;
            }
        }
    }

    @Override // defpackage.ph7
    public void b(ViewGroup viewGroup) {
        h.e(viewGroup, "view");
        this.b = viewGroup;
        View G = q4.G(viewGroup, C0707R.id.quote_row);
        h.d(G, "requireViewById(view, R.id.quote_row)");
        this.a = (RecyclerView) G;
    }
}
