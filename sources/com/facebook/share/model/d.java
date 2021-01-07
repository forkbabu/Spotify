package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.d;
import com.facebook.share.model.d.a;
import com.facebook.share.model.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class d<P extends d, E extends a> implements Object {
    private final Uri a;
    private final List<String> b;
    private final String c;
    private final String f;
    private final String n;
    private final e o;

    public static abstract class a<P extends d, E extends a> {
        private Uri a;
        private List<String> b;
        private String c;
        private String d;
        private String e;
        private e f;

        public E g(P p) {
            List<String> list;
            this.a = p.a();
            List<String> c2 = p.c();
            if (c2 == null) {
                list = null;
            } else {
                list = Collections.unmodifiableList(c2);
            }
            this.b = list;
            this.c = p.e();
            this.d = p.b();
            this.e = p.f();
            this.f = p.g();
            return this;
        }

        public E h(Uri uri) {
            this.a = uri;
            return this;
        }

        public E i(String str) {
            this.d = str;
            return this;
        }
    }

    protected d(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.f = aVar.d;
        this.n = aVar.e;
        this.o = aVar.f;
    }

    public Uri a() {
        return this.a;
    }

    public String b() {
        return this.f;
    }

    public List<String> c() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.n;
    }

    public e g() {
        return this.o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, 0);
    }

    protected d(Parcel parcel) {
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.b = arrayList.size() == 0 ? null : Collections.unmodifiableList(arrayList);
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.n = parcel.readString();
        e.b bVar = new e.b();
        bVar.b(parcel);
        this.o = new e(bVar, null);
    }
}
