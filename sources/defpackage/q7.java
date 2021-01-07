package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;

/* renamed from: q7  reason: default package */
public interface q7 extends Closeable {

    /* renamed from: q7$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
            if (r0 != null) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
            if (r3.hasNext() != false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            a(r3.o());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002a A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v12 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0025, B:8:0x002c, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(defpackage.p7 r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Corruption reported by sqlite on database: "
                java.lang.StringBuilder r0 = defpackage.je.V0(r0)
                java.lang.String r1 = r3.o()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0024
                java.lang.String r3 = r3.o()
                r2.a(r3)
                return
            L_0x0024:
                r0 = 0
                java.util.List r0 = r3.z()     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
                goto L_0x002c
            L_0x002a:
                r1 = move-exception
                goto L_0x0030
            L_0x002c:
                r3.close()     // Catch:{ IOException -> 0x0052, all -> 0x002a }
                goto L_0x0053
            L_0x0030:
                if (r0 == 0) goto L_0x004a
                java.util.Iterator r3 = r0.iterator()
            L_0x0036:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0051
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0036
            L_0x004a:
                java.lang.String r3 = r3.o()
                r2.a(r3)
            L_0x0051:
                throw r1
            L_0x0052:
            L_0x0053:
                if (r0 == 0) goto L_0x006d
                java.util.Iterator r3 = r0.iterator()
            L_0x0059:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0074
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0059
            L_0x006d:
                java.lang.String r3 = r3.o()
                r2.a(r3)
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.q7.a.b(p7):void");
        }

        public abstract void c(p7 p7Var);

        public abstract void d(p7 p7Var);

        public abstract void e(p7 p7Var, int i, int i2);
    }

    /* renamed from: q7$b */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        /* renamed from: q7$b$a */
        public static class a {
            Context a;
            String b;
            a c;
            boolean d;

            a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.d || !TextUtils.isEmpty(this.b)) {
                    return new b(this.a, this.b, this.c, this.d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(boolean z) {
                this.d = z;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: q7$c */
    public interface c {
        q7 a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    p7 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
