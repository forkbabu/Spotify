package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.StateSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: l  reason: default package */
public final class l implements Cloneable {
    private ArrayList<a> a = new ArrayList<>();
    private a b;
    private Animator c;
    private WeakReference<View> f;
    private AnimatorListenerAdapter n = new k(this);

    /* access modifiers changed from: private */
    /* renamed from: l$a */
    public static class a {
        final int[] a;
        final Animator b;

        a(int[] iArr, Animator animator, k kVar) {
            this.a = iArr;
            this.b = animator;
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            l lVar = (l) super.clone();
            lVar.a = new ArrayList<>(this.a.size());
            lVar.b = null;
            lVar.c = null;
            lVar.f = null;
            lVar.n = null;
            lVar.n = new k(lVar);
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                a aVar = this.a.get(i);
                Animator clone = aVar.b.clone();
                clone.removeListener(this.n);
                lVar.d(aVar.a, clone);
            }
            return lVar;
        } catch (CloneNotSupportedException e) {
            AssertionError assertionError = new AssertionError("cannot clone state list animator");
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public void d(int[] iArr, Animator animator) {
        a aVar = new a(iArr, animator, null);
        animator.addListener(this.n);
        this.a.add(aVar);
    }

    public Animator e() {
        return this.c;
    }

    public void f() {
        Animator animator = this.c;
        if (animator != null) {
            animator.end();
        }
    }

    public void g(int[] iArr) {
        View view;
        a aVar;
        Animator animator;
        int size = this.a.size();
        int i = 0;
        while (true) {
            view = null;
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.a.get(i);
            if (StateSet.stateSetMatches(aVar.a, iArr)) {
                break;
            }
            i++;
        }
        a aVar2 = this.b;
        if (aVar != aVar2) {
            if (!(aVar2 == null || (animator = this.c) == null)) {
                animator.cancel();
                this.c = null;
            }
            this.b = aVar;
            if (aVar != null) {
                Animator animator2 = aVar.b;
                WeakReference<View> weakReference = this.f;
                if (weakReference != null) {
                    view = weakReference.get();
                }
                animator2.setTarget(view);
                Animator animator3 = aVar.b;
                this.c = animator3;
                animator3.start();
            }
        }
    }

    public void j(View view) {
        WeakReference<View> weakReference = this.f;
        View view2 = weakReference == null ? null : weakReference.get();
        if (view2 != view) {
            if (view2 != null) {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    this.a.get(i).b.setTarget(null);
                }
                this.f = null;
                this.b = null;
                this.c = null;
            }
            if (view != null) {
                this.f = new WeakReference<>(view);
            }
        }
    }
}
