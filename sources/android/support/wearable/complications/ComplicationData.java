package android.support.wearable.complications;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class ComplicationData implements Parcelable {
    public static final Parcelable.Creator<ComplicationData> CREATOR = new a();
    private static final String[][] c = {null, new String[0], new String[0], new String[]{"SHORT_TEXT"}, new String[]{"LONG_TEXT"}, new String[]{"VALUE", "MIN_VALUE", "MAX_VALUE"}, new String[]{"ICON"}, new String[]{"SMALL_IMAGE", "IMAGE_STYLE"}, new String[]{"LARGE_IMAGE"}, new String[0], new String[0]};
    private static final String[][] f = {null, new String[0], new String[0], new String[]{"SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", "SMALL_IMAGE_BURN_IN_PROTECTION", "IMAGE_STYLE", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "SMALL_IMAGE_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[0]};
    private final int a;
    private final Bundle b;

    class a implements Parcelable.Creator<ComplicationData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationData createFromParcel(Parcel parcel) {
            return new ComplicationData(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationData[] newArray(int i) {
            return new ComplicationData[i];
        }
    }

    public static final class b {
        private final int a;
        private final Bundle b;

        public b(int i) {
            this.a = i;
            Bundle bundle = new Bundle();
            this.b = bundle;
            if (i == 7 || i == 4) {
                ComplicationData.b("IMAGE_STYLE", i);
                bundle.putInt("IMAGE_STYLE", 1);
            }
        }

        private void d(String str, Object obj) {
            ComplicationData.b(str, this.a);
            if (obj == null) {
                this.b.remove(str);
            } else if (obj instanceof String) {
                this.b.putString(str, (String) obj);
            } else if (obj instanceof Parcelable) {
                this.b.putParcelable(str, (Parcelable) obj);
            } else {
                String valueOf = String.valueOf(obj.getClass());
                throw new IllegalArgumentException(je.i0(valueOf.length() + 24, "Unexpected object type: ", valueOf));
            }
        }

        public ComplicationData c() {
            String[] strArr = ComplicationData.c[this.a];
            for (String str : strArr) {
                if (!this.b.containsKey(str)) {
                    int i = this.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                    sb.append("Field ");
                    sb.append(str);
                    sb.append(" is required for type ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                } else if (this.b.containsKey("ICON_BURN_IN_PROTECTION") && !this.b.containsKey("ICON")) {
                    throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.");
                } else if (this.b.containsKey("SMALL_IMAGE_BURN_IN_PROTECTION") && !this.b.containsKey("SMALL_IMAGE")) {
                    throw new IllegalStateException("Field SMALL_IMAGE must be provided when field SMALL_IMAGE_BURN_IN_PROTECTION is provided.");
                }
            }
            return new ComplicationData(this, (a) null);
        }

        public b e(Icon icon) {
            d("ICON", icon);
            return this;
        }

        public b f(ComplicationText complicationText) {
            d("SHORT_TEXT", complicationText);
            return this;
        }
    }

    ComplicationData(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    static void b(String str, int i) {
        boolean z = true;
        if (1 > i || i > c.length) {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Type ");
            sb.append(i);
            sb.append(" can not be recognized");
            throw new IllegalStateException(sb.toString());
        } else if (!u(str, i)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 44);
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" is not supported for type ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private static void c(String str, int i) {
        boolean z = true;
        if (1 > i || i > c.length) {
            z = false;
        }
        if (z && !u(str, i) && Log.isLoggable("ComplicationData", 3)) {
            str.length();
        }
    }

    private <T extends Parcelable> T n(String str) {
        try {
            return (T) this.b.getParcelable(str);
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    private static boolean u(String str, int i) {
        for (String str2 : c[i]) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : f[i]) {
            if (str3.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Icon e() {
        c("ICON_BURN_IN_PROTECTION", this.a);
        return (Icon) n("ICON_BURN_IN_PROTECTION");
    }

    public Icon f() {
        c("SMALL_IMAGE_BURN_IN_PROTECTION", this.a);
        return (Icon) n("SMALL_IMAGE_BURN_IN_PROTECTION");
    }

    public Icon g() {
        c("ICON", this.a);
        return (Icon) n("ICON");
    }

    public int getType() {
        return this.a;
    }

    public int h() {
        c("IMAGE_STYLE", this.a);
        return this.b.getInt("IMAGE_STYLE");
    }

    public Icon i() {
        c("LARGE_IMAGE", this.a);
        return (Icon) n("LARGE_IMAGE");
    }

    public ComplicationText j() {
        c("LONG_TEXT", this.a);
        return (ComplicationText) n("LONG_TEXT");
    }

    public ComplicationText k() {
        c("LONG_TITLE", this.a);
        return (ComplicationText) n("LONG_TITLE");
    }

    public float l() {
        c("MAX_VALUE", this.a);
        return this.b.getFloat("MAX_VALUE");
    }

    public float m() {
        c("MIN_VALUE", this.a);
        return this.b.getFloat("MIN_VALUE");
    }

    public ComplicationText o() {
        c("SHORT_TEXT", this.a);
        return (ComplicationText) n("SHORT_TEXT");
    }

    public ComplicationText p() {
        c("SHORT_TITLE", this.a);
        return (ComplicationText) n("SHORT_TITLE");
    }

    public Icon q() {
        c("SMALL_IMAGE", this.a);
        return (Icon) n("SMALL_IMAGE");
    }

    public PendingIntent r() {
        c("TAP_ACTION", this.a);
        return (PendingIntent) n("TAP_ACTION");
    }

    public float s() {
        c("VALUE", this.a);
        return this.b.getFloat("VALUE");
    }

    public boolean t(long j) {
        return j >= this.b.getLong("START_TIME", 0) && j <= this.b.getLong("END_TIME", Long.MAX_VALUE);
    }

    @Override // java.lang.Object
    public String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("ComplicationData{mType=");
        sb.append(i);
        sb.append(", mFields=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }

    ComplicationData(Parcel parcel, a aVar) {
        this.a = parcel.readInt();
        this.b = parcel.readBundle(ComplicationData.class.getClassLoader());
    }
}
