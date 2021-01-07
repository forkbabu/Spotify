package com.spotify.libs.search.history;

import android.content.Context;
import android.os.Looper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class q implements p {
    private final ObjectMapper a;
    private final File b;
    private final String c;
    private final o<SearchHistoryItem> d;
    private ExecutorService e = Executors.newSingleThreadExecutor();
    private boolean f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.f(q.this);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.g(q.this);
        }
    }

    public q(Context context, String str, String str2, g gVar, int i) {
        this.d = new f(i);
        this.c = str;
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.a = b2.build();
        context.getClass();
        this.b = new File(context.getFilesDir(), String.format(Locale.US, "%s/history-%d-%s", "search", Integer.valueOf(str.hashCode()), str2));
    }

    static void f(q qVar) {
        qVar.getClass();
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                qVar.a.writeValue(qVar.h(), SearchHistory.create(((f) qVar.d).e()));
            } catch (IOException e2) {
                Logger.e(e2, "Failed saving search history file.", new Object[0]);
            }
        } else {
            throw new IllegalStateException("Called on main looper");
        }
    }

    static void g(q qVar) {
        SearchHistory searchHistory;
        synchronized (qVar) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IllegalStateException("Called on main looper");
            } else if (!qVar.f) {
                try {
                    ((f) qVar.d).c();
                    File h = qVar.h();
                    if (h.exists() && (searchHistory = (SearchHistory) qVar.a.readValue(h, SearchHistory.class)) != null) {
                        ((f) qVar.d).b(searchHistory.getItems());
                    }
                    qVar.f = true;
                } catch (IOException e2) {
                    Logger.e(e2, "Failed saving search history file.", new Object[0]);
                }
            }
        }
    }

    private File h() {
        if (this.b.exists()) {
            if (!this.b.isDirectory() && !new File(this.b.getCanonicalPath()).isDirectory()) {
                Assertion.p("history storage is not a directory!");
            }
        } else if (!this.b.mkdirs()) {
            Assertion.p("could not create history storage folder");
        }
        if (this.b.isDirectory()) {
            return new File(this.b, "new-history");
        }
        throw new IOException("Features storage is not a directory!");
    }

    @Override // com.spotify.libs.search.history.p
    public synchronized void a() {
        if (!this.f) {
            this.e.execute(new b());
        }
    }

    @Override // com.spotify.libs.search.history.p
    public io.reactivex.g<List<SearchHistoryItem>> b() {
        a();
        return ((f) this.d).d();
    }

    @Override // com.spotify.libs.search.history.p
    public o<SearchHistoryItem> c() {
        return this.d;
    }

    @Override // com.spotify.libs.search.history.p
    public boolean d() {
        return this.f;
    }

    @Override // com.spotify.libs.search.history.p
    public void e() {
        this.e.execute(new a());
    }
}
