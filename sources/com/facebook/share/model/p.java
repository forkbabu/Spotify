package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.d;
import com.facebook.share.model.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class p extends d<p, b> {
    public static final Parcelable.Creator<p> CREATOR = new a();
    private final List<o> p;

    static class a implements Parcelable.Creator<p> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    public static class b extends d.a<p, b> {
        private final List<o> g = new ArrayList();

        public b k(List<o> list) {
            if (list != null) {
                for (o oVar : list) {
                    if (oVar != null) {
                        this.g.add(new o.b().j(oVar).g());
                    }
                }
            }
            return this;
        }

        public p l() {
            return new p(this, null);
        }

        public b m(List<o> list) {
            this.g.clear();
            k(list);
            return this;
        }
    }

    p(b bVar, a aVar) {
        super(bVar);
        this.p = Collections.unmodifiableList(bVar.g);
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public List<o> h() {
        return this.p;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List<o> list = this.p;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }

    p(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList arrayList = new ArrayList(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ShareMedia shareMedia = (ShareMedia) it.next();
            if (shareMedia instanceof o) {
                arrayList2.add((o) shareMedia);
            }
        }
        this.p = Collections.unmodifiableList(arrayList2);
    }
}
