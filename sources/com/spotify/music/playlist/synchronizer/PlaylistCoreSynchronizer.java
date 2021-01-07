package com.spotify.music.playlist.synchronizer;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.playlist.endpoints.i;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class PlaylistCoreSynchronizer implements d, m {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Set<String> b = new HashSet(23, 0.75f);
    private final Set<String> c = new HashSet(101, 0.75f);
    private boolean f;
    private final Object n = new Object();
    private final q o = new q();
    private final a p = new a(this);
    private final i q;
    private final y r;
    private final long s = ((long) 200);

    public PlaylistCoreSynchronizer(i iVar, y yVar, n nVar) {
        h.e(iVar, "playlistOperation");
        h.e(yVar, "scheduler");
        h.e(nVar, "lifecycleOwner");
        h.e(nVar, "lifecycleOwner");
        h.e(iVar, "playlistOperation");
        h.e(yVar, "scheduler");
        this.q = iVar;
        this.r = yVar;
        nVar.A().a(this);
    }

    public static final void c(PlaylistCoreSynchronizer playlistCoreSynchronizer, String str) {
        synchronized (playlistCoreSynchronizer) {
            playlistCoreSynchronizer.b.add(str);
        }
    }

    public static final String h(PlaylistCoreSynchronizer playlistCoreSynchronizer) {
        String next;
        synchronized (playlistCoreSynchronizer) {
            Iterator<String> it = playlistCoreSynchronizer.c.iterator();
            next = it.hasNext() ? it.next() : null;
        }
        return next;
    }

    public static final void k(PlaylistCoreSynchronizer playlistCoreSynchronizer, String str) {
        synchronized (playlistCoreSynchronizer) {
            playlistCoreSynchronizer.b.remove(str);
        }
    }

    @Override // com.spotify.music.playlist.synchronizer.d
    public void a(String str) {
        boolean contains;
        boolean add;
        h.e(str, "playlistUri");
        synchronized (this) {
            contains = this.b.contains(str);
        }
        if (!contains) {
            synchronized (this) {
                add = this.c.add(str);
            }
            if (add) {
                synchronized (this.n) {
                    if (!this.f) {
                        this.f = true;
                        this.a.post(this.p);
                    }
                }
            }
        }
    }

    @Override // com.spotify.music.playlist.synchronizer.d
    public synchronized void b(String str) {
        h.e(str, "playlistUri");
        this.c.remove(str);
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        synchronized (this) {
            this.c.clear();
        }
        synchronized (this.n) {
            this.f = false;
            this.a.removeCallbacks(this.p);
            this.o.c();
        }
    }
}
