package defpackage;

import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.Collections;
import java.util.List;

/* renamed from: hp  reason: default package */
final class hp implements d {
    private final List<List<a>> a;
    private final List<Long> b;

    public hp(List<List<a>> list, List<Long> list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        int i;
        List<Long> list = this.b;
        Long valueOf = Long.valueOf(j);
        int i2 = f0.a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < this.b.size()) {
            return i;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        int c = f0.c(this.b, Long.valueOf(j), true, false);
        if (c == -1) {
            return Collections.emptyList();
        }
        return this.a.get(c);
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        boolean z = true;
        g.a(i >= 0);
        if (i >= this.b.size()) {
            z = false;
        }
        g.a(z);
        return this.b.get(i).longValue();
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        return this.b.size();
    }
}
