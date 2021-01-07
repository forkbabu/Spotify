package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.g;

public abstract class RemoteCreator<T> {
    private final String a;
    private T b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(@RecentlyNonNull String str) {
            super(str);
        }

        public RemoteCreatorException(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(@RecentlyNonNull String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public abstract T a(@RecentlyNonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final T b(@RecentlyNonNull Context context) {
        Context context2;
        if (this.b == null) {
            if (context != null) {
                int i = g.e;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                if (context2 != null) {
                    try {
                        this.b = a((IBinder) context2.getClassLoader().loadClass(this.a).newInstance());
                    } catch (ClassNotFoundException e) {
                        throw new RemoteCreatorException("Could not load creator class.", e);
                    } catch (InstantiationException e2) {
                        throw new RemoteCreatorException("Could not instantiate creator.", e2);
                    } catch (IllegalAccessException e3) {
                        throw new RemoteCreatorException("Could not access creator.", e3);
                    }
                } else {
                    throw new RemoteCreatorException("Could not get remote context.");
                }
            } else {
                throw new NullPointerException("null reference");
            }
        }
        return this.b;
    }
}
