package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.y0;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class d extends p9 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final h d = new h(this, i(), "google_app_measurement.db");
    private final l9 e = new l9(d());

    d(r9 r9Var) {
        super(r9Var);
    }

    private final Object E(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            l().E().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                l().E().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            l().E().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static void K(ContentValues contentValues, String str, Object obj) {
        g.i(str);
        if (obj == null) {
            throw new NullPointerException("null reference");
        } else if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final boolean T(String str, int i2, l0 l0Var) {
        o();
        b();
        g.i(str);
        if (l0Var != null) {
            Integer num = null;
            if (TextUtils.isEmpty(l0Var.z())) {
                c4 H = l().H();
                Object w = a4.w(str);
                Integer valueOf = Integer.valueOf(i2);
                if (l0Var.x()) {
                    num = Integer.valueOf(l0Var.y());
                }
                H.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
                return false;
            }
            byte[] i3 = l0Var.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", l0Var.x() ? Integer.valueOf(l0Var.y()) : null);
            contentValues.put("event_name", l0Var.z());
            contentValues.put("session_scoped", l0Var.G() ? Boolean.valueOf(l0Var.H()) : null);
            contentValues.put("data", i3);
            try {
                if (v().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                l().E().b("Failed to insert event filter (got -1). appId", a4.w(str));
                return true;
            } catch (SQLiteException e2) {
                l().E().c("Error storing event filter. appId", a4.w(str), e2);
                return false;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    private final boolean U(String str, int i2, n0 n0Var) {
        o();
        b();
        g.i(str);
        if (n0Var != null) {
            Integer num = null;
            if (TextUtils.isEmpty(n0Var.x())) {
                c4 H = l().H();
                Object w = a4.w(str);
                Integer valueOf = Integer.valueOf(i2);
                if (n0Var.v()) {
                    num = Integer.valueOf(n0Var.w());
                }
                H.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
                return false;
            }
            byte[] i3 = n0Var.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", n0Var.v() ? Integer.valueOf(n0Var.w()) : null);
            contentValues.put("property_name", n0Var.x());
            contentValues.put("session_scoped", n0Var.B() ? Boolean.valueOf(n0Var.C()) : null);
            contentValues.put("data", i3);
            try {
                if (v().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                l().E().b("Failed to insert property filter (got -1). appId", a4.w(str));
                return false;
            } catch (SQLiteException e2) {
                l().E().c("Error storing property filter. appId", a4.w(str), e2);
                return false;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    private final boolean e0() {
        return i().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long f0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            l().E().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean j0(String str, List<Integer> list) {
        g.i(str);
        o();
        b();
        SQLiteDatabase v = v();
        try {
            long f0 = f0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min((int) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION, j().t(str, t.F)));
            if (f0 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            String j0 = je.j0(je.N0(join, 2), "(", join, ")");
            return v.delete("audience_filter_values", je.j0(je.N0(j0, 140), "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", j0, " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            l().E().c("Database error querying filters. appId", a4.w(str), e2);
            return false;
        }
    }

    private final long z(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return j2;
        } catch (SQLiteException e2) {
            l().E().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.f A(long r22, java.lang.String r24, long r25, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.A(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.f");
    }

    public final long A0() {
        Cursor cursor = null;
        try {
            cursor = v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j2 = cursor.getLong(0);
            cursor.close();
            return j2;
        } catch (SQLiteException e2) {
            l().E().b("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final f B(long j2, String str, boolean z, boolean z2) {
        return A(j2, str, 1, false, false, z, false, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.n C(java.lang.String r28, java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.C(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String F(long r5) {
        /*
            r4 = this;
            r4.b()
            r4.o()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.v()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.a4 r6 = r4.l()     // Catch:{ SQLiteException -> 0x003a }
            com.google.android.gms.measurement.internal.c4 r6 = r6.M()     // Catch:{ SQLiteException -> 0x003a }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)
            r5.close()
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0055
        L_0x003e:
            r6 = move-exception
            r5 = r0
        L_0x0040:
            com.google.android.gms.measurement.internal.a4 r1 = r4.l()     // Catch:{ all -> 0x0053 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.E()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0052
            r5.close()
        L_0x0052:
            return r0
        L_0x0053:
            r6 = move-exception
            r0 = r5
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.F(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7 A[Catch:{ all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.aa> G(java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.G(java.lang.String):java.util.List");
    }

    public final List<Pair<c1, Long>> H(String str, int i2, int i3) {
        b();
        o();
        g.c(i2 > 0);
        g.c(i3 > 0);
        g.i(str);
        Cursor cursor = null;
        try {
            Cursor query = v().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
            if (!query.moveToFirst()) {
                List<Pair<c1, Long>> emptyList = Collections.emptyList();
                query.close();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            do {
                long j2 = query.getLong(0);
                try {
                    byte[] V = m().V(query.getBlob(1));
                    if (!arrayList.isEmpty() && V.length + i4 > i3) {
                        break;
                    }
                    try {
                        c1.a aVar = (c1.a) v9.z(c1.u0(), V);
                        if (!query.isNull(2)) {
                            aVar.l0(query.getInt(2));
                        }
                        i4 += V.length;
                        arrayList.add(Pair.create((c1) ((f4) aVar.s()), Long.valueOf(j2)));
                    } catch (IOException e2) {
                        l().E().c("Failed to merge queued bundle. appId", a4.w(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } catch (IOException e3) {
                    l().E().c("Failed to unzip queued bundle. appId", a4.w(str), e3);
                }
            } while (i4 <= i3);
            query.close();
            return arrayList;
        } catch (SQLiteException e4) {
            l().E().c("Error querying bundles. appId", a4.w(str), e4);
            List<Pair<c1, Long>> emptyList2 = Collections.emptyList();
            if (0 != 0) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        r3 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0137 A[Catch:{ all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.aa> I(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.I(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.oa> J(java.lang.String r40, java.lang.String[] r41) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.J(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void L(n nVar) {
        if (nVar != null) {
            b();
            o();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", nVar.a);
            contentValues.put("name", nVar.b);
            contentValues.put("lifetime_count", Long.valueOf(nVar.c));
            contentValues.put("current_bundle_count", Long.valueOf(nVar.d));
            contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f));
            contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.g));
            contentValues.put("last_bundled_day", nVar.h);
            contentValues.put("last_sampled_complex_event_id", nVar.i);
            contentValues.put("last_sampling_rate", nVar.j);
            contentValues.put("current_session_count", Long.valueOf(nVar.e));
            Boolean bool = nVar.k;
            contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
            try {
                if (v().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                    l().E().b("Failed to insert/update event aggregates (got -1). appId", a4.w(nVar.a));
                }
            } catch (SQLiteException e2) {
                l().E().c("Error storing event aggregates. appId", a4.w(nVar.a), e2);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void M(d4 d4Var) {
        b();
        o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d4Var.t());
        contentValues.put("app_instance_id", d4Var.x());
        contentValues.put("gmp_app_id", d4Var.A());
        contentValues.put("resettable_device_id_hash", d4Var.J());
        contentValues.put("last_bundle_index", Long.valueOf(d4Var.f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(d4Var.P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(d4Var.R()));
        contentValues.put("app_version", d4Var.T());
        contentValues.put("app_store", d4Var.X());
        contentValues.put("gmp_version", Long.valueOf(d4Var.Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(d4Var.b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(d4Var.e0()));
        contentValues.put("day", Long.valueOf(d4Var.j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(d4Var.k0()));
        contentValues.put("daily_events_count", Long.valueOf(d4Var.l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(d4Var.m0()));
        contentValues.put("config_fetched_time", Long.valueOf(d4Var.g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(d4Var.h0()));
        contentValues.put("app_version_int", Long.valueOf(d4Var.V()));
        contentValues.put("firebase_instance_id", d4Var.M());
        contentValues.put("daily_error_events_count", Long.valueOf(d4Var.h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(d4Var.g()));
        contentValues.put("health_monitor_sample", d4Var.i());
        contentValues.put("android_id", Long.valueOf(d4Var.k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(d4Var.l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(d4Var.m()));
        contentValues.put("admob_app_id", d4Var.D());
        contentValues.put("dynamite_version", Long.valueOf(d4Var.d0()));
        if (d4Var.o() != null) {
            if (d4Var.o().size() == 0) {
                l().H().b("Safelisted events should not be an empty list. appId", d4Var.t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", d4Var.o()));
            }
        }
        if (f9.b() && j().x(d4Var.t(), t.k0)) {
            contentValues.put("ga_app_id", d4Var.G());
        }
        try {
            SQLiteDatabase v = v();
            if (((long) v.update("apps", contentValues, "app_id = ?", new String[]{d4Var.t()})) == 0 && v.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                l().E().b("Failed to insert/update app (got -1). appId", a4.w(d4Var.t()));
            }
        } catch (SQLiteException e2) {
            l().E().c("Error storing app. appId", a4.w(d4Var.t()), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(String str, List<k0> list) {
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3 = "app_id=? and audience_id=?";
        int i2 = 0;
        while (i2 < list.size()) {
            k0.a aVar = (k0.a) list.get(i2).t();
            if (aVar.x() != 0) {
                int i3 = 0;
                while (i3 < aVar.x()) {
                    l0.a aVar2 = (l0.a) aVar.y(i3).t();
                    l0.a aVar3 = (l0.a) ((f4.b) aVar2.clone());
                    String m2 = f.m(aVar2.w(), c6.a, c6.c);
                    if (m2 != null) {
                        aVar3.u(m2);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i4 = 0;
                    while (i4 < aVar2.x()) {
                        m0 v = aVar2.v(i4);
                        String m3 = f.m(v.C(), f6.a, f6.b);
                        if (m3 != null) {
                            m0.a aVar4 = (m0.a) v.t();
                            aVar4.t(m3);
                            aVar3.t(i4, (m0) ((f4) aVar4.s()));
                            z3 = true;
                        }
                        i4++;
                        aVar2 = aVar2;
                        str3 = str3;
                    }
                    if (z3) {
                        aVar.u(i3, aVar3);
                        list.set(i2, (k0) ((f4) aVar.s()));
                    }
                    i3++;
                    str3 = str3;
                }
            }
            if (aVar.t() != 0) {
                for (int i5 = 0; i5 < aVar.t(); i5++) {
                    n0 w = aVar.w(i5);
                    String m4 = f.m(w.x(), e6.a, e6.b);
                    if (m4 != null) {
                        n0.a aVar5 = (n0.a) w.t();
                        aVar5.t(m4);
                        aVar.v(i5, aVar5);
                        list.set(i2, (k0) ((f4) aVar.s()));
                    }
                }
            }
            i2++;
            str3 = str3;
        }
        String str4 = str3;
        o();
        b();
        g.i(str);
        SQLiteDatabase v2 = v();
        v2.beginTransaction();
        try {
            o();
            b();
            g.i(str);
            SQLiteDatabase v3 = v();
            v3.delete("property_filters", "app_id=?", new String[]{str});
            v3.delete("event_filters", "app_id=?", new String[]{str});
            for (k0 k0Var : list) {
                o();
                b();
                g.i(str);
                g.l(k0Var);
                if (!k0Var.x()) {
                    l().H().b("Audience with no ID. appId", a4.w(str));
                } else {
                    int y = k0Var.y();
                    Iterator<l0> it = k0Var.C().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().x()) {
                                l().H().c("Event filter with no ID. Audience definition ignored. appId, audienceId", a4.w(str), Integer.valueOf(y));
                                break;
                            }
                        } else {
                            Iterator<n0> it2 = k0Var.A().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().v()) {
                                        l().H().c("Property filter with no ID. Audience definition ignored. appId, audienceId", a4.w(str), Integer.valueOf(y));
                                        break;
                                    }
                                } else {
                                    Iterator<l0> it3 = k0Var.C().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!T(str, y, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<n0> it4 = k0Var.A().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!U(str, y, it4.next())) {
                                                    z2 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    z2 = z;
                                    if (!z2) {
                                        o();
                                        b();
                                        g.i(str);
                                        SQLiteDatabase v4 = v();
                                        str2 = str4;
                                        v4.delete("property_filters", str2, new String[]{str, String.valueOf(y)});
                                        v4.delete("event_filters", str2, new String[]{str, String.valueOf(y)});
                                    } else {
                                        str2 = str4;
                                    }
                                    str4 = str2;
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (k0 k0Var2 : list) {
                arrayList.add(k0Var2.x() ? Integer.valueOf(k0Var2.y()) : null);
            }
            j0(str, arrayList);
            v2.setTransactionSuccessful();
        } finally {
            v2.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    public final void O(List<Long> list) {
        b();
        o();
        if (list == null) {
            throw new NullPointerException("null reference");
        } else if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (e0()) {
            String join = TextUtils.join(",", list);
            String j0 = je.j0(je.N0(join, 2), "(", join, ")");
            if (f0(je.j0(je.N0(j0, 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", j0, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                l().H().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = v();
                StringBuilder sb = new StringBuilder(String.valueOf(j0).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(j0);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb.toString());
            } catch (SQLiteException e2) {
                l().E().b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean P(c1 c1Var, boolean z) {
        b();
        o();
        g.i(c1Var.G1());
        g.o(c1Var.n1());
        v0();
        ((com.google.android.gms.common.util.d) d()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c1Var.o1() < currentTimeMillis - qa.G() || c1Var.o1() > qa.G() + currentTimeMillis) {
            l().H().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", a4.w(c1Var.G1()), Long.valueOf(currentTimeMillis), Long.valueOf(c1Var.o1()));
        }
        try {
            byte[] W = m().W(c1Var.i());
            l().M().b("Saving bundle, size", Integer.valueOf(W.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c1Var.G1());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1Var.o1()));
            contentValues.put("data", W);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c1Var.f0()) {
                contentValues.put("retry_count", Integer.valueOf(c1Var.n0()));
            }
            try {
                if (v().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                l().E().b("Failed to insert bundle (got -1). appId", a4.w(c1Var.G1()));
                return false;
            } catch (SQLiteException e2) {
                l().E().c("Error storing bundle. appId", a4.w(c1Var.G1()), e2);
                return false;
            }
        } catch (IOException e3) {
            l().E().c("Data loss. Failed to serialize bundle. appId", a4.w(c1Var.G1()), e3);
            return false;
        }
    }

    public final boolean Q(k kVar, long j2, boolean z) {
        b();
        o();
        g.i(kVar.a);
        byte[] i2 = m().x(kVar).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kVar.a);
        contentValues.put("name", kVar.b);
        contentValues.put("timestamp", Long.valueOf(kVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", i2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (v().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            l().E().b("Failed to insert raw event (got -1). appId", a4.w(kVar.a));
            return false;
        } catch (SQLiteException e2) {
            l().E().c("Error storing raw event. appId", a4.w(kVar.a), e2);
            return false;
        }
    }

    public final boolean R(aa aaVar) {
        b();
        o();
        if (l0(aaVar.a, aaVar.c) == null) {
            if (z9.Z(aaVar.c)) {
                long f0 = f0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{aaVar.a});
                qa j2 = j();
                String str = aaVar.a;
                j2.getClass();
                int i2 = 25;
                if (p7.b() && j2.x(null, t.E0)) {
                    i2 = Math.max(Math.min(j2.t(str, t.G), 100), 25);
                }
                if (f0 >= ((long) i2)) {
                    return false;
                }
            } else if (!"_npa".equals(aaVar.c) && f0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{aaVar.a, aaVar.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aaVar.a);
        contentValues.put("origin", aaVar.b);
        contentValues.put("name", aaVar.c);
        contentValues.put("set_timestamp", Long.valueOf(aaVar.d));
        K(contentValues, "value", aaVar.e);
        try {
            if (v().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                l().E().b("Failed to insert/update user property (got -1). appId", a4.w(aaVar.a));
            }
        } catch (SQLiteException e2) {
            l().E().c("Error storing user property. appId", a4.w(aaVar.a), e2);
        }
        return true;
    }

    public final boolean S(oa oaVar) {
        b();
        o();
        if (l0(oaVar.a, oaVar.c.b) == null && f0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{oaVar.a}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oaVar.a);
        contentValues.put("origin", oaVar.b);
        contentValues.put("name", oaVar.c.b);
        K(contentValues, "value", oaVar.c.I1());
        contentValues.put("active", Boolean.valueOf(oaVar.n));
        contentValues.put("trigger_event_name", oaVar.o);
        contentValues.put("trigger_timeout", Long.valueOf(oaVar.q));
        f();
        contentValues.put("timed_out_event", z9.i0(oaVar.p));
        contentValues.put("creation_timestamp", Long.valueOf(oaVar.f));
        f();
        contentValues.put("triggered_event", z9.i0(oaVar.r));
        contentValues.put("triggered_timestamp", Long.valueOf(oaVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(oaVar.s));
        f();
        contentValues.put("expired_event", z9.i0(oaVar.t));
        try {
            if (v().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                l().E().b("Failed to insert/update conditional user property (got -1)", a4.w(oaVar.a));
            }
        } catch (SQLiteException e2) {
            l().E().c("Error storing conditional user property", a4.w(oaVar.a), e2);
        }
        return true;
    }

    public final boolean V(String str, Long l2, long j2, y0 y0Var) {
        b();
        o();
        if (y0Var != null) {
            g.i(str);
            if (l2 != null) {
                byte[] i2 = y0Var.i();
                l().M().c("Saving complex main event, appId, data size", e().v(str), Integer.valueOf(i2.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("event_id", l2);
                contentValues.put("children_to_process", Long.valueOf(j2));
                contentValues.put("main_event", i2);
                try {
                    if (v().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                        return true;
                    }
                    l().E().b("Failed to insert complex main event (got -1). appId", a4.w(str));
                    return false;
                } catch (SQLiteException e2) {
                    l().E().c("Error storing complex main event. appId", a4.w(str), e2);
                    return false;
                }
            } else {
                throw new NullPointerException("null reference");
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0190 A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0194 A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01cc A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01e6 A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0216 A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0219 A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0228 A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x025e A[Catch:{ SQLiteException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.d4 g0(java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 676
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.g0(java.lang.String):com.google.android.gms.measurement.internal.d4");
    }

    public final List<oa> h0(String str, String str2, String str3) {
        g.i(str);
        b();
        o();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void i0(String str, String str2) {
        g.i(str);
        g.i(str2);
        b();
        o();
        try {
            v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            l().E().d("Error deleting user property. appId", a4.w(str), e().z(str2), e2);
        }
    }

    public final long k0(String str) {
        g.i(str);
        b();
        o();
        try {
            return (long) v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, j().t(str, t.p))))});
        } catch (SQLiteException e2) {
            l().E().c("Error deleting over the limit events. appId", a4.w(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.aa l0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.exoplayer2.util.g.i(r19)
            com.google.android.exoplayer2.util.g.i(r20)
            r18.b()
            r18.o()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.v()     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0083, all -> 0x007f }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007b, all -> 0x0077 }
            if (r0 != 0) goto L_0x0042
            r10.close()
            return r9
        L_0x0042:
            long r5 = r10.getLong(r1)
            r11 = r18
            java.lang.Object r7 = r11.E(r10, r2)     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.aa r0 = new com.google.android.gms.measurement.internal.aa     // Catch:{ SQLiteException -> 0x0075 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0075 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0075 }
            if (r1 == 0) goto L_0x0071
            com.google.android.gms.measurement.internal.a4 r1 = r18.l()     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.E()     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.a4.w(r19)     // Catch:{ SQLiteException -> 0x0075 }
            r1.b(r2, r3)     // Catch:{ SQLiteException -> 0x0075 }
        L_0x0071:
            r10.close()
            return r0
        L_0x0075:
            r0 = move-exception
            goto L_0x0087
        L_0x0077:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x007b:
            r0 = move-exception
            r11 = r18
            goto L_0x0087
        L_0x007f:
            r0 = move-exception
            r11 = r18
            goto L_0x00a8
        L_0x0083:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0087:
            com.google.android.gms.measurement.internal.a4 r1 = r18.l()     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.E()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.a4.w(r19)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.y3 r4 = r18.e()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = r4.z(r8)     // Catch:{ all -> 0x00a6 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a6 }
            if (r10 == 0) goto L_0x00a5
            r10.close()
        L_0x00a5:
            return r9
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            r9 = r10
        L_0x00a8:
            if (r9 == 0) goto L_0x00ad
            r9.close()
        L_0x00ad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.l0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.aa");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.oa m0(java.lang.String r33, java.lang.String r34) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.m0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.oa");
    }

    public final int n0(String str, String str2) {
        g.i(str);
        g.i(str2);
        b();
        o();
        try {
            return v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            l().E().d("Error deleting conditional property", a4.w(str), e().z(str2), e2);
            return 0;
        }
    }

    public final void o0() {
        o();
        v().beginTransaction();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.l0>> p0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.o()
            r12.b()
            com.google.android.exoplayer2.util.g.i(r13)
            com.google.android.exoplayer2.util.g.i(r14)
            m1 r0 = new m1
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0098 }
            if (r1 != 0) goto L_0x0046
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0098 }
            r14.close()
            return r13
        L_0x0046:
            byte[] r1 = r14.getBlob(r11)
            com.google.android.gms.internal.measurement.l0$a r2 = com.google.android.gms.internal.measurement.l0.I()     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.k5 r1 = com.google.android.gms.measurement.internal.v9.z(r2, r1)     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.l0$a r1 = (com.google.android.gms.internal.measurement.l0.a) r1     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.l5 r1 = r1.s()     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.f4 r1 = (com.google.android.gms.internal.measurement.f4) r1     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.l0 r1 = (com.google.android.gms.internal.measurement.l0) r1     // Catch:{ IOException -> 0x007c }
            int r2 = r14.getInt(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0078
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
        L_0x0078:
            r3.add(r1)
            goto L_0x008e
        L_0x007c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.a4 r2 = r12.l()
            com.google.android.gms.measurement.internal.c4 r2 = r2.E()
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.a4.w(r13)
            r2.c(r3, r4, r1)
        L_0x008e:
            boolean r1 = r14.moveToNext()
            if (r1 != 0) goto L_0x0046
            r14.close()
            return r0
        L_0x0098:
            r0 = move-exception
            goto L_0x009e
        L_0x009a:
            r13 = move-exception
            goto L_0x00d3
        L_0x009c:
            r0 = move-exception
            r14 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.a4 r1 = r12.l()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.E()     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.a4.w(r13)     // Catch:{ all -> 0x00d1 }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x00d1 }
            boolean r0 = com.google.android.gms.internal.measurement.n8.b()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.qa r0 = r12.j()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.q3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.t.N0     // Catch:{ all -> 0x00d1 }
            boolean r13 = r0.x(r13, r1)     // Catch:{ all -> 0x00d1 }
            if (r13 == 0) goto L_0x00cb
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00d1 }
            if (r14 == 0) goto L_0x00ca
            r14.close()
        L_0x00ca:
            return r13
        L_0x00cb:
            if (r14 == 0) goto L_0x00d0
            r14.close()
        L_0x00d0:
            return r9
        L_0x00d1:
            r13 = move-exception
            r9 = r14
        L_0x00d3:
            if (r9 == 0) goto L_0x00d8
            r9.close()
        L_0x00d8:
            goto L_0x00da
        L_0x00d9:
            throw r13
        L_0x00da:
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.p0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.n0>> q0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.o()
            r12.b()
            com.google.android.exoplayer2.util.g.i(r13)
            com.google.android.exoplayer2.util.g.i(r14)
            m1 r0 = new m1
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009c, all -> 0x009a }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0098 }
            if (r1 != 0) goto L_0x0046
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0098 }
            r14.close()
            return r13
        L_0x0046:
            byte[] r1 = r14.getBlob(r11)
            com.google.android.gms.internal.measurement.n0$a r2 = com.google.android.gms.internal.measurement.n0.D()     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.k5 r1 = com.google.android.gms.measurement.internal.v9.z(r2, r1)     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.n0$a r1 = (com.google.android.gms.internal.measurement.n0.a) r1     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.l5 r1 = r1.s()     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.f4 r1 = (com.google.android.gms.internal.measurement.f4) r1     // Catch:{ IOException -> 0x007c }
            com.google.android.gms.internal.measurement.n0 r1 = (com.google.android.gms.internal.measurement.n0) r1     // Catch:{ IOException -> 0x007c }
            int r2 = r14.getInt(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0078
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
        L_0x0078:
            r3.add(r1)
            goto L_0x008e
        L_0x007c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.a4 r2 = r12.l()
            com.google.android.gms.measurement.internal.c4 r2 = r2.E()
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.a4.w(r13)
            r2.c(r3, r4, r1)
        L_0x008e:
            boolean r1 = r14.moveToNext()
            if (r1 != 0) goto L_0x0046
            r14.close()
            return r0
        L_0x0098:
            r0 = move-exception
            goto L_0x009e
        L_0x009a:
            r13 = move-exception
            goto L_0x00d3
        L_0x009c:
            r0 = move-exception
            r14 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.a4 r1 = r12.l()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.E()     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.a4.w(r13)     // Catch:{ all -> 0x00d1 }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x00d1 }
            boolean r0 = com.google.android.gms.internal.measurement.n8.b()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.qa r0 = r12.j()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.q3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.t.N0     // Catch:{ all -> 0x00d1 }
            boolean r13 = r0.x(r13, r1)     // Catch:{ all -> 0x00d1 }
            if (r13 == 0) goto L_0x00cb
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00d1 }
            if (r14 == 0) goto L_0x00ca
            r14.close()
        L_0x00ca:
            return r13
        L_0x00cb:
            if (r14 == 0) goto L_0x00d0
            r14.close()
        L_0x00d0:
            return r9
        L_0x00d1:
            r13 = move-exception
            r9 = r14
        L_0x00d3:
            if (r9 == 0) goto L_0x00d8
            r9.close()
        L_0x00d8:
            goto L_0x00da
        L_0x00d9:
            throw r13
        L_0x00da:
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.q0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.p9
    public final boolean r() {
        return false;
    }

    public final void r0() {
        o();
        v().endTransaction();
    }

    public final long s0(String str) {
        g.i(str);
        return z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: protected */
    public final long t0(String str, String str2) {
        Throwable th;
        SQLiteException e2;
        long z;
        g.i(str);
        g.i(str2);
        b();
        o();
        SQLiteDatabase v = v();
        v.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(str2.length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                z = z(sb.toString(), new String[]{str}, -1);
                if (z == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (v.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        l().E().c("Failed to insert column (got -1). appId", a4.w(str), str2);
                        v.endTransaction();
                        return -1;
                    }
                    z = 0;
                }
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    l().E().d("Error inserting column. appId", a4.w(str), str2, e2);
                    v.endTransaction();
                    return j2;
                } catch (Throwable th2) {
                    th = th2;
                    v.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + z));
                if (((long) v.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    l().E().c("Failed to update column (got 0). appId", a4.w(str), str2);
                    v.endTransaction();
                    return -1;
                }
                v.setTransactionSuccessful();
                v.endTransaction();
                return z;
            } catch (SQLiteException e4) {
                e2 = e4;
                j2 = z;
                l().E().d("Error inserting column. appId", a4.w(str), str2, e2);
                v.endTransaction();
                return j2;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            l().E().d("Error inserting column. appId", a4.w(str), str2, e2);
            v.endTransaction();
            return j2;
        } catch (Throwable th3) {
            th = th3;
            v.endTransaction();
            throw th;
        }
    }

    public final void u() {
        o();
        v().setTransactionSuccessful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle u0(java.lang.String r8) {
        /*
            r7 = this;
            r7.b()
            r7.o()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.v()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r2 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.a4 r8 = r7.l()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.M()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x002e:
            byte[] r2 = r1.getBlob(r4)
            com.google.android.gms.internal.measurement.y0$a r3 = com.google.android.gms.internal.measurement.y0.M()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.k5 r2 = com.google.android.gms.measurement.internal.v9.z(r3, r2)     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.y0$a r2 = (com.google.android.gms.internal.measurement.y0.a) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.l5 r2 = r2.s()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.f4) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.y0 r2 = (com.google.android.gms.internal.measurement.y0) r2     // Catch:{ IOException -> 0x00a0 }
            r7.m()
            java.util.List r8 = r2.v()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0054:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r8.next()
            com.google.android.gms.internal.measurement.a1 r3 = (com.google.android.gms.internal.measurement.a1) r3
            java.lang.String r4 = r3.B()
            boolean r5 = r3.M()
            if (r5 == 0) goto L_0x0072
            double r5 = r3.N()
            r2.putDouble(r4, r5)
            goto L_0x0054
        L_0x0072:
            boolean r5 = r3.K()
            if (r5 == 0) goto L_0x0080
            float r3 = r3.L()
            r2.putFloat(r4, r3)
            goto L_0x0054
        L_0x0080:
            boolean r5 = r3.F()
            if (r5 == 0) goto L_0x008e
            java.lang.String r3 = r3.G()
            r2.putString(r4, r3)
            goto L_0x0054
        L_0x008e:
            boolean r5 = r3.I()
            if (r5 == 0) goto L_0x0054
            long r5 = r3.J()
            r2.putLong(r4, r5)
            goto L_0x0054
        L_0x009c:
            r1.close()
            return r2
        L_0x00a0:
            r2 = move-exception
            com.google.android.gms.measurement.internal.a4 r3 = r7.l()
            com.google.android.gms.measurement.internal.c4 r3 = r3.E()
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.a4.w(r8)
            r3.c(r4, r8, r2)
            r1.close()
            return r0
        L_0x00b6:
            r8 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8 = move-exception
            goto L_0x00d1
        L_0x00ba:
            r8 = move-exception
            r1 = r0
        L_0x00bc:
            com.google.android.gms.measurement.internal.a4 r2 = r7.l()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.c4 r2 = r2.E()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00ce
            r1.close()
        L_0x00ce:
            return r0
        L_0x00cf:
            r8 = move-exception
            r0 = r1
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            r0.close()
        L_0x00d6:
            goto L_0x00d8
        L_0x00d7:
            throw r8
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.u0(java.lang.String):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase v() {
        b();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e2) {
            l().H().b("Error opening database", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void v0() {
        b();
        o();
        if (e0()) {
            long a = h().h.a();
            ((com.google.android.gms.common.util.d) d()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > t.y.a(null).longValue()) {
                h().h.b(elapsedRealtime);
                b();
                o();
                if (e0()) {
                    SQLiteDatabase v = v();
                    ((com.google.android.gms.common.util.d) d()).getClass();
                    int delete = v.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(qa.G())});
                    if (delete > 0) {
                        l().M().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003b
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            com.google.android.gms.measurement.internal.a4 r3 = r6.l()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.c4 r3 = r3.E()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.w():java.lang.String");
    }

    public final long w0() {
        return z("select max(bundle_end_timestamp) from queue", null, 0);
    }

    public final boolean x() {
        return f0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final long x0() {
        return z("select max(timestamp) from raw_events", null, 0);
    }

    public final long y(c1 c1Var) {
        b();
        o();
        g.i(c1Var.G1());
        byte[] i2 = c1Var.i();
        long v = m().v(i2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1Var.G1());
        contentValues.put("metadata_fingerprint", Long.valueOf(v));
        contentValues.put("metadata", i2);
        try {
            v().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return v;
        } catch (SQLiteException e2) {
            l().E().c("Error storing raw event metadata. appId", a4.w(c1Var.G1()), e2);
            throw e2;
        }
    }

    public final boolean y0() {
        return f0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean z0() {
        return f0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }
}
