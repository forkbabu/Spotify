package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.features.followfeed.hubs.components.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.e<RecyclerView.b0> {
    private final List<i45> c = new ArrayList();
    private c.a f;

    /* renamed from: com.spotify.music.features.followfeed.views.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    static final class View$OnClickListenerC0231a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object f;
        public final /* synthetic */ Object n;

        public View$OnClickListenerC0231a(int i, int i2, Object obj, Object obj2, Object obj3) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            this.f = obj2;
            this.n = obj3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                c.a aVar = ((a) this.c).f;
                if (aVar != null) {
                    aVar.a(((i45) this.f).d(), ((i45) this.f).c(), this.b);
                }
            } else if (i == 1) {
                c.a aVar2 = ((a) this.c).f;
                if (aVar2 != null) {
                    aVar2.b(((i45) ((a) this.c).c.get(this.b)).d(), this.b);
                }
            } else {
                throw null;
            }
        }
    }

    static final class b implements View.OnLongClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ int b;
        final /* synthetic */ i45 c;

        b(a aVar, Context context, int i, i45 i45) {
            this.a = aVar;
            this.b = i;
            this.c = i45;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            c.a aVar = this.a.f;
            if (aVar == null) {
                return false;
            }
            aVar.c(this.c.d(), this.c.c(), this.b);
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        h.e(b0Var, "holder");
        View view = b0Var.a;
        h.d(view, "holder.itemView");
        Context context = view.getContext();
        View view2 = b0Var.a;
        int i2 = e90.i;
        g90 o = l70.o(view2, x90.class);
        h.d(o, "Glue.restore(holder.item… RowTwoLines::class.java)");
        x90 x90 = (x90) o;
        i45 i45 = this.c.get(i);
        TextView titleView = x90.getTitleView();
        h.d(titleView, "titleView");
        titleView.setText(i45.c());
        x90.setActive(i45.f());
        x90.setAppearsDisabled(i45.a());
        TextView subtitleView = x90.getSubtitleView();
        h.d(subtitleView, "subtitleView");
        subtitleView.setText(d.p(i45.b(), ", ", null, null, 0, null, null, 62, null));
        TextLabelUtil.b(context, x90.getSubtitleView(), i45.e());
        x90.z0(p42.a(context));
        x90.W1().setOnClickListener(new View$OnClickListenerC0231a(0, i, this, i45, context));
        View view3 = b0Var.a;
        h.d(context, "context");
        view3.setBackgroundColor(context.getResources().getColor(R.color.gray_15));
        view3.setOnClickListener(new View$OnClickListenerC0231a(1, i, this, context, i45));
        view3.setOnLongClickListener(new b(this, context, i, i45));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        h90 h0 = h90.h0(e90.d().g(viewGroup.getContext(), viewGroup));
        h.d(h0, "GlueViewHolder.forViewBinder(row)");
        return h0;
    }

    public final void Z(List<i45> list) {
        h.e(list, "trackRows");
        this.c.clear();
        this.c.addAll(list);
    }

    public final void b0(c.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
