package com.spotify.music.features.home.common.viewbinder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;
import kotlin.jvm.internal.h;

public final class r extends RecyclerView.q implements RecyclerView.n {
    private View a;
    private final RecyclerView.l b = new a(this);
    private final ImpressionLogger c;
    private final l81 f;

    public static final class a extends RecyclerView.l {
        final /* synthetic */ r a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(r rVar) {
            this.a = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            h.e(rect, "outRect");
            h.e(view, "view");
            h.e(recyclerView, "parent");
            h.e(yVar, "state");
            if (yVar.b()) {
                view.setTag(C0707R.id.home_impression_logged_tag, Boolean.FALSE);
            }
            r rVar = this.a;
            RecyclerView.b0 a0 = recyclerView.a0(view);
            h.d(a0, "parent.getChildViewHolder(view)");
            rVar.g(a0, recyclerView.X(view));
        }
    }

    public r(ImpressionLogger impressionLogger, l81 l81) {
        h.e(impressionLogger, "impressionLogger");
        h.e(l81, "ubiImpressionLogger");
        this.c = impressionLogger;
        this.f = l81;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void g(RecyclerView.b0 b0Var, int i) {
        View view = b0Var.a;
        Object tag = view.getTag(C0707R.id.home_impression_logged_tag);
        if (!(tag instanceof Boolean)) {
            tag = null;
        }
        Boolean bool = (Boolean) tag;
        boolean z = false;
        if (!(bool != null ? bool.booleanValue() : false) && i > -1) {
            h.e(b0Var, "itemViewHolder");
            Rect rect = new Rect();
            View view2 = this.a;
            if (view2 != null) {
                view2.getGlobalVisibleRect(rect);
            }
            Rect rect2 = new Rect();
            b0Var.a.getGlobalVisibleRect(rect2);
            boolean z2 = rect2.bottom > rect.top && rect2.top < rect.bottom;
            boolean z3 = rect2.right > rect.left && rect2.left < rect.right;
            if (z2 && z3) {
                z = true;
            }
            if (z) {
                w61<?> f0 = i61.f0(b0Var);
                h.d(f0, "HubsAdapter.unwrap(viewHolder)");
                s81 d = f0.d();
                this.c.b(d.logging().string("ui:source", ""), d.logging().string("ui:uri", ""), d.logging().string("ui:group", ""), i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
                this.f.a(d);
                view.setTag(C0707R.id.home_impression_logged_tag, Boolean.TRUE);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        h.e(view, "view");
        view.setTag(C0707R.id.home_impression_logged_tag, Boolean.FALSE);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.D0(this);
            recyclerView.B0(this);
            recyclerView.A0(this.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int Y1;
        int b2;
        LinearLayoutManager linearLayoutManager2;
        int Y12;
        int b22;
        h.e(recyclerView, "recyclerView");
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (Y1 = (linearLayoutManager = (LinearLayoutManager) layoutManager).Y1()) <= (b2 = linearLayoutManager.b2())) {
            while (true) {
                RecyclerView.b0 S = recyclerView.S(Y1);
                if (S != null) {
                    h.d(S, "viewHolder");
                    g(S, Y1);
                    View view = S.a;
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView2 = (RecyclerView) view;
                        RecyclerView.m layoutManager2 = recyclerView2.getLayoutManager();
                        if ((layoutManager2 instanceof LinearLayoutManager) && (Y12 = (linearLayoutManager2 = (LinearLayoutManager) layoutManager2).Y1()) <= (b22 = linearLayoutManager2.b2())) {
                            while (true) {
                                RecyclerView.b0 S2 = recyclerView2.S(Y12);
                                if (S2 != null) {
                                    h.d(S2, "nestedViewHolder");
                                    g(S2, Y12);
                                }
                                if (Y12 == b22) {
                                    break;
                                }
                                Y12++;
                            }
                        }
                    }
                }
                if (Y1 != b2) {
                    Y1++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
        h.e(view, "view");
        view.setTag(C0707R.id.home_impression_logged_tag, Boolean.FALSE);
        if (view instanceof RecyclerView) {
            f((RecyclerView) view);
        }
    }

    public final void f(RecyclerView recyclerView) {
        h.e(recyclerView, "rv");
        recyclerView.n(this);
        recyclerView.l(this);
        recyclerView.k(this.b, -1);
    }

    public final void h(View view) {
        this.a = view;
    }
}
