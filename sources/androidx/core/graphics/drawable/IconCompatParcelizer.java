package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.n(iconCompat.a, 1);
        iconCompat.c = versionedParcel.i(iconCompat.c, 2);
        iconCompat.d = versionedParcel.p(iconCompat.d, 3);
        iconCompat.e = versionedParcel.n(iconCompat.e, 4);
        iconCompat.f = versionedParcel.n(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) versionedParcel.p(iconCompat.g, 6);
        String r = versionedParcel.r(iconCompat.i, 7);
        iconCompat.i = r;
        iconCompat.h = PorterDuff.Mode.valueOf(r);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 == null) {
                    byte[] bArr = iconCompat.c;
                    iconCompat.b = bArr;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr.length;
                    break;
                } else {
                    iconCompat.b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                iconCompat.b = new String(iconCompat.c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            versionedParcel.C(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.y(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            versionedParcel.E(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            versionedParcel.C(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            versionedParcel.C(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            versionedParcel.E(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            versionedParcel.G(str, 7);
        }
    }
}
