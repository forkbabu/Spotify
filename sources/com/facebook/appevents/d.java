package com.facebook.appevents;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* access modifiers changed from: package-private */
public class d {

    /* access modifiers changed from: private */
    public static class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(AppEvent.SerializationProxyV1.class) : readClassDescriptor;
        }
    }

    d() {
    }

    public static synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, j jVar) {
        synchronized (d.class) {
            PersistedEvents c = c();
            if (c.b(accessTokenAppIdPair)) {
                c.c(accessTokenAppIdPair).addAll(jVar.d());
            } else {
                c.a(accessTokenAppIdPair, jVar.d());
            }
            d(c);
        }
    }

    public static synchronized void b(b bVar) {
        synchronized (d.class) {
            PersistedEvents c = c();
            for (AccessTokenAppIdPair accessTokenAppIdPair : bVar.f()) {
                c.a(accessTokenAppIdPair, bVar.c(accessTokenAppIdPair).d());
            }
            d(c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC, Splitter:B:21:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0043 A[SYNTHETIC, Splitter:B:33:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0055 A[SYNTHETIC, Splitter:B:45:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.appevents.PersistedEvents c() {
        /*
            java.lang.Class<com.facebook.appevents.d> r0 = com.facebook.appevents.d.class
            monitor-enter(r0)
            android.content.Context r1 = com.facebook.k.d()     // Catch:{ all -> 0x0068 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0052, Exception -> 0x0040, all -> 0x002e }
            com.facebook.appevents.d$a r4 = new com.facebook.appevents.d$a     // Catch:{ FileNotFoundException -> 0x0052, Exception -> 0x0040, all -> 0x002e }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0052, Exception -> 0x0040, all -> 0x002e }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0052, Exception -> 0x0040, all -> 0x002e }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0052, Exception -> 0x0040, all -> 0x002e }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0053, Exception -> 0x0041, all -> 0x002c }
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch:{ FileNotFoundException -> 0x0053, Exception -> 0x0041, all -> 0x002c }
            r4.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002a }
            r1.delete()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            r2 = r3
            goto L_0x005f
        L_0x002c:
            r2 = move-exception
            goto L_0x0031
        L_0x002e:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L_0x0031:
            if (r4 == 0) goto L_0x0036
            r4.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x003f }
            r1.delete()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r2
        L_0x0040:
            r4 = r2
        L_0x0041:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0050 }
        L_0x004c:
            r1.delete()     // Catch:{ Exception -> 0x0050 }
            goto L_0x005f
        L_0x0050:
            goto L_0x005f
        L_0x0052:
            r4 = r2
        L_0x0053:
            if (r4 == 0) goto L_0x0058
            r4.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)
            goto L_0x004c
        L_0x005f:
            if (r2 != 0) goto L_0x0066
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents
            r2.<init>()
        L_0x0066:
            monitor-exit(r0)
            return r2
        L_0x0068:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x006c
        L_0x006b:
            throw r1
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.d.c():com.facebook.appevents.PersistedEvents");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v2 java.io.ObjectOutputStream) = (r2v0 java.io.ObjectOutputStream), (r2v1 java.io.ObjectOutputStream), (r2v1 java.io.ObjectOutputStream), (r2v0 java.io.ObjectOutputStream) binds: [B:1:0x0007, B:11:0x0023, B:13:?, B:2:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[SYNTHETIC, Splitter:B:16:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void d(com.facebook.appevents.PersistedEvents r6) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            android.content.Context r1 = com.facebook.k.d()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r5 = 0
            java.io.FileOutputStream r5 = r1.openFileOutput(r0, r5)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r3.writeObject(r6)     // Catch:{ Exception -> 0x001f, all -> 0x001d }
            r3.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0038
        L_0x001d:
            r6 = move-exception
            goto L_0x002c
        L_0x001f:
            r2 = r3
            goto L_0x0023
        L_0x0021:
            r6 = move-exception
            goto L_0x002b
        L_0x0023:
            java.io.File r6 = r1.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0032, all -> 0x0021 }
            r6.delete()     // Catch:{ Exception -> 0x0032, all -> 0x0021 }
            goto L_0x0033
        L_0x002b:
            r3 = r2
        L_0x002c:
            if (r3 == 0) goto L_0x0031
            r3.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r6
        L_0x0032:
        L_0x0033:
            if (r2 == 0) goto L_0x0038
            r2.close()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.d.d(com.facebook.appevents.PersistedEvents):void");
    }
}
