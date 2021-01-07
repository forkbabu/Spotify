package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class b {

    private static class a extends b {
        private final ActivityOptions a;

        a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        @Override // androidx.core.app.b
        public Bundle c() {
            return this.a.toBundle();
        }
    }

    protected b() {
    }

    public static b a(Context context, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return new a(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static b b(Activity activity, View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new b();
    }

    public Bundle c() {
        return null;
    }
}
