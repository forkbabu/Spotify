package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static void A(@RecentlyNonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + z(parcel, i));
    }

    public static int B(@RecentlyNonNull Parcel parcel) {
        int readInt = parcel.readInt();
        int z = z(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = z + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new ParseException(je.h0(54, "Size read is invalid start=", dataPosition, " end=", i), parcel);
    }

    public static void C(@RecentlyNonNull Parcel parcel, int i, boolean z) {
        b0(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void D(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Boolean bool, boolean z) {
        if (bool != null) {
            b0(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void E(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int Y = Y(parcel, i);
            parcel.writeBundle(bundle);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void F(@RecentlyNonNull Parcel parcel, int i, byte b) {
        b0(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void G(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int Y = Y(parcel, i);
            parcel.writeByteArray(bArr);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void H(@RecentlyNonNull Parcel parcel, int i, double d) {
        b0(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void I(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Double d, boolean z) {
        if (d != null) {
            b0(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void J(@RecentlyNonNull Parcel parcel, int i, float f) {
        b0(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void K(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Float f, boolean z) {
        if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void L(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int Y = Y(parcel, i);
            parcel.writeStrongBinder(iBinder);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void M(@RecentlyNonNull Parcel parcel, int i, int i2) {
        b0(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void N(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int Y = Y(parcel, i);
            parcel.writeIntArray(iArr);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void O(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Integer num, boolean z) {
        if (num != null) {
            b0(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void P(@RecentlyNonNull Parcel parcel, int i, long j) {
        b0(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void Q(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull long[] jArr, boolean z) {
        if (jArr != null) {
            int Y = Y(parcel, i);
            parcel.writeLongArray(jArr);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void R(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Long l, boolean z) {
        if (l != null) {
            b0(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void S(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int Y = Y(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void T(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        if (str != null) {
            int Y = Y(parcel, i);
            parcel.writeString(str);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void U(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int Y = Y(parcel, i);
            parcel.writeStringArray(strArr);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static void V(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        if (list != null) {
            int Y = Y(parcel, i);
            parcel.writeStringList(list);
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void W(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int Y = Y(parcel, i);
            int length = tArr.length;
            parcel.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    a0(parcel, t, i2);
                }
            }
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void X(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        if (list != null) {
            int Y = Y(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    a0(parcel, t, 0);
                }
            }
            d0(parcel, Y);
        } else if (z) {
            b0(parcel, i, 0);
        }
    }

    private static int Y(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void Z(Parcel parcel, int i, int i2) {
        int z = z(parcel, i);
        if (z != i2) {
            String hexString = Integer.toHexString(z);
            StringBuilder sb = new StringBuilder(je.N0(hexString, 46));
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(z);
            throw new ParseException(je.J0(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static int a(@RecentlyNonNull Parcel parcel) {
        return Y(parcel, 20293);
    }

    private static <T extends Parcelable> void a0(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    @RecentlyNonNull
    public static Bundle b(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + z);
        return readBundle;
    }

    private static void b0(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    @RecentlyNonNull
    public static byte[] c(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + z);
        return createByteArray;
    }

    private static void c0(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(je.N0(hexString, 46));
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            throw new ParseException(je.J0(sb, " (0x", hexString, ")"), parcel);
        }
    }

    @RecentlyNonNull
    public static int[] d(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + z);
        return createIntArray;
    }

    private static void d0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    @RecentlyNonNull
    public static long[] e(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + z);
        return createLongArray;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T f(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + z);
        return createFromParcel;
    }

    @RecentlyNonNull
    public static String g(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + z);
        return readString;
    }

    @RecentlyNonNull
    public static String[] h(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + z);
        return createStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> i(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + z);
        return createStringArrayList;
    }

    @RecentlyNonNull
    public static <T> T[] j(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + z);
        return tArr;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> k(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + z);
        return createTypedArrayList;
    }

    public static void l(@RecentlyNonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException(je.f0(37, "Overread allowed size end=", i), parcel);
        }
    }

    public static void m(@RecentlyNonNull Parcel parcel, int i) {
        d0(parcel, i);
    }

    public static boolean n(@RecentlyNonNull Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    @RecentlyNonNull
    public static Boolean o(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        c0(parcel, z, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte p(@RecentlyNonNull Parcel parcel, int i) {
        Z(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double q(@RecentlyNonNull Parcel parcel, int i) {
        Z(parcel, i, 8);
        return parcel.readDouble();
    }

    @RecentlyNonNull
    public static Double r(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        c0(parcel, z, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float s(@RecentlyNonNull Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readFloat();
    }

    @RecentlyNonNull
    public static Float t(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        c0(parcel, z, 4);
        return Float.valueOf(parcel.readFloat());
    }

    @RecentlyNonNull
    public static IBinder u(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + z);
        return readStrongBinder;
    }

    public static int v(@RecentlyNonNull Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static Integer w(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        c0(parcel, z, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x(@RecentlyNonNull Parcel parcel, int i) {
        Z(parcel, i, 8);
        return parcel.readLong();
    }

    @RecentlyNonNull
    public static Long y(@RecentlyNonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        c0(parcel, z, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int z(@RecentlyNonNull Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & AudioDriver.SPOTIFY_MAX_VOLUME : parcel.readInt();
    }
}
