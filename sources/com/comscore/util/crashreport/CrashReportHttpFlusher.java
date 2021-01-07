package com.comscore.util.crashreport;

import android.os.Build;
import com.spotify.core.http.HttpConnection;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public class CrashReportHttpFlusher implements CrashReportFlusher {
    private static final int a = 4088;
    private static final int b = 5;
    private static final boolean c = true;
    private Proxy d;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    private HttpURLConnection a(URL url) {
        Proxy proxy = this.d;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
        httpURLConnection.setRequestProperty("Connection", "Close");
        return httpURLConnection;
    }

    private Proxy a(String str) {
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            i = Integer.parseInt(str.substring(indexOf + 1));
            str = substring;
        } else {
            i = 80;
        }
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
    }

    private URL a(URL url, int i, String str) {
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
            case HttpConnection.kErrorHttpBadRange /* 305 */:
                if (str == null) {
                    return null;
                }
                if (i == 305) {
                    int i2 = 0;
                    if (str.startsWith(url.getProtocol() + ':')) {
                        i2 = url.getProtocol().length() + 1;
                    }
                    if (str.startsWith("//", i2)) {
                        i2 += 2;
                    }
                    this.d = a(str.substring(i2));
                    return url;
                }
                URL url2 = new URL(url, str);
                if (!url.getProtocol().equals(url2.getProtocol())) {
                    return null;
                }
                return url2;
            case 304:
            default:
                return null;
        }
    }

    private boolean a() {
        return c;
    }

    public URL createURL(String str) {
        if (str.length() > a) {
            String substring = str.substring(0, a);
            int lastIndexOf = substring.lastIndexOf(37);
            if (lastIndexOf >= 4086) {
                substring = substring.substring(0, lastIndexOf);
            }
            str = je.x0(substring, "&ns_cut=");
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportFlusher
    public boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport) {
        int i;
        boolean z = false;
        HttpURLConnection httpURLConnection = null;
        try {
            URL createURL = createURL(str + "?" + crashReportParser.reportToString(crashReport));
            if (a()) {
                httpURLConnection = a(createURL);
                i = httpURLConnection.getResponseCode();
            } else {
                int i2 = 0;
                int i3 = 0;
                while (createURL != null && i3 < 5) {
                    httpURLConnection = a(createURL);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    i2 = httpURLConnection.getResponseCode();
                    createURL = a(createURL, i2, httpURLConnection.getHeaderField("Location"));
                    i3++;
                }
                i = i2;
            }
            if (i == 200 || i == 204) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return z;
    }
}
