package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h0;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.navigation.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {
    private final Context a;
    private Activity b;
    private r c;
    o d;
    private Bundle e;
    private Parcelable[] f;
    private boolean g;
    final Deque<h> h = new ArrayDeque();
    private n i;
    private j j;
    private w k = new w();
    private final CopyOnWriteArrayList<b> l = new CopyOnWriteArrayList<>();
    private final m m = new l() {
        /* class androidx.navigation.NavController.AnonymousClass1 */

        @Override // androidx.lifecycle.l
        public void p(n nVar, Lifecycle.Event event) {
            NavController navController = NavController.this;
            if (navController.d != null) {
                for (h hVar : navController.h) {
                    hVar.e(event);
                }
            }
        }
    };
    private final androidx.activity.b n = new a(false);
    private boolean o = true;

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            NavController.this.k();
        }
    }

    public interface b {
        void a(NavController navController, m mVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        w wVar = this.k;
        wVar.a(new p(wVar));
        this.k.a(new a(this.a));
    }

    private boolean b() {
        Lifecycle.State state = Lifecycle.State.STARTED;
        Lifecycle.State state2 = Lifecycle.State.RESUMED;
        while (!this.h.isEmpty() && (this.h.peekLast().b() instanceof o) && l(this.h.peekLast().b().k(), true)) {
        }
        if (this.h.isEmpty()) {
            return false;
        }
        m b2 = this.h.peekLast().b();
        m mVar = null;
        if (b2 instanceof b) {
            Iterator<h> descendingIterator = this.h.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                m b3 = descendingIterator.next().b();
                if (!((b3 instanceof o) || (b3 instanceof b))) {
                    mVar = b3;
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator<h> descendingIterator2 = this.h.descendingIterator();
        while (descendingIterator2.hasNext()) {
            h next = descendingIterator2.next();
            Lifecycle.State c2 = next.c();
            m b4 = next.b();
            if (b2 != null && b4.k() == b2.k()) {
                if (c2 != state2) {
                    hashMap.put(next, state2);
                }
                b2 = b2.n();
            } else if (mVar == null || b4.k() != mVar.k()) {
                next.h(Lifecycle.State.CREATED);
            } else {
                if (c2 == state2) {
                    next.h(state);
                } else if (c2 != state) {
                    hashMap.put(next, state);
                }
                mVar = mVar.n();
            }
        }
        for (h hVar : this.h) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(hVar);
            if (state3 != null) {
                hVar.h(state3);
            } else {
                hVar.i();
            }
        }
        h peekLast = this.h.peekLast();
        Iterator<b> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a(this, peekLast.b(), peekLast.a());
        }
        return true;
    }

    private void i(m mVar, Bundle bundle, s sVar, v.a aVar) {
        boolean z = false;
        boolean l2 = (sVar == null || sVar.e() == -1) ? false : l(sVar.e(), sVar.f());
        v c2 = this.k.c(mVar.l());
        Bundle e2 = mVar.e(bundle);
        m b2 = c2.b(mVar, e2, sVar, aVar);
        if (b2 != null) {
            if (!(b2 instanceof b)) {
                while (!this.h.isEmpty() && (this.h.peekLast().b() instanceof b) && l(this.h.peekLast().b().k(), true)) {
                }
            }
            if (this.h.isEmpty()) {
                this.h.add(new h(this.a, this.d, e2, this.i, this.j));
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            o oVar = b2;
            while (oVar != null && d(oVar.k()) == null) {
                oVar = oVar.n();
                if (oVar != null) {
                    arrayDeque.addFirst(new h(this.a, oVar, e2, this.i, this.j));
                }
            }
            this.h.addAll(arrayDeque);
            this.h.add(new h(this.a, b2, b2.e(e2), this.i, this.j));
        } else if (sVar != null && sVar.g()) {
            h peekLast = this.h.peekLast();
            if (peekLast != null) {
                peekLast.f(bundle);
            }
            z = true;
        }
        s();
        if (l2 || b2 != null || z) {
            b();
        }
    }

    private void s() {
        androidx.activity.b bVar = this.n;
        boolean z = false;
        if (this.o) {
            int i2 = 0;
            for (h hVar : this.h) {
                if (!(hVar.b() instanceof o)) {
                    i2++;
                }
            }
            if (i2 > 1) {
                z = true;
            }
        }
        bVar.f(z);
    }

    public void a(b bVar) {
        if (!this.h.isEmpty()) {
            h peekLast = this.h.peekLast();
            bVar.a(this, peekLast.b(), peekLast.a());
        }
        this.l.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        this.o = z;
        s();
    }

    /* access modifiers changed from: package-private */
    public m d(int i2) {
        m mVar;
        o oVar;
        o oVar2 = this.d;
        if (oVar2 == null) {
            return null;
        }
        if (oVar2.k() == i2) {
            return this.d;
        }
        if (this.h.isEmpty()) {
            mVar = this.d;
        } else {
            mVar = this.h.getLast().b();
        }
        if (mVar instanceof o) {
            oVar = mVar;
        } else {
            oVar = mVar.n();
        }
        return oVar.E(i2, true);
    }

    public h e(int i2) {
        h hVar;
        Iterator<h> descendingIterator = this.h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                hVar = null;
                break;
            }
            hVar = descendingIterator.next();
            if (hVar.b().k() == i2) {
                break;
            }
        }
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException(je.q0("No destination with ID ", i2, " is on the NavController's back stack"));
    }

    public m f() {
        h hVar;
        if (this.h.isEmpty()) {
            hVar = null;
        } else {
            hVar = this.h.getLast();
        }
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public w g() {
        return this.k;
    }

    public h h() {
        Iterator<h> descendingIterator = this.h.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            h next = descendingIterator.next();
            if (!(next.b() instanceof o)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(androidx.navigation.n r9) {
        /*
            r8 = this;
            int r0 = r9.a()
            android.os.Bundle r9 = r9.b()
            java.util.Deque<androidx.navigation.h> r1 = r8.h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0013
            androidx.navigation.o r1 = r8.d
            goto L_0x001f
        L_0x0013:
            java.util.Deque<androidx.navigation.h> r1 = r8.h
            java.lang.Object r1 = r1.getLast()
            androidx.navigation.h r1 = (androidx.navigation.h) r1
            androidx.navigation.m r1 = r1.b()
        L_0x001f:
            if (r1 == 0) goto L_0x00c7
            androidx.navigation.c r2 = r1.h(r0)
            r3 = 0
            if (r2 == 0) goto L_0x003f
            androidx.navigation.s r4 = r2.c()
            int r5 = r2.b()
            android.os.Bundle r6 = r2.a()
            if (r6 == 0) goto L_0x0041
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putAll(r6)
            goto L_0x0042
        L_0x003f:
            r5 = r0
            r4 = r3
        L_0x0041:
            r7 = r3
        L_0x0042:
            if (r9 == 0) goto L_0x004e
            if (r7 != 0) goto L_0x004b
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L_0x004b:
            r7.putAll(r9)
        L_0x004e:
            if (r5 != 0) goto L_0x006b
            if (r4 == 0) goto L_0x006b
            int r9 = r4.e()
            r6 = -1
            if (r9 == r6) goto L_0x006b
            int r9 = r4.e()
            boolean r0 = r4.f()
            boolean r9 = r8.l(r9, r0)
            if (r9 == 0) goto L_0x00be
            r8.b()
            goto L_0x00be
        L_0x006b:
            if (r5 == 0) goto L_0x00bf
            androidx.navigation.m r9 = r8.d(r5)
            if (r9 != 0) goto L_0x00bb
            android.content.Context r9 = r8.a
            java.lang.String r9 = androidx.navigation.m.j(r9, r5)
            java.lang.String r3 = " cannot be found from the current destination "
            if (r2 == 0) goto L_0x009e
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Navigation destination "
            java.lang.String r5 = " referenced from action "
            java.lang.StringBuilder r9 = defpackage.je.a1(r4, r9, r5)
            android.content.Context r4 = r8.a
            java.lang.String r0 = androidx.navigation.m.j(r4, r0)
            r9.append(r0)
            r9.append(r3)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r2.<init>(r9)
            throw r2
        L_0x009e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Navigation action/destination "
            r2.append(r4)
            r2.append(r9)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x00bb:
            r8.i(r9, r7, r4, r3)
        L_0x00be:
            return
        L_0x00bf:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r9.<init>(r0)
            throw r9
        L_0x00c7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "no current navigation node"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.j(androidx.navigation.n):void");
    }

    public boolean k() {
        if (!this.h.isEmpty() && l(f().k(), true) && b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l(int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h> descendingIterator = this.h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            m b2 = descendingIterator.next().b();
            v c2 = this.k.c(b2.l());
            if (z || b2.k() != i2) {
                arrayList.add(c2);
            }
            if (b2.k() == i2) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            m.j(this.a, i2);
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((v) it.next()).e()) {
            h removeLast = this.h.removeLast();
            removeLast.h(Lifecycle.State.DESTROYED);
            j jVar = this.j;
            if (jVar != null) {
                jVar.g(removeLast.o);
            }
            z3 = true;
        }
        s();
        return z3;
    }

    public void m(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.a.getClassLoader());
            this.e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    public Bundle n() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, v<? extends m>> entry : this.k.d().entrySet()) {
            String key = entry.getKey();
            Bundle d2 = entry.getValue().d();
            if (d2 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, d2);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.h.size()];
            int i2 = 0;
            for (h hVar : this.h) {
                parcelableArr[i2] = new i(hVar);
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.g);
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x028e, code lost:
        if (r1 == false) goto L_0x0291;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(int r19, android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.o(int, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public void p(n nVar) {
        this.i = nVar;
        nVar.A().a(this.m);
    }

    /* access modifiers changed from: package-private */
    public void q(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.i != null) {
            this.n.d();
            onBackPressedDispatcher.b(this.i, this.n);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* access modifiers changed from: package-private */
    public void r(h0 h0Var) {
        if (this.h.isEmpty()) {
            this.j = j.h(h0Var);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }
}
