package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.play.core.internal.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class d implements a {
    private static final a e = new a("MissingSplitsManagerImpl");
    private final Context a;
    private final Runtime b;
    private final c c;
    private final AtomicReference<Boolean> d;

    d(Context context, Runtime runtime, c cVar, AtomicReference<Boolean> atomicReference) {
        this.a = context;
        this.b = runtime;
        this.c = cVar;
        this.d = atomicReference;
    }

    private final boolean c() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required"))) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            e.g("App '%s' is not found in the PackageManager", this.a.getPackageName());
            return false;
        }
    }

    private final Set<String> d() {
        String[] strArr;
        if (Build.VERSION.SDK_INT < 21) {
            return Collections.emptySet();
        }
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo == null || (strArr = packageInfo.splitNames) == null) {
                return hashSet;
            }
            Collections.addAll(hashSet, strArr);
            return hashSet;
        } catch (PackageManager.NameNotFoundException unused) {
            e.g("App '%s' is not found in PackageManager", this.a.getPackageName());
            return Collections.emptySet();
        }
    }

    private final List<ActivityManager.AppTask> e() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.a.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    @Override // com.google.android.play.core.missingsplits.a
    public final boolean a() {
        boolean booleanValue;
        boolean z;
        Intent intent;
        boolean z2;
        Bundle bundle;
        Set set;
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return false;
        }
        synchronized (this.d) {
            if (this.d.get() == null) {
                AtomicReference<Boolean> atomicReference = this.d;
                if (i >= 21) {
                    try {
                        ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
                        if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null || !Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required")))) {
                            if (i >= 21) {
                                try {
                                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                                    HashSet hashSet = new HashSet();
                                    if (!(packageInfo == null || (strArr = packageInfo.splitNames) == null)) {
                                        Collections.addAll(hashSet, strArr);
                                    }
                                    set = hashSet;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    e.g("App '%s' is not found in PackageManager", this.a.getPackageName());
                                }
                                if (set.isEmpty() || (set.size() == 1 && set.contains(""))) {
                                    z2 = true;
                                    atomicReference.set(Boolean.valueOf(z2));
                                }
                            }
                            set = Collections.emptySet();
                            z2 = true;
                            atomicReference.set(Boolean.valueOf(z2));
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        e.g("App '%s' is not found in the PackageManager", this.a.getPackageName());
                    }
                }
                z2 = false;
                atomicReference.set(Boolean.valueOf(z2));
            }
            booleanValue = this.d.get().booleanValue();
        }
        if (booleanValue) {
            Iterator<ActivityManager.AppTask> it = e().iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.AppTask next = it.next();
                    if (!(next.getTaskInfo() == null || next.getTaskInfo().baseIntent == null || next.getTaskInfo().baseIntent.getComponent() == null || !PlayCoreMissingSplitsActivity.class.getName().equals(next.getTaskInfo().baseIntent.getComponent().getClassName()))) {
                        break;
                    }
                } else {
                    Iterator<ActivityManager.AppTask> it2 = e().iterator();
                    loop1:
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        ActivityManager.RecentTaskInfo taskInfo = it2.next().getTaskInfo();
                        if (!(taskInfo == null || (intent = taskInfo.baseIntent) == null || intent.getComponent() == null)) {
                            ComponentName component = taskInfo.baseIntent.getComponent();
                            String className = component.getClassName();
                            try {
                                Class<?> cls = Class.forName(className);
                                while (cls != null) {
                                    if (cls.equals(Activity.class)) {
                                        break loop1;
                                    }
                                    Class<? super Object> superclass = cls.getSuperclass();
                                    cls = superclass != cls ? superclass : null;
                                }
                                continue;
                            } catch (ClassNotFoundException unused3) {
                                e.g("ClassNotFoundException when scanning class hierarchy of '%s'", className);
                                try {
                                    if (this.a.getPackageManager().getActivityInfo(component, 0) != null) {
                                        break;
                                    }
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    continue;
                                }
                            }
                        }
                    }
                    z = true;
                    this.c.c();
                    for (ActivityManager.AppTask appTask : e()) {
                        appTask.finishAndRemoveTask();
                    }
                    if (z) {
                        this.a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a, PlayCoreMissingSplitsActivity.class), 1, 1);
                        this.a.startActivity(new Intent(this.a, PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                    }
                    this.b.exit(0);
                }
            }
            return true;
        }
        if (this.c.b()) {
            this.c.d();
            this.b.exit(0);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r2 == false) goto L_0x0017;
     */
    @Override // com.google.android.play.core.missingsplits.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r6.d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.d     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0038 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0038 }
            if (r1 != 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.d     // Catch:{ all -> 0x0038 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0038 }
            r3 = 21
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L_0x0019
        L_0x0017:
            r4 = 0
            goto L_0x003f
        L_0x0019:
            boolean r2 = r6.c()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0017
            java.util.Set r2 = r6.d()     // Catch:{ all -> 0x0038 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x003c
            int r3 = r2.size()     // Catch:{ all -> 0x0038 }
            if (r3 != r4) goto L_0x003a
            java.lang.String r3 = ""
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x003a
            goto L_0x003c
        L_0x0038:
            r1 = move-exception
            goto L_0x0054
        L_0x003a:
            r2 = 0
            goto L_0x003d
        L_0x003c:
            r2 = 1
        L_0x003d:
            if (r2 == 0) goto L_0x0017
        L_0x003f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0038 }
            r1.set(r2)     // Catch:{ all -> 0x0038 }
        L_0x0046:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.d     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0038 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0038 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x0057
        L_0x0056:
            throw r1
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.d.b():boolean");
    }
}
