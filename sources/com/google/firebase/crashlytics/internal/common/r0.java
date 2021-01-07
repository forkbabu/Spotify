package com.google.firebase.crashlytics.internal.common;

import com.adjust.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class r0 {
    private static final Charset b = Charset.forName(Constants.ENCODING);
    private final File a;

    public r0(File file) {
        this.a = file;
    }

    private static x0 c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        x0 x0Var = new x0();
        String str2 = null;
        if (!jSONObject.isNull("userId")) {
            str2 = jSONObject.optString("userId", null);
        }
        x0Var.e(str2);
        return x0Var;
    }

    public File a(String str) {
        return new File(this.a, je.y0(str, "keys", ".meta"));
    }

    public File b(String str) {
        return new File(this.a, je.y0(str, "user", ".meta"));
    }

    public x0 d(String str) {
        Throwable th;
        Exception e;
        File b2 = b(str);
        if (!b2.exists()) {
            return new x0();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b2);
            try {
                x0 c = c(CommonUtils.w(fileInputStream2));
                CommonUtils.c(fileInputStream2, "Failed to close user metadata file.");
                return c;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    ty.f().e("Error deserializing user metadata.", e);
                    CommonUtils.c(fileInputStream, "Failed to close user metadata file.");
                    return new x0();
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.c(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                CommonUtils.c(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            ty.f().e("Error deserializing user metadata.", e);
            CommonUtils.c(fileInputStream, "Failed to close user metadata file.");
            return new x0();
        }
    }

    public void e(String str, Map<String, String> map) {
        Throwable th;
        Exception e;
        File a2 = a(str);
        BufferedWriter bufferedWriter = null;
        try {
            String jSONObject = new JSONObject(map).toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), b));
            try {
                bufferedWriter2.write(jSONObject);
                bufferedWriter2.flush();
                CommonUtils.c(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    ty.f().e("Error serializing key/value metadata.", e);
                    CommonUtils.c(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.c(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
                CommonUtils.c(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            ty.f().e("Error serializing key/value metadata.", e);
            CommonUtils.c(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    public void f(String str, x0 x0Var) {
        Throwable th;
        Exception e;
        File b2 = b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String jSONObject = new q0(x0Var).toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), b));
            try {
                bufferedWriter2.write(jSONObject);
                bufferedWriter2.flush();
                CommonUtils.c(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    ty.f().e("Error serializing user metadata.", e);
                    CommonUtils.c(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.c(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
                CommonUtils.c(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            ty.f().e("Error serializing user metadata.", e);
            CommonUtils.c(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
