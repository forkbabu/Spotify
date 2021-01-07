package android.support.wearable.watchface.decomposition;

import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;

public class ImageComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator<ImageComponent> CREATOR = new Parcelable.Creator<ImageComponent>() {
        /* class android.support.wearable.watchface.decomposition.ImageComponent.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ImageComponent createFromParcel(Parcel parcel) {
            return new ImageComponent(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ImageComponent[] newArray(int i) {
            return new ImageComponent[i];
        }
    };

    public static class Builder extends BaseDrawnComponent.BaseDrawnBuilder<Builder, ImageComponent> {
        public Builder() {
            super(new BaseComponent.ComponentFactory<ImageComponent>() {
                /* class android.support.wearable.watchface.decomposition.ImageComponent.Builder.AnonymousClass1 */
            });
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ImageComponent(android.os.Parcel r1, android.support.wearable.watchface.decomposition.ImageComponent.AnonymousClass1 r2) {
        /*
            r0 = this;
            android.os.Bundle r1 = r1.readBundle()
            r0.<init>(r1)
            java.lang.Class r2 = r0.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setClassLoader(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.watchface.decomposition.ImageComponent.<init>(android.os.Parcel, android.support.wearable.watchface.decomposition.ImageComponent$1):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RectF e() {
        return new RectF((RectF) this.a.getParcelable("bounds"));
    }

    public float f() {
        return this.a.getFloat("degreesPerDay");
    }

    public float g() {
        return this.a.getFloat("degreesPerStep");
    }

    public Icon h() {
        return (Icon) this.a.getParcelable("image");
    }

    public float i() {
        return this.a.getFloat("offsetDegrees");
    }

    public PointF j() {
        PointF pointF = (PointF) this.a.getParcelable("pivot");
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
