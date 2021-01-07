package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.g;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a> CREATOR = new i();
    private static final b p = new b("CastMediaOptions");
    private final String a;
    private final String b;
    private final v c;
    private final g f;
    private final boolean n;
    private final boolean o;

    /* renamed from: com.google.android.gms.cast.framework.media.a$a  reason: collision with other inner class name */
    public static final class C0092a {
        private g a = new g.a().a();
        private boolean b = true;

        public final a a() {
            return new a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, this.a, false, this.b);
        }
    }

    a(String str, String str2, IBinder iBinder, g gVar, boolean z, boolean z2) {
        v vVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof v) {
                vVar = (v) queryLocalInterface;
            } else {
                vVar = new c0(iBinder);
            }
        }
        this.c = vVar;
        this.f = gVar;
        this.n = z;
        this.o = z2;
    }

    public String I1() {
        return this.b;
    }

    public c Q1() {
        v vVar = this.c;
        if (vVar == null) {
            return null;
        }
        try {
            return (c) com.google.android.gms.dynamic.b.E3(vVar.Q1());
        } catch (RemoteException e) {
            p.b(e, "Unable to call %s on %s.", "getWrappedClientObject", v.class.getSimpleName());
            return null;
        }
    }

    public String o2() {
        return this.a;
    }

    public boolean p2() {
        return this.o;
    }

    public g q2() {
        return this.f;
    }

    public final boolean r2() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        v vVar = this.c;
        SafeParcelReader.L(parcel, 4, vVar == null ? null : vVar.asBinder(), false);
        SafeParcelReader.S(parcel, 5, this.f, i, false);
        SafeParcelReader.C(parcel, 6, this.n);
        SafeParcelReader.C(parcel, 7, this.o);
        SafeParcelReader.m(parcel, a2);
    }
}
