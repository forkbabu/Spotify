package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.List;

public class j implements s {
    private static final Constructor<? extends q> b;
    private static final Constructor<? extends q> c;
    private static final Constructor<? extends q> d;
    private final r a;

    static {
        Constructor<? extends q> constructor;
        Constructor<? extends q> constructor2;
        Constructor<? extends q> constructor3 = null;
        try {
            constructor = c(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader"));
        } catch (ClassNotFoundException unused) {
            constructor = null;
        }
        b = constructor;
        try {
            constructor2 = c(Class.forName("so"));
        } catch (ClassNotFoundException unused2) {
            constructor2 = null;
        }
        c = constructor2;
        try {
            constructor3 = c(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader"));
        } catch (ClassNotFoundException unused3) {
        }
        d = constructor3;
    }

    public j(r rVar) {
        this.a = rVar;
    }

    private q b(DownloadRequest downloadRequest, Constructor<? extends q> constructor) {
        if (constructor != null) {
            try {
                return (q) constructor.newInstance(downloadRequest.c, downloadRequest.f, this.a);
            } catch (Exception e) {
                StringBuilder V0 = je.V0("Failed to instantiate downloader for: ");
                V0.append(downloadRequest.b);
                throw new RuntimeException(V0.toString(), e);
            }
        } else {
            StringBuilder V02 = je.V0("Module missing for: ");
            V02.append(downloadRequest.b);
            throw new IllegalStateException(V02.toString());
        }
    }

    private static Constructor<? extends q> c(Class<?> cls) {
        try {
            return cls.asSubclass(q.class).getConstructor(Uri.class, List.class, r.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Downloader constructor missing", e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.s
    public q a(DownloadRequest downloadRequest) {
        String str = downloadRequest.b;
        str.hashCode();
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3680:
                if (str.equals("ss")) {
                    c2 = 0;
                    break;
                }
                break;
            case 103407:
                if (str.equals("hls")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3075986:
                if (str.equals("dash")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1131547531:
                if (str.equals("progressive")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return b(downloadRequest, d);
            case 1:
                return b(downloadRequest, c);
            case 2:
                return b(downloadRequest, b);
            case 3:
                return new v(downloadRequest.c, downloadRequest.n, this.a);
            default:
                StringBuilder V0 = je.V0("Unsupported type: ");
                V0.append(downloadRequest.b);
                throw new IllegalArgumentException(V0.toString());
        }
    }
}
