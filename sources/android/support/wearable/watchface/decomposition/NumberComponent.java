package android.support.wearable.watchface.decomposition;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;
import java.util.Locale;
import java.util.TimeZone;

public class NumberComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator<NumberComponent> CREATOR = new Parcelable.Creator<NumberComponent>() {
        /* class android.support.wearable.watchface.decomposition.NumberComponent.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public NumberComponent createFromParcel(Parcel parcel) {
            return new NumberComponent(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public NumberComponent[] newArray(int i) {
            return new NumberComponent[i];
        }
    };

    public static class Builder extends BaseDrawnComponent.BaseDrawnBuilder<Builder, NumberComponent> {
        public Builder() {
            super(new BaseComponent.ComponentFactory<NumberComponent>() {
                /* class android.support.wearable.watchface.decomposition.NumberComponent.Builder.AnonymousClass1 */
            });
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    NumberComponent(android.os.Parcel r1, android.support.wearable.watchface.decomposition.NumberComponent.AnonymousClass1 r2) {
        /*
            r0 = this;
            android.os.Bundle r1 = r1.readBundle()
            r0.<init>(r1)
            java.lang.Class r2 = r0.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setClassLoader(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.watchface.decomposition.NumberComponent.<init>(android.os.Parcel, android.support.wearable.watchface.decomposition.NumberComponent$1):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e(long j) {
        long offset = j + ((long) TimeZone.getDefault().getOffset(j));
        long j2 = this.a.getLong("lowest_value");
        long j3 = (((offset + this.a.getLong("time_offset_ms")) / this.a.getLong("ms_per_increment")) % ((this.a.getLong("highest_value") - j2) + 1)) + j2;
        int i = this.a.getInt("leading_zeroes");
        if (i <= 0) {
            return Long.toString(j3);
        }
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder(14);
        sb.append("%0");
        sb.append(i);
        sb.append("d");
        return String.format(locale, sb.toString(), Long.valueOf(j3));
    }

    public int f() {
        return this.a.getInt("font_component_id");
    }

    public long g() {
        return this.a.getLong("highest_value");
    }

    public PointF h() {
        PointF pointF = (PointF) this.a.getParcelable("position");
        if (pointF == null) {
            return null;
        }
        return new PointF(pointF.x, pointF.y);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
