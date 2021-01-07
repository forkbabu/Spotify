package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements h {
    static /* synthetic */ g lambda$getComponents$0(e eVar) {
        return new f((c) eVar.get(c.class), (b20) eVar.get(b20.class), (HeartBeatInfo) eVar.get(HeartBeatInfo.class));
    }

    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        d.b a = d.a(g.class);
        a.b(p.f(c.class));
        a.b(p.f(HeartBeatInfo.class));
        a.b(p.f(b20.class));
        a.f(h.b());
        return Arrays.asList(a.d(), a20.a("fire-installations", "16.3.3"));
    }
}
