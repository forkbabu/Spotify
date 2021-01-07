package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.v;
import java.util.List;
import kotlin.jvm.internal.h;

public final class d {
    private final List<j> a;
    private final PickerStepData b;
    private final List<v> c;
    private final boolean d;
    private final boolean e;

    public d() {
        this(null, null, null, false, false, 31);
    }

    public d(List<j> list, PickerStepData pickerStepData, List<v> list2, boolean z, boolean z2) {
        this.a = list;
        this.b = pickerStepData;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public static d a(d dVar, List list, PickerStepData pickerStepData, List list2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = dVar.a;
        }
        if ((i & 2) != 0) {
            pickerStepData = dVar.b;
        }
        if ((i & 4) != 0) {
            list2 = dVar.c;
        }
        if ((i & 8) != 0) {
            z = dVar.d;
        }
        if ((i & 16) != 0) {
            z2 = dVar.e;
        }
        dVar.getClass();
        return new d(list, pickerStepData, list2, z, z2);
    }

    public final List<v> b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final PickerStepData d() {
        return this.b;
    }

    public final List<j> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && h.a(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        List<j> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        PickerStepData pickerStepData = this.b;
        int hashCode2 = (hashCode + (pickerStepData != null ? pickerStepData.hashCode() : 0)) * 31;
        List<v> list2 = this.c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.e;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CombinedData(selected=");
        V0.append(this.a);
        V0.append(", screenData=");
        V0.append(this.b);
        V0.append(", allSections=");
        V0.append(this.c);
        V0.append(", isLoading=");
        V0.append(this.d);
        V0.append(", hasError=");
        return je.P0(V0, this.e, ")");
    }

    public d(List list, PickerStepData pickerStepData, List list2, boolean z, boolean z2, int i) {
        int i2 = i & 1;
        int i3 = i & 2;
        int i4 = i & 4;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = z;
        this.e = z2;
    }
}
