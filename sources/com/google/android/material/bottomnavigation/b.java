package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import com.google.android.material.internal.f;

public class b implements m {
    private g a;
    private BottomNavigationMenuView b;
    private boolean c = false;
    private int f;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0102a();
        int a;
        f b;

        /* renamed from: com.google.android.material.bottomnavigation.b$a$a  reason: collision with other inner class name */
        static class C0102a implements Parcelable.Creator<a> {
            C0102a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, 0);
        }

        a(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = (f) parcel.readParcelable(a.class.getClassLoader());
        }
    }

    public void a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.b = bottomNavigationMenuView;
    }

    public void b(int i) {
        this.f = i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
    }

    public void d(boolean z) {
        this.c = z;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        a aVar = new a();
        aVar.a = this.b.getSelectedItemId();
        SparseArray<bx> badgeDrawables = this.b.getBadgeDrawables();
        boolean z = cx.a;
        f fVar = new f();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            bx valueAt = badgeDrawables.valueAt(i);
            if (valueAt != null) {
                fVar.put(keyAt, valueAt.g());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.b = fVar;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.b.h(aVar.a);
            this.b.setBadgeDrawables(cx.a(this.b.getContext(), aVar.b));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        if (!this.c) {
            if (z) {
                this.b.d();
            } else {
                this.b.i();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void m(Context context, g gVar) {
        this.a = gVar;
        this.b.a(gVar);
    }
}
