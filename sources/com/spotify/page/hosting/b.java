package com.spotify.page.hosting;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.h;

public final class b extends k {
    private final a b;

    public b(a aVar) {
        h.e(aVar, "hostingFactory");
        this.b = aVar;
    }

    @Override // androidx.fragment.app.k
    public Fragment a(ClassLoader classLoader, String str) {
        h.e(classLoader, "classLoader");
        h.e(str, "className");
        if (h.a(k.d(classLoader, str), PageHostingFragment.class)) {
            return this.b.b();
        }
        try {
            Fragment fragment = (Fragment) k.d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
            h.d(fragment, "super.instantiate(classLoader, className)");
            return fragment;
        } catch (InstantiationException e) {
            throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
