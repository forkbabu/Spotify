package com.comscore.android.util.update;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UpdateFrom5_4_x {
    public static final String OLD_DEFAULT_PREFS_NAME = "cSPrefs";
    private SharedPreferences a;
    private HashMap<String, String> b;
    private File c;
    private File d;
    private Context e;

    public UpdateFrom5_4_x(Context context) {
        this.e = context;
        File file = new File(this.e.getFilesDir().getParent() + "/shared_prefs/" + OLD_DEFAULT_PREFS_NAME + ".xml");
        this.c = file;
        if (file.exists()) {
            this.d = new File(this.e.getFilesDir().getParent() + "/shared_prefs/" + OLD_DEFAULT_PREFS_NAME + ".back");
            this.b = new HashMap<>();
            SharedPreferences sharedPreferences = this.e.getSharedPreferences(OLD_DEFAULT_PREFS_NAME, 0);
            this.a = sharedPreferences;
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    this.b.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    private ArrayList<String> a(Context context) {
        String[] strArr;
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.isDirectory()) {
            strArr = null;
        } else {
            strArr = filesDir.list(new FilenameFilter() {
                /* class com.comscore.android.util.update.UpdateFrom5_4_x.AnonymousClass2 */

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return str.startsWith("cs_cache_");
                }
            });
            if (strArr != null) {
                Arrays.sort(strArr);
            } else {
                strArr = new String[0];
            }
        }
        return new ArrayList<>(Arrays.asList(strArr));
    }

    private void a() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().commit();
            new Thread(new Runnable() {
                /* class com.comscore.android.util.update.UpdateFrom5_4_x.AnonymousClass1 */

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException unused) {
                    }
                    if (UpdateFrom5_4_x.this.c.exists()) {
                        UpdateFrom5_4_x.this.c.delete();
                    }
                    if (UpdateFrom5_4_x.this.d.exists()) {
                        UpdateFrom5_4_x.this.d.delete();
                    }
                }
            }).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC, Splitter:B:17:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r4, java.lang.String r5, java.util.ArrayList<java.lang.String> r6) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            java.io.FileInputStream r4 = r4.openFileInput(r5)     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
        L_0x000f:
            java.lang.String r4 = r1.readLine()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            if (r4 == 0) goto L_0x001f
            int r5 = r4.length()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            if (r5 == 0) goto L_0x000f
            r6.add(r4)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            goto L_0x000f
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0035
        L_0x0023:
            r4 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x0026:
            r0 = r1
            goto L_0x0030
        L_0x0028:
            r4 = move-exception
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            throw r4
        L_0x002f:
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.util.update.UpdateFrom5_4_x.a(android.content.Context, java.lang.String, java.util.ArrayList):void");
    }

    public void libraryPostUpdate(Map<String, String> map, ArrayList<String> arrayList) {
        if (this.a != null) {
            a();
            Iterator<String> it = a(this.e).iterator();
            while (it.hasNext()) {
                String next = it.next();
                a(this.e, next, arrayList);
                this.e.deleteFile(next);
            }
        }
    }

    public void libraryUpdate(Map<String, String> map) {
        if (this.a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("ns_ap_fg", "foreground_transitions_count");
            hashMap.put("installTime", "current_install_timestamp");
            String str = this.b.get("lastActivityTime");
            if (!(str == null || str.length() == 0)) {
                map.put("last_application_accumulation_timestamp", str);
                map.put("last_session_accumulation_timestamp", str);
            }
            hashMap.put("lastApplicationAccumulationTimestamp", "last_application_accumulation_timestamp");
            hashMap.put("lastSessionAccumulationTimestamp", "last_session_accumulation_timestamp");
            hashMap.put("lastApplicationSessionTimestamp", "last_application_session_timestamp");
            hashMap.put("lastUserSessionTimestamp", "last_user_session_timestamp");
            hashMap.put("lastActiveUserSessionTimestamp", "last_active_user_session_timestamp");
            hashMap.put("foregroundTransitionsCount", "foreground_transitions_count");
            hashMap.put("totalForegroundTime", "total_foreground_time");
            hashMap.put("totalBackgroundTime", "total_background_time");
            hashMap.put("totalInactiveTime", "total_inactive_time");
            hashMap.put("accumulatedForegroundTime", "accumulated_foreground_time");
            hashMap.put("accumulatedBackgroundTime", "accumulated_background_time");
            hashMap.put("accumulatedInactiveTime", "accumulated_inactive_time");
            hashMap.put("accumulatedApplicationSessionTime", "accumulated_application_session_time");
            hashMap.put("accumulatedActiveUserSessionTime", "accumulated_active_user_session_time");
            hashMap.put("accumulatedUserSessionTime", "accumulated_user_session_time");
            hashMap.put("activeUserSessionCount", "active_user_session_count");
            hashMap.put("userInteractionCount", "user_interaction_count");
            hashMap.put("userSessionCount", "user_session_count");
            hashMap.put("applicationSessionCountKey", "application_session_count");
            hashMap.put("genesis", "genesis");
            hashMap.put("previousGenesis", "previous_genesis");
            hashMap.put("installId", "current_install_timestamp");
            hashMap.put("firstInstallId", "first_install_timestamp");
            hashMap.put("currentVersion", "previous_app_version");
            hashMap.put("runs", "runs");
            hashMap.put("coldStartCount", "cold_start_count");
            hashMap.put("lastMeasurementProcessedTimestamp", "last_transmission_time");
            hashMap.put("lastUserInteractionTimestamp", "last_user_interaction_timestamp");
            hashMap.put("crossPublisherId", "crosspublisher_id_RSA");
            hashMap.put("md5RawCrossPublisherId", "crosspublisher_id_MD5");
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getValue();
                String str3 = this.b.get((String) entry.getKey());
                if (!(str3 == null || str3.length() == 0)) {
                    map.put(str2, str3);
                }
            }
            String str4 = map.get("updated_from_versions");
            map.put("updated_from_versions", (str4 == null || str4.length() == 0) ? "5.4.x" : je.x0("5.4.x,", str4));
        }
    }
}
