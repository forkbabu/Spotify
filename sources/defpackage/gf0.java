package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.adjust.sdk.Adjust;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: gf0  reason: default package */
public final class gf0 {
    public static <E> ImmutableList<E> a(Collection<? extends E> collection) {
        if (collection == null) {
            return ImmutableList.of();
        }
        return ImmutableList.copyOf((Collection) collection);
    }

    public static <K, V> Map<K, V> b() {
        return Collections.synchronizedMap(new WeakHashMap(16));
    }

    public static String c(String str, Charset charset) {
        try {
            str.getClass();
            String name = charset.name();
            name.getClass();
            return URLDecoder.decode(str, name);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String d(String str, Charset charset) {
        try {
            str.getClass();
            String name = charset.name();
            name.getClass();
            return URLEncoder.encode(str, name);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String f() {
        String adid = Adjust.getAdid();
        if (!TextUtils.isEmpty(adid)) {
            return adid;
        }
        Logger.n("Got an empty Adjust ad id, can't set deduplication id", new Object[0]);
        return "";
    }

    public static Uri g(Context context, int i) {
        Resources resources = context.getResources();
        StringBuilder V0 = je.V0("android.resource://");
        V0.append(context.getPackageName());
        V0.append('/');
        V0.append(resources.getResourceTypeName(i));
        V0.append('/');
        V0.append(resources.getResourceEntryName(i));
        return Uri.parse(V0.toString());
    }

    public static void h(EditText editText) {
        editText.getClass();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static byte[] i(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends Enum<?>> T j(Parcel parcel, Class<T> cls) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        return cls.getEnumConstants()[readInt];
    }

    public static <V> ImmutableMap<String, V> k(Parcel parcel, Parcelable.Creator<V> creator) {
        Parcelable.Creator<String> b = zf0.b();
        int readInt = parcel.readInt();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (true) {
            int i = readInt - 1;
            if (readInt <= 0) {
                return builder.build();
            }
            builder.mo51put(b.createFromParcel(parcel), creator.createFromParcel(parcel));
            readInt = i;
        }
    }

    public static String l(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return parcel.readString();
        }
        return null;
    }

    public static Set<String> m(Parcel parcel) {
        int readInt = parcel.readInt();
        HashSet hashSet = new HashSet(readInt);
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        return hashSet;
    }

    public static <T extends Parcelable> T n(Parcel parcel, Parcelable.Creator<T> creator) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) ((Parcelable) parcel.readTypedObject(creator));
        }
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static boolean o(File file) {
        boolean z = false;
        if (!(file.mkdirs() || file.isDirectory())) {
            return false;
        }
        File file2 = new File(file, UUID.randomUUID().toString());
        try {
            boolean createNewFile = file2.createNewFile();
            if (file2.exists()) {
                z = file2.delete();
            }
            return createNewFile | z;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void p(EditText editText) {
        editText.getClass();
        editText.requestFocus();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }

    public static <T extends Enum<?>> void q(Parcel parcel, T t) {
        parcel.writeInt(t == null ? -1 : t.ordinal());
    }

    public static <K, V> void r(Parcel parcel, Map<K, V> map, xf0<? super K> xf0, xf0<? super V> xf02, int i) {
        parcel.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            entry.getKey().getClass();
            entry.getValue().getClass();
            xf0.a(entry.getKey(), parcel, i);
            xf02.a(entry.getValue(), parcel, i);
        }
    }

    public static void s(Parcel parcel, String str) {
        if (str != null) {
            parcel.writeInt(1);
            parcel.writeString(str);
            return;
        }
        parcel.writeInt(0);
    }

    public static void t(Parcel parcel, Map<String, String> map) {
        r(parcel, map, zf0.c(), zf0.c(), 0);
    }

    public static void u(Parcel parcel, Set<String> set) {
        parcel.writeInt(set.size());
        for (String str : set) {
            parcel.writeString(str);
        }
    }

    public static void v(Parcel parcel, Parcelable parcelable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            parcel.writeTypedObject(parcelable, i);
            return;
        }
        int i2 = parcelable != null ? 1 : 0;
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcelable.writeToParcel(parcel, i);
        }
    }
}
