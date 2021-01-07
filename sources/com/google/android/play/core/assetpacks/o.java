package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.g0;
import com.google.android.play.core.internal.l;
import com.google.android.play.core.internal.n;
import com.google.android.play.core.tasks.c;
import com.google.android.play.core.tasks.e;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class o implements f3 {
    private static final a f = new a("AssetPackServiceImpl");
    private static final Intent g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    private final String a;
    private final u0 b;
    @Nullable
    private l<g0> c;
    @Nullable
    private l<g0> d;
    private final AtomicBoolean e = new AtomicBoolean();

    o(Context context, u0 u0Var) {
        this.a = context.getPackageName();
        this.b = u0Var;
        if (n.a(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            a aVar = f;
            Intent intent = g;
            this.c = new l<>(context2, aVar, "AssetPackService", intent, g3.a);
            Context applicationContext2 = context.getApplicationContext();
            this.d = new l<>(applicationContext2 != null ? applicationContext2 : context, aVar, "AssetPackService-keepAlive", intent, h3.a);
        }
        f.c("AssetPackService initiated.", new Object[0]);
    }

    static List c(o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            u0 u0Var = oVar.b;
            ArrayList arrayList2 = new ArrayList();
            w wVar = y.a;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                hashMap.put(str, AssetPackState.b(bundle, str, u0Var, wVar));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                hashMap.put(str2, AssetPackState.c(str2, 4, 0, 0, 0, 0.0d, 1));
            }
            AssetPackState next = new f0(bundle.getLong("total_bytes_to_download"), hashMap).a().values().iterator().next();
            if (next == null) {
                f.e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int g2 = next.g();
            if (g2 == 1 || g2 == 7 || g2 == 2 || g2 == 3) {
                z = true;
            }
            if (z) {
                arrayList.add(next.f());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void d(int i, String str, int i2) {
        if (this.c != null) {
            f.f("notifyModuleCompleted", new Object[0]);
            m mVar = new m();
            this.c.c(new f(this, mVar, i, str, mVar, i2));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    static /* synthetic */ Bundle g(Map map) {
        Bundle n = n();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        n.putParcelableArrayList("installed_asset_module", arrayList);
        return n;
    }

    static Bundle j(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i2);
        return bundle;
    }

    private static <T> c<T> m() {
        f.e("onError(%d)", -11);
        return e.a(new AssetPackException(-11));
    }

    /* access modifiers changed from: private */
    public static Bundle n() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10802);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void A(List<String> list) {
        if (this.c != null) {
            f.f("cancelDownloads(%s)", list);
            m mVar = new m();
            this.c.c(new c(this, mVar, list, mVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void D(int i) {
        if (this.c != null) {
            f.f("notifySessionFailed", new Object[0]);
            m mVar = new m();
            this.c.c(new g(this, mVar, i, mVar));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final c<ParcelFileDescriptor> E(int i, String str, String str2, int i2) {
        if (this.c == null) {
            return m();
        }
        f.f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        m mVar = new m();
        this.c.c(new h(this, mVar, i, str, str2, i2, mVar));
        return mVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void F(int i, String str, String str2, int i2) {
        if (this.c != null) {
            f.f("notifyChunkTransferred", new Object[0]);
            m mVar = new m();
            this.c.c(new e(this, mVar, i, str, str2, i2, mVar));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final c<List<String>> G(Map<String, Long> map) {
        if (this.c == null) {
            return m();
        }
        f.f("syncPacks", new Object[0]);
        m mVar = new m();
        this.c.c(new d(this, mVar, map, mVar));
        return mVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void a(int i, String str) {
        d(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final synchronized void e() {
        if (this.d == null) {
            f.g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        a aVar = f;
        aVar.f("keepAlive", new Object[0]);
        if (!this.e.compareAndSet(false, true)) {
            aVar.f("Service is already kept alive.", new Object[0]);
            return;
        }
        m mVar = new m();
        this.d.c(new i(this, mVar, mVar));
    }
}
