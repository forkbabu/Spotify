package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.transition.Transition;
import java.util.ArrayList;

public class e extends j0 {

    class a extends Transition.c {
        final /* synthetic */ Rect a;

        a(e eVar, Rect rect) {
            this.a = rect;
        }

        @Override // androidx.transition.Transition.c
        public Rect a(Transition transition) {
            return this.a;
        }
    }

    class b implements Transition.d {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(e eVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
            transition.P(this);
            transition.b(this);
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            transition.P(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
        }
    }

    class c extends t {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ Object n;
        final /* synthetic */ ArrayList o;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.f = arrayList2;
            this.n = obj3;
            this.o = arrayList3;
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void b(Transition transition) {
            Object obj = this.a;
            if (obj != null) {
                e.this.n(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                e.this.n(obj2, this.f, null);
            }
            Object obj3 = this.n;
            if (obj3 != null) {
                e.this.n(obj3, this.o, null);
            }
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            transition.P(this);
        }
    }

    class d implements a.AbstractC0029a {
        final /* synthetic */ Transition a;

        d(e eVar, Transition transition) {
            this.a = transition;
        }

        @Override // androidx.core.os.a.AbstractC0029a
        public void b() {
            this.a.cancel();
        }
    }

    /* renamed from: androidx.transition.e$e  reason: collision with other inner class name */
    class C0049e implements Transition.d {
        final /* synthetic */ Runnable a;

        C0049e(e eVar, Runnable runnable) {
            this.a = runnable;
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            this.a.run();
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
        }
    }

    class f extends Transition.c {
        final /* synthetic */ Rect a;

        f(e eVar, Rect rect) {
            this.a = rect;
        }

        @Override // androidx.transition.Transition.c
        public Rect a(Transition transition) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    private static boolean w(Transition transition) {
        return !j0.k(transition.n) || !j0.k(transition.G()) || !j0.k(transition.H());
    }

    @Override // androidx.fragment.app.j0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.j0
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int f0 = transitionSet.f0();
                while (i < f0) {
                    b(transitionSet.e0(i), arrayList);
                    i++;
                }
            } else if (!w(transition) && j0.k(transition.o)) {
                int size = arrayList.size();
                while (i < size) {
                    transition.d(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.j0
    public void c(ViewGroup viewGroup, Object obj) {
        u.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.j0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.j0
    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.j0
    public Object l(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.c0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.c0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.c0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.j0
    public void m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).Q(view);
        }
    }

    @Override // androidx.fragment.app.j0
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int f0 = transitionSet.f0();
            while (i2 < f0) {
                n(transitionSet.e0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!w(transition)) {
            ArrayList<View> arrayList3 = transition.o;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.d(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.Q(arrayList.get(size));
                }
            }
        }
    }

    @Override // androidx.fragment.app.j0
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).b(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.j0
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.j0
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).U(new f(this, rect));
        }
    }

    @Override // androidx.fragment.app.j0
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((Transition) obj).U(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.j0
    public void s(Fragment fragment, Object obj, androidx.core.os.a aVar, Runnable runnable) {
        Transition transition = (Transition) obj;
        aVar.c(new d(this, transition));
        transition.b(new C0049e(this, runnable));
    }

    @Override // androidx.fragment.app.j0
    public void t(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.o;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j0.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.j0
    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.o.clear();
            transitionSet.o.addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.j0
    public Object v(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.c0((Transition) obj);
        return transitionSet;
    }
}
