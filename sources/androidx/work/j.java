package androidx.work;

import android.util.Log;

public abstract class j {
    private static j a;

    public static class a extends j {
        private int b;

        public a(int i) {
            this.b = i;
        }

        @Override // androidx.work.j
        public void a(String str, String str2, Throwable... thArr) {
            if (this.b <= 3 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        @Override // androidx.work.j
        public void b(String str, String str2, Throwable... thArr) {
            if (this.b > 6) {
                return;
            }
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.j
        public void d(String str, String str2, Throwable... thArr) {
            if (this.b <= 4 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        @Override // androidx.work.j
        public void g(String str, String str2, Throwable... thArr) {
            if (this.b <= 2 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        @Override // androidx.work.j
        public void h(String str, String str2, Throwable... thArr) {
            if (this.b <= 5 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            if (a == null) {
                a = new a(3);
            }
            jVar = a;
        }
        return jVar;
    }

    public static synchronized void e(j jVar) {
        synchronized (j.class) {
            a = jVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder T0 = je.T0(23, "WM-");
        if (length >= 20) {
            T0.append(str.substring(0, 20));
        } else {
            T0.append(str);
        }
        return T0.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
