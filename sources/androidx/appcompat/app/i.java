package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class i {
    private static final o1<WeakReference<i>> a = new o1<>();
    private static final Object b = new Object();
    public static final /* synthetic */ int c = 0;

    i() {
    }

    static void c(i iVar) {
        synchronized (b) {
            u(iVar);
            a.add(new WeakReference<>(iVar));
        }
    }

    static void t(i iVar) {
        synchronized (b) {
            u(iVar);
        }
    }

    private static void u(i iVar) {
        synchronized (b) {
            Iterator<WeakReference<i>> it = a.iterator();
            while (it.hasNext()) {
                i iVar2 = it.next().get();
                if (iVar2 == iVar || iVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public Context e(Context context) {
        return context;
    }

    public abstract <T extends View> T f(int i);

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract ActionBar i();

    public abstract void j();

    public abstract void k();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract boolean v(int i);

    public abstract void w(int i);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);

    public void z(int i) {
    }
}
