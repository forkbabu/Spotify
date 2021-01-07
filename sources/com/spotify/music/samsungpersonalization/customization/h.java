package com.spotify.music.samsungpersonalization.customization;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.text.e;

public final class h extends RecyclerView.e<a> {
    private List<? extends m60> c = new ArrayList(0);

    public static final class a extends RecyclerView.b0 {
        private final SimpleDateFormat C = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ENGLISH);
        private final TextView D;
        private final TextView E;
        private final TextView F;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            kotlin.jvm.internal.h.e(view, "itemView");
            View findViewById = view.findViewById(C0707R.id.time);
            kotlin.jvm.internal.h.d(findViewById, "itemView.findViewById(R.id.time)");
            this.D = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0707R.id.context);
            kotlin.jvm.internal.h.d(findViewById2, "itemView.findViewById(R.id.context)");
            this.E = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0707R.id.confidence);
            kotlin.jvm.internal.h.d(findViewById3, "itemView.findViewById(R.id.confidence)");
            this.F = (TextView) findViewById3;
        }

        public final void h0(m60 m60) {
            kotlin.jvm.internal.h.e(m60, "item");
            this.D.setText(this.C.format(Long.valueOf(m60.c)));
            TextView textView = this.E;
            String str = m60.a;
            kotlin.jvm.internal.h.d(str, "item.tpoContext");
            textView.setText(e.C(str).toString());
            TextView textView2 = this.F;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(m60.f)}, 1));
            kotlin.jvm.internal.h.d(format, "java.lang.String.format(format, *args)");
            textView2.setText(format);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        kotlin.jvm.internal.h.e(aVar2, "viewHolder");
        aVar2.h0((m60) this.c.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.h.e(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.item_tpo_context, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "view");
        return new a(inflate);
    }

    public final void X(List<? extends m60> list) {
        kotlin.jvm.internal.h.e(list, "list");
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
