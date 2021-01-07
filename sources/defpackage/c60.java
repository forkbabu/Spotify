package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: c60  reason: default package */
public final class c60 implements b60 {
    private b91 a = HubsImmutableViewModel.EMPTY;
    private final g60 b;

    public c60(g60 g60) {
        h.e(g60, "itemSizeRepo");
        this.b = g60;
    }

    private final boolean d(s81 s81, List<String> list, List<String> list2) {
        Iterator<? extends s81> it = this.a.body().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            s81 s812 = (s81) it.next();
            if (h.a(s812, s81)) {
                return true;
            }
            for (T t : s812.children()) {
                int i2 = i + 1;
                if (i >= 0) {
                    T t2 = t;
                    if (t2 == null || !h.a(t2, s81)) {
                        i = i2;
                    } else {
                        ListIterator<? extends s81> listIterator = s812.children().listIterator();
                        while (listIterator.nextIndex() < i) {
                            list2.add(((s81) listIterator.next()).componentId().id());
                        }
                        return true;
                    }
                } else {
                    d.L();
                    throw null;
                }
            }
            list.add(s812.componentId().id());
        }
    }

    @Override // defpackage.b60
    public void a(b91 b91) {
        h.e(b91, "<set-?>");
        this.a = b91;
    }

    @Override // defpackage.b60
    public int b(s81 s81, i60 i60) {
        h.e(s81, "model");
        h.e(i60, "mode");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (!d(s81, arrayList, arrayList2)) {
            return 0;
        }
        if (i60 instanceof h60) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i += this.b.get((String) it.next()).b();
            }
            return i;
        } else if (i60 instanceof v50) {
            int max = Math.max(((v50) i60).a(), 1);
            int size = arrayList2.size() % max;
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2 += this.b.get((String) it2.next()).b();
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                int i3 = i + 1;
                if (i >= 0) {
                    String str = (String) next;
                    if (i % max == size) {
                        i2 = this.b.get(str).b() + i2;
                    }
                    i = i3;
                } else {
                    d.L();
                    throw null;
                }
            }
            return i2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.b60
    public int c(s81 s81, i60 i60) {
        h.e(s81, "model");
        h.e(i60, "mode");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!d(s81, new ArrayList<>(), arrayList)) {
            return 0;
        }
        if (i60 instanceof h60) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i += this.b.get((String) it.next()).c();
            }
            return i;
        } else if (i60 instanceof v50) {
            int max = Math.max(((v50) i60).a(), 1);
            int size = arrayList.size() / max;
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = (String) next;
                    if (i2 / max == size) {
                        i = this.b.get(str).c() + i;
                    }
                    i2 = i3;
                } else {
                    d.L();
                    throw null;
                }
            }
            return i;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
