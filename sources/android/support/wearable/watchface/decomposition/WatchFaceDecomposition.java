package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchFaceDecomposition implements Parcelable {
    public static final Parcelable.Creator<WatchFaceDecomposition> CREATOR = new Parcelable.Creator<WatchFaceDecomposition>() {
        /* class android.support.wearable.watchface.decomposition.WatchFaceDecomposition.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public WatchFaceDecomposition createFromParcel(Parcel parcel) {
            return new WatchFaceDecomposition(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public WatchFaceDecomposition[] newArray(int i) {
            return new WatchFaceDecomposition[i];
        }
    };
    private final List<ImageComponent> a;
    private final List<NumberComponent> b;
    private final List<FontComponent> c;
    private final List<ComplicationComponent> f;

    public static class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
        }
    }

    public interface Component {
        boolean a();
    }

    public interface DrawnComponent extends Component {
        int b();
    }

    WatchFaceDecomposition(Parcel parcel, AnonymousClass1 r5) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        List<ImageComponent> parcelableArrayList = readBundle.getParcelableArrayList("images");
        List<NumberComponent> parcelableArrayList2 = readBundle.getParcelableArrayList("numbers");
        List<FontComponent> parcelableArrayList3 = readBundle.getParcelableArrayList("fonts");
        List<ComplicationComponent> parcelableArrayList4 = readBundle.getParcelableArrayList("complications");
        this.a = parcelableArrayList == null ? Collections.emptyList() : parcelableArrayList;
        this.b = parcelableArrayList2 == null ? Collections.emptyList() : parcelableArrayList2;
        this.c = parcelableArrayList3 == null ? Collections.emptyList() : parcelableArrayList3;
        this.f = parcelableArrayList4 == null ? Collections.emptyList() : parcelableArrayList4;
    }

    public List<ComplicationComponent> a() {
        return this.f;
    }

    public List<FontComponent> b() {
        return this.c;
    }

    public List<ImageComponent> c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<NumberComponent> e() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("images", new ArrayList<>(this.a));
        bundle.putParcelableArrayList("numbers", new ArrayList<>(this.b));
        bundle.putParcelableArrayList("fonts", new ArrayList<>(this.c));
        bundle.putParcelableArrayList("complications", new ArrayList<>(this.f));
        parcel.writeBundle(bundle);
    }
}
