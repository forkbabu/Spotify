package androidx.viewpager2.widget;

import java.util.Comparator;

/* access modifiers changed from: package-private */
public class a implements Comparator<int[]> {
    a(b bVar) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(int[] iArr, int[] iArr2) {
        return iArr[0] - iArr2[0];
    }
}
