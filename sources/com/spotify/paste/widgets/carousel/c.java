package com.spotify.paste.widgets.carousel;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends e0 {
    private final ArrayList<RecyclerView.b0> h = new ArrayList<>();
    private final ArrayList<RecyclerView.b0> i = new ArrayList<>();
    private final ArrayList<ArrayList<RecyclerView.b0>> j = new ArrayList<>();
    private final ArrayList<RecyclerView.b0> k = new ArrayList<>();
    private final ArrayList<RecyclerView.b0> l = new ArrayList<>();

    class a implements Runnable {
        final /* synthetic */ ArrayList a;

        a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c.A(c.this, (RecyclerView.b0) it.next());
            }
            this.a.clear();
            c.this.j.remove(this.a);
        }
    }

    public static class b {
        public float a;
    }

    static void A(c cVar, RecyclerView.b0 b0Var) {
        cVar.getClass();
        x4 a2 = q4.a(b0Var.a);
        cVar.k.add(b0Var);
        b bVar = (b) b0Var.a.getTag(C0707R.id.paste_carousel_animation_info);
        float f = bVar != null ? bVar.a : 1.0f;
        a aVar = (a) b0Var.a.getTag(C0707R.id.paste_carousel_tag);
        if (aVar != null) {
            if (aVar.b() == -1) {
                b0Var.a.setTranslationX((float) (-aVar.a()));
            }
            if (aVar.b() == 1) {
                b0Var.a.setTranslationX((float) aVar.a());
            }
        }
        a2.a(f);
        a2.k(0.0f);
        a2.d(300);
        a2.f(new e(cVar, b0Var, a2));
        a2.j();
    }

    /* access modifiers changed from: package-private */
    public void E(List<RecyclerView.b0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                q4.a(list.get(size).a).b();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.e0, androidx.recyclerview.widget.RecyclerView.j
    public boolean b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        h(b0Var);
        h(b0Var2);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void j(RecyclerView.b0 b0Var) {
        View view = b0Var.a;
        q4.a(view).b();
        if (this.h.remove(b0Var)) {
            view.setAlpha(1.0f);
            h(b0Var);
        }
        if (this.i.remove(b0Var)) {
            b bVar = (b) b0Var.a.getTag(C0707R.id.paste_carousel_animation_info);
            view.setAlpha(bVar != null ? bVar.a : 1.0f);
            h(b0Var);
        }
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ArrayList<RecyclerView.b0> arrayList = this.j.get(size);
            if (arrayList.remove(b0Var)) {
                view.setAlpha(1.0f);
                h(b0Var);
                if (arrayList.isEmpty()) {
                    this.j.remove(size);
                }
            }
        }
        if (!p()) {
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void k() {
        for (int size = this.h.size() - 1; size >= 0; size--) {
            h(this.h.get(size));
            this.h.remove(size);
        }
        int size2 = this.i.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.i.get(size2);
            View view = b0Var.a;
            int i2 = q4.g;
            view.setAlpha(1.0f);
            h(b0Var);
            this.i.remove(size2);
        }
        if (p()) {
            for (int size3 = this.j.size() - 1; size3 >= 0; size3--) {
                ArrayList<RecyclerView.b0> arrayList = this.j.get(size3);
                for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                    RecyclerView.b0 b0Var2 = arrayList.get(size4);
                    View view2 = b0Var2.a;
                    int i3 = q4.g;
                    view2.setAlpha(1.0f);
                    h(b0Var2);
                    arrayList.remove(size4);
                    if (arrayList.isEmpty()) {
                        this.j.remove(arrayList);
                    }
                }
            }
            E(this.l);
            E(this.k);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public long l() {
        return 300;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public long o() {
        return 120;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean p() {
        return !this.i.isEmpty() || !this.h.isEmpty() || !this.l.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void s() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.i.isEmpty();
        if (z || z2) {
            Iterator<RecyclerView.b0> it = this.h.iterator();
            while (it.hasNext()) {
                RecyclerView.b0 next = it.next();
                View view = next.a;
                x4 a2 = q4.a(view);
                a aVar = (a) view.getTag(C0707R.id.paste_carousel_tag);
                if (aVar != null) {
                    if (aVar.b() == -1) {
                        a2.l((float) (-aVar.a()));
                    }
                    if (aVar.b() == 1) {
                        a2.l((float) aVar.a());
                    }
                }
                this.l.add(next);
                a2.d(120);
                a2.a(0.0f);
                a2.f(new d(this, next, a2));
                a2.j();
            }
            this.h.clear();
            if (z2) {
                ArrayList<RecyclerView.b0> arrayList = new ArrayList<>();
                arrayList.addAll(this.i);
                this.j.add(arrayList);
                this.i.clear();
                a aVar2 = new a(arrayList);
                if (z) {
                    View view2 = arrayList.get(0).a;
                    int i2 = q4.g;
                    int i3 = Build.VERSION.SDK_INT;
                    view2.postOnAnimationDelayed(aVar2, 120);
                    return;
                }
                aVar2.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean v(RecyclerView.b0 b0Var) {
        j(b0Var);
        a aVar = (a) b0Var.a.getTag(C0707R.id.paste_carousel_tag);
        b0Var.a.setAlpha(0.0f);
        b bVar = new b();
        bVar.a = 1.0f;
        b0Var.a.setTag(C0707R.id.paste_carousel_animation_info, bVar);
        this.i.add(b0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean w(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i2, int i3, int i4, int i5) {
        if (b0Var != null) {
            h(b0Var);
        }
        h(b0Var2);
        return false;
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean x(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        if (b0Var == null) {
            return false;
        }
        h(b0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean y(RecyclerView.b0 b0Var) {
        j(b0Var);
        a aVar = (a) b0Var.a.getTag(C0707R.id.paste_carousel_tag);
        this.h.add(b0Var);
        return true;
    }
}
