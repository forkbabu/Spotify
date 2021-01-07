package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class a {
    private final Context a;

    public a(Context context) {
        this.a = context;
    }

    public JSONObject a() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        JSONObject jSONObject;
        ty.f().b("Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new f00(this.a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(CommonUtils.w(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ty.f().e("Failed to fetch cached settings", e);
                        CommonUtils.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        CommonUtils.c(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                ty.f().b("No cached settings found.");
                jSONObject = null;
            }
            CommonUtils.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            ty.f().e("Failed to fetch cached settings", e);
            CommonUtils.c(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void b(long j, JSONObject jSONObject) {
        Throwable th;
        Exception e;
        ty.f().b("Writing settings to cache file...");
        FileWriter fileWriter = null;
        try {
            jSONObject.put("expires_at", j);
            FileWriter fileWriter2 = new FileWriter(new File(new f00(this.a).a(), "com.crashlytics.settings.json"));
            try {
                fileWriter2.write(jSONObject.toString());
                fileWriter2.flush();
                CommonUtils.c(fileWriter2, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter = fileWriter2;
                try {
                    ty.f().e("Failed to cache settings", e);
                    CommonUtils.c(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.c(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                CommonUtils.c(fileWriter, "Failed to close settings writer.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            ty.f().e("Failed to cache settings", e);
            CommonUtils.c(fileWriter, "Failed to close settings writer.");
        }
    }
}
