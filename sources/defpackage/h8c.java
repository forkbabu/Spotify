package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.offline.OfflineError;

/* renamed from: h8c  reason: default package */
public class h8c implements i8c {
    private final g8c a;
    private final f8c b;
    private e8c c;
    private boolean d;
    private boolean e;

    public h8c(g8c g8c, f8c f8c) {
        this.a = g8c;
        this.b = f8c;
    }

    @Override // defpackage.m8c.a
    public void a(OfflineError offlineError) {
        if (this.c == null) {
            Logger.d("Wrong initialization detected. onOfflineSyncError cannot be called before the onModelChanged. Please check the code.", new Object[0]);
        } else if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
            if (this.e) {
                this.e = false;
                this.b.b(false);
            }
            this.a.b(this.c.a());
        }
    }

    public void b(boolean z) {
        if (!z) {
            this.b.a(z);
            return;
        }
        e8c e8c = this.c;
        if (e8c == null) {
            Logger.d("Wrong initialization detected. onDownloadRequest cannot be called before the onModelChanged. Please check the code.", new Object[0]);
        } else if (e8c.b()) {
            this.b.b(true);
            this.d = true;
            this.e = true;
        } else {
            this.b.a(z);
        }
    }

    public void c(e8c e8c) {
        this.c = e8c;
        if (!this.d) {
            this.a.b(e8c.a());
        }
        if (this.d && !this.c.b()) {
            this.d = false;
            this.b.a(true);
        }
    }
}
