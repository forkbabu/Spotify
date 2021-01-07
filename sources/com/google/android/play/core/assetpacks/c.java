package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.List;

final class c extends b {
    final /* synthetic */ List b;
    final /* synthetic */ m c;
    final /* synthetic */ o f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(o oVar, m mVar, List list, m mVar2) {
        super(mVar);
        this.f = oVar;
        this.b = list;
        this.c = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.b
    public final void a() {
        List<String> list = this.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            ((g0) this.f.c.f()).o3(this.f.a, arrayList, o.n(), new j(this.f, this.c, (byte[]) null));
        } catch (RemoteException e) {
            o.f.d(e, "cancelDownloads(%s)", this.b);
        }
    }
}
