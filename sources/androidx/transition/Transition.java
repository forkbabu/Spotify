package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.transition.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Transition implements Cloneable {
    private static final int[] L = {2, 1, 3, 4};
    private static final PathMotion M = new a();
    private static ThreadLocal<m1<Animator, b>> N = new ThreadLocal<>();
    private ArrayList<x> A;
    boolean B;
    ArrayList<Animator> C;
    private int D;
    private boolean E;
    private boolean F;
    private ArrayList<d> G;
    private ArrayList<Animator> H;
    v I;
    private c J;
    private PathMotion K;
    private String a;
    private long b;
    long c;
    private TimeInterpolator f;
    ArrayList<Integer> n;
    ArrayList<View> o;
    private ArrayList<String> p;
    private ArrayList<Class<?>> q;
    private ArrayList<Integer> r;
    private ArrayList<View> s;
    private ArrayList<Class<?>> t;
    private ArrayList<String> u;
    private y v;
    private y w;
    TransitionSet x;
    private int[] y;
    private ArrayList<x> z;

    static class a extends PathMotion {
        a() {
        }

        @Override // androidx.transition.PathMotion
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        View a;
        String b;
        x c;
        r0 d;
        Transition e;

        b(View view, String str, Transition transition, r0 r0Var, x xVar) {
            this.a = view;
            this.b = str;
            this.c = xVar;
            this.d = r0Var;
            this.e = transition;
        }
    }

    public static abstract class c {
        public abstract Rect a(Transition transition);
    }

    public interface d {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition);

        void e(Transition transition);
    }

    public Transition() {
        this.a = getClass().getName();
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new y();
        this.w = new y();
        this.x = null;
        this.y = L;
        this.B = false;
        this.C = new ArrayList<>();
        this.D = 0;
        this.E = false;
        this.F = false;
        this.G = null;
        this.H = new ArrayList<>();
        this.K = M;
    }

    private static m1<Animator, b> E() {
        m1<Animator, b> m1Var = N.get();
        if (m1Var != null) {
            return m1Var;
        }
        m1<Animator, b> m1Var2 = new m1<>();
        N.set(m1Var2);
        return m1Var2;
    }

    private static boolean M(x xVar, x xVar2, String str) {
        Object obj = xVar.a.get(str);
        Object obj2 = xVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private static void g(y yVar, View view, x xVar) {
        yVar.a.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.b.indexOfKey(id) >= 0) {
                yVar.b.put(id, null);
            } else {
                yVar.b.put(id, view);
            }
        }
        String s2 = q4.s(view);
        if (s2 != null) {
            if (yVar.d.f(s2) >= 0) {
                yVar.d.put(s2, null);
            } else {
                yVar.d.put(s2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.c.k(itemIdAtPosition) >= 0) {
                    View g = yVar.c.g(itemIdAtPosition);
                    if (g != null) {
                        int i = Build.VERSION.SDK_INT;
                        g.setHasTransientState(false);
                        yVar.c.o(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                view.setHasTransientState(true);
                yVar.c.o(itemIdAtPosition, view);
            }
        }
    }

    private void k(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.r;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.s;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.t;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.t.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        x xVar = new x(view);
                        if (z2) {
                            n(xVar);
                        } else {
                            j(xVar);
                        }
                        xVar.c.add(this);
                        m(xVar);
                        if (z2) {
                            g(this.v, view, xVar);
                        } else {
                            g(this.w, view, xVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            k(viewGroup.getChildAt(i2), z2);
                        }
                    }
                }
            }
        }
    }

    public c A() {
        return this.J;
    }

    public TimeInterpolator B() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public x C(View view, boolean z2) {
        TransitionSet transitionSet = this.x;
        if (transitionSet != null) {
            return transitionSet.C(view, z2);
        }
        ArrayList<x> arrayList = z2 ? this.z : this.A;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            x xVar = arrayList.get(i2);
            if (xVar == null) {
                return null;
            }
            if (xVar.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z2 ? this.A : this.z).get(i);
    }

    public PathMotion D() {
        return this.K;
    }

    public long F() {
        return this.b;
    }

    public List<String> G() {
        return this.p;
    }

    public List<Class<?>> H() {
        return this.q;
    }

    public String[] I() {
        return null;
    }

    public x J(View view, boolean z2) {
        TransitionSet transitionSet = this.x;
        if (transitionSet != null) {
            return transitionSet.J(view, z2);
        }
        return (z2 ? this.v : this.w).a.getOrDefault(view, null);
    }

    public boolean K(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] I2 = I();
        if (I2 != null) {
            for (String str : I2) {
                if (!M(xVar, xVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : xVar.a.keySet()) {
            if (M(xVar, xVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean L(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.r;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.s;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.t;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.t.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.u == null || q4.s(view) == null || !this.u.contains(q4.s(view)))) {
            return false;
        }
        if ((this.n.size() == 0 && this.o.size() == 0 && (((arrayList = this.q) == null || arrayList.isEmpty()) && ((arrayList2 = this.p) == null || arrayList2.isEmpty()))) || this.n.contains(Integer.valueOf(id)) || this.o.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.p;
        if (arrayList6 != null && arrayList6.contains(q4.s(view))) {
            return true;
        }
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                if (this.q.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void N(View view) {
        int i;
        if (!this.F) {
            m1<Animator, b> E2 = E();
            int size = E2.size();
            r0 c2 = g0.c(view);
            int i2 = size - 1;
            while (true) {
                i = 0;
                if (i2 < 0) {
                    break;
                }
                b m = E2.m(i2);
                if (m.a != null && c2.equals(m.d)) {
                    Animator i3 = E2.i(i2);
                    if (Build.VERSION.SDK_INT >= 19) {
                        i3.pause();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = i3.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            while (i < size2) {
                                Animator.AnimatorListener animatorListener = listeners.get(i);
                                if (animatorListener instanceof a.AbstractC0048a) {
                                    ((a.AbstractC0048a) animatorListener).onAnimationPause(i3);
                                }
                                i++;
                            }
                        }
                    }
                }
                i2--;
            }
            ArrayList<d> arrayList = this.G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.G.clone();
                int size3 = arrayList2.size();
                while (i < size3) {
                    ((d) arrayList2.get(i)).c(this);
                    i++;
                }
            }
            this.E = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void O(ViewGroup viewGroup) {
        b orDefault;
        x xVar;
        View view;
        View view2;
        View g;
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        y yVar = this.v;
        y yVar2 = this.w;
        m1 m1Var = new m1(yVar.a);
        m1 m1Var2 = new m1(yVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.y;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                int size = m1Var.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    View view3 = (View) m1Var.i(size);
                    if (view3 != null && L(view3) && (xVar = (x) m1Var2.remove(view3)) != null && L(xVar.b)) {
                        this.z.add((x) m1Var.k(size));
                        this.A.add(xVar);
                    }
                }
            } else if (i2 == 2) {
                m1<String, View> m1Var3 = yVar.d;
                m1<String, View> m1Var4 = yVar2.d;
                int size2 = m1Var3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    View m = m1Var3.m(i3);
                    if (m != null && L(m) && (view = m1Var4.get(m1Var3.i(i3))) != null && L(view)) {
                        x xVar2 = (x) m1Var.getOrDefault(m, null);
                        x xVar3 = (x) m1Var2.getOrDefault(view, null);
                        if (!(xVar2 == null || xVar3 == null)) {
                            this.z.add(xVar2);
                            this.A.add(xVar3);
                            m1Var.remove(m);
                            m1Var2.remove(view);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray<View> sparseArray = yVar.b;
                SparseArray<View> sparseArray2 = yVar2.b;
                int size3 = sparseArray.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    View valueAt = sparseArray.valueAt(i4);
                    if (valueAt != null && L(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i4))) != null && L(view2)) {
                        x xVar4 = (x) m1Var.getOrDefault(valueAt, null);
                        x xVar5 = (x) m1Var2.getOrDefault(view2, null);
                        if (!(xVar4 == null || xVar5 == null)) {
                            this.z.add(xVar4);
                            this.A.add(xVar5);
                            m1Var.remove(valueAt);
                            m1Var2.remove(view2);
                        }
                    }
                }
            } else if (i2 == 4) {
                q1<View> q1Var = yVar.c;
                q1<View> q1Var2 = yVar2.c;
                int r2 = q1Var.r();
                for (int i5 = 0; i5 < r2; i5++) {
                    View s2 = q1Var.s(i5);
                    if (s2 != null && L(s2) && (g = q1Var2.g(q1Var.n(i5))) != null && L(g)) {
                        x xVar6 = (x) m1Var.getOrDefault(s2, null);
                        x xVar7 = (x) m1Var2.getOrDefault(g, null);
                        if (!(xVar6 == null || xVar7 == null)) {
                            this.z.add(xVar6);
                            this.A.add(xVar7);
                            m1Var.remove(s2);
                            m1Var2.remove(g);
                        }
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < m1Var.size(); i6++) {
            x xVar8 = (x) m1Var.m(i6);
            if (L(xVar8.b)) {
                this.z.add(xVar8);
                this.A.add(null);
            }
        }
        for (int i7 = 0; i7 < m1Var2.size(); i7++) {
            x xVar9 = (x) m1Var2.m(i7);
            if (L(xVar9.b)) {
                this.A.add(xVar9);
                this.z.add(null);
            }
        }
        m1<Animator, b> E2 = E();
        int size4 = E2.size();
        r0 c2 = g0.c(viewGroup);
        for (int i8 = size4 - 1; i8 >= 0; i8--) {
            Animator i9 = E2.i(i8);
            if (!(i9 == null || (orDefault = E2.getOrDefault(i9, null)) == null || orDefault.a == null || !c2.equals(orDefault.d))) {
                x xVar10 = orDefault.c;
                View view4 = orDefault.a;
                x J2 = J(view4, true);
                x C2 = C(view4, true);
                if (J2 == null && C2 == null) {
                    C2 = this.w.a.get(view4);
                }
                if (!(J2 == null && C2 == null) && orDefault.e.K(xVar10, C2)) {
                    if (i9.isRunning() || i9.isStarted()) {
                        i9.cancel();
                    } else {
                        E2.remove(i9);
                    }
                }
            }
        }
        s(viewGroup, this.v, this.w, this.z, this.A);
        S();
    }

    public Transition P(d dVar) {
        ArrayList<d> arrayList = this.G;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.G.size() == 0) {
            this.G = null;
        }
        return this;
    }

    public Transition Q(View view) {
        this.o.remove(view);
        return this;
    }

    public void R(View view) {
        if (this.E) {
            if (!this.F) {
                m1<Animator, b> E2 = E();
                int size = E2.size();
                r0 c2 = g0.c(view);
                for (int i = size - 1; i >= 0; i--) {
                    b m = E2.m(i);
                    if (m.a != null && c2.equals(m.d)) {
                        Animator i2 = E2.i(i);
                        if (Build.VERSION.SDK_INT >= 19) {
                            i2.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = i2.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof a.AbstractC0048a) {
                                        ((a.AbstractC0048a) animatorListener).onAnimationResume(i2);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<d> arrayList = this.G;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.G.clone();
                    int size3 = arrayList2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((d) arrayList2.get(i4)).a(this);
                    }
                }
            }
            this.E = false;
        }
    }

    /* access modifiers changed from: protected */
    public void S() {
        a0();
        m1<Animator, b> E2 = E();
        Iterator<Animator> it = this.H.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (E2.containsKey(next)) {
                a0();
                if (next != null) {
                    next.addListener(new q(this, E2));
                    long j = this.c;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new r(this));
                    next.start();
                }
            }
        }
        this.H.clear();
        t();
    }

    public Transition T(long j) {
        this.c = j;
        return this;
    }

    public void U(c cVar) {
        this.J = cVar;
    }

    public Transition V(TimeInterpolator timeInterpolator) {
        this.f = timeInterpolator;
        return this;
    }

    public void W(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.K = M;
        } else {
            this.K = pathMotion;
        }
    }

    public void X(v vVar) {
        this.I = vVar;
    }

    /* access modifiers changed from: package-private */
    public Transition Y(ViewGroup viewGroup) {
        return this;
    }

    public Transition Z(long j) {
        this.b = j;
        return this;
    }

    /* access modifiers changed from: protected */
    public void a0() {
        if (this.D == 0) {
            ArrayList<d> arrayList = this.G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.G.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).b(this);
                }
            }
            this.F = false;
        }
        this.D++;
    }

    public Transition b(d dVar) {
        if (this.G == null) {
            this.G = new ArrayList<>();
        }
        this.G.add(dVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public String b0(String str) {
        StringBuilder V0 = je.V0(str);
        V0.append(getClass().getSimpleName());
        V0.append("@");
        V0.append(Integer.toHexString(hashCode()));
        V0.append(": ");
        String sb = V0.toString();
        if (this.c != -1) {
            sb = je.E0(je.Z0(sb, "dur("), this.c, ") ");
        }
        if (this.b != -1) {
            sb = je.E0(je.Z0(sb, "dly("), this.b, ") ");
        }
        if (this.f != null) {
            StringBuilder Z0 = je.Z0(sb, "interp(");
            Z0.append(this.f);
            Z0.append(") ");
            sb = Z0.toString();
        }
        if (this.n.size() <= 0 && this.o.size() <= 0) {
            return sb;
        }
        String x0 = je.x0(sb, "tgts(");
        if (this.n.size() > 0) {
            for (int i = 0; i < this.n.size(); i++) {
                if (i > 0) {
                    x0 = je.x0(x0, ", ");
                }
                StringBuilder V02 = je.V0(x0);
                V02.append(this.n.get(i));
                x0 = V02.toString();
            }
        }
        if (this.o.size() > 0) {
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                if (i2 > 0) {
                    x0 = je.x0(x0, ", ");
                }
                StringBuilder V03 = je.V0(x0);
                V03.append(this.o.get(i2));
                x0 = V03.toString();
            }
        }
        return je.x0(x0, ")");
    }

    public Transition c(int i) {
        if (i != 0) {
            this.n.add(Integer.valueOf(i));
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.C.get(size).cancel();
        }
        ArrayList<d> arrayList = this.G;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.G.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((d) arrayList2.get(i)).e(this);
            }
        }
    }

    public Transition d(View view) {
        this.o.add(view);
        return this;
    }

    public Transition e(Class<?> cls) {
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        this.q.add(cls);
        return this;
    }

    public Transition f(String str) {
        if (this.p == null) {
            this.p = new ArrayList<>();
        }
        this.p.add(str);
        return this;
    }

    public abstract void j(x xVar);

    /* access modifiers changed from: package-private */
    public void m(x xVar) {
        boolean z2;
        if (this.I != null && !xVar.a.isEmpty()) {
            String[] a2 = this.I.a();
            int i = 0;
            while (true) {
                if (i >= a2.length) {
                    z2 = true;
                    break;
                } else if (!xVar.a.containsKey(a2[i])) {
                    z2 = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z2) {
                ((o0) this.I).getClass();
                View view = xVar.b;
                Integer num = (Integer) xVar.a.get("android:visibility:visibility");
                if (num == null) {
                    num = Integer.valueOf(view.getVisibility());
                }
                xVar.a.put("android:visibilityPropagation:visibility", num);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                iArr[0] = Math.round(view.getTranslationX()) + iArr[0];
                iArr[0] = (view.getWidth() / 2) + iArr[0];
                iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
                iArr[1] = (view.getHeight() / 2) + iArr[1];
                xVar.a.put("android:visibilityPropagation:center", iArr);
            }
        }
    }

    public abstract void n(x xVar);

    /* access modifiers changed from: package-private */
    public void o(ViewGroup viewGroup, boolean z2) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        p(z2);
        if ((this.n.size() > 0 || this.o.size() > 0) && (((arrayList = this.p) == null || arrayList.isEmpty()) && ((arrayList2 = this.q) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.n.size(); i++) {
                View findViewById = viewGroup.findViewById(this.n.get(i).intValue());
                if (findViewById != null) {
                    x xVar = new x(findViewById);
                    if (z2) {
                        n(xVar);
                    } else {
                        j(xVar);
                    }
                    xVar.c.add(this);
                    m(xVar);
                    if (z2) {
                        g(this.v, findViewById, xVar);
                    } else {
                        g(this.w, findViewById, xVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                View view = this.o.get(i2);
                x xVar2 = new x(view);
                if (z2) {
                    n(xVar2);
                } else {
                    j(xVar2);
                }
                xVar2.c.add(this);
                m(xVar2);
                if (z2) {
                    g(this.v, view, xVar2);
                } else {
                    g(this.w, view, xVar2);
                }
            }
            return;
        }
        k(viewGroup, z2);
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z2) {
        if (z2) {
            this.v.a.clear();
            this.v.b.clear();
            this.v.c.c();
            return;
        }
        this.w.a.clear();
        this.w.b.clear();
        this.w.c.c();
    }

    /* renamed from: q */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.H = new ArrayList<>();
            transition.v = new y();
            transition.w = new y();
            transition.z = null;
            transition.A = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        int i;
        int i2;
        Animator r2;
        View view;
        Animator animator;
        x xVar;
        x xVar2;
        Animator animator2;
        m1<Animator, b> E2 = E();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            x xVar3 = arrayList.get(i3);
            x xVar4 = arrayList2.get(i3);
            if (xVar3 != null && !xVar3.c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null)) {
                if ((xVar3 == null || xVar4 == null || K(xVar3, xVar4)) && (r2 = r(viewGroup, xVar3, xVar4)) != null) {
                    if (xVar4 != null) {
                        view = xVar4.b;
                        String[] I2 = I();
                        if (I2 != null && I2.length > 0) {
                            xVar2 = new x(view);
                            i2 = size;
                            x xVar5 = yVar2.a.get(view);
                            if (xVar5 != null) {
                                int i4 = 0;
                                while (i4 < I2.length) {
                                    xVar2.a.put(I2[i4], xVar5.a.get(I2[i4]));
                                    i4++;
                                    i3 = i3;
                                    xVar5 = xVar5;
                                }
                            }
                            i = i3;
                            int size2 = E2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = r2;
                                    break;
                                }
                                b bVar = E2.get(E2.i(i5));
                                if (bVar.c != null && bVar.a == view && bVar.b.equals(this.a) && bVar.c.equals(xVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = r2;
                            xVar2 = null;
                        }
                        animator = animator2;
                        xVar = xVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = xVar3.b;
                        animator = r2;
                        xVar = null;
                    }
                    if (animator != null) {
                        v vVar = this.I;
                        if (vVar != null) {
                            long b2 = vVar.b(viewGroup, this, xVar3, xVar4);
                            sparseIntArray.put(this.H.size(), (int) b2);
                            j = Math.min(b2, j);
                        }
                        E2.put(animator, new b(view, this.a, this, g0.c(viewGroup), xVar));
                        this.H.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.H.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - j));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        int i = this.D - 1;
        this.D = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.G.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < this.v.c.r(); i3++) {
                View s2 = this.v.c.s(i3);
                if (s2 != null) {
                    int i4 = q4.g;
                    int i5 = Build.VERSION.SDK_INT;
                    s2.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < this.w.c.r(); i6++) {
                View s3 = this.w.c.s(i6);
                if (s3 != null) {
                    int i7 = q4.g;
                    int i8 = Build.VERSION.SDK_INT;
                    s3.setHasTransientState(false);
                }
            }
            this.F = true;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        return b0("");
    }

    public Transition u(int i, boolean z2) {
        ArrayList<Integer> arrayList = this.r;
        if (i > 0) {
            if (z2) {
                arrayList = a.a(arrayList, Integer.valueOf(i));
            } else {
                arrayList = a.g(arrayList, Integer.valueOf(i));
            }
        }
        this.r = arrayList;
        return this;
    }

    public Transition v(View view, boolean z2) {
        ArrayList<View> arrayList = this.s;
        if (view != null) {
            if (z2) {
                arrayList = a.a(arrayList, view);
            } else {
                arrayList = a.g(arrayList, view);
            }
        }
        this.s = arrayList;
        return this;
    }

    public Transition w(Class<?> cls, boolean z2) {
        ArrayList<Class<?>> arrayList = this.t;
        if (cls != null) {
            if (z2) {
                arrayList = a.a(arrayList, cls);
            } else {
                arrayList = a.g(arrayList, cls);
            }
        }
        this.t = arrayList;
        return this;
    }

    public Transition x(String str, boolean z2) {
        ArrayList<String> arrayList = this.u;
        if (str != null) {
            if (z2) {
                arrayList = a.a(arrayList, str);
            } else {
                arrayList = a.g(arrayList, str);
            }
        }
        this.u = arrayList;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void y(ViewGroup viewGroup) {
        m1<Animator, b> E2 = E();
        int size = E2.size();
        if (!(viewGroup == null || size == 0)) {
            r0 c2 = g0.c(viewGroup);
            m1 m1Var = new m1(E2);
            E2.clear();
            for (int i = size - 1; i >= 0; i--) {
                b bVar = (b) m1Var.m(i);
                if (bVar.a != null && c2.equals(bVar.d)) {
                    ((Animator) m1Var.i(i)).end();
                }
            }
        }
    }

    public Rect z() {
        c cVar = this.J;
        if (cVar == null) {
            return null;
        }
        return cVar.a(this);
    }

    public Transition(Context context, AttributeSet attributeSet) {
        boolean z2;
        int[] iArr = L;
        this.a = getClass().getName();
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new y();
        this.w = new y();
        this.x = null;
        this.y = iArr;
        this.B = false;
        this.C = new ArrayList<>();
        this.D = 0;
        this.E = false;
        this.F = false;
        this.G = null;
        this.H = new ArrayList<>();
        this.K = M;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k = (long) i2.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k >= 0) {
            T(k);
        }
        long k2 = (long) i2.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k2 > 0) {
            Z(k2);
        }
        int l = i2.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            V(AnimationUtils.loadInterpolator(context, l));
        }
        String m = i2.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(m, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr2[i] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr2[i] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr3 = new int[(iArr2.length - 1)];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(je.y0("Unknown match type in matchOrder: '", trim, "'"));
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.y = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 >= 1 && i3 <= 4) {
                        int i4 = iArr2[i2];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i2) {
                                z2 = false;
                                break;
                            } else if (iArr2[i5] == i4) {
                                z2 = true;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (z2) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    } else {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                }
                this.y = (int[]) iArr2.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}
