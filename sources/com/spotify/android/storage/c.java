package com.spotify.android.storage;

import com.spotify.android.storage.MovingOrchestrator;
import java.io.IOException;
import java.lang.Thread;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.commons.io.b;

public class c implements MovingOrchestrator {
    private g a;
    private g b;
    private MovingOrchestrator.State c;
    private a d;
    private Thread.UncaughtExceptionHandler e;
    private final Set<MovingOrchestrator.a> f = new CopyOnWriteArraySet();

    static boolean i(g gVar) {
        return "cancelled".equals(gVar.d("moving-state"));
    }

    private boolean k(f fVar) {
        j(MovingOrchestrator.State.SYNCING);
        g gVar = this.a;
        String absolutePath = this.b.c().getAbsolutePath();
        gVar.e("moving-state", "sending");
        gVar.e("destination", absolutePath);
        gVar.b();
        g gVar2 = this.b;
        String absolutePath2 = this.a.c().getAbsolutePath();
        gVar2.e("moving-state", "receiving");
        gVar2.e("source", absolutePath2);
        gVar2.b();
        this.e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new b(this));
        a aVar = new a(this.a.c(), this.b.c(), fVar);
        this.d = aVar;
        boolean b2 = aVar.b();
        if (i(this.a)) {
            j(MovingOrchestrator.State.CANCELLED);
        } else {
            g gVar3 = this.a;
            String absolutePath3 = this.b.c().getAbsolutePath();
            gVar3.e("moving-state", "sent");
            gVar3.e("destination", absolutePath3);
            gVar3.b();
            g gVar4 = this.b;
            String absolutePath4 = this.a.c().getAbsolutePath();
            gVar4.e("moving-state", "received");
            gVar4.e("source", absolutePath4);
            gVar4.b();
            j(MovingOrchestrator.State.SYNCED);
        }
        Thread.setDefaultUncaughtExceptionHandler(this.e);
        return b2;
    }

    @Override // com.spotify.android.storage.MovingOrchestrator
    public String a() {
        MovingOrchestrator.State state = MovingOrchestrator.State.IDLE;
        if (this.b == null || this.c == state) {
            throw new IllegalStateException("Could not finalize move");
        }
        try {
            k(f.a);
            if (!i(this.a)) {
                j(MovingOrchestrator.State.PRUNING);
                try {
                    b.f(this.a.c());
                    this.b.a();
                } catch (IOException unused) {
                    throw new SyncError("Unable to delete old cache folder: " + this.a.c().getAbsolutePath());
                }
            }
        } catch (SyncError unused2) {
        }
        j(state);
        g gVar = new g(this.b.c());
        this.a = gVar;
        return gVar.c().getAbsolutePath();
    }

    @Override // com.spotify.android.storage.MovingOrchestrator
    public void b(String str) {
        MovingOrchestrator.State state = MovingOrchestrator.State.SYNCED;
        this.a = new g(str);
        j(MovingOrchestrator.State.IDLE);
        if ("sending".equals(this.a.d("moving-state"))) {
            j(MovingOrchestrator.State.SYNCING);
            String d2 = this.a.d("destination");
            d2.getClass();
            this.b = new g(d2);
        } else if ("sent".equals(this.a.d("moving-state"))) {
            j(state);
            String d3 = this.a.d("destination");
            d3.getClass();
            this.b = new g(d3);
        } else if ("received".equals(this.a.d("moving-state"))) {
            j(state);
            g gVar = this.a;
            this.b = gVar;
            String d4 = gVar.d("source");
            d4.getClass();
            this.a = new g(d4);
        } else if (i(this.a)) {
            j(MovingOrchestrator.State.CANCELLED);
            this.b = this.a;
        }
    }

    @Override // com.spotify.android.storage.MovingOrchestrator
    public void c() {
        MovingOrchestrator.State state = MovingOrchestrator.State.IDLE;
        try {
            g gVar = this.b;
            if (gVar != null) {
                b.f(gVar.c());
            }
            this.a.a();
            j(state);
        } catch (IOException e2) {
            throw new SyncError("Unable to revert change: " + e2.getMessage());
        } catch (Throwable th) {
            j(state);
            throw th;
        }
    }

    @Override // com.spotify.android.storage.MovingOrchestrator
    public void d(MovingOrchestrator.a aVar) {
        this.f.add(aVar);
    }

    @Override // com.spotify.android.storage.MovingOrchestrator
    public MovingOrchestrator.SyncingResult e(String str, f fVar) {
        MovingOrchestrator.SyncingResult syncingResult = MovingOrchestrator.SyncingResult.AN_ERROR_WHILE_SYNCING;
        this.b = new g(str);
        try {
            boolean k = k(fVar);
            if (i(this.a)) {
                return syncingResult;
            }
            return k ? MovingOrchestrator.SyncingResult.SOMETHING_SYNCED : MovingOrchestrator.SyncingResult.EVERYTHING_IN_SYNC;
        } catch (SyncError e2) {
            for (MovingOrchestrator.a aVar : this.f) {
                aVar.b(e2);
            }
            return syncingResult;
        }
    }

    @Override // com.spotify.android.storage.MovingOrchestrator
    public MovingOrchestrator.State getState() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void j(MovingOrchestrator.State state) {
        this.c = state;
        for (MovingOrchestrator.a aVar : this.f) {
            aVar.a(state);
        }
    }
}
