package defpackage;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import com.comscore.streaming.ContentMediaFormat;
import com.google.common.hash.Funnels;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteSource;
import com.google.common.io.ByteStreams;
import com.google.common.io.Closer;
import com.google.common.io.Files;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.connectivity.e0;
import com.spotify.music.C0707R;
import com.spotify.superbird.ota.model.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.t0;
import io.reactivex.s;
import io.reactivex.subjects.c;
import io.reactivex.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: vne  reason: default package */
public class vne extends BroadcastReceiver {
    private static final long k = TimeUnit.DAYS.toMillis(30);
    public static final /* synthetic */ int l = 0;
    private final Context a;
    private final cqe b;
    private final DownloadManager c;
    private final ape d;
    private final Map<Long, a> e = new HashMap();
    private final c<ooe> f;
    private final e0 g;
    private final y h;
    private b i;
    private b j;

    /* renamed from: vne$a */
    public static class a {
        public final String a;
        public final g b;
        public final boolean c;

        a(String str, g gVar, boolean z) {
            str.getClass();
            this.a = str;
            this.b = gVar;
            this.c = z;
        }
    }

    public vne(Context context, cqe cqe, ape ape, c<ooe> cVar, e0 e0Var, y yVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.i = emptyDisposable;
        this.j = emptyDisposable;
        this.a = context.getApplicationContext();
        this.b = cqe;
        this.c = (DownloadManager) context.getSystemService("download");
        this.d = ape;
        this.f = cVar;
        this.g = e0Var;
        this.h = yVar;
    }

    private File d() {
        File file = new File(this.a.getExternalFilesDir(null), "superbird");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        StringBuilder V0 = je.V0("Failed to create folder ");
        V0.append(file.getCanonicalPath());
        throw new IOException(V0.toString());
    }

    private String e(String str, String str2, String str3) {
        return String.format("%s_%s_%s", str, str2, str3);
    }

    private void k(a aVar, g gVar, String str) {
        this.d.b(aVar.a, gVar.packageName(), gVar.version(), gVar.fromVersion(), str);
        l(aVar.c, ooe.b(aVar.a, gVar.packageName(), gVar.version(), gVar.hash(), gVar.sizeBytes()));
    }

    private void l(boolean z, ooe ooe) {
        if (z) {
            this.f.onNext(ooe);
        }
    }

    public void a() {
        this.i.dispose();
    }

    public void b(String str, g gVar) {
        try {
            c(str, gVar, true);
        } catch (IOException e2) {
            this.d.b(str, gVar.packageName(), gVar.version(), gVar.fromVersion(), String.format("Failed to download a package: %s", e2.getMessage()));
        }
    }

    public void c(String str, g gVar, boolean z) {
        if (g(str, gVar)) {
            l(z, ooe.a(str, gVar.packageName(), gVar.version(), gVar.hash(), gVar.sizeBytes()));
            return;
        }
        File d2 = d();
        this.d.a(str, gVar.packageName(), gVar.version(), gVar.fromVersion());
        l(z, ooe.d(gVar.packageName(), gVar.version(), gVar.hash(), gVar.sizeBytes()));
        long enqueue = this.c.enqueue(new DownloadManager.Request(Uri.parse(gVar.url())).setTitle(this.a.getString(C0707R.string.notification_download_title)).setDescription(this.a.getString(C0707R.string.notification_download_description, gVar.version())).setNotificationVisibility(0).setDestinationUri(Uri.fromFile(new File(d2, e(str, gVar.packageName(), gVar.version())))));
        if (this.j.d()) {
            this.j = new t0(s.h0(3, TimeUnit.SECONDS, this.h).I0(this.h), new one(this)).subscribe(new nne(this, z));
        }
        this.e.put(Long.valueOf(enqueue), new a(str, gVar, z));
    }

    public long f(long j2) {
        Cursor query = this.c.query(new DownloadManager.Query().setFilterById(j2));
        query.moveToFirst();
        long j3 = query.getLong(query.getColumnIndexOrThrow("bytes_so_far"));
        long j4 = query.getLong(query.getColumnIndexOrThrow("total_size"));
        if (j4 == 0) {
            return 0;
        }
        return (j3 * 100) / j4;
    }

    public boolean g(String str, g gVar) {
        try {
            File file = new File(d(), e(str, gVar.packageName(), gVar.version()));
            if (!file.exists()) {
                return false;
            }
            ByteSource asByteSource = Files.asByteSource(file);
            Hasher newHasher = Hashing.md5().newHasher();
            OutputStream asOutputStream = Funnels.asOutputStream(newHasher);
            Closer create = Closer.create();
            try {
                InputStream openStream = asByteSource.openStream();
                create.register(openStream);
                ByteStreams.copy(openStream, asOutputStream);
                create.close();
                boolean equals = gVar.hash().equals(newHasher.hash().toString());
                if (!equals) {
                    org.apache.commons.io.b.g(file);
                }
                return equals;
            } catch (Throwable th) {
                create.close();
                throw th;
            }
        } catch (IOException e2) {
            Logger.e(e2, "Failed to check if file was already downloaded", new Object[0]);
            return false;
        }
    }

    public boolean h() {
        return !this.e.isEmpty();
    }

    public /* synthetic */ boolean i(Long l2) {
        return !this.e.isEmpty();
    }

    public void j(boolean z, Long l2) {
        String str;
        for (Map.Entry<Long, a> entry : this.e.entrySet()) {
            long longValue = entry.getKey().longValue();
            Cursor query = this.c.query(new DownloadManager.Query().setFilterById(longValue));
            query.moveToFirst();
            long j2 = (long) query.getInt(query.getColumnIndexOrThrow("status"));
            if (j2 == 16 || j2 == 4) {
                a value = entry.getValue();
                this.e.remove(Long.valueOf(longValue));
                ape ape = this.d;
                String str2 = value.a;
                String packageName = value.b.packageName();
                String version = value.b.version();
                String fromVersion = value.b.fromVersion();
                Cursor query2 = this.c.query(new DownloadManager.Query().setFilterById(longValue));
                query2.moveToFirst();
                int i2 = query2.getInt(query2.getColumnIndexOrThrow("reason"));
                if (i2 == 1) {
                    str = "The download was paused because some network error occurred and the download manager is waiting before retrying the request.";
                } else if (i2 == 2) {
                    str = "The download was waiting for network connectivity to proceed.";
                } else if (i2 == 3) {
                    str = "The download exceeds a size limit for downloads over the mobile network and the download manager is waiting for a Wi-Fi connection to proceed.";
                } else if (i2 == 4) {
                    str = "The download was paused for some other reason.";
                } else if (i2 == 1001) {
                    str = "Storage error.";
                } else if (i2 != 1002) {
                    switch (i2) {
                        case ContentMediaFormat.PARTIAL_CONTENT_GENERIC /* 1004 */:
                            str = "Error receiving or processing data occurred at the HTTP level.";
                            break;
                        case ContentMediaFormat.PARTIAL_CONTENT_EPISODE /* 1005 */:
                            str = "There were too many redirects.";
                            break;
                        case ContentMediaFormat.PARTIAL_CONTENT_MOVIE /* 1006 */:
                            str = "There was insufficient storage space. Typically, this is because the SD card is full.";
                            break;
                        case ContentMediaFormat.PREVIEW_GENERIC /* 1007 */:
                            str = "No external storage device was found. Typically, this is because the SD card is not mounted.";
                            break;
                        case ContentMediaFormat.PREVIEW_EPISODE /* 1008 */:
                            str = "Some possibly transient error occurred but we can't resume the download.";
                            break;
                        case ContentMediaFormat.PREVIEW_MOVIE /* 1009 */:
                            str = "The requested destination file already exists (the download manager will not overwrite an existing file).";
                            break;
                        default:
                            str = "Unknown error.";
                            break;
                    }
                } else {
                    str = "HTTP code was received that download manager can't handle.";
                }
                ape.b(str2, packageName, version, fromVersion, str);
                l(z, ooe.b(value.a, value.b.packageName(), value.b.version(), value.b.hash(), value.b.sizeBytes()));
                this.c.remove(longValue);
            }
        }
    }

    public Set<Long> m() {
        return this.e.keySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] n(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, int r8) {
        /*
            r3 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.d()
            java.lang.String r4 = r3.e(r4, r5, r6)
            r1.<init>(r2, r4)
            r0.<init>(r1)
            byte[] r4 = new byte[r8]     // Catch:{ all -> 0x003b }
            long r5 = (long) r7     // Catch:{ all -> 0x003b }
            long r5 = r0.skip(r5)     // Catch:{ all -> 0x003b }
            int r6 = (int) r5     // Catch:{ all -> 0x003b }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x003b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003b }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x003b }
            java.lang.String r6 = "Skipped %d bytes"
            com.spotify.base.java.logging.Logger.g(r6, r5)     // Catch:{ all -> 0x003b }
            int r5 = r0.read(r4)     // Catch:{ all -> 0x003b }
            r6 = -1
            if (r5 != r6) goto L_0x0033
            byte[] r4 = new byte[r7]     // Catch:{ all -> 0x003b }
            goto L_0x0037
        L_0x0033:
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch:{ all -> 0x003b }
        L_0x0037:
            r0.close()
            return r4
        L_0x003b:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vne.n(java.lang.String, java.lang.String, java.lang.String, int, int):byte[]");
    }

    public void o() {
        try {
            File d2 = d();
            if (d2.exists() && d2.isDirectory()) {
                File[] listFiles = d2.listFiles();
                for (File file : listFiles) {
                    if (this.b.d() - file.lastModified() > k && !file.delete()) {
                        Logger.d("Failed to delete a file : %s", file.getAbsolutePath());
                    }
                }
            }
        } catch (IOException e2) {
            Logger.e(e2, "Failed to remove old files.", new Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (this.e.containsKey(Long.valueOf(longExtra))) {
            a aVar = this.e.get(Long.valueOf(longExtra));
            g gVar = aVar.b;
            if (this.c.getUriForDownloadedFile(longExtra) != null) {
                this.e.remove(Long.valueOf(longExtra));
                try {
                    if (!g(aVar.a, gVar)) {
                        k(aVar, gVar, "Failed to verify the hash.");
                        return;
                    }
                    l(aVar.c, ooe.a(aVar.a, gVar.packageName(), gVar.version(), gVar.hash(), this.c.openDownloadedFile(longExtra).getStatSize()));
                    String str = aVar.a;
                    String packageName = gVar.packageName();
                    String version = gVar.version();
                    try {
                        File[] listFiles = d().listFiles(new kne(str));
                        String e2 = e(str, packageName, version);
                        for (File file : listFiles) {
                            if (!file.getName().equals(e2)) {
                                file.delete();
                            }
                        }
                    } catch (IOException e3) {
                        Logger.e(e3, "Failed to remove previous files.", new Object[0]);
                    }
                    this.d.d(aVar.a, gVar.packageName(), gVar.version(), gVar.fromVersion());
                } catch (FileNotFoundException unused) {
                    k(aVar, gVar, "Failed to find the downloaded file.");
                }
            } else {
                k(aVar, gVar, "Failed to download successfully.");
            }
        }
    }

    public void p(String str, List<g> list) {
        this.i.dispose();
        this.i = this.g.b().Q(lne.a).N0(1).subscribe(new mne(this, list, str));
    }

    public void q() {
        this.a.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    public void r() {
        o();
        this.a.unregisterReceiver(this);
        this.e.clear();
        this.j.dispose();
        this.i.dispose();
    }
}
