package com.google.firebase.installations.local;

import com.adjust.sdk.Constants;
import com.google.firebase.c;
import com.google.firebase.installations.local.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {
    private final File a;
    private final c b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(c cVar) {
        File filesDir = cVar.g().getFilesDir();
        StringBuilder V0 = je.V0("PersistedInstallation.");
        V0.append(cVar.k());
        V0.append(".json");
        this.a = new File(filesDir, V0.toString());
        this.b = cVar;
    }

    public c a(c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", cVar.c());
            jSONObject.put("Status", cVar.f().ordinal());
            jSONObject.put("AuthToken", cVar.a());
            jSONObject.put("RefreshToken", cVar.e());
            jSONObject.put("TokenCreationEpochInSecs", cVar.g());
            jSONObject.put("ExpiresInSecs", cVar.b());
            jSONObject.put("FisError", cVar.d());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.a)) {
                return cVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public c b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        FileInputStream fileInputStream = new FileInputStream(this.a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
        try {
            fileInputStream.close();
        } catch (IOException | JSONException unused2) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", null);
        int i = c.a;
        a.b bVar = new a.b();
        bVar.h(0);
        bVar.g(registrationStatus);
        bVar.c(0);
        bVar.d(optString);
        bVar.g(RegistrationStatus.values()[optInt]);
        bVar.b(optString2);
        bVar.f(optString3);
        bVar.h(optLong);
        bVar.c(optLong2);
        bVar.e(optString4);
        return bVar.a();
        throw th;
    }
}
