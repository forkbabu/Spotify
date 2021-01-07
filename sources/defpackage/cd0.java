package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: cd0  reason: default package */
public class cd0 {
    private final Context a;
    private final a b;

    /* renamed from: cd0$a */
    public static class a {
        public Reader a() {
            StringBuilder V0 = je.V0("/proc/");
            V0.append(Process.myPid());
            V0.append("/cmdline");
            return new BufferedReader(new InputStreamReader(new FileInputStream(V0.toString()), Charsets.ISO_8859_1));
        }
    }

    public cd0(Context context) {
        a aVar = new a();
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    public String a(String str) {
        Reader reader = null;
        try {
            Reader a2 = this.b.a();
            StringBuilder sb = new StringBuilder(64);
            while (true) {
                int read = a2.read();
                if (read > 0) {
                    sb.append((char) read);
                } else {
                    a2.close();
                    return sb.toString();
                }
            }
        } catch (IOException e) {
            if (0 != 0) {
                reader.close();
            }
            throw e;
        } catch (Exception unused) {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(10000)) {
                if (runningServiceInfo.pid == myPid) {
                    return runningServiceInfo.process;
                }
            }
            return str;
        }
    }
}
