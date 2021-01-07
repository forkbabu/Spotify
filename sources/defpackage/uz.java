package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: uz  reason: default package */
public final class uz {
    public static byte[] a(File file, Context context) {
        Throwable th;
        if (file == null || !file.exists()) {
            return new byte[0];
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new tz(context, new xz()).a(bufferedReader2);
                CommonUtils.d(bufferedReader2);
                return a;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                CommonUtils.d(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.d(bufferedReader);
            throw th;
        }
    }
}
