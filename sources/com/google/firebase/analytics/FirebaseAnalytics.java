package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.measurement.internal.i7;
import com.google.android.gms.tasks.j;
import com.google.firebase.installations.f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final h a;

    private FirebaseAnalytics(h hVar) {
        if (hVar != null) {
            this.a = hVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(h.a(context, null, null, null, null));
                }
            }
        }
        return b;
    }

    @Keep
    public static i7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        h a2 = h.a(context, null, null, null, bundle);
        if (a2 == null) {
            return null;
        }
        return new a(a2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) j.b(f.f().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.g(activity, str, str2);
    }
}
