package com.spotify.playlist.models.offline;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

public final class b {
    public static final a a(String str, int i) {
        a.f fVar = a.f.a;
        if (str == null) {
            return fVar;
        }
        switch (str.hashCode()) {
            case -1309235419:
                return str.equals("expired") ? a.e.a : fVar;
            case -1211129254:
                if (str.equals("downloading")) {
                    return new a.b(i);
                }
                return fVar;
            case -934422706:
                if (str.equals("resync")) {
                    return a.g.a;
                }
                return fVar;
            case 3521:
                str.equals("no");
                return fVar;
            case 119527:
                if (str.equals("yes")) {
                    return a.C0377a.a;
                }
                return fVar;
            case 96784904:
                if (str.equals(AppProtocol.LogMessage.SEVERITY_ERROR)) {
                    return a.c.a;
                }
                return fVar;
            case 111293437:
                if (str.equals("waitingSyncNotAllowed")) {
                    return b(i, WaitingReason.SYNC_NOT_ALLOWED);
                }
                return fVar;
            case 119284121:
                if (str.equals("waitingOfflineMode")) {
                    return b(i, WaitingReason.OFFLINE_MODE);
                }
                return fVar;
            case 1116313165:
                if (str.equals("waiting")) {
                    return b(i, WaitingReason.IN_QUEUE);
                }
                return fVar;
            case 1881262700:
                if (str.equals("waitingNoConnection")) {
                    return b(i, WaitingReason.NO_CONNECTION);
                }
                return fVar;
            case 1987113811:
                if (str.equals("exceeded")) {
                    return a.d.a;
                }
                return fVar;
            default:
                return fVar;
        }
    }

    private static final a b(int i, WaitingReason waitingReason) {
        if (i == 100) {
            return a.C0377a.a;
        }
        h.e(waitingReason, "waitingReason");
        return new a.h(waitingReason, i);
    }
}
