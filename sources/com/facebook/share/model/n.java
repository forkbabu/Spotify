package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.n;
import com.facebook.share.model.n.a;
import java.util.Set;

public abstract class n<P extends n, E extends a> implements Object {
    private final Bundle a;

    public static abstract class a<P extends n, E extends a> {
        private Bundle a = new Bundle();

        public E b(String str, String str2) {
            this.a.putString(str, str2);
            return this;
        }

        public E c(P p) {
            this.a.putAll(p.b());
            return this;
        }
    }

    protected n(a<P, E> aVar) {
        this.a = (Bundle) ((a) aVar).a.clone();
    }

    public Object a(String str) {
        return this.a.get(str);
    }

    public Bundle b() {
        return (Bundle) this.a.clone();
    }

    public String c(String str) {
        return this.a.getString(str);
    }

    public int describeContents() {
        return 0;
    }

    public Set<String> e() {
        return this.a.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    n(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }
}
