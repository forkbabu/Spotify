package defpackage;

import android.animation.Animator;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bvd  reason: default package */
public class bvd implements cvd {
    private static final int[] e = {16842919};
    private static final int[] f = new int[0];
    private final float a;
    private final View b;
    private final List<View> c = new ArrayList();
    private final List<View> d = new ArrayList();

    public bvd(View view, float f2) {
        this.b = view;
        this.a = f2;
    }

    public void a() {
        boolean z = true;
        if (this.b instanceof zud) {
            Iterator<View> it = this.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(it.next() instanceof zud)) {
                        break;
                    }
                } else {
                    Iterator<View> it2 = this.d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!(it2.next() instanceof zud)) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
            }
        }
        if (z) {
            Logger.n("Can't apply press state animations to views that don't implement StateListAnimatorCompatSupport", new Object[0]);
            return;
        }
        Animator a2 = uud.a(new evd(this));
        Animator a3 = uud.a(new avd(this));
        View view = this.b;
        if (view instanceof zud) {
            l lVar = new l();
            lVar.d(e, a3);
            lVar.d(f, a2);
            ((zud) view).setStateListAnimatorCompat(lVar);
            return;
        }
        StringBuilder V0 = je.V0("PressableMotionSpec requires the target view to implement StateListAnimatorCompatSupport; Class: ");
        V0.append(view.getClass().getSimpleName());
        throw new IllegalArgumentException(V0.toString());
    }

    public float b() {
        return this.a;
    }

    public List<View> c() {
        return this.d;
    }

    public View d() {
        return this.b;
    }

    public List<View> e() {
        return this.c;
    }

    public bvd f(View... viewArr) {
        Collections.addAll(this.d, viewArr);
        return this;
    }

    public bvd g(View... viewArr) {
        Collections.addAll(this.c, viewArr);
        return this;
    }
}
