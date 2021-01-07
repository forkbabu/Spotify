package android.support.wearable.complications;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.spotify.music.C0707R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimeDifferenceText implements TimeDependentText {
    public static final Parcelable.Creator<TimeDifferenceText> CREATOR = new a();
    private final long a;
    private final long b;
    private final int c;
    private final boolean f;
    private final TimeUnit n;

    class a implements Parcelable.Creator<TimeDifferenceText> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public TimeDifferenceText createFromParcel(Parcel parcel) {
            return new TimeDifferenceText(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public TimeDifferenceText[] newArray(int i) {
            return new TimeDifferenceText[i];
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TimeUnit.HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TimeUnit.DAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public TimeDifferenceText(long j, long j2, int i, boolean z, TimeUnit timeUnit) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.f = z;
        this.n = timeUnit;
    }

    private static String a(int i, Resources resources) {
        return resources.getQuantityString(C0707R.plurals.time_difference_short_days, i, Integer.valueOf(i));
    }

    private String b(long j, Resources resources) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        long s = s(j, timeUnit);
        TimeUnit timeUnit2 = this.n;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        if (p(timeUnit2, timeUnit3) || h(s) >= 10) {
            return a(h(s(j, timeUnit3)), resources);
        }
        long s2 = s(j, TimeUnit.MINUTES);
        if (h(s2) > 0) {
            int o = o(s);
            if (o > 0) {
                return resources.getString(C0707R.string.time_difference_short_days_and_hours, a(h(s), resources), c(o, resources));
            }
            return a(h(s), resources);
        } else if (p(this.n, timeUnit)) {
            return c(o(s), resources);
        } else {
            int o2 = o(s2);
            int q = q(s2);
            if (o2 <= 0) {
                return e(q(s2), resources);
            }
            if (q > 0) {
                return resources.getString(C0707R.string.time_difference_short_hours_and_minutes, c(o2, resources), e(q, resources));
            }
            return c(o2, resources);
        }
    }

    private static String c(int i, Resources resources) {
        return resources.getQuantityString(C0707R.plurals.time_difference_short_hours, i, Integer.valueOf(i));
    }

    private static String e(int i, Resources resources) {
        return resources.getQuantityString(C0707R.plurals.time_difference_short_minutes, i, Integer.valueOf(i));
    }

    private String f(long j, Resources resources) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        long s = s(j, timeUnit);
        TimeUnit timeUnit2 = this.n;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        if (p(timeUnit2, timeUnit3) || h(s) > 0) {
            return a(h(s(j, timeUnit3)), resources);
        }
        long s2 = s(j, TimeUnit.MINUTES);
        if (p(this.n, timeUnit) || o(s2) > 0) {
            return c(o(s), resources);
        }
        return e(q(s2), resources);
    }

    private String g(long j, Resources resources) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        long s = s(j, timeUnit);
        TimeUnit timeUnit2 = this.n;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        if (p(timeUnit2, timeUnit3) || h(s) > 0) {
            int h = h(s(j, timeUnit3));
            return resources.getQuantityString(C0707R.plurals.time_difference_words_days, h, Integer.valueOf(h));
        }
        long s2 = s(j, TimeUnit.MINUTES);
        if (p(this.n, timeUnit) || o(s2) > 0) {
            int o = o(s);
            return resources.getQuantityString(C0707R.plurals.time_difference_words_hours, o, Integer.valueOf(o));
        }
        int q = q(s2);
        return resources.getQuantityString(C0707R.plurals.time_difference_words_minutes, q, Integer.valueOf(q));
    }

    private static int h(long j) {
        return r(j, TimeUnit.DAYS);
    }

    private static long i(long j, long j2) {
        return (j / j2) + ((long) (j % j2 == 0 ? 0 : 1));
    }

    private long n(long j) {
        long j2 = this.a;
        if (j < j2) {
            return j2 - j;
        }
        long j3 = this.b;
        if (j > j3) {
            return j - j3;
        }
        return 0;
    }

    private static int o(long j) {
        return r(j, TimeUnit.HOURS);
    }

    private static boolean p(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit != null && timeUnit.toMillis(1) >= timeUnit2.toMillis(1);
    }

    private static int q(long j) {
        return r(j, TimeUnit.MINUTES);
    }

    private static int r(long j, TimeUnit timeUnit) {
        int i;
        long millis = j / timeUnit.toMillis(1);
        int i2 = b.a[timeUnit.ordinal()];
        if (i2 != 1) {
            i = 60;
            if (!(i2 == 2 || i2 == 3)) {
                if (i2 == 4) {
                    i = 24;
                } else if (i2 == 5) {
                    i = Integer.MAX_VALUE;
                } else {
                    String valueOf = String.valueOf(timeUnit);
                    throw new IllegalArgumentException(je.i0(valueOf.length() + 20, "Unit not supported: ", valueOf));
                }
            }
        } else {
            i = Constants.ONE_SECOND;
        }
        return (int) (millis % ((long) i));
    }

    private static long s(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(1);
        return i(j, millis) * millis;
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public CharSequence L1(Context context, long j) {
        Resources resources = context.getResources();
        long n2 = n(j);
        if (n2 == 0 && this.f) {
            return resources.getString(C0707R.string.time_difference_now);
        }
        int i = this.c;
        if (i == 1) {
            TimeUnit timeUnit = this.n;
            TimeUnit timeUnit2 = TimeUnit.DAYS;
            if (p(timeUnit, timeUnit2)) {
                return a(h(s(n2, timeUnit2)), resources);
            }
            TimeUnit timeUnit3 = TimeUnit.MINUTES;
            long s = s(n2, timeUnit3);
            if (p(this.n, TimeUnit.HOURS) || h(s) > 0) {
                return b(n2, resources);
            }
            TimeUnit timeUnit4 = TimeUnit.SECONDS;
            long s2 = s(n2, timeUnit4);
            if (p(this.n, timeUnit3) || o(s2) > 0) {
                return String.format(Locale.US, "%d:%02d", Integer.valueOf(o(s)), Integer.valueOf(q(s)));
            }
            return String.format(Locale.US, "%02d:%02d", Integer.valueOf(q(s2)), Integer.valueOf(r(s2, timeUnit4)));
        } else if (i == 2) {
            return f(n2, resources);
        } else {
            if (i == 3) {
                String b2 = b(n2, resources);
                return b2.length() <= 7 ? b2 : f(n2, resources);
            } else if (i == 4) {
                return g(n2, resources);
            } else {
                if (i != 5) {
                    return f(n2, resources);
                }
                String g = g(n2, resources);
                return g.length() <= 7 ? g : f(n2, resources);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public TimeUnit j() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public long k() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public long l() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        TimeUnit timeUnit = this.n;
        parcel.writeInt(timeUnit == null ? -1 : timeUnit.ordinal());
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public boolean x0(long j, long j2) {
        long j3;
        if (this.c != 1) {
            j3 = TimeUnit.MINUTES.toMillis(1);
        } else {
            j3 = TimeUnit.SECONDS.toMillis(1);
        }
        TimeUnit timeUnit = this.n;
        if (timeUnit != null) {
            j3 = Math.max(j3, timeUnit.toMillis(1));
        }
        if (i(n(j), j3) == i(n(j2), j3)) {
            return true;
        }
        return false;
    }

    protected TimeDifferenceText(Parcel parcel) {
        TimeUnit timeUnit;
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.f = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            timeUnit = null;
        } else {
            timeUnit = TimeUnit.values()[readInt];
        }
        this.n = timeUnit;
    }
}
