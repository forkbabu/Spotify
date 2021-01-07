package android.support.wearable.complications;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class ComplicationText implements Parcelable, TimeDependentText {
    public static final Parcelable.Creator<ComplicationText> CREATOR = new a();
    private final CharSequence a;
    private final TimeDependentText b;
    private final CharSequence[] c;
    private long f;
    private CharSequence n;

    class a implements Parcelable.Creator<ComplicationText> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationText createFromParcel(Parcel parcel) {
            return new ComplicationText(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationText[] newArray(int i) {
            return new ComplicationText[i];
        }
    }

    private ComplicationText(CharSequence charSequence, TimeDependentText timeDependentText) {
        this.c = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        this.a = charSequence;
        this.b = null;
        if (charSequence == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    public static ComplicationText a(CharSequence charSequence) {
        return new ComplicationText(charSequence, (TimeDependentText) null);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public CharSequence L1(Context context, long j) {
        CharSequence charSequence;
        TimeDependentText timeDependentText = this.b;
        if (timeDependentText == null) {
            return this.a;
        }
        if (this.n == null || !timeDependentText.x0(this.f, j)) {
            charSequence = this.b.L1(context, j);
            this.f = j;
            this.n = charSequence;
        } else {
            charSequence = this.n;
        }
        CharSequence charSequence2 = this.a;
        if (charSequence2 == null) {
            return charSequence;
        }
        CharSequence[] charSequenceArr = this.c;
        charSequenceArr[0] = charSequence;
        return TextUtils.expandTemplate(charSequence2, charSequenceArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("surrounding_string", this.a);
        TimeDependentText timeDependentText = this.b;
        if (timeDependentText instanceof TimeDifferenceText) {
            TimeDifferenceText timeDifferenceText = (TimeDifferenceText) timeDependentText;
            bundle.putLong("difference_period_start", timeDifferenceText.l());
            bundle.putLong("difference_period_end", timeDifferenceText.k());
            bundle.putInt("difference_style", timeDifferenceText.m());
            bundle.putBoolean("show_now_text", timeDifferenceText.t());
            if (timeDifferenceText.j() != null) {
                bundle.putString("minimum_unit", timeDifferenceText.j().name());
            }
        } else if (timeDependentText instanceof TimeFormatText) {
            TimeFormatText timeFormatText = (TimeFormatText) timeDependentText;
            bundle.putString("format_format_string", timeFormatText.a());
            bundle.putInt("format_style", timeFormatText.c());
            TimeZone e = timeFormatText.e();
            if (e != null) {
                bundle.putString("format_time_zone", e.getID());
            }
        }
        parcel.writeBundle(bundle);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public boolean x0(long j, long j2) {
        TimeDependentText timeDependentText = this.b;
        if (timeDependentText == null) {
            return true;
        }
        return timeDependentText.x0(j, j2);
    }

    ComplicationText(Parcel parcel, a aVar) {
        this.c = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        Bundle readBundle = parcel.readBundle(ComplicationText.class.getClassLoader());
        this.a = readBundle.getCharSequence("surrounding_string");
        TimeZone timeZone = null;
        r2 = null;
        TimeUnit timeUnit = null;
        if (readBundle.containsKey("difference_style") && readBundle.containsKey("difference_period_start") && readBundle.containsKey("difference_period_end")) {
            long j = readBundle.getLong("difference_period_start");
            long j2 = readBundle.getLong("difference_period_end");
            int i = readBundle.getInt("difference_style");
            boolean z = readBundle.getBoolean("show_now_text", true);
            String string = readBundle.getString("minimum_unit");
            if (string != null) {
                try {
                    timeUnit = TimeUnit.valueOf(string);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.b = new TimeDifferenceText(j, j2, i, z, timeUnit);
        } else if (!readBundle.containsKey("format_format_string") || !readBundle.containsKey("format_style")) {
            this.b = null;
        } else {
            this.b = new TimeFormatText(readBundle.getString("format_format_string"), readBundle.getInt("format_style"), readBundle.containsKey("format_time_zone") ? TimeZone.getTimeZone(readBundle.getString("format_time_zone")) : timeZone);
        }
        if (this.a == null && this.b == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }
}
