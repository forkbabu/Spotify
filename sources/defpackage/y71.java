package defpackage;

import android.util.SparseArray;
import defpackage.mg0;

/* renamed from: y71  reason: default package */
public final /* synthetic */ class y71 implements mg0.b {
    public final /* synthetic */ Class a;

    public /* synthetic */ y71(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.mg0.b
    public final Object create() {
        Enum[] enumArr = (Enum[]) this.a.getEnumConstants();
        SparseArray sparseArray = new SparseArray(enumArr.length);
        for (Enum r4 : enumArr) {
            z71 z71 = (z71) r4;
            sparseArray.put(z71.d(), z71.g());
        }
        return sparseArray;
    }
}
