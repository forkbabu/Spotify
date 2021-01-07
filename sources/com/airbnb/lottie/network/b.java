package com.airbnb.lottie.network;

import android.content.Context;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.spotify.cosmos.router.Request;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class b {
    private final Context a;
    private final String b;
    private final a c;

    private b(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        if (str2 == null) {
            this.c = null;
        } else {
            this.c = new a(applicationContext);
        }
    }

    private l<d> a() {
        StringBuilder V0 = je.V0("Fetching ");
        V0.append(this.b);
        ae.a(V0.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.b).openConnection();
        httpURLConnection.setRequestMethod(Request.GET);
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    l<d> d = d(httpURLConnection);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(d.b() != null);
                    ae.a(sb.toString());
                    httpURLConnection.disconnect();
                    return d;
                }
            }
            String c2 = c(httpURLConnection);
            return new l<>(new IllegalArgumentException("Unable to fetch " + this.b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + c2));
        } catch (Exception e) {
            return new l<>(e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static l<d> b(Context context, String str, String str2) {
        u3<FileExtension, InputStream> a2;
        l<d> lVar;
        b bVar = new b(context, str, str2);
        a aVar = bVar.c;
        d dVar = null;
        if (!(aVar == null || (a2 = aVar.a(bVar.b)) == null)) {
            F f = a2.a;
            S s = a2.b;
            if (f == FileExtension.ZIP) {
                lVar = e.m(new ZipInputStream(s), bVar.b);
            } else {
                lVar = e.f(s, bVar.b);
            }
            if (lVar.b() != null) {
                dVar = lVar.b();
            }
        }
        if (dVar != null) {
            return new l<>(dVar);
        }
        StringBuilder V0 = je.V0("Animation for ");
        V0.append(bVar.b);
        V0.append(" not found in cache. Fetching from network.");
        ae.a(V0.toString());
        try {
            return bVar.a();
        } catch (IOException e) {
            return new l<>(e);
        }
    }

    private String c(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    private l<d> d(HttpURLConnection httpURLConnection) {
        l<d> lVar;
        FileExtension fileExtension;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            ae.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            a aVar = this.c;
            if (aVar == null) {
                lVar = e.m(new ZipInputStream(httpURLConnection.getInputStream()), null);
            } else {
                lVar = e.m(new ZipInputStream(new FileInputStream(aVar.e(this.b, httpURLConnection.getInputStream(), fileExtension))), this.b);
            }
        } else {
            ae.a("Received json response.");
            fileExtension = FileExtension.JSON;
            a aVar2 = this.c;
            if (aVar2 == null) {
                lVar = e.f(httpURLConnection.getInputStream(), null);
            } else {
                lVar = e.f(new FileInputStream(new File(aVar2.e(this.b, httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.b);
            }
        }
        if (!(this.c == null || lVar.b() == null)) {
            this.c.d(this.b, fileExtension);
        }
        return lVar;
    }
}
