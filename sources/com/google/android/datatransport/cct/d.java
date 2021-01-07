package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.comscore.android.ConnectivityType;
import com.comscore.streaming.WindowState;
import com.comscore.util.log.LogLevel;
import com.google.android.datatransport.cct.a.a;
import com.google.android.datatransport.cct.a.j;
import com.google.android.datatransport.cct.a.k;
import com.google.android.datatransport.cct.a.l;
import com.google.android.datatransport.cct.a.m;
import com.google.android.datatransport.cct.a.zzp;
import com.google.android.datatransport.cct.a.zzt;
import com.google.android.datatransport.cct.a.zzu;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.l;
import com.google.firebase.encoders.EncodingException;
import com.spotify.cosmos.router.Request;
import defpackage.pg;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* access modifiers changed from: package-private */
public final class d implements l {
    private final com.google.firebase.encoders.a a;
    private final ConnectivityManager b;
    final URL c = d(a.c);
    private final ti d;
    private final ti e;
    private final int f;

    /* access modifiers changed from: package-private */
    public static final class a {
        final URL a;
        final j b;
        final String c;

        a(URL url, j jVar, String str) {
            this.a = url;
            this.b = jVar;
            this.c = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    d(Context context, ti tiVar, ti tiVar2) {
        m10 m10 = new m10();
        ((com.google.android.datatransport.cct.a.b) com.google.android.datatransport.cct.a.b.a).a(m10);
        m10.f(true);
        this.a = m10.e();
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = tiVar2;
        this.e = tiVar;
        this.f = ConnectivityType.UNKNOWN;
    }

    static b c(d dVar, a aVar) {
        dVar.getClass();
        bh.a("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(LogLevel.NONE);
        httpURLConnection.setReadTimeout(dVar.f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(Request.POST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.3.1"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    dVar.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    bh.e("CctTransportBackend", "Status Code: " + responseCode);
                    bh.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    bh.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            b bVar = new b(responseCode, null, m.b(new BufferedReader(new InputStreamReader(gZIPInputStream))).a());
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
                throw th;
                throw th;
                throw th;
                throw th;
            } catch (Throwable unused4) {
            }
        } catch (ConnectException | UnknownHostException e2) {
            bh.c("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new b(500, null, 0);
        } catch (EncodingException | IOException e3) {
            bh.c("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new b(WindowState.NORMAL, null, 0);
        }
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(je.x0("Invalid url: ", str), e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.l
    public pg a(pg pgVar) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        pg.a l = pgVar.l();
        l.a("sdk-version", Build.VERSION.SDK_INT);
        l.c("model", Build.MODEL);
        l.c("hardware", Build.HARDWARE);
        l.c("device", Build.DEVICE);
        l.c("product", Build.PRODUCT);
        l.c("os-uild", Build.ID);
        l.c("manufacturer", Build.MANUFACTURER);
        l.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l.b("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / Constants.ONE_SECOND));
        if (activeNetworkInfo == null) {
            i = zzt.zzc.B.a();
        } else {
            i = activeNetworkInfo.getType();
        }
        l.a("net-type", i);
        if (activeNetworkInfo == null) {
            i2 = zzt.zzb.a.a();
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                i2 = zzt.zzb.D.a();
            } else if (zzt.zzb.d(i2) == null) {
                i2 = 0;
            }
        }
        l.a("mobile-subtype", i2);
        return l.d();
    }

    @Override // com.google.android.datatransport.runtime.backends.l
    public BackendResponse b(f fVar) {
        Object a2;
        k.a aVar;
        HashMap hashMap = new HashMap();
        for (pg pgVar : fVar.b()) {
            String j = pgVar.j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(pgVar);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(pgVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            pg pgVar2 = (pg) ((List) entry.getValue()).get(0);
            l.a a3 = com.google.android.datatransport.cct.a.l.a();
            a3.d(zzu.a);
            a3.b(this.e.a());
            a3.i(this.d.a());
            zzp.a a4 = zzp.a();
            a4.b(zzp.zzb.b);
            a.AbstractC0084a a5 = com.google.android.datatransport.cct.a.a.a();
            a5.a(Integer.valueOf(pgVar2.g("sdk-version")));
            a5.g(pgVar2.b("model"));
            a5.e(pgVar2.b("hardware"));
            a5.b(pgVar2.b("device"));
            a5.i(pgVar2.b("product"));
            a5.h(pgVar2.b("os-uild"));
            a5.f(pgVar2.b("manufacturer"));
            a5.d(pgVar2.b("fingerprint"));
            a4.a(a5.c());
            a3.c(a4.c());
            try {
                a3.a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a3.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (pg pgVar3 : (List) entry.getValue()) {
                og e2 = pgVar3.e();
                com.google.android.datatransport.b b2 = e2.b();
                if (b2.equals(com.google.android.datatransport.b.b("proto"))) {
                    aVar = k.b(e2.a());
                } else if (b2.equals(com.google.android.datatransport.b.b("json"))) {
                    aVar = k.a(new String(e2.a(), Charset.forName(Constants.ENCODING)));
                } else {
                    bh.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.a(pgVar3.f());
                aVar.e(pgVar3.k());
                aVar.f(pgVar3.h("tz-offset"));
                zzt.a a6 = zzt.a();
                a6.b(zzt.zzc.d(pgVar3.g("net-type")));
                a6.a(zzt.zzb.d(pgVar3.g("mobile-subtype")));
                aVar.b(a6.c());
                if (pgVar3.d() != null) {
                    aVar.c(pgVar3.d());
                }
                arrayList3.add(aVar.d());
            }
            a3.g(arrayList3);
            arrayList2.add(a3.h());
        }
        j a7 = j.a(arrayList2);
        String str = null;
        URL url = this.c;
        if (fVar.c() != null) {
            try {
                a a8 = a.a(fVar.c());
                if (a8.b() != null) {
                    str = a8.b();
                }
                if (a8.c() != null) {
                    url = d(a8.c());
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        }
        int i = 5;
        try {
            Object aVar2 = new a(url, a7, str);
            ch b3 = b.b(this);
            dh b4 = c.b();
            do {
                a2 = ((b) b3).a(aVar2);
                aVar2 = ((c) b4).a(aVar2, a2);
                if (aVar2 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            b bVar = (b) a2;
            int i2 = bVar.a;
            if (i2 == 200) {
                return BackendResponse.d(bVar.c);
            }
            if (i2 >= 500 || i2 == 404) {
                return BackendResponse.e();
            }
            return BackendResponse.a();
        } catch (IOException e3) {
            bh.c("CctTransportBackend", "Could not make request to the backend", e3);
            return BackendResponse.e();
        }
    }
}
