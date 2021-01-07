package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f<T> {
    private final T a;
    private final c<T> b;

    /* access modifiers changed from: private */
    public static class b implements c<Context> {
        private final Class<? extends Service> a;

        b(Class cls, a aVar) {
            this.a = cls;
        }

        public List a(Object obj) {
            Context context = (Context) obj;
            Bundle bundle = null;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                    if (serviceInfo == null) {
                        String str = this.a + " has no service info.";
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public interface c<T> {
    }

    f(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static f<Context> b(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls, null));
    }

    public List<h> a() {
        List<String> a2 = ((b) this.b).a(this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : a2) {
            try {
                Class<?> cls = Class.forName(str);
                if (!h.class.isAssignableFrom(cls)) {
                    String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar");
                } else {
                    arrayList.add((h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not an found.", str);
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str);
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str);
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str);
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str);
            }
        }
        return arrayList;
    }
}
