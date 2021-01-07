package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.ads.rules.m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeFormatText implements TimeDependentText {
    public static final Parcelable.Creator<TimeFormatText> CREATOR = new a();
    private static final String[][] o = {new String[]{"S", "s"}, new String[]{m.f}, new String[]{"H", "K", "h", "k", "j", "J", "C"}, new String[]{"a", "b", "B"}};
    private static final long[] p;
    private final SimpleDateFormat a;
    private final int b;
    private final TimeZone c;
    private final Date f;
    private long n;

    class a implements Parcelable.Creator<TimeFormatText> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public TimeFormatText createFromParcel(Parcel parcel) {
            return new TimeFormatText(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public TimeFormatText[] newArray(int i) {
            return new TimeFormatText[i];
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        p = new long[]{TimeUnit.SECONDS.toMillis(1), TimeUnit.MINUTES.toMillis(1), timeUnit.toMillis(1), timeUnit.toMillis(12)};
    }

    public TimeFormatText(String str, int i, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.a = simpleDateFormat;
        this.b = i;
        this.n = -1;
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
            this.c = timeZone;
        } else {
            this.c = simpleDateFormat.getTimeZone();
        }
        this.f = new Date();
    }

    private long b(long j) {
        this.f.setTime(j);
        if (this.c.inDaylightTime(this.f)) {
            return ((long) this.c.getRawOffset()) + ((long) this.c.getDSTSavings());
        }
        return (long) this.c.getRawOffset();
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public CharSequence L1(Context context, long j) {
        String format = this.a.format(new Date(j));
        int i = this.b;
        if (i == 2) {
            return format.toUpperCase();
        }
        if (i != 3) {
            return format;
        }
        return format.toLowerCase();
    }

    public String a() {
        return this.a.toPattern();
    }

    public int c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TimeZone e() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
        parcel.writeSerializable(this.c);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public boolean x0(long j, long j2) {
        String[][] strArr = o;
        if (this.n == -1) {
            String pattern = this.a.toPattern();
            String str = "";
            int i = 0;
            boolean z = false;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == '\'') {
                    int i2 = i + 1;
                    if (i2 >= pattern.length() || pattern.charAt(i2) != '\'') {
                        z = !z;
                        i = i2;
                    } else {
                        i += 2;
                    }
                } else {
                    if (!z) {
                        String valueOf = String.valueOf(str);
                        char charAt = pattern.charAt(i);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 1);
                        sb.append(valueOf);
                        sb.append(charAt);
                        str = sb.toString();
                    }
                    i++;
                }
            }
            for (int i3 = 0; i3 < strArr.length && this.n == -1; i3++) {
                int i4 = 0;
                while (true) {
                    if (i4 >= strArr[i3].length) {
                        break;
                    } else if (str.contains(strArr[i3][i4])) {
                        this.n = p[i3];
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (this.n == -1) {
                this.n = TimeUnit.DAYS.toMillis(1);
            }
        }
        long j3 = this.n;
        if ((j + b(j)) / j3 == (j2 + b(j2)) / j3) {
            return true;
        }
        return false;
    }

    protected TimeFormatText(Parcel parcel) {
        this.a = (SimpleDateFormat) parcel.readSerializable();
        this.b = parcel.readInt();
        this.c = (TimeZone) parcel.readSerializable();
        this.n = -1;
        this.f = new Date();
    }
}
