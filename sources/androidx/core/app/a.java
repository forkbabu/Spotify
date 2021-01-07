package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

public class a extends androidx.core.content.a {
    public static final /* synthetic */ int c = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    public class RunnableC0025a implements Runnable {
        final /* synthetic */ String[] a;
        final /* synthetic */ Activity b;
        final /* synthetic */ int c;

        RunnableC0025a(String[] strArr, Activity activity, int i) {
            this.a = strArr;
            this.b = activity;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.a.length];
            PackageManager packageManager = this.b.getPackageManager();
            String packageName = this.b.getPackageName();
            int length = this.a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.a[i], packageName);
            }
            ((b) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
        }
    }

    public interface b {
        @Override // androidx.core.app.a.b
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface c {
        void U(int i);
    }

    public static Uri g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static void h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!c.c(activity)) {
            activity.recreate();
        }
    }

    public static void i(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).U(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0025a(strArr, activity, i));
        }
    }

    public static boolean j(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
