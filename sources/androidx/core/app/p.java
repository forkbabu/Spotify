package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
public class p {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(h hVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat c2 = hVar.c();
        bundle2.putInt("icon", c2 != null ? c2.g() : 0);
        bundle2.putCharSequence("title", hVar.j);
        bundle2.putParcelable("actionIntent", hVar.k);
        if (hVar.a != null) {
            bundle = new Bundle(hVar.a);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", hVar.a());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", d(hVar.d()));
        bundle2.putBoolean("showsUserInterface", hVar.f);
        bundle2.putInt("semanticAction", hVar.e());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                c = true;
                return null;
            }
        }
    }

    private static Bundle[] d(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rVarArr.length];
        for (int i = 0; i < rVarArr.length; i++) {
            r rVar = rVarArr[i];
            Bundle bundle = new Bundle();
            rVar.getClass();
            bundle.putString("resultKey", null);
            bundle.putCharSequence("label", null);
            bundle.putCharSequenceArray("choices", null);
            bundle.putBoolean("allowFreeFormInput", false);
            bundle.putBundle("extras", null);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public static Bundle e(Notification.Builder builder, h hVar) {
        IconCompat c2 = hVar.c();
        builder.addAction(c2 != null ? c2.g() : 0, hVar.j, hVar.k);
        Bundle bundle = new Bundle(hVar.a);
        if (hVar.d() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", d(hVar.d()));
        }
        if (hVar.b() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", d(hVar.b()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", hVar.a());
        return bundle;
    }
}
