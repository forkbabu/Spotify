package androidx.work;

import android.content.Context;

public abstract class s {
    private static final String a = j.f("WorkerFactory");
    public static final /* synthetic */ int b = 0;

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            j.c().b(a, je.x0("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                j.c().b(a, je.x0("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.j()) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
