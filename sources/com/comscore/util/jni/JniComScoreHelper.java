package com.comscore.util.jni;

import com.comscore.util.Base64Coder;
import com.comscore.util.crashreport.CrashReport;
import com.comscore.util.crashreport.CrashReportDecorator;
import com.comscore.util.crashreport.CrashReportManager;
import com.comscore.util.log.LogLevel;
import com.comscore.util.log.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;

public abstract class JniComScoreHelper implements Logger.OnErrorLogListener {
    protected CrashReportManager crashReporter = new CrashReportManager(createCrashReportDecorator());

    public static class HTTPStream {
        private HttpURLConnection a;
        private InputStream b;
        private long c;

        public HTTPStream(HttpURLConnection httpURLConnection, int[] iArr, StringBuffer stringBuffer) {
            this.a = httpURLConnection;
            try {
                this.b = new BufferedInputStream(this.a.getInputStream());
            } catch (IOException e) {
                if (this.a.getResponseCode() < 400) {
                    throw e;
                }
            } finally {
                iArr[0] = this.a.getResponseCode();
            }
            this.b = iArr[0] >= 400 ? this.a.getErrorStream() : this.a.getInputStream();
            for (Map.Entry<String, List<String>> entry : this.a.getHeaderFields().entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    stringBuffer.append(entry.getKey() + ": " + a(",", entry.getValue()) + "\n");
                }
            }
        }

        private String a(CharSequence charSequence, Iterable<?> iterable) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Object obj : iterable) {
                if (z) {
                    z = false;
                } else {
                    sb.append(charSequence);
                }
                sb.append(obj);
            }
            return sb.toString();
        }

        public final long getPosition() {
            return this.c;
        }

        public final long getTotalLength() {
            return -1;
        }

        public final boolean isExhausted() {
            return false;
        }

        public final int read(byte[] bArr, int i) {
            int i2 = 0;
            try {
                i2 = this.b.read(bArr, 0, i);
            } catch (IOException unused) {
            }
            if (i2 > 0) {
                this.c += (long) i2;
            }
            return i2;
        }

        public final void release() {
            try {
                this.b.close();
            } catch (IOException unused) {
            }
            this.a.disconnect();
        }

        public final boolean setPosition(long j) {
            return false;
        }
    }

    public JniComScoreHelper() {
        Logger.setOnErrorLogListener(this);
    }

    public static HTTPStream createHTTPStream(String str, boolean z, byte[] bArr, String str2, int i, int[] iArr, StringBuffer stringBuffer, int i2, String str3) {
        HTTPStream hTTPStream;
        int indexOf;
        int indexOf2;
        if (i < 0) {
            i = 0;
        } else if (i == 0) {
            i = LogLevel.NONE;
        }
        String[] split = str2.split("\\n");
        while (true) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                if (httpURLConnection == null) {
                    return null;
                }
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    for (int i3 = 0; i3 < split.length; i3++) {
                        int indexOf3 = split[i3].indexOf(":");
                        if (indexOf3 > 0 && indexOf3 < split[i3].length()) {
                            String substring = split[i3].substring(0, indexOf3);
                            String substring2 = split[i3].substring(indexOf3 + 1);
                            if (substring2.length() > 0) {
                                httpURLConnection.setRequestProperty(substring, substring2);
                            }
                        }
                    }
                    httpURLConnection.setRequestMethod(str3);
                    if (z) {
                        httpURLConnection.setDoOutput(true);
                        if (bArr != null) {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            outputStream.write(bArr);
                            outputStream.flush();
                        }
                    }
                    hTTPStream = new HTTPStream(httpURLConnection, iArr, stringBuffer);
                    int i4 = iArr[0];
                    i2--;
                    if (i2 < 0 || (!(i4 == 301 || i4 == 302 || i4 == 303 || i4 == 307) || (indexOf2 = stringBuffer.indexOf("\n", (indexOf = stringBuffer.indexOf("Location:") + 10))) <= indexOf)) {
                        break;
                    }
                    String url = new URL(new URL(str), stringBuffer.substring(indexOf, indexOf2)).toString();
                    if (url == str) {
                        break;
                    }
                    stringBuffer.delete(0, stringBuffer.length());
                    str = url;
                } catch (Throwable unused) {
                    httpURLConnection.disconnect();
                    return null;
                }
            } catch (Throwable unused2) {
                return null;
            }
        }
        return hTTPStream;
    }

    protected static String getLocaleValue(boolean z) {
        Locale locale = Locale.getDefault();
        return z ? locale.getDisplayCountry(Locale.US) : locale.getDisplayLanguage(Locale.US);
    }

    private static native void shutdownSdkNative();

    /* access modifiers changed from: protected */
    public CrashReportDecorator createCrashReportDecorator() {
        return new CrashReportDecorator(this);
    }

    /* access modifiers changed from: protected */
    public String decryptRSA(String str, String str2) {
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64Coder.decode(str2.replace("\n", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", ""))));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            instance.init(2, generatePrivate);
            return new String(instance.doFinal(Base64Coder.decode(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String encryptRSA(String str, String str2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Coder.decode(str2.replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""))));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            instance.init(1, generatePublic);
            return new String(Base64Coder.encode(instance.doFinal(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract String getAppDataDir();

    public abstract String getApplicationId();

    public abstract String getApplicationName();

    public abstract String getApplicationVersion();

    public abstract String getArchitecture();

    /* access modifiers changed from: protected */
    public abstract int getConnectivityType();

    /* access modifiers changed from: protected */
    public String getCrossPublisherId() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract int getCurrentHostApplicationState();

    public abstract String[] getDeviceIds();

    public abstract String getDeviceModel();

    /* access modifiers changed from: protected */
    public String[] getInvalidIds() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String getLanguage();

    public abstract String getOsName();

    public abstract String getOsVersion();

    /* access modifiers changed from: protected */
    public abstract Map<String, String> getPlatformLabels(Map<String, String> map);

    public abstract String getRuntimeName();

    public abstract String getRuntimeVersion();

    /* access modifiers changed from: protected */
    public abstract int getScreenHeight();

    /* access modifiers changed from: protected */
    public abstract int getScreenWidth();

    /* access modifiers changed from: protected */
    public abstract boolean isJailBroken();

    /* access modifiers changed from: protected */
    public boolean libraryPostUpdate(String str, String str2, Map<String, String> map, ArrayList<String> arrayList) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean libraryUpdate(String str, String str2, Map<String, String> map) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCoreCreated() {
    }

    /* access modifiers changed from: protected */
    public void onCoreDestroyed() {
    }

    /* access modifiers changed from: protected */
    public void onCoreInitializationFinished() {
    }

    /* access modifiers changed from: protected */
    public void onCoreStarted() {
    }

    @Override // com.comscore.util.log.Logger.OnErrorLogListener
    public void onLogError(String str, Throwable th) {
        this.crashReporter.addReport(new CrashReport(str, th, (Map<String, String>) null));
    }

    public void shutdownSdk() {
        try {
            shutdownSdkNative();
        } catch (UnsatisfiedLinkError e) {
            Logger.e("Error using the native library: ", e);
        }
    }

    public void start() {
        this.crashReporter.start();
    }

    public abstract boolean subscribeToForegroundNotification();

    public abstract boolean unsubscribeFromForegroundNotification();
}
