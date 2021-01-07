package com.spotify.music.storage;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Process;
import androidx.core.app.j;
import androidx.core.app.k;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import dagger.android.f;
import java.io.File;

public class CacheMovingIntentService extends f {
    public static final /* synthetic */ int n = 0;
    MovingOrchestrator a;
    j b;
    o c;
    l2e f;

    private static class a implements com.spotify.android.storage.f {
        private final k b;
        private final long c;
        private final NotificationManager d;
        private long e;
        private int f;
        private boolean g;

        public a(k kVar, long j, NotificationManager notificationManager) {
            this.b = kVar;
            this.c = j;
            this.d = notificationManager;
        }

        @Override // com.spotify.android.storage.f
        public void a(File file) {
            long length = this.e + ((long) ((int) file.length()));
            this.e = length;
            int i = (int) ((length * 100) / this.c);
            if (!this.g && i > this.f) {
                this.b.x(100, i, false);
                this.d.notify(C0707R.id.notification_cache_move, this.b.a());
                this.f = i;
            }
        }

        public void b() {
            this.g = true;
        }
    }

    public CacheMovingIntentService() {
        super("CacheMovingIntentService.CACHE_MOVING_INTENT_SERVICE");
    }

    private void a() {
        String string = getString(C0707R.string.cache_migration_failed_subtitle);
        k kVar = new k(this, "spotify_updates_channel");
        kVar.j(getString(C0707R.string.cache_migration_failed));
        kVar.i(string);
        kVar.D(getString(C0707R.string.cache_migration_failed));
        j jVar = new j();
        jVar.j(string);
        kVar.B(jVar);
        kVar.z(C0707R.drawable.icn_notification);
        kVar.y(false);
        this.f.f(42, kVar.a(), false);
        this.a.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        MovingOrchestrator.SyncingResult e;
        if ("move".equals(intent.getAction())) {
            File file = new File(intent.getStringExtra("volume"), this.b.d());
            if (file.exists() || file.mkdirs()) {
                String string = getString(C0707R.string.cache_migration_notification_text);
                k kVar = new k(this, "spotify_updates_channel");
                kVar.j(getString(C0707R.string.cache_migration_notification_title));
                kVar.i(string);
                kVar.D(getString(C0707R.string.cache_migration_notification_title));
                j jVar = new j();
                jVar.j(string);
                kVar.B(jVar);
                kVar.z(C0707R.drawable.icn_notification);
                kVar.y(false);
                kVar.x(100, 0, false);
                this.f.f(C0707R.id.notification_cache_move, kVar.a(), true);
                int i = 50;
                a aVar = new a(kVar, intent.getLongExtra("estimated-size", 0), (NotificationManager) getSystemService("notification"));
                do {
                    e = this.a.e(file.getAbsolutePath(), aVar);
                    if (e != MovingOrchestrator.SyncingResult.SOMETHING_SYNCED) {
                        break;
                    }
                    aVar.b();
                    i--;
                } while (i > 0);
                this.f.b(C0707R.id.notification_cache_move);
                stopForeground(true);
                if (e == MovingOrchestrator.SyncingResult.AN_ERROR_WHILE_SYNCING) {
                    a();
                    return;
                }
                Intent a2 = this.c.a(this);
                a2.addFlags(268468224);
                a2.addCategory("android.intent.category.DEFAULT");
                startActivity(a2);
                Process.killProcess(Process.myPid());
                return;
            }
            a();
            return;
        }
        Assertion.n();
    }
}
