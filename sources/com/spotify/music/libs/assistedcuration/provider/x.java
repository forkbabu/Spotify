package com.spotify.music.libs.assistedcuration.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.provider.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public abstract class x<T extends x<T>> implements Parcelable {
    private List<e> a;
    private final Set<String> b;
    private final boolean c;
    private int f;
    private final b n;

    protected x(List<e> list, b bVar) {
        this.a = Collections.synchronizedList(new ArrayList());
        this.c = true;
        this.b = new HashSet();
        this.n = bVar;
        j(list);
    }

    /* access modifiers changed from: package-private */
    public T a() {
        MoreObjects.checkArgument(this.c, "Card is not initialized.");
        this.f = Math.min(this.a.size(), this.n.f() + this.f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public T b(e eVar, List<e> list) {
        MoreObjects.checkArgument(this.c, "Card is not initialized.");
        eVar.getClass();
        String uri = eVar.getUri();
        ArrayList newArrayList = Collections2.newArrayList(this.a);
        int i = 0;
        while (true) {
            if (i >= newArrayList.size()) {
                i = -1;
                break;
            } else if (newArrayList.get(i).getUri().equals(uri)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return this;
        }
        newArrayList.remove(i);
        if (!list.isEmpty()) {
            newArrayList.addAll(i, list);
        }
        j(newArrayList);
        return this;
    }

    /* access modifiers changed from: package-private */
    public T c(e eVar) {
        MoreObjects.checkArgument(this.c, "Card is not initialized.");
        ArrayList newArrayList = Collections2.newArrayList(this.a);
        int size = newArrayList.size() - this.f;
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int min = Math.min(size, this.n.g());
            int i = this.f;
            arrayList.addAll(newArrayList.subList(i, i + min));
            List<e> newArrayList2 = Collections2.newArrayList(newArrayList.subList(0, this.f));
            newArrayList2.addAll(newArrayList.subList(this.f + min, newArrayList.size()));
            j(newArrayList2);
        }
        b(eVar, arrayList);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public List<e> e() {
        return this.a.subList(0, this.f);
    }

    /* access modifiers changed from: package-private */
    public List<e> f() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f < this.a.size();
    }

    /* access modifiers changed from: package-private */
    public T h(e eVar) {
        this.b.add(eVar.getUri());
        return this;
    }

    /* access modifiers changed from: package-private */
    public T i(Set<String> set) {
        ArrayList newArrayList = Collections2.newArrayList(this.a);
        Iterator<e> it = newArrayList.iterator();
        while (it.hasNext()) {
            String uri = it.next().getUri();
            if (set.contains(uri) && !this.b.contains(uri)) {
                it.remove();
            }
        }
        j(newArrayList);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void j(List<e> list) {
        this.a = Collections.synchronizedList(list);
        int max = Math.max(this.f, this.n.e());
        this.f = max;
        this.f = Math.min(max, this.a.size());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        gf0.u(parcel, this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.f);
        gf0.v(parcel, this.n, 0);
    }

    protected x(Parcel parcel) {
        this.a = Collections.synchronizedList(new ArrayList());
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, e.a);
        this.a = Collections.synchronizedList(arrayList);
        this.b = gf0.m(parcel);
        this.c = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.n = (b) gf0.n(parcel, b.b);
    }
}
