package com.spotify.music.storage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class j {
    private static final Set<String> n = new HashSet(Arrays.asList("SC-02H", "SCV33", "SM-G9300", "SM-G9308", "SM-G9309", "SM-G930A", "SM-G930AZ", "SM-G930F", "SM-G930FD", "SM-G930K", "SM-G930L", "SM-G930P", "SM-G930R4", "SM-G930R6", "SM-G930R7", "SM-G930S", "SM-G930T", "SM-G930T1", "SM-G930U", "SM-G930V", "SM-G930VC", "SM-G930VL", "SM-G930W8", "SM-G9350", "SM-G9358", "SM-G9359", "SM-G935A", "SM-G935F", "SM-G935FD", "SM-G935K", "SM-G935L", "SM-G935P", "SM-G935R4", "SM-G935S", "SM-G935T", "SM-G935U", "SM-G935V", "SM-G935VC", "SM-G935W8"));
    static final SpSharedPreferences.b<Object, String> o = SpSharedPreferences.b.c("cache_location_v4");
    static final SpSharedPreferences.b<Object, String> p = SpSharedPreferences.b.c("cache_location");
    static final SpSharedPreferences.b<Object, String> q = SpSharedPreferences.b.c("settings_location");
    static final SpSharedPreferences.b<Object, String> r = SpSharedPreferences.b.c("storage_location");
    private static final SpSharedPreferences.b<Object, String> s = SpSharedPreferences.b.c("previous_cache_path");
    private static final SpSharedPreferences.b<Object, Long> t = SpSharedPreferences.b.c("previous_cache_size");
    static final SpSharedPreferences.b<Object, Boolean> u = SpSharedPreferences.b.c("previous_external_storage_failure");
    private final Context a;
    private final MovingOrchestrator b;
    private final a c;
    private final o d;
    private String e;
    private boolean f;
    private boolean g;
    private String h;
    private final SpSharedPreferences<Object> i;
    private final b j;
    private List<File> k;
    private final dd0 l;
    private final cqe m;

    public interface a {
        void a();
    }

    public static class b {
        private final String a;

        public b(t tVar) {
            this.a = tVar.y();
        }

        public String a() {
            return je.J0(je.V0("Android/data/"), this.a, "/files/", "spotifycache");
        }

        public String b() {
            StringBuilder sb = new StringBuilder();
            StringBuilder V0 = je.V0("Android/data/");
            V0.append(this.a);
            sb.append(V0.toString());
            sb.append("/cache");
            return sb.toString();
        }

        public String c() {
            StringBuilder sb = new StringBuilder();
            StringBuilder V0 = je.V0("Android/data/");
            V0.append(this.a);
            sb.append(V0.toString());
            sb.append("/files");
            return sb.toString();
        }

        public String d() {
            return je.I0(je.V0("Android/data/"), this.a, "/cache");
        }

        public boolean e() {
            return Environment.getExternalStorageState().equals("mounted");
        }
    }

    public j(Context context, cqe cqe, b bVar, SpSharedPreferences<Object> spSharedPreferences, dd0 dd0, MovingOrchestrator movingOrchestrator, a aVar, o oVar) {
        this.a = context;
        this.i = spSharedPreferences;
        this.m = cqe;
        this.j = bVar;
        this.l = dd0;
        this.b = movingOrchestrator;
        this.c = aVar;
        this.d = oVar;
        if (Build.VERSION.SDK_INT >= 19) {
            File[] externalCacheDirs = context.getExternalCacheDirs();
            for (File file : externalCacheDirs) {
                if (file != null) {
                    Logger.g("Cache dir=%s", file.getAbsolutePath());
                }
            }
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            for (File file2 : externalFilesDirs) {
                if (file2 != null) {
                    Logger.g("Files dir=%s", file2.getAbsolutePath());
                }
            }
        }
    }

    private String a(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    private String e() {
        SpSharedPreferences<Object> spSharedPreferences = this.i;
        SpSharedPreferences.b<Object, String> bVar = r;
        this.j.getClass();
        return spSharedPreferences.m(bVar, Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    private String h() {
        File file = this.k.get(0);
        Logger.g("Using orphan cache stored on %s", file);
        return a(file);
    }

    private boolean j() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return str.toLowerCase(locale).equals("samsung") && n.contains(Build.MODEL.toUpperCase(locale));
    }

    private boolean k(File file) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return "unknown".equals(Environment.getExternalStorageState(file));
    }

    private static String m(String str, String str2, String str3) {
        boolean z;
        File file = new File(str);
        File file2 = new File(str.substring(0, str.length() - str2.length()), str3);
        File parentFile = file2.getParentFile();
        if (parentFile.exists()) {
            z = true;
        } else {
            z = parentFile.mkdirs();
        }
        if (z) {
            if (file.renameTo(file2)) {
                return file2.toString();
            }
            Assertion.g("Could not move cache location from " + str + " to " + file2);
        }
        return str;
    }

    private boolean n() {
        return !this.j.e() || new File(this.i.l(r)).isDirectory();
    }

    private boolean o() {
        if (this.k == null) {
            Set<String> a2 = this.l.a();
            ArrayList arrayList = new ArrayList();
            String a3 = this.j.a();
            Iterator it = ((HashSet) a2).iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next(), a3);
                if (file.isDirectory()) {
                    arrayList.add(file);
                }
            }
            this.k = arrayList;
        }
        Logger.g("Found %d volume(s) containing a pre-existing cache", Integer.valueOf(this.k.size()));
        return true ^ this.k.isEmpty();
    }

    public String b() {
        return this.i.m(o, null);
    }

    public File c() {
        File filesDir = this.a.getFilesDir();
        this.j.getClass();
        return new File(filesDir, "settings");
    }

    public String d() {
        return this.j.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String f() {
        /*
        // Method dump skipped, instructions count: 1120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.storage.j.f():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String g() {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.storage.j.g():java.lang.String");
    }

    public String i() {
        return this.i.m(q, null);
    }

    public boolean l(String str) {
        if (str.isEmpty()) {
            return false;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            Logger.g("Settingsdir not a valid directory, or is inaccessible", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("spotifycache");
        for (File file : listFiles) {
            if (!arrayList.contains(file.getName())) {
                return true;
            }
        }
        return false;
    }
}
