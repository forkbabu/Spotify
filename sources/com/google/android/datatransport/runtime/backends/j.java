package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

class j implements e {
    private final a a;
    private final h b;
    private final Map<String, l> c = new HashMap();

    static class a {
        private final Context a;
        private Map<String, String> b = null;

        a(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.datatransport.runtime.backends.d a(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.b
                r3 = 0
                r4 = 0
                if (r2 != 0) goto L_0x0080
                android.content.Context r2 = r13.a
                android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0026 }
                if (r5 != 0) goto L_0x0013
                goto L_0x0026
            L_0x0013:
                android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0026 }
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r6.<init>(r2, r7)     // Catch:{ NameNotFoundException -> 0x0026 }
                r2 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0026 }
                if (r2 != 0) goto L_0x0023
                goto L_0x0026
            L_0x0023:
                android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0026 }
                goto L_0x0027
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != 0) goto L_0x002e
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L_0x007e
            L_0x002e:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Set r6 = r2.keySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x003b:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x007d
                java.lang.Object r7 = r6.next()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r2.get(r7)
                boolean r9 = r8 instanceof java.lang.String
                if (r9 == 0) goto L_0x003b
                java.lang.String r9 = "backend:"
                boolean r9 = r7.startsWith(r9)
                if (r9 == 0) goto L_0x003b
                java.lang.String r8 = (java.lang.String) r8
                r9 = -1
                java.lang.String r10 = ","
                java.lang.String[] r8 = r8.split(r10, r9)
                int r9 = r8.length
                r10 = 0
            L_0x0062:
                if (r10 >= r9) goto L_0x003b
                r11 = r8[r10]
                java.lang.String r11 = r11.trim()
                boolean r12 = r11.isEmpty()
                if (r12 == 0) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r12 = 8
                java.lang.String r12 = r7.substring(r12)
                r5.put(r11, r12)
            L_0x007a:
                int r10 = r10 + 1
                goto L_0x0062
            L_0x007d:
                r2 = r5
            L_0x007e:
                r13.b = r2
            L_0x0080:
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.b
                java.lang.Object r14 = r2.get(r14)
                java.lang.String r14 = (java.lang.String) r14
                if (r14 != 0) goto L_0x008b
                return r3
            L_0x008b:
                r2 = 1
                java.lang.Class r5 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Class<com.google.android.datatransport.runtime.backends.d> r6 = com.google.android.datatransport.runtime.backends.d.class
                java.lang.Class r5 = r5.asSubclass(r6)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                com.google.android.datatransport.runtime.backends.d r5 = (com.google.android.datatransport.runtime.backends.d) r5     // Catch:{ ClassNotFoundException -> 0x00c5, IllegalAccessException -> 0x00bd, InstantiationException -> 0x00b5, NoSuchMethodException -> 0x00ad, InvocationTargetException -> 0x00a5 }
                return r5
            L_0x00a5:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto L_0x00ce
            L_0x00ad:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto L_0x00ce
            L_0x00b5:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto L_0x00ce
            L_0x00bd:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto L_0x00ce
            L_0x00c5:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String r14 = "Class %s is not found."
                java.lang.String.format(r14, r0)
            L_0x00ce:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.j.a.a(java.lang.String):com.google.android.datatransport.runtime.backends.d");
        }
    }

    j(Context context, h hVar) {
        a aVar = new a(context);
        this.a = aVar;
        this.b = hVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    public synchronized l get(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        d a2 = this.a.a(str);
        if (a2 == null) {
            return null;
        }
        l create = a2.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }
}
