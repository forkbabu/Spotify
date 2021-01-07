package io.reactivex.android.schedulers;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.y;

public final class a {
    private static final y a;

    /* renamed from: io.reactivex.android.schedulers.a$a  reason: collision with other inner class name */
    private static final class C0609a {
        static final y a = new b(new Handler(Looper.getMainLooper()), false);
    }

    static {
        try {
            y yVar = C0609a.a;
            if (yVar != null) {
                a = yVar;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    public static y a(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        return new b(new Handler(looper), false);
    }

    public static y b() {
        y yVar = a;
        if (yVar != null) {
            return yVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
