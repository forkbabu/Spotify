package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import java.util.Set;

/* renamed from: w52  reason: default package */
public interface w52 {
    void a(int i, Fragment fragment, Set<String> set, String str, boolean z);

    PermissionsRequestActivity.a b(Intent intent);

    void c(Activity activity, String... strArr);

    void d(int i, Fragment fragment, Set<String> set);

    boolean e(Activity activity, String str);

    boolean f(Context context, String str);
}
