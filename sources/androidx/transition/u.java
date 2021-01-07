package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class u {
    private static Transition a = new AutoTransition();
    private static ThreadLocal<WeakReference<m1<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    /* access modifiers changed from: private */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        Transition a;
        ViewGroup b;

        /* renamed from: androidx.transition.u$a$a  reason: collision with other inner class name */
        class C0050a extends t {
            final /* synthetic */ m1 a;

            C0050a(m1 m1Var) {
                this.a = m1Var;
            }

            @Override // androidx.transition.Transition.d
            public void d(Transition transition) {
                ((ArrayList) this.a.get(a.this.b)).remove(transition);
                transition.P(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.a = transition;
            this.b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
            if (!u.c.remove(this.b)) {
                return true;
            }
            m1<ViewGroup, ArrayList<Transition>> c = u.c();
            ArrayList<Transition> arrayList = c.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.b(new C0050a(c));
            this.a.o(this.b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).R(this.b);
                }
            }
            this.a.O(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
            u.c.remove(this.b);
            ArrayList<Transition> arrayList = u.c().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().R(this.b);
                }
            }
            this.a.p(true);
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (!c.contains(viewGroup) && q4.w(viewGroup)) {
            c.add(viewGroup);
            if (transition == null) {
                transition = a;
            }
            Transition q = transition.clone();
            e(viewGroup, q);
            viewGroup.setTag(C0707R.id.transition_current_scene, null);
            if (q != null) {
                a aVar = new a(q, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList<Transition> orDefault = c().getOrDefault(viewGroup, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            ArrayList arrayList = new ArrayList(orDefault);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((Transition) arrayList.get(size)).y(viewGroup);
                } else {
                    return;
                }
            }
        }
    }

    static m1<ViewGroup, ArrayList<Transition>> c() {
        m1<ViewGroup, ArrayList<Transition>> m1Var;
        WeakReference<m1<ViewGroup, ArrayList<Transition>>> weakReference = b.get();
        if (weakReference != null && (m1Var = weakReference.get()) != null) {
            return m1Var;
        }
        m1<ViewGroup, ArrayList<Transition>> m1Var2 = new m1<>();
        b.set(new WeakReference<>(m1Var2));
        return m1Var2;
    }

    public static void d(n nVar, Transition transition) {
        ViewGroup d = nVar.d();
        if (!c.contains(d)) {
            n.c(d);
            c.add(d);
            Transition q = transition.clone();
            q.Y(d);
            e(d, q);
            nVar.a();
            if (d != null) {
                a aVar = new a(q, d);
                d.addOnAttachStateChangeListener(aVar);
                d.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    private static void e(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> orDefault = c().getOrDefault(viewGroup, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator<Transition> it = orDefault.iterator();
            while (it.hasNext()) {
                it.next().N(viewGroup);
            }
        }
        if (transition != null) {
            transition.o(viewGroup, true);
        }
        n nVar = (n) viewGroup.getTag(C0707R.id.transition_current_scene);
        if (nVar != null) {
            nVar.b();
        }
    }
}
