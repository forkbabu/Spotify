package okio;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class q extends AbstractList<ByteString> implements RandomAccess {
    final ByteString[] a;
    final int[] b;

    private q(ByteString[] byteStringArr, int[] iArr) {
        this.a = byteStringArr;
        this.b = iArr;
    }

    private static void c(long j, e eVar, int i, List<ByteString> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        e eVar2;
        if (i2 < i3) {
            for (int i9 = i2; i9 < i3; i9++) {
                if (list.get(i9).x() < i) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            if (i == byteString.x()) {
                int intValue = list2.get(i2).intValue();
                int i10 = i2 + 1;
                i4 = i10;
                i5 = intValue;
                byteString = list.get(i10);
            } else {
                i5 = -1;
                i4 = i2;
            }
            long j2 = 4;
            if (byteString.n(i) != byteString2.n(i)) {
                int i11 = 1;
                for (int i12 = i4 + 1; i12 < i3; i12++) {
                    if (list.get(i12 - 1).n(i) != list.get(i12).n(i)) {
                        i11++;
                    }
                }
                long j3 = j + ((long) ((int) (eVar.b / 4))) + 2 + ((long) (i11 * 2));
                eVar.Q(i11);
                eVar.Q(i5);
                for (int i13 = i4; i13 < i3; i13++) {
                    byte n = list.get(i13).n(i);
                    if (i13 == i4 || n != list.get(i13 - 1).n(i)) {
                        eVar.Q(n & 255);
                    }
                }
                e eVar3 = new e();
                int i14 = i4;
                while (i14 < i3) {
                    byte n2 = list.get(i14).n(i);
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (true) {
                        if (i16 >= i3) {
                            i7 = i3;
                            break;
                        } else if (n2 != list.get(i16).n(i)) {
                            i7 = i16;
                            break;
                        } else {
                            i16++;
                        }
                    }
                    if (i15 == i7 && i + 1 == list.get(i14).x()) {
                        eVar.Q(list2.get(i14).intValue());
                        i8 = i7;
                        eVar2 = eVar3;
                    } else {
                        eVar.Q((int) ((((long) ((int) (eVar3.b / j2))) + j3) * -1));
                        i8 = i7;
                        eVar2 = eVar3;
                        c(j3, eVar3, i + 1, list, i14, i7, list2);
                    }
                    eVar3 = eVar2;
                    i14 = i8;
                    j2 = 4;
                }
                eVar.l0(eVar3, eVar3.b);
                return;
            }
            int i17 = 0;
            int min = Math.min(byteString.x(), byteString2.x());
            int i18 = i;
            while (i18 < min && byteString.n(i18) == byteString2.n(i18)) {
                i17++;
                i18++;
            }
            long j4 = 1 + j + ((long) ((int) (eVar.b / 4))) + 2 + ((long) i17);
            eVar.Q(-i17);
            eVar.Q(i5);
            int i19 = i;
            while (true) {
                i6 = i + i17;
                if (i19 >= i6) {
                    break;
                }
                eVar.Q(byteString.n(i19) & 255);
                i19++;
            }
            if (i4 + 1 != i3) {
                e eVar4 = new e();
                eVar.Q((int) ((((long) ((int) (eVar4.b / 4))) + j4) * -1));
                c(j4, eVar4, i6, list, i4, i3, list2);
                eVar.l0(eVar4, eVar4.b);
            } else if (i6 == list.get(i4).x()) {
                eVar.Q(list2.get(i4).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static q d(ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new q(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(byteStringArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, byteStringArr[i2]), Integer.valueOf(i2));
        }
        if (((ByteString) arrayList.get(0)).x() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                ByteString byteString = (ByteString) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    ByteString byteString2 = (ByteString) arrayList.get(i5);
                    byteString2.getClass();
                    if (!byteString2.u(0, byteString, 0, byteString.x())) {
                        continue;
                        break;
                    } else if (byteString2.x() == byteString.x()) {
                        throw new IllegalArgumentException("duplicate option: " + byteString2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            e eVar = new e();
            c(0, eVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i6 = (int) (eVar.b / 4);
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = eVar.readInt();
            }
            if (eVar.l1()) {
                return new q((ByteString[]) byteStringArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.a.length;
    }
}
