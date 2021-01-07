package defpackage;

import com.facebook.internal.f0;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.k;
import com.facebook.m;
import com.facebook.q;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: tf  reason: default package */
public class tf implements Thread.UncaughtExceptionHandler {
    private static final String b = tf.class.getCanonicalName();
    private static tf c;
    private final Thread.UncaughtExceptionHandler a;

    /* access modifiers changed from: package-private */
    /* renamed from: tf$a */
    public static class a implements Comparator<InstrumentData> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(InstrumentData instrumentData, InstrumentData instrumentData2) {
            return instrumentData.b(instrumentData2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tf$b */
    public static class b implements m.c {
        final /* synthetic */ ArrayList a;

        b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            try {
                if (qVar.e() == null && qVar.f().getBoolean("success")) {
                    for (int i = 0; this.a.size() > i; i++) {
                        ((InstrumentData) this.a.get(i)).a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private tf(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public static synchronized void a() {
        synchronized (tf.class) {
            if (k.g()) {
                b();
            }
            if (c == null) {
                tf tfVar = new tf(Thread.getDefaultUncaughtExceptionHandler());
                c = tfVar;
                Thread.setDefaultUncaughtExceptionHandler(tfVar);
            }
        }
    }

    private static void b() {
        if (!f0.A()) {
            File[] d = InstrumentData.b.d();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File file : d) {
                InstrumentData e = InstrumentData.b.e(file);
                if (e.c()) {
                    arrayList.add(e);
                }
            }
            Collections.sort(arrayList, new a());
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 5) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            InstrumentData.b.g("crash_reports", jSONArray, new b(arrayList));
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        boolean z = false;
        if (th != null) {
            Throwable th2 = null;
            Throwable th3 = th;
            loop0:
            while (true) {
                if (th3 == null || th3 == th2) {
                    break;
                }
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    if (stackTraceElement.getClassName().startsWith("com.facebook")) {
                        z = true;
                        break loop0;
                    }
                }
                th2 = th3;
                th3 = th3.getCause();
            }
        }
        if (z) {
            com.facebook.internal.instrument.b.b(th);
            InstrumentData.b.a(th, InstrumentData.Type.CrashReport).d();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
