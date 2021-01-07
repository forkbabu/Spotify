package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class r extends g implements HttpDataSource {
    private static final Pattern t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> u = new AtomicReference<>();
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final HttpDataSource.b i;
    private final HttpDataSource.b j;
    private m k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private int o;
    private long p;
    private long q;
    private long r;
    private long s;

    public r(String str, int i2, int i3, boolean z, HttpDataSource.b bVar) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.h = str;
            this.j = new HttpDataSource.b();
            this.f = i2;
            this.g = i3;
            this.e = z;
            this.i = bVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.l = null;
        }
    }

    private static URL i(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (Constants.SCHEME.equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException(je.x0("Unsupported protocol redirect: ", protocol));
        }
        throw new ProtocolException("Null location redirect");
    }

    private HttpURLConnection j(m mVar) {
        HttpURLConnection k2;
        m mVar2 = mVar;
        URL url = new URL(mVar2.a.toString());
        int i2 = mVar2.b;
        byte[] bArr = mVar2.c;
        long j2 = mVar2.f;
        long j3 = mVar2.g;
        boolean c = mVar2.c(1);
        if (!this.e) {
            return k(url, i2, bArr, j2, j3, c, true, mVar2.d);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                k2 = k(url, i2, bArr, j2, j3, c, false, mVar2.d);
                int responseCode = k2.getResponseCode();
                String headerField = k2.getHeaderField("Location");
                if ((i2 == 1 || i2 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    k2.disconnect();
                    url = i(url, headerField);
                } else if (i2 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                } else {
                    k2.disconnect();
                    url = i(url, headerField);
                    i2 = 1;
                    bArr = null;
                }
                mVar2 = mVar;
                i3 = i4;
                j3 = j3;
                j2 = j2;
            } else {
                throw new NoRouteToHostException(je.p0("Too many redirects: ", i4));
            }
        }
        return k2;
    }

    private HttpURLConnection k(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        HttpDataSource.b bVar = this.i;
        if (bVar != null) {
            hashMap.putAll(bVar.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            String str = "bytes=" + j2 + "-";
            if (j3 != -1) {
                StringBuilder V0 = je.V0(str);
                V0.append((j2 + j3) - 1);
                str = V0.toString();
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.h);
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(m.b(i2));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private static void l(HttpURLConnection httpURLConnection, long j2) {
        int i2 = f0.a;
        if (i2 == 19 || i2 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j2 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void m() {
        if (this.r != this.p) {
            byte[] andSet = u.getAndSet(null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j2 = this.r;
                long j3 = this.p;
                if (j2 != j3) {
                    int read = this.m.read(andSet, 0, (int) Math.min(j3 - j2, (long) andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.r += (long) read;
                        d(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    u.set(andSet);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r7 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7  */
    @Override // com.google.android.exoplayer2.upstream.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(com.google.android.exoplayer2.upstream.m r19) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.r.a(com.google.android.exoplayer2.upstream.m):long");
    }

    @Override // com.google.android.exoplayer2.upstream.g, com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        try {
            if (this.m != null) {
                HttpURLConnection httpURLConnection = this.l;
                long j2 = this.q;
                if (j2 != -1) {
                    j2 -= this.s;
                }
                l(httpURLConnection, j2);
                try {
                    this.m.close();
                } catch (IOException e2) {
                    throw new HttpDataSource.HttpDataSourceException(e2, this.k, 3);
                }
            }
        } finally {
            this.m = null;
            h();
            if (this.n) {
                this.n = false;
                e();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i2, int i3) {
        try {
            m();
            if (i3 == 0) {
                return 0;
            }
            long j2 = this.q;
            if (j2 != -1) {
                long j3 = j2 - this.s;
                if (j3 != 0) {
                    i3 = (int) Math.min((long) i3, j3);
                }
                return -1;
            }
            int read = this.m.read(bArr, i2, i3);
            if (read != -1) {
                this.s += (long) read;
                d(read);
                return read;
            } else if (this.q == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new HttpDataSource.HttpDataSourceException(e2, this.k, 2);
        }
    }
}
