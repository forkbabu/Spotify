package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.lyrics.core.experience.model.ProviderAndroidIntent;
import kotlin.jvm.internal.h;

/* renamed from: sdb  reason: default package */
public final class sdb {
    private static final boolean a(Context context, Intent intent) {
        return (intent != null ? intent.resolveActivity(context.getPackageManager()) : null) != null;
    }

    private static final Intent b(ProviderAndroidIntent providerAndroidIntent, boolean z) {
        Intent intent = new Intent(providerAndroidIntent.getAction());
        intent.setPackage(providerAndroidIntent.getProviderAndroidPackage());
        if (!(providerAndroidIntent.getData() == null || providerAndroidIntent.getContentType() == null)) {
            intent.setDataAndType(Uri.parse(providerAndroidIntent.getData()), providerAndroidIntent.getContentType());
        }
        if (z) {
            intent.setComponent(new ComponentName(providerAndroidIntent.getProviderAndroidPackage(), ""));
        }
        return intent;
    }

    private static final Uri c(String str) {
        return Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", str).build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0123 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(java.util.List<com.spotify.music.lyrics.core.experience.model.LyricsLineData> r5) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdb.d(java.util.List):boolean");
    }

    private static final void e(Context context, Uri uri) {
        Intent flags = new Intent("android.intent.action.VIEW").setData(uri).setFlags(268435456);
        h.d(flags, "Intent(Intent.ACTION_VIE…t.FLAG_ACTIVITY_NEW_TASK)");
        f(context, flags);
    }

    private static final boolean f(Context context, Intent intent) {
        if (!a(context, intent)) {
            return false;
        }
        h.c(intent);
        intent.setFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    public static final void g(Context context, ProviderAndroidIntent providerAndroidIntent) {
        h.e(context, "context");
        h.e(providerAndroidIntent, "providerAndroidIntent");
        String providerAndroidPackage = providerAndroidIntent.getProviderAndroidPackage();
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(providerAndroidPackage, 0);
            h.d(applicationInfo, "manager.getApplicationInfo(packageName, 0)");
            Intent intent = null;
            if (providerAndroidIntent.getAction() != null) {
                Intent b = b(providerAndroidIntent, false);
                if (!a(context, b)) {
                    Logger.n("Unable to resolve activity for provider: %s", providerAndroidIntent.toString());
                } else {
                    intent = b;
                }
            }
            if (intent == null) {
                intent = packageManager.getLaunchIntentForPackage(applicationInfo.packageName);
            }
            if (f(context, intent)) {
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.b("Application not installed: %s", providerAndroidPackage);
        } catch (Throwable th) {
            Uri c = c(providerAndroidPackage);
            h.d(c, "getPlayStoreApplicationUri(packageName)");
            e(context, c);
            throw th;
        }
        Uri c2 = c(providerAndroidPackage);
        h.d(c2, "getPlayStoreApplicationUri(packageName)");
        e(context, c2);
    }
}
