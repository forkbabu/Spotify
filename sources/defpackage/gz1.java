package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import java.lang.reflect.Field;

/* renamed from: gz1  reason: default package */
public final class gz1 {
    private static final Field e;
    private final Class<? extends Fragment> a;
    private final Fragment.e b;
    private final Bundle c;
    private int d;

    static {
        try {
            Field declaredField = Fragment.e.class.getDeclaredField("a");
            e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    private gz1(Class<? extends Fragment> cls, Fragment.e eVar, Bundle bundle, int i) {
        this.a = cls;
        this.b = eVar;
        this.c = bundle;
        this.d = i;
    }

    public static gz1 a(o oVar, Fragment fragment) {
        return new gz1(fragment.getClass(), oVar.H0(fragment), fragment.D2(), -1);
    }

    public static gz1 d(ClassLoader classLoader, Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(Fragment.e.class.getClassLoader());
        Fragment.e eVar = (Fragment.e) bundle.getParcelable("saved_state");
        if (eVar != null) {
            try {
                ((Bundle) e.get(eVar)).setClassLoader(classLoader);
            } catch (IllegalAccessException | IllegalArgumentException e2) {
                throw new AssertionError(e2);
            }
        }
        Class cls = (Class) bundle.getSerializable("class");
        cls.getClass();
        return new gz1(cls, eVar, (Bundle) bundle.getParcelable("arguments"), bundle.getInt("size"));
    }

    public String b() {
        return this.a.toString();
    }

    public Fragment c(o oVar) {
        ClassLoader classLoader = this.a.getClassLoader();
        if (classLoader != null) {
            Fragment a2 = oVar.a0().a(classLoader, this.a.getName());
            a2.w4(this.b);
            a2.r4(this.c);
            return a2;
        }
        throw new AssertionError(je.l0(this.a, je.V0("ClassLoader of "), " is null"));
    }

    public u3<Parcelable, Integer> e() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("class", this.a);
        bundle.putParcelable("saved_state", this.b);
        bundle.putParcelable("arguments", this.c);
        if (this.d == -1) {
            this.d = gf0.i(bundle).length;
        }
        bundle.putInt("size", this.d);
        return new u3<>(bundle, Integer.valueOf(this.d));
    }
}
