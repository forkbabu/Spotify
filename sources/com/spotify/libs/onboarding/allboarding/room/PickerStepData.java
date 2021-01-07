package com.spotify.libs.onboarding.allboarding.room;

import kotlin.jvm.internal.h;

public final class PickerStepData {
    private final long a;
    private final String b;
    private final String c;
    private final AllboardingScreenType d;
    private final String e;
    private final AllboardingSearch f;
    private final b g;
    private final b h;
    private final Integer i;
    private final boolean j;
    private final long k;
    private final String l;

    public enum AllboardingScreenType {
        LOADING,
        PICKER
    }

    public static final class NextAction {
        private final AllboardingType a;
        private final String b;

        /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
        public static final class AllboardingType extends Enum<AllboardingType> {
            private static final /* synthetic */ AllboardingType[] a = {new AllboardingType("URI", 0), new AllboardingType("SUBMIT", 1), new AllboardingType("DISMISS", 2)};

            private AllboardingType(String str, int i) {
            }

            public static AllboardingType valueOf(String str) {
                return (AllboardingType) Enum.valueOf(AllboardingType.class, str);
            }

            public static AllboardingType[] values() {
                return (AllboardingType[]) a.clone();
            }
        }

        public NextAction(AllboardingType allboardingType, String str) {
            h.e(allboardingType, "type");
            this.a = allboardingType;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final AllboardingType b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextAction)) {
                return false;
            }
            NextAction nextAction = (NextAction) obj;
            return h.a(this.a, nextAction.a) && h.a(this.b, nextAction.b);
        }

        public int hashCode() {
            AllboardingType allboardingType = this.a;
            int i = 0;
            int hashCode = (allboardingType != null ? allboardingType.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NextAction(type=");
            V0.append(this.a);
            V0.append(", link=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class a {
        private final AllboardingScreenType a;
        private final String b;

        public a(AllboardingScreenType allboardingScreenType, String str) {
            h.e(allboardingScreenType, "type");
            this.a = allboardingScreenType;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final AllboardingScreenType b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            AllboardingScreenType allboardingScreenType = this.a;
            int i = 0;
            int hashCode = (allboardingScreenType != null ? allboardingScreenType.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NextScreen(type=");
            V0.append(this.a);
            V0.append(", loadingText=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class b {
        private final NextAction a;
        private final a b;
        private final String c;

        public b(NextAction nextAction, a aVar, String str) {
            h.e(nextAction, "nextAction");
            h.e(aVar, "nextScreen");
            this.a = nextAction;
            this.b = aVar;
            this.c = str;
        }

        public final String a() {
            return this.c;
        }

        public final NextAction b() {
            return this.a;
        }

        public final a c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }

        public int hashCode() {
            NextAction nextAction = this.a;
            int i = 0;
            int hashCode = (nextAction != null ? nextAction.hashCode() : 0) * 31;
            a aVar = this.b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NextStep(nextAction=");
            V0.append(this.a);
            V0.append(", nextScreen=");
            V0.append(this.b);
            V0.append(", buttonLabel=");
            return je.I0(V0, this.c, ")");
        }
    }

    public PickerStepData(long j2, String str, String str2, AllboardingScreenType allboardingScreenType, String str3, AllboardingSearch allboardingSearch, b bVar, b bVar2, Integer num, boolean z, long j3, String str4) {
        h.e(str, "onBoardingSessionId");
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.d = allboardingScreenType;
        this.e = str3;
        this.f = allboardingSearch;
        this.g = bVar;
        this.h = bVar2;
        this.i = num;
        this.j = z;
        this.k = j3;
        this.l = str4;
    }

    public static PickerStepData a(PickerStepData pickerStepData, long j2, String str, String str2, AllboardingScreenType allboardingScreenType, String str3, AllboardingSearch allboardingSearch, b bVar, b bVar2, Integer num, boolean z, long j3, String str4, int i2) {
        long j4 = (i2 & 1) != 0 ? pickerStepData.a : j2;
        String str5 = (i2 & 2) != 0 ? pickerStepData.b : null;
        String str6 = (i2 & 4) != 0 ? pickerStepData.c : str2;
        AllboardingScreenType allboardingScreenType2 = (i2 & 8) != 0 ? pickerStepData.d : allboardingScreenType;
        String str7 = (i2 & 16) != 0 ? pickerStepData.e : str3;
        AllboardingSearch allboardingSearch2 = (i2 & 32) != 0 ? pickerStepData.f : allboardingSearch;
        b bVar3 = (i2 & 64) != 0 ? pickerStepData.g : bVar;
        b bVar4 = (i2 & 128) != 0 ? pickerStepData.h : bVar2;
        Integer num2 = (i2 & 256) != 0 ? pickerStepData.i : num;
        boolean z2 = (i2 & 512) != 0 ? pickerStepData.j : z;
        long j5 = (i2 & 1024) != 0 ? pickerStepData.k : j3;
        String str8 = (i2 & 2048) != 0 ? pickerStepData.l : null;
        pickerStepData.getClass();
        h.e(str5, "onBoardingSessionId");
        return new PickerStepData(j4, str5, str6, allboardingScreenType2, str7, allboardingSearch2, bVar3, bVar4, num2, z2, j5, str8);
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.l;
    }

    public final Integer d() {
        return this.i;
    }

    public final b e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickerStepData)) {
            return false;
        }
        PickerStepData pickerStepData = (PickerStepData) obj;
        return this.a == pickerStepData.a && h.a(this.b, pickerStepData.b) && h.a(this.c, pickerStepData.c) && h.a(this.d, pickerStepData.d) && h.a(this.e, pickerStepData.e) && h.a(this.f, pickerStepData.f) && h.a(this.g, pickerStepData.g) && h.a(this.h, pickerStepData.h) && h.a(this.i, pickerStepData.i) && this.j == pickerStepData.j && this.k == pickerStepData.k && h.a(this.l, pickerStepData.l);
    }

    public final b f() {
        return this.h;
    }

    public final String g() {
        return this.b;
    }

    public final long h() {
        return this.k;
    }

    public int hashCode() {
        int a2 = e.a(this.a) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AllboardingScreenType allboardingScreenType = this.d;
        int hashCode3 = (hashCode2 + (allboardingScreenType != null ? allboardingScreenType.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AllboardingSearch allboardingSearch = this.f;
        int hashCode5 = (hashCode4 + (allboardingSearch != null ? allboardingSearch.hashCode() : 0)) * 31;
        b bVar = this.g;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.h;
        int hashCode7 = (hashCode6 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        Integer num = this.i;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.j;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int a3 = (((hashCode8 + i3) * 31) + e.a(this.k)) * 31;
        String str4 = this.l;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return a3 + i2;
    }

    public final AllboardingSearch i() {
        return this.f;
    }

    public final boolean j() {
        return this.j;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.e;
    }

    public final AllboardingScreenType m() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PickerStepData(id=");
        V0.append(this.a);
        V0.append(", onBoardingSessionId=");
        V0.append(this.b);
        V0.append(", step=");
        V0.append(this.c);
        V0.append(", type=");
        V0.append(this.d);
        V0.append(", title=");
        V0.append(this.e);
        V0.append(", search=");
        V0.append(this.f);
        V0.append(", nextStepPrimary=");
        V0.append(this.g);
        V0.append(", nextStepSecondary=");
        V0.append(this.h);
        V0.append(", minimumSelectedItems=");
        V0.append(this.i);
        V0.append(", skippable=");
        V0.append(this.j);
        V0.append(", parentPickerStepId=");
        V0.append(this.k);
        V0.append(", loadingText=");
        return je.I0(V0, this.l, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerStepData(long j2, String str, String str2, AllboardingScreenType allboardingScreenType, String str3, AllboardingSearch allboardingSearch, b bVar, b bVar2, Integer num, boolean z, long j3, String str4, int i2) {
        this((i2 & 1) != 0 ? 0 : j2, str, null, null, null, null, null, null, null, (i2 & 512) != 0 ? true : z, j3, (i2 & 2048) != 0 ? null : str4);
        int i3 = i2 & 4;
        int i4 = i2 & 8;
        int i5 = i2 & 16;
        int i6 = i2 & 32;
        int i7 = i2 & 64;
        int i8 = i2 & 128;
        int i9 = i2 & 256;
    }
}
