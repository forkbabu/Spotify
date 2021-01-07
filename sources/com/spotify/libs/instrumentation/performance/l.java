package com.spotify.libs.instrumentation.performance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import java.util.LinkedHashSet;

/* access modifiers changed from: package-private */
public class l {
    private final Context a;
    private final b b;
    private final LinkedHashSet<String> c = new LinkedHashSet<>(20);
    private final LinkedHashSet<String> d = new LinkedHashSet<>(20);
    private boolean e = true;
    private int f;
    private final BroadcastReceiver g = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("event");
            String stringExtra2 = intent.getStringExtra("uri");
            if (stringExtra != null && stringExtra2 != null) {
                char c = 65535;
                switch (stringExtra.hashCode()) {
                    case -1670636944:
                        if (stringExtra.equals("uri_failed")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1060732754:
                        if (stringExtra.equals("uri_started")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -477459058:
                        if (stringExtra.equals("uri_timeout")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1617603406:
                        if (stringExtra.equals("uri_succeeded")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 3:
                        l.b(l.this, stringExtra2);
                        return;
                    case 1:
                        l.a(l.this, stringExtra2);
                        return;
                    case 2:
                        if (l.this.c.contains(stringExtra2)) {
                            l.d(l.this);
                            Logger.b("timeout: %s %b %d", stringExtra2, Boolean.valueOf(l.this.e), Integer.valueOf(l.this.c.size()));
                            l.b(l.this, stringExtra2);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public interface b {
    }

    public l(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    static void a(l lVar, String str) {
        if (lVar.e) {
            if (lVar.d.isEmpty()) {
                ViewLoadingTracker.a(ViewLoadingTracker.this, ViewLoadingTracker.Step.IMAGE_LOADING_STARTED);
            }
            lVar.c.add(str);
            lVar.d.add(str);
        }
    }

    static void b(l lVar, String str) {
        if (lVar.c.remove(str) && !lVar.f()) {
            ((ViewLoadingTracker.a) lVar.b).a(lVar.d.size(), lVar.f);
            e6.b(lVar.a).e(lVar.g);
        }
    }

    static /* synthetic */ int d(l lVar) {
        int i = lVar.f;
        lVar.f = i + 1;
        return i;
    }

    public boolean f() {
        return this.e || !this.c.isEmpty();
    }

    public void g() {
        this.d.clear();
        this.c.clear();
        this.e = true;
        e6.b(this.a).c(this.g, new IntentFilter("image-load-event"));
    }

    public void h() {
        if (this.e) {
            this.e = false;
            if (this.c.isEmpty()) {
                if (!this.d.isEmpty()) {
                    ((ViewLoadingTracker.a) this.b).a(this.d.size(), this.f);
                }
                e6.b(this.a).e(this.g);
            }
        }
    }
}
