package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import com.google.android.play.core.tasks.c;
import com.google.android.play.core.tasks.e;
import com.google.android.play.core.tasks.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class q1 implements f3 {
    private static final a g = new a("FakeAssetPackService");
    private final String a;
    private final t b;
    private final Context c;
    private final c2 d;
    private final x<Executor> e;
    private final Handler f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    q1(File file, t tVar, u0 u0Var, Context context, c2 c2Var, x<Executor> xVar) {
        this.a = file.getAbsolutePath();
        this.b = tVar;
        this.c = context;
        this.d = c2Var;
        this.e = xVar;
    }

    static long b(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    private final void c(int i, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.d.a());
        bundle.putInt("session_id", i);
        File[] g2 = g(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : g2) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = rw.a(file);
            bundle.putParcelableArrayList(rw.c("chunk_intents", str, a2), arrayList2);
            try {
                bundle.putString(rw.c("uncompressed_hash_sha256", str, a2), s1.b(Arrays.asList(file)));
                bundle.putLong(rw.c("uncompressed_size", str, a2), file.length());
                arrayList.add(a2);
            } catch (NoSuchAlgorithmException e2) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e2);
            } catch (IOException e3) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), e3);
            }
        }
        bundle.putStringArrayList(rw.b("slice_ids", str), arrayList);
        bundle.putLong(rw.b("pack_version", str), (long) this.d.a());
        bundle.putInt(rw.b("status", str), i2);
        bundle.putInt(rw.b("error_code", str), 0);
        bundle.putLong(rw.b("bytes_downloaded", str), b(i2, j));
        bundle.putLong(rw.b("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", b(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f.post(new p1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    private final File[] g(String str) {
        File file = new File(this.a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new o1(str));
            if (listFiles != null) {
                int length = listFiles.length;
                if (length != 0) {
                    for (File file2 : listFiles) {
                        if (rw.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void A(List<String> list) {
        g.f("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void D(int i) {
        g.f("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final c<ParcelFileDescriptor> E(int i, String str, String str2, int i2) {
        g.f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        m mVar = new m();
        try {
            File[] g2 = g(str);
            for (File file : g2) {
                if (rw.a(file).equals(str2)) {
                    mVar.c(ParcelFileDescriptor.open(file, 268435456));
                    return mVar.a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
        } catch (FileNotFoundException e2) {
            g.g("getChunkFileDescriptor failed", e2);
            mVar.b(new LocalTestingException("Asset Slice file not found.", e2));
        } catch (LocalTestingException e3) {
            g.g("getChunkFileDescriptor failed", e3);
            mVar.b(e3);
        }
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void F(int i, String str, String str2, int i2) {
        g.f("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final c<List<String>> G(Map<String, Long> map) {
        g.f("syncPacks()", new Object[0]);
        return e.b(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void a(int i, String str) {
        g.f("notifyModuleCompleted", new Object[0]);
        this.e.e().execute(new n1(this, i, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Intent intent) {
        this.b.a(this.c, intent);
    }

    @Override // com.google.android.play.core.assetpacks.f3
    public final void e() {
        g.f("keepAlive", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(int i, String str) {
        try {
            c(i, str, 4);
        } catch (LocalTestingException e2) {
            g.g("notifyModuleCompleted failed", e2);
        }
    }
}
