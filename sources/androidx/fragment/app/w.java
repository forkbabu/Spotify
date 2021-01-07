package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class w {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, v> b = new HashMap<>();

    w() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.t = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void d(int i) {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            v vVar = this.b.get(it.next().n);
            if (vVar != null) {
                vVar.r(i);
            }
        }
        for (v vVar2 : this.b.values()) {
            if (vVar2 != null) {
                vVar2.r(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String x0 = je.x0(str, "    ");
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (v vVar : this.b.values()) {
                printWriter.print(str);
                if (vVar != null) {
                    Fragment i = vVar.i();
                    printWriter.println(i);
                    i.z2(x0, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        v vVar = this.b.get(str);
        if (vVar != null) {
            return vVar.i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.E == i) {
                return fragment;
            }
        }
        for (v vVar : this.b.values()) {
            if (vVar != null) {
                Fragment i2 = vVar.i();
                if (i2.E == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.G)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (v vVar : this.b.values()) {
            if (vVar != null) {
                Fragment i = vVar.i();
                if (str.equals(i.G)) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        for (v vVar : this.b.values()) {
            if (vVar != null) {
                Fragment i = vVar.i();
                if (!str.equals(i.n)) {
                    i = i.C.V(str);
                }
                if (i != null) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment j(Fragment fragment) {
        ViewGroup viewGroup = fragment.O;
        View view = fragment.P;
        if (viewGroup == null || view == null) {
            return null;
        }
        int indexOf = this.a.indexOf(fragment);
        while (true) {
            indexOf--;
            if (indexOf < 0) {
                return null;
            }
            Fragment fragment2 = this.a.get(indexOf);
            if (fragment2.O == viewGroup && fragment2.P != null) {
                return fragment2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> k() {
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.b.values()) {
            if (vVar != null) {
                arrayList.add(vVar.i());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public v l(String str) {
        return this.b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> m() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void n(v vVar) {
        this.b.put(vVar.i().n, vVar);
    }

    /* access modifiers changed from: package-private */
    public void o(v vVar) {
        Fragment i = vVar.i();
        for (v vVar2 : this.b.values()) {
            if (vVar2 != null) {
                Fragment i2 = vVar2.i();
                if (i.n.equals(i2.q)) {
                    i2.p = i;
                    i2.q = null;
                }
            }
        }
        this.b.put(i.n, null);
        String str = i.q;
        if (str != null) {
            i.p = f(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.t = false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public void r(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f != null) {
                    if (o.k0(2)) {
                        String str2 = "restoreSaveState: added (" + str + "): " + f;
                    }
                    a(f);
                } else {
                    throw new IllegalStateException(je.y0("No instantiated fragment for (", str, ")"));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<u> s() {
        ArrayList<u> arrayList = new ArrayList<>(this.b.size());
        for (v vVar : this.b.values()) {
            if (vVar != null) {
                Fragment i = vVar.i();
                u p = vVar.p();
                arrayList.add(p);
                if (o.k0(2)) {
                    String str = "Saved state of " + i + ": " + p.v;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> t() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.n);
                if (o.k0(2)) {
                    String str = "saveAllState: adding fragment (" + next.n + "): " + next;
                }
            }
            return arrayList;
        }
    }
}
