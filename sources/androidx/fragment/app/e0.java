package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
public class e0 {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    private static final j0 b = (Build.VERSION.SDK_INT >= 21 ? new f0() : null);
    private static final j0 c;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    /* access modifiers changed from: package-private */
    public static class b {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;

        b() {
        }
    }

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        c = j0Var;
    }

    private static void a(ArrayList<View> arrayList, m1<String, View> m1Var, Collection<String> collection) {
        for (int size = m1Var.size() - 1; size >= 0; size--) {
            View m = m1Var.m(size);
            if (collection.contains(q4.s(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.t != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0076, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.H == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00e6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.x.a r9, android.util.SparseArray<androidx.fragment.app.e0.b> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.b(androidx.fragment.app.a, androidx.fragment.app.x$a, android.util.SparseArray, boolean, boolean):void");
    }

    static void c(Fragment fragment, Fragment fragment2, boolean z, m1<String, View> m1Var, boolean z2) {
        if (z) {
            fragment2.H2();
        } else {
            fragment.H2();
        }
    }

    private static boolean d(j0 j0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!j0Var.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static m1<String, View> e(j0 j0Var, m1<String, String> m1Var, Object obj, b bVar) {
        ArrayList<String> arrayList;
        Fragment fragment = bVar.a;
        View view = fragment.P;
        if (m1Var.isEmpty() || obj == null || view == null) {
            m1Var.clear();
            return null;
        }
        m1<String, View> m1Var2 = new m1<>();
        j0Var.i(m1Var2, view);
        a aVar = bVar.c;
        if (bVar.b) {
            fragment.J2();
            arrayList = aVar.n;
        } else {
            fragment.H2();
            arrayList = aVar.o;
        }
        if (arrayList != null) {
            m1Var2.o(arrayList);
            m1Var2.o(m1Var.values());
        }
        int size = m1Var.size();
        while (true) {
            size--;
            if (size < 0) {
                return m1Var2;
            }
            if (!m1Var2.containsKey(m1Var.m(size))) {
                m1Var.k(size);
            }
        }
    }

    private static m1<String, View> f(j0 j0Var, m1<String, String> m1Var, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (m1Var.isEmpty() || obj == null) {
            m1Var.clear();
            return null;
        }
        Fragment fragment = bVar.d;
        m1<String, View> m1Var2 = new m1<>();
        j0Var.i(m1Var2, fragment.m4());
        a aVar = bVar.f;
        if (bVar.e) {
            fragment.H2();
            arrayList = aVar.o;
        } else {
            fragment.J2();
            arrayList = aVar.n;
        }
        if (arrayList != null) {
            m1Var2.o(arrayList);
        }
        m1Var.o(m1Var2.keySet());
        return m1Var2;
    }

    private static j0 g(Fragment fragment, Fragment fragment2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object I2 = fragment.I2();
            if (I2 != null) {
                arrayList.add(I2);
            }
            Fragment.c cVar = fragment.S;
            if (cVar == null) {
                obj2 = null;
            } else {
                obj2 = cVar.g;
                if (obj2 == Fragment.f0) {
                    obj2 = fragment.G2();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            Fragment.c cVar2 = fragment.S;
            if (cVar2 == null) {
                obj3 = null;
            } else {
                obj3 = cVar2.k;
                if (obj3 == Fragment.f0) {
                    obj3 = fragment.T2();
                }
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (fragment2 != null) {
            Object G2 = fragment2.G2();
            if (G2 != null) {
                arrayList.add(G2);
            }
            Fragment.c cVar3 = fragment2.S;
            if (cVar3 == null) {
                obj = null;
            } else {
                obj = cVar3.i;
                if (obj == Fragment.f0) {
                    obj = fragment2.I2();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object T2 = fragment2.T2();
            if (T2 != null) {
                arrayList.add(T2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        j0 j0Var = b;
        if (j0Var != null && d(j0Var, arrayList)) {
            return j0Var;
        }
        j0 j0Var2 = c;
        if (j0Var2 != null && d(j0Var2, arrayList)) {
            return j0Var2;
        }
        if (j0Var == null && j0Var2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> h(j0 j0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.P;
        if (view2 != null) {
            j0Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        j0Var.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object i(j0 j0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.c cVar = fragment.S;
            if (cVar != null && (obj = cVar.i) == Fragment.f0) {
                obj = fragment.I2();
            }
        } else {
            obj = fragment.G2();
        }
        return j0Var.g(obj);
    }

    private static Object j(j0 j0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.c cVar = fragment.S;
            if (cVar != null && (obj = cVar.g) == Fragment.f0) {
                obj = fragment.G2();
            }
        } else {
            obj = fragment.I2();
        }
        return j0Var.g(obj);
    }

    static View k(m1<String, View> m1Var, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar = bVar.c;
        if (obj == null || m1Var == null || (arrayList = aVar.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar.n.get(0);
        } else {
            str = aVar.o.get(0);
        }
        return m1Var.get(str);
    }

    private static Object l(j0 j0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (z) {
            Fragment.c cVar = fragment2.S;
            if (cVar == null) {
                obj = null;
            } else {
                obj = cVar.k;
                if (obj == Fragment.f0) {
                    obj = fragment2.T2();
                }
            }
        } else {
            obj = fragment.T2();
        }
        return j0Var.v(j0Var.g(obj));
    }

    private static void m(j0 j0Var, Object obj, Object obj2, m1<String, View> m1Var, boolean z, a aVar) {
        String str;
        ArrayList<String> arrayList = aVar.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar.o.get(0);
            } else {
                str = aVar.n.get(0);
            }
            View view = m1Var.get(str);
            j0Var.r(obj, view);
            if (obj2 != null) {
                j0Var.r(obj2, view);
            }
        }
    }

    static void n(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0489 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0244 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void o(androidx.fragment.app.o r38, java.util.ArrayList<androidx.fragment.app.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, androidx.fragment.app.e0.a r44) {
        /*
        // Method dump skipped, instructions count: 1183
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.o(androidx.fragment.app.o, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.e0$a):void");
    }

    static boolean p() {
        return (b == null && c == null) ? false : true;
    }
}
