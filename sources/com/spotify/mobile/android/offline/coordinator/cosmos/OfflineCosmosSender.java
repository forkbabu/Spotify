package com.spotify.mobile.android.offline.coordinator.cosmos;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$DownloadResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$IdentifyResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$RemoveResponse;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$StopDownloadResponse;
import com.spotify.mobile.android.video.offline.exception.BetamaxDownloadException;
import com.spotify.mobile.android.video.offline.exception.ErrorType;
import com.spotify.rxjava2.q;
import java.util.List;

public class OfflineCosmosSender {
    private final f a;
    private final q b = new q();

    public static class StateResponse {
        public final String a;
        public final State b;
        public final long c;

        public enum State {
            NOT_DOWNLOADED(OfflinePlugin$IdentifyResponse.Result.Status.MISSING),
            DOWNLOADED(OfflinePlugin$IdentifyResponse.Result.Status.COMPLETE),
            INVALID(OfflinePlugin$IdentifyResponse.Result.Status.NOT_APPLICABLE);
            
            private final OfflinePlugin$IdentifyResponse.Result.Status mStatus;

            private State(OfflinePlugin$IdentifyResponse.Result.Status status) {
                this.mStatus = status;
            }

            public OfflinePlugin$IdentifyResponse.Result.Status d() {
                return this.mStatus;
            }
        }

        public StateResponse(String str, State state, long j) {
            this.a = str;
            this.b = state;
            this.c = j;
        }
    }

    public OfflineCosmosSender(f fVar) {
        this.a = fVar;
    }

    private static OfflinePlugin$PluginResponse a() {
        OfflinePlugin$PluginResponse.a o = OfflinePlugin$PluginResponse.o();
        o.n("betamax-offline");
        return (OfflinePlugin$PluginResponse) o.build();
    }

    private void e(OfflinePlugin$PluginResponse offlinePlugin$PluginResponse) {
        this.b.a(this.a.b(offlinePlugin$PluginResponse).subscribe());
    }

    public void b() {
        this.b.c();
    }

    public void c(String str, long j, long j2, boolean z, Throwable th) {
        OfflinePlugin$DownloadResponse.Error error;
        OfflinePlugin$DownloadResponse.a o = OfflinePlugin$DownloadResponse.o();
        o.q(str);
        o.n(z);
        o.p(j);
        o.m(j2);
        if (th == null) {
            error = OfflinePlugin$DownloadResponse.Error.OK;
        } else {
            boolean z2 = true;
            if (!(th instanceof SQLiteDiskIOException) && !(th instanceof SQLiteFullException) && (!(th instanceof BetamaxDownloadException) || ((BetamaxDownloadException) th).a() != ErrorType.ERROR_DISK_FULL)) {
                z2 = false;
            }
            if (z2) {
                error = OfflinePlugin$DownloadResponse.Error.DISK_FULL;
            } else {
                error = OfflinePlugin$DownloadResponse.Error.PERMANENT_ERROR;
            }
        }
        o.o(error);
        OfflinePlugin$PluginResponse.a aVar = (OfflinePlugin$PluginResponse.a) a().toBuilder();
        aVar.m((OfflinePlugin$DownloadResponse) o.build());
        e((OfflinePlugin$PluginResponse) aVar.build());
    }

    public void d() {
        OfflinePlugin$PluginResponse.a aVar = (OfflinePlugin$PluginResponse.a) a().toBuilder();
        aVar.p((OfflinePlugin$RemoveResponse) OfflinePlugin$RemoveResponse.h().build());
        e((OfflinePlugin$PluginResponse) aVar.build());
    }

    public void f(List<StateResponse> list) {
        OfflinePlugin$IdentifyResponse.a i = OfflinePlugin$IdentifyResponse.i();
        for (StateResponse stateResponse : list) {
            OfflinePlugin$IdentifyResponse.Result.Status d = stateResponse.b.d();
            long j = stateResponse.c;
            OfflinePlugin$IdentifyResponse.Result.a m = OfflinePlugin$IdentifyResponse.Result.m();
            m.n(d);
            m.m(j);
            i.m(stateResponse.a, (OfflinePlugin$IdentifyResponse.Result) m.build());
        }
        OfflinePlugin$PluginResponse.a aVar = (OfflinePlugin$PluginResponse.a) a().toBuilder();
        aVar.o((OfflinePlugin$IdentifyResponse) i.build());
        e((OfflinePlugin$PluginResponse) aVar.build());
    }

    public void g() {
        OfflinePlugin$PluginResponse.a aVar = (OfflinePlugin$PluginResponse.a) a().toBuilder();
        aVar.q((OfflinePlugin$StopDownloadResponse) OfflinePlugin$StopDownloadResponse.h().build());
        e((OfflinePlugin$PluginResponse) aVar.build());
    }
}
