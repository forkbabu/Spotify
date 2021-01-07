package android.support.wearable.watchface.decomposition;

import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;

public class FontComponent extends BaseComponent implements Parcelable {
    public static final Parcelable.Creator<FontComponent> CREATOR = new Parcelable.Creator<FontComponent>() {
        /* class android.support.wearable.watchface.decomposition.FontComponent.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public FontComponent createFromParcel(Parcel parcel) {
            return new FontComponent(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public FontComponent[] newArray(int i) {
            return new FontComponent[i];
        }
    };

    public static class Builder extends BaseComponent.BaseBuilder<Builder, FontComponent> {
        public Builder() {
            super(new BaseComponent.ComponentFactory<FontComponent>() {
                /* class android.support.wearable.watchface.decomposition.FontComponent.Builder.AnonymousClass1 */
            });
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FontComponent(android.os.Parcel r1, android.support.wearable.watchface.decomposition.FontComponent.AnonymousClass1 r2) {
        /*
            r0 = this;
            android.os.Bundle r1 = r1.readBundle()
            r0.<init>(r1)
            java.lang.Class r2 = r0.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setClassLoader(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.watchface.decomposition.FontComponent.<init>(android.os.Parcel, android.support.wearable.watchface.decomposition.FontComponent$1):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.a.getInt("component_id");
    }

    public int f() {
        return this.a.getInt("digit_count");
    }

    public Icon g() {
        return (Icon) this.a.getParcelable("image");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
