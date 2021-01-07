package android.support.wearable.watchface.decomposition;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.rendering.ComplicationDrawable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;
import java.util.Arrays;

public class ComplicationComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator<ComplicationComponent> CREATOR = new Parcelable.Creator<ComplicationComponent>() {
        /* class android.support.wearable.watchface.decomposition.ComplicationComponent.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationComponent createFromParcel(Parcel parcel) {
            return new ComplicationComponent(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ComplicationComponent[] newArray(int i) {
            return new ComplicationComponent[i];
        }
    };

    public static class Builder extends BaseDrawnComponent.BaseDrawnBuilder<Builder, ComplicationComponent> {
        public Builder() {
            super(new BaseComponent.ComponentFactory<ComplicationComponent>() {
                /* class android.support.wearable.watchface.decomposition.ComplicationComponent.Builder.AnonymousClass1 */
            });
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ComplicationComponent(android.os.Parcel r1, android.support.wearable.watchface.decomposition.ComplicationComponent.AnonymousClass1 r2) {
        /*
            r0 = this;
            android.os.Bundle r1 = r1.readBundle()
            r0.<init>(r1)
            java.lang.Class r2 = r0.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setClassLoader(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.watchface.decomposition.ComplicationComponent.<init>(android.os.Parcel, android.support.wearable.watchface.decomposition.ComplicationComponent$1):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RectF e() {
        return new RectF((RectF) this.a.getParcelable("bounds"));
    }

    public ComplicationDrawable f() {
        return (ComplicationDrawable) this.a.getParcelable("complication_drawable");
    }

    public int[] g() {
        int[] intArray = this.a.getIntArray("complication_types");
        if (intArray == null) {
            return null;
        }
        return Arrays.copyOf(intArray, intArray.length);
    }

    public int h() {
        return this.a.getInt("wf_complication_id");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
