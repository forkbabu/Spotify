package com.spotify.music.features.premiumreactivation;

import com.google.common.base.Joiner;
import com.google.protobuf.u;
import com.spotify.messages.ResubscriptionModalMessage;
import com.spotify.remoteconfig.AndroidFeaturePremiumReactivationProperties;
import com.spotify.remoteconfig.runtime.model.PropertyModel;
import io.reactivex.disposables.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class m {
    private final gl0<u> a;
    private final o b;
    private final AndroidFeaturePremiumReactivationProperties c;

    public m(gl0<u> gl0, o oVar, AndroidFeaturePremiumReactivationProperties androidFeaturePremiumReactivationProperties) {
        this.a = gl0;
        this.b = oVar;
        this.c = androidFeaturePremiumReactivationProperties;
    }

    private void d(String str, long j) {
        ResubscriptionModalMessage.b n = ResubscriptionModalMessage.n();
        n.n(str);
        n.m(j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(this.c.c());
        Collections.sort(arrayList3, d.a);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            PropertyModel propertyModel = (PropertyModel) it.next();
            arrayList.add(propertyModel.name());
            arrayList2.add(propertyModel.value().toString());
        }
        if (!arrayList.isEmpty()) {
            n.o(Joiner.on("|").skipNulls().join(arrayList));
        }
        if (!arrayList2.isEmpty()) {
            n.p(Joiner.on("|").skipNulls().join(arrayList2));
        }
        this.a.c(n.build());
    }

    public /* synthetic */ void a(String str, Integer num) {
        d(str, (long) num.intValue());
    }

    public /* synthetic */ void b(String str, Throwable th) {
        d(str, -1);
    }

    public b c(String str) {
        return this.b.a().subscribe(new c(this, str), new e(this, str));
    }
}
