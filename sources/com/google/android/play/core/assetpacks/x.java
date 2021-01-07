package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.j0;
import com.google.android.play.core.internal.m0;
import com.google.android.play.core.internal.n;
import java.util.Arrays;

final class x extends j0 {
    private final a a = new a("AssetPackExtractionService");
    private final Context b;
    private final AssetPackExtractionService c;
    private final z d;

    x(Context context, AssetPackExtractionService assetPackExtractionService, z zVar) {
        this.b = context;
        this.c = assetPackExtractionService;
        this.d = zVar;
    }

    @Override // com.google.android.play.core.internal.k0
    public final void N1(Bundle bundle, m0 m0Var) {
        String[] packagesForUid;
        this.a.c("updateServiceState AIDL call", new Object[0]);
        if (!n.a(this.b) || (packagesForUid = this.b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
            m0Var.j(new Bundle());
            this.c.b();
            return;
        }
        m0Var.t(this.c.a(bundle), new Bundle());
    }

    @Override // com.google.android.play.core.internal.k0
    public final void r2(m0 m0Var) {
        this.d.u();
        m0Var.u(new Bundle());
    }
}
