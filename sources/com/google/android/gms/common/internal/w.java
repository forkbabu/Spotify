package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.f;
import com.google.android.gms.common.util.e;
import com.spotify.music.C0707R;
import java.util.Locale;

public final class w {
    private static final t1<String, String> a = new t1<>();
    private static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0707R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C0707R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C0707R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return b(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return b(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return b(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return b(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String b(Context context, String str) {
        Resources resources;
        t1<String, String> t1Var = a;
        synchronized (t1Var) {
            Locale b2 = e2.i(context.getResources().getConfiguration()).b(0);
            if (!b2.equals(b)) {
                t1Var.clear();
                b = b2;
            }
            String orDefault = t1Var.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i = f.f;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing resource: ".concat(valueOf);
                } else {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Got empty resource: ".concat(valueOf2);
                } else {
                    new String("Got empty resource: ");
                }
                return null;
            }
            t1Var.put(str, string);
            return string;
        }
    }

    private static String c(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String b2 = b(context, str);
        if (b2 == null) {
            b2 = resources.getString(C0707R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, b2, str2);
    }

    private static String d(Context context) {
        String packageName = context.getPackageName();
        try {
            return xr.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String e(Context context, int i) {
        String str;
        if (i == 6) {
            str = b(context, "common_google_play_services_resolution_required_title");
        } else {
            str = a(context, i);
        }
        return str == null ? context.getResources().getString(C0707R.string.common_google_play_services_notification_ticker) : str;
    }

    public static String f(Context context, int i) {
        Resources resources = context.getResources();
        String d = d(context);
        if (i == 1) {
            return resources.getString(C0707R.string.common_google_play_services_install_text, d);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(C0707R.string.common_google_play_services_enable_text, d);
            }
            if (i == 5) {
                return c(context, "common_google_play_services_invalid_account_text", d);
            }
            if (i == 7) {
                return c(context, "common_google_play_services_network_error_text", d);
            }
            if (i == 9) {
                return resources.getString(C0707R.string.common_google_play_services_unsupported_text, d);
            }
            if (i == 20) {
                return c(context, "common_google_play_services_restricted_profile_text", d);
            }
            switch (i) {
                case 16:
                    return c(context, "common_google_play_services_api_unavailable_text", d);
                case 17:
                    return c(context, "common_google_play_services_sign_in_failed_text", d);
                case 18:
                    return resources.getString(C0707R.string.common_google_play_services_updating_text, d);
                default:
                    return resources.getString(C0707R.string.common_google_play_services_unknown_issue, d);
            }
        } else if (e.g(context)) {
            return resources.getString(C0707R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C0707R.string.common_google_play_services_update_text, d);
        }
    }

    public static String g(Context context, int i) {
        if (i == 6 || i == 19) {
            return c(context, "common_google_play_services_resolution_required_text", d(context));
        }
        return f(context, i);
    }
}
