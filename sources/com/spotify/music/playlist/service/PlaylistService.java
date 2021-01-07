package com.spotify.music.playlist.service;

import android.app.IntentService;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import io.reactivex.e;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlaylistService extends IntentService {
    public static final a c = new a(null);
    public v a;
    public i b;

    public static final class a {
        public a(f fVar) {
        }
    }

    static final class b<V> implements Callable<e> {
        final /* synthetic */ PlaylistService a;
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;

        b(PlaylistService playlistService, boolean z, String str) {
            this.a = playlistService;
            this.b = z;
            this.c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public e call() {
            if (!this.b) {
                return io.reactivex.internal.operators.completable.b.a;
            }
            v vVar = this.a.a;
            if (vVar != null) {
                return vVar.b(this.c, false);
            }
            h.k("rootlistOperation");
            throw null;
        }
    }

    public PlaylistService() {
        super("PlaylistService");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        dagger.android.a.b(this);
        super.onCreate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2 A[Catch:{ TimeoutException -> 0x00f4, RuntimeException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3 A[Catch:{ TimeoutException -> 0x00f4, RuntimeException -> 0x00e9 }] */
    @Override // android.app.IntentService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r11) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.playlist.service.PlaylistService.onHandleIntent(android.content.Intent):void");
    }
}
