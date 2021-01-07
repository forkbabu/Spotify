package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e2 implements p2 {
    private final Context a;

    e2(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.measurement.p2
    public final Object a() {
        zzdx zzdx;
        Context context = this.a;
        zzdx zzdx2 = zzdt.a;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if (!((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            return zzdx2;
        }
        if (m1.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                zzdx = file.exists() ? new zzdz(file) : zzdx2;
            } catch (RuntimeException e) {
                Log.e("HermeticFileOverrides", "no data dir", e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                zzdx = zzdx2;
            }
            if (!zzdx.b()) {
                return zzdx2;
            }
            File file2 = (File) zzdx.c();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                try {
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            String[] split = readLine.split(" ", 3);
                            if (split.length != 3) {
                                Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                            } else {
                                String str3 = split[0];
                                String decode = Uri.decode(split[1]);
                                String decode2 = Uri.decode(split[2]);
                                if (!hashMap.containsKey(str3)) {
                                    hashMap.put(str3, new HashMap());
                                }
                                ((Map) hashMap.get(str3)).put(decode, decode2);
                            }
                        } else {
                            String.valueOf(file2).length();
                            x1 x1Var = new x1(hashMap);
                            bufferedReader.close();
                            return new zzdz(x1Var);
                        }
                    }
                } catch (Throwable th) {
                    s2.a(th, th);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        throw th;
    }
}
