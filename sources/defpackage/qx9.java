package defpackage;

import android.content.Context;
import com.google.common.collect.UnmodifiableIterator;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.json.g;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.Collections;
import java.util.Map;

/* renamed from: qx9  reason: default package */
public class qx9 {
    private final Context a;
    private final zw9 b;
    private final nx9 c;
    private final g d;
    private final boolean e;
    private Thread.UncaughtExceptionHandler f;

    public qx9(Context context, zw9 zw9, nx9 nx9, g gVar, boolean z) {
        this.a = context;
        this.b = zw9;
        this.c = nx9;
        this.d = gVar;
        this.e = z;
    }

    public /* synthetic */ void a(Thread thread, Throwable th) {
        this.c.a();
        this.f.uncaughtException(thread, th);
    }

    public void b() {
        Map map;
        this.f = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new mw9(this));
        if (this.e) {
            File file = new File(this.a.getExternalFilesDir(null), "crashlytics.json");
            FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
            if (file.exists()) {
                Logger.g("Initializing crashlytics extras from '%s'", file.getAbsolutePath());
                try {
                    map = (Map) this.d.a().readValue(file, new px9(this));
                } catch (IOException e2) {
                    Logger.n("Unable to read json file: '%s', error message: '%s'", file.getAbsolutePath(), e2.getMessage());
                    map = Collections.emptyMap();
                }
                for (Map.Entry entry : map.entrySet()) {
                    Logger.g("Extra crashlytics key: '%s' -> '%s'", entry.getKey(), entry.getValue());
                    instance.setCustomKey((String) entry.getKey(), (String) entry.getValue());
                }
            } else {
                Logger.g("Crashlytics extras file '%s' does not exist", file.getAbsolutePath());
            }
        }
        FirebaseCrashlytics instance2 = FirebaseCrashlytics.getInstance();
        UnmodifiableIterator<Map.Entry<String, String>> it = this.b.a().a().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            if (vw9.b.contains(next.getKey())) {
                instance2.setCustomKey(next.getKey(), next.getValue());
            }
        }
    }
}
