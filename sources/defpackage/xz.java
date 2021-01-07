package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.tz;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: xz  reason: default package */
public class xz implements tz.a {
    xz() {
    }

    /* JADX INFO: finally extract failed */
    public String a(File file) {
        String str;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file.getPath()));
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.SHA1);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                }
                str = CommonUtils.q(instance.digest());
            } catch (Exception e) {
                ty.f().e("Could not calculate hash for app icon.", e);
                str = "";
            }
            CommonUtils.d(bufferedInputStream);
            return str;
        } catch (Throwable th) {
            CommonUtils.d(null);
            throw th;
        }
    }
}
