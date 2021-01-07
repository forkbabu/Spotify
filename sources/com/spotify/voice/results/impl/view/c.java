package com.spotify.voice.results.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.voice.results.model.e;
import io.reactivex.functions.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends RecyclerView.e<b> implements View.OnClickListener {
    private List<e.a> c;
    private final h<ImageView, String, String, ng0> f;
    private final a n;
    private final List<Integer> o;
    private RecyclerView p;
    private final float q;
    private final int r;

    public interface a {
        void a(e.a aVar, int i);
    }

    static class b extends RecyclerView.b0 implements View.OnLayoutChangeListener {
        private final List<ResultRowView> C;
        private final float D;
        private final c E;
        private final RecyclerView F;
        private final int G;
        private int H = 0;
        private int I = 0;

        b(View view, c cVar, float f, RecyclerView recyclerView, int i) {
            super(view);
            this.C = Collections2.newArrayList((ResultRowView) view.findViewById(C0707R.id.result_item_1), (ResultRowView) view.findViewById(C0707R.id.result_item_2), (ResultRowView) view.findViewById(C0707R.id.result_item_3), (ResultRowView) view.findViewById(C0707R.id.result_item_4));
            this.E = cVar;
            this.D = f;
            this.F = recyclerView;
            this.G = i;
        }

        private void m0(int i) {
            if (i == this.E.o.size()) {
                this.E.o.add(i, 0);
                if (this.E.b0(i) < this.E.c.size()) {
                    this.E.C(i);
                    RecyclerView recyclerView = this.F;
                    if (recyclerView != null) {
                        recyclerView.I0(this.G);
                        return;
                    }
                    return;
                }
                this.E.o.remove(i);
            }
        }

        /* access modifiers changed from: package-private */
        public void h0(List<e.a> list, h<ImageView, String, String, ng0> hVar, View.OnClickListener onClickListener, int i) {
            this.H = 0;
            this.I = i;
            int size = this.C.size();
            for (int i2 = 0; i2 < size; i2++) {
                ResultRowView resultRowView = this.C.get(i2);
                resultRowView.setOnClickListener(onClickListener);
                if (list.size() <= i2) {
                    resultRowView.setVisibility(8);
                    resultRowView.setTag(null);
                } else {
                    e.a aVar = list.get(i2);
                    resultRowView.setTag(aVar);
                    resultRowView.setTitle(aVar.j());
                    resultRowView.setIsContainer(aVar.f());
                    resultRowView.setActive(aVar.a());
                    resultRowView.c(aVar.i(), aVar.c());
                    try {
                        hVar.a(resultRowView.getImageView(), aVar.g(), aVar.e());
                    } catch (Exception e) {
                        Logger.e(e, "Should not happen", new Object[0]);
                    }
                    resultRowView.addOnLayoutChangeListener(this);
                }
            }
        }

        public /* synthetic */ void j0() {
            m0(this.I + 1);
        }

        public /* synthetic */ void l0() {
            m0(this.I + 1);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            if (((float) (i4 - i2)) >= this.D || this.H == 0) {
                this.H++;
                view.setVisibility(0);
                if (this.H == 4) {
                    this.E.o.set(this.I, Integer.valueOf(this.H));
                    view.post(new a(this));
                    return;
                }
                return;
            }
            view.setVisibility(8);
            view.setTag(null);
            this.E.o.set(this.I, Integer.valueOf(this.H));
            view.post(new b(this));
        }
    }

    public c(Context context, List<e.a> list, h<ImageView, String, String, ng0> hVar, a aVar, int i) {
        this.c = new ArrayList(list);
        this.f = hVar;
        this.n = aVar;
        ArrayList arrayList = new ArrayList(4);
        this.o = arrayList;
        arrayList.clear();
        arrayList.add(0);
        this.q = (float) context.getResources().getDimensionPixelSize(C0707R.dimen.row_height);
        this.r = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int b0(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.o.get(i3).intValue();
        }
        return i2;
    }

    private void c0(List<e.a> list) {
        this.c = new ArrayList(list);
        this.o.clear();
        this.o.add(0);
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        this.p = recyclerView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(b bVar, int i) {
        b bVar2 = bVar;
        int b0 = b0(i);
        if (b0 < this.c.size()) {
            List<e.a> list = this.c;
            bVar2.h0(list.subList(b0, Math.min(b0 + 4, list.size())), this.f, this, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b M(ViewGroup viewGroup, int i) {
        return new b(je.G(viewGroup, C0707R.layout.voice_result_list, viewGroup, false), this, this.q, this.p, this.r);
    }

    public void f0(List<e.a> list) {
        if (list.size() != this.c.size()) {
            c0(list);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < list.size(); i++) {
                e.a aVar = list.get(i);
                e.a aVar2 = this.c.get(i);
                if (!aVar.equals(aVar2)) {
                    if (aVar.j().equals(aVar2.j()) && aVar.i().equals(aVar2.i()) && aVar.h().equals(aVar2.h()) && aVar.c() == aVar2.c() && aVar.g().equals(aVar2.g()) && aVar.a() != aVar2.a()) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                c0(list);
                return;
            }
            int size = this.o.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                this.c.set(num.intValue(), list.get(num.intValue()));
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    i3 += this.o.get(i2).intValue();
                    if (num.intValue() < i3) {
                        A(i2);
                        break;
                    }
                    i2++;
                }
                if (num.intValue() > i3) {
                    A(size - 1);
                }
            }
        } catch (Exception unused) {
            c0(list);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() instanceof e.a) {
            e.a aVar = (e.a) view.getTag();
            this.n.a(aVar, this.c.indexOf(aVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return 1;
    }
}
