package com.spotify.music.mainactivity;

import android.app.Activity;
import android.net.Uri;
import android.os.BadParcelableException;
import android.text.TextUtils;
import androidx.core.app.a;
import com.spotify.base.java.logging.Logger;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class u {
    public Uri a(Activity activity) {
        h.e(activity, "activity");
        try {
            return a.g(activity);
        } catch (BadParcelableException e) {
            Logger.e(e, "BadParcelableException while reading referrer", new Object[0]);
            return null;
        } catch (RuntimeException e2) {
            String message = e2.getMessage();
            if (!TextUtils.isEmpty(message)) {
                h.c(message);
                if (e.c(message, "Unmarshalling unknown type", false, 2, null)) {
                    Logger.e(e2, "Unmarshalling unknown type RuntimeException while reading referrer", new Object[0]);
                    return null;
                }
            }
            throw e2;
        }
    }
}
