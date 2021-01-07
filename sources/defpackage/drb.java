package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.mobile.android.util.b0;
import com.spotify.mobile.android.util.x;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: drb  reason: default package */
public abstract class drb<VH extends e<ContextTrack>> extends b<VH> {
    private List<vqb> c = Collections.emptyList();

    /* renamed from: drb$a */
    class a implements b0 {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // com.spotify.mobile.android.util.b0
        public void a(int i) {
            this.a.add(new zqb(this, i));
        }

        @Override // com.spotify.mobile.android.util.b0
        public void b(int i, int i2) {
            this.a.add(new xqb(this, i, i2));
        }

        @Override // com.spotify.mobile.android.util.b0
        public void c(int i) {
            this.a.add(new yqb(this, i));
        }

        @Override // com.spotify.mobile.android.util.b0
        public void d(int i, int i2) {
            this.a.add(new wqb(this, i, i2));
        }
    }

    public boolean Z() {
        return this.c.isEmpty();
    }

    public int b0(List<ContextTrack> list, ContextTrack contextTrack, List<ContextTrack> list2, Handler handler) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList(5);
        arrayList.addAll(list);
        arrayList.add(contextTrack);
        arrayList.addAll(list2);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        SparseIntArray sparseIntArray = new SparseIntArray();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ContextTrack contextTrack2 = (ContextTrack) it.next();
            if (!MoreObjects.isNullOrEmpty(contextTrack2.uid())) {
                i2 = contextTrack2.uid().hashCode();
            } else {
                i2 = contextTrack2.uri().hashCode();
            }
            int i3 = sparseIntArray.get(i2, 0) + 1;
            sparseIntArray.put(i2, i3);
            arrayList2.add(new vqb(contextTrack2, i2, i3));
        }
        ArrayList arrayList3 = new ArrayList();
        int a2 = x.a(this.c, arrayList2, new a(arrayList3), arb.a);
        boolean isEmpty = this.c.isEmpty();
        this.c = arrayList2;
        if (a2 == 0) {
            return 0;
        }
        if (isEmpty || a2 >= 3) {
            z();
            return 2;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            handler.post((Runnable) it2.next());
        }
        for (i = 0; i < arrayList2.size(); i++) {
            for (vqb vqb : this.c) {
                ContextTrack b = ((vqb) arrayList2.get(i)).b();
                ContextTrack b2 = vqb.b();
                if (b.uid().equals(b2.uid()) && !b.equals(b2)) {
                    A(i);
                }
            }
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public ContextTrack c0(int i) {
        return this.c.get(i).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.c.get(i).a();
    }
}
