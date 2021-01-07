package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.a;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u52  reason: default package */
public final class u52 implements w52 {
    @Override // defpackage.w52
    public void a(int i, Fragment fragment, Set<String> set, String str, boolean z) {
        Intent c = PermissionsRequestActivity.c(fragment.j4(), (String[]) set.toArray(new String[0]));
        c.putExtra("permission_rationale", str);
        c.putExtra("permission_rationale_always_show", z);
        fragment.H4(c, i, null);
    }

    @Override // defpackage.w52
    public PermissionsRequestActivity.a b(Intent intent) {
        int i = PermissionsRequestActivity.f;
        return (PermissionsRequestActivity.a) intent.getParcelableExtra("permission_result");
    }

    @Override // defpackage.w52
    public void c(Activity activity, String... strArr) {
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(strArr.length);
        Collections.addAll(newHashSetWithExpectedSize, strArr);
        activity.startActivityForResult(PermissionsRequestActivity.c(activity, (String[]) newHashSetWithExpectedSize.toArray(new String[0])), 4660);
    }

    @Override // defpackage.w52
    public void d(int i, Fragment fragment, Set<String> set) {
        fragment.H4(PermissionsRequestActivity.c(fragment.j4(), (String[]) set.toArray(new String[0])), i, null);
    }

    @Override // defpackage.w52
    public boolean e(Activity activity, String str) {
        return a.j(activity, str);
    }

    @Override // defpackage.w52
    public boolean f(Context context, String str) {
        return androidx.core.content.a.a(context, str) == 0;
    }
}
