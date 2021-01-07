package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.p;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;

public class b implements HeartBeatInfo {
    private c a;

    private b(Context context) {
        this.a = c.a(context);
    }

    public static d<HeartBeatInfo> b() {
        d.b a2 = d.a(HeartBeatInfo.class);
        a2.b(p.f(Context.class));
        a2.f(a.b());
        return a2.d();
    }

    static /* synthetic */ HeartBeatInfo c(e eVar) {
        return new b((Context) eVar.get(Context.class));
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public HeartBeatInfo.HeartBeat a(String str) {
        boolean b;
        long currentTimeMillis = System.currentTimeMillis();
        boolean b2 = this.a.b(str, currentTimeMillis);
        c cVar = this.a;
        synchronized (cVar) {
            b = cVar.b("fire-global", currentTimeMillis);
        }
        if (b2 && b) {
            return HeartBeatInfo.HeartBeat.COMBINED;
        }
        if (b) {
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        if (b2) {
            return HeartBeatInfo.HeartBeat.SDK;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }
}
