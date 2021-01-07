package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {
    private ArrayList<Transition> O = new ArrayList<>();
    private boolean P = true;
    int Q;
    boolean R = false;
    private int S = 0;

    class a extends t {
        final /* synthetic */ Transition a;

        a(TransitionSet transitionSet, Transition transition) {
            this.a = transition;
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            this.a.S();
            transition.P(this);
        }
    }

    static class b extends t {
        TransitionSet a;

        b(TransitionSet transitionSet) {
            this.a = transitionSet;
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void b(Transition transition) {
            TransitionSet transitionSet = this.a;
            if (!transitionSet.R) {
                transitionSet.a0();
                this.a.R = true;
            }
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            TransitionSet transitionSet = this.a;
            int i = transitionSet.Q - 1;
            transitionSet.Q = i;
            if (i == 0) {
                transitionSet.R = false;
                transitionSet.t();
            }
            transition.P(this);
        }
    }

    public TransitionSet() {
    }

    @Override // androidx.transition.Transition
    public void N(View view) {
        super.N(view);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).N(view);
        }
    }

    @Override // androidx.transition.Transition
    public Transition P(Transition.d dVar) {
        super.P(dVar);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition Q(View view) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).Q(view);
        }
        this.o.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public void R(View view) {
        super.R(view);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).R(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public void S() {
        if (this.O.isEmpty()) {
            a0();
            t();
            return;
        }
        b bVar = new b(this);
        Iterator<Transition> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.Q = this.O.size();
        if (!this.P) {
            for (int i = 1; i < this.O.size(); i++) {
                this.O.get(i - 1).b(new a(this, this.O.get(i)));
            }
            Transition transition = this.O.get(0);
            if (transition != null) {
                transition.S();
                return;
            }
            return;
        }
        Iterator<Transition> it2 = this.O.iterator();
        while (it2.hasNext()) {
            it2.next().S();
        }
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition T(long j) {
        g0(j);
        return this;
    }

    @Override // androidx.transition.Transition
    public void U(Transition.c cVar) {
        super.U(cVar);
        this.S |= 8;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).U(cVar);
        }
    }

    @Override // androidx.transition.Transition
    public void W(PathMotion pathMotion) {
        super.W(pathMotion);
        this.S |= 4;
        if (this.O != null) {
            for (int i = 0; i < this.O.size(); i++) {
                this.O.get(i).W(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void X(v vVar) {
        this.I = vVar;
        this.S |= 2;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).X(vVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public Transition Y(ViewGroup viewGroup) {
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).Y(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition Z(long j) {
        super.Z(j);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition b(Transition.d dVar) {
        super.b(dVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public String b0(String str) {
        String b0 = super.b0(str);
        for (int i = 0; i < this.O.size(); i++) {
            StringBuilder Z0 = je.Z0(b0, "\n");
            Z0.append(this.O.get(i).b0(je.x0(str, "  ")));
            b0 = Z0.toString();
        }
        return b0;
    }

    @Override // androidx.transition.Transition
    public Transition c(int i) {
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            this.O.get(i2).c(i);
        }
        super.c(i);
        return this;
    }

    public TransitionSet c0(Transition transition) {
        this.O.add(transition);
        transition.x = this;
        long j = this.c;
        if (j >= 0) {
            transition.T(j);
        }
        if ((this.S & 1) != 0) {
            transition.V(B());
        }
        if ((this.S & 2) != 0) {
            transition.X(this.I);
        }
        if ((this.S & 4) != 0) {
            transition.W(D());
        }
        if ((this.S & 8) != 0) {
            transition.U(A());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public Transition d(View view) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).d(view);
        }
        this.o.add(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition e(Class cls) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).e(cls);
        }
        super.e(cls);
        return this;
    }

    public Transition e0(int i) {
        if (i < 0 || i >= this.O.size()) {
            return null;
        }
        return this.O.get(i);
    }

    @Override // androidx.transition.Transition
    public Transition f(String str) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).f(str);
        }
        super.f(str);
        return this;
    }

    public int f0() {
        return this.O.size();
    }

    public TransitionSet g0(long j) {
        ArrayList<Transition> arrayList;
        this.c = j;
        if (j >= 0 && (arrayList = this.O) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.O.get(i).T(j);
            }
        }
        return this;
    }

    /* renamed from: h0 */
    public TransitionSet V(TimeInterpolator timeInterpolator) {
        this.S |= 1;
        ArrayList<Transition> arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.O.get(i).V(timeInterpolator);
            }
        }
        super.V(timeInterpolator);
        return this;
    }

    public TransitionSet i0(int i) {
        if (i == 0) {
            this.P = true;
        } else if (i == 1) {
            this.P = false;
        } else {
            throw new AndroidRuntimeException(je.p0("Invalid parameter for TransitionSet ordering: ", i));
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void j(x xVar) {
        if (L(xVar.b)) {
            Iterator<Transition> it = this.O.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.L(xVar.b)) {
                    next.j(xVar);
                    xVar.c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void m(x xVar) {
        super.m(xVar);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).m(xVar);
        }
    }

    @Override // androidx.transition.Transition
    public void n(x xVar) {
        if (L(xVar.b)) {
            Iterator<Transition> it = this.O.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.L(xVar.b)) {
                    next.n(xVar);
                    xVar.c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: q */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.O = new ArrayList<>();
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            Transition q = this.O.get(i).clone();
            transitionSet.O.add(q);
            q.x = transitionSet;
        }
        return transitionSet;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public void s(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long F = F();
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.O.get(i);
            if (F > 0 && (this.P || i == 0)) {
                long F2 = transition.F();
                if (F2 > 0) {
                    transition.Z(F2 + F);
                } else {
                    transition.Z(F);
                }
            }
            transition.s(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public Transition u(int i, boolean z) {
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            this.O.get(i2).u(i, z);
        }
        super.u(i, z);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition v(View view, boolean z) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).v(view, z);
        }
        super.v(view, z);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition w(Class<?> cls, boolean z) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).w(cls, z);
        }
        super.w(cls, z);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition x(String str, boolean z) {
        for (int i = 0; i < this.O.size(); i++) {
            this.O.get(i).x(str, z);
        }
        super.x(str, z);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).y(viewGroup);
        }
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.h);
        i0(i2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
