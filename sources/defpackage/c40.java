package defpackage;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.LinkedList;
import java.util.List;

/* renamed from: c40  reason: default package */
public class c40 extends r30 {
    private static j50 q = j50.a(c40.class);
    x30[] f;
    SampleDescriptionBox n;
    List<w30> o;
    long[] p;

    /* JADX DEBUG: Multi-variable search result rejected for r11v35, resolved type: com.coremedia.iso.boxes.sampleentry.VisualSampleEntry */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c40(defpackage.x30... r18) {
        /*
        // Method dump skipped, instructions count: 1065
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c40.<init>(x30[]):void");
    }

    private m40 a(g40 g40, g40 g402) {
        if (!(g40 instanceof m40) || !(g402 instanceof m40)) {
            q.c("I can only merge ESDescriptors");
            return null;
        }
        m40 m40 = (m40) g40;
        m40 m402 = (m40) g402;
        if (m40.m() != m402.m() || m40.h() != m402.h() || m40.i() != m402.i() || m40.o() != m402.o() || m40.p() != m402.p() || m40.l() != m402.l()) {
            return null;
        }
        if (m40.n() != null) {
            m40.n().equals(m402.n());
        }
        if (m40.g() == null ? m402.g() != null : !m40.g().equals(m402.g())) {
            j40 g = m40.g();
            j40 g2 = m402.g();
            if (g.g() != null && g2.g() != null && !g.g().equals(g2.g())) {
                return null;
            }
            if (g.h() != g2.h()) {
                g.o((g2.h() + g.h()) / 2);
            }
            if (g.i() == null ? g2.i() != null : !g.i().equals(g2.i())) {
                return null;
            }
            if (g.j() != g2.j()) {
                g.p(Math.max(g.j(), g2.j()));
            }
            if (!(g.l().equals(g2.l()) && g.k() == g2.k() && g.m() == g2.m() && g.n() == g2.n())) {
                return null;
            }
        }
        if (m40.j() == null ? m402.j() != null : !m40.j().equals(m402.j())) {
            return null;
        }
        if (m40.k() == null ? m402.k() == null : m40.k().equals(m402.k())) {
            return m40;
        }
        return null;
    }

    @Override // defpackage.x30
    public synchronized long[] B1() {
        return this.p;
    }

    @Override // defpackage.x30
    public long[] T() {
        if (this.f[0].T() == null || this.f[0].T().length <= 0) {
            return null;
        }
        x30[] x30Arr = this.f;
        int i = 0;
        for (x30 x30 : x30Arr) {
            i += x30.T() != null ? x30.T().length : 0;
        }
        long[] jArr = new long[i];
        long j = 0;
        x30[] x30Arr2 = this.f;
        int i2 = 0;
        for (x30 x302 : x30Arr2) {
            if (x302.T() != null) {
                long[] T = x302.T();
                int length = T.length;
                int i3 = 0;
                while (i3 < length) {
                    jArr[i2] = T[i3] + j;
                    i3++;
                    i2++;
                }
            }
            j += (long) x302.p0().size();
        }
        return jArr;
    }

    @Override // defpackage.x30
    public SubSampleInformationBox X() {
        return this.f[0].X();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (x30 x30 : this.f) {
            x30.close();
        }
    }

    @Override // defpackage.x30
    public String getHandler() {
        return this.f[0].getHandler();
    }

    @Override // defpackage.x30
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.n;
    }

    @Override // defpackage.x30
    public List<SampleDependencyTypeBox.a> l2() {
        if (this.f[0].l2() == null || this.f[0].l2().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (x30 x30 : this.f) {
            linkedList.addAll(x30.l2());
        }
        return linkedList;
    }

    @Override // defpackage.x30
    public y30 n1() {
        return this.f[0].n1();
    }

    @Override // defpackage.x30
    public List<w30> p0() {
        return this.o;
    }

    @Override // defpackage.x30
    public List<CompositionTimeToSample.a> y() {
        if (this.f[0].y() == null || this.f[0].y().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (x30 x30 : this.f) {
            linkedList.add(CompositionTimeToSample.blowupCompositionTimes(x30.y()));
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr : linkedList) {
            for (int i : iArr) {
                if (linkedList2.isEmpty() || ((CompositionTimeToSample.a) linkedList2.getLast()).b() != i) {
                    linkedList2.add(new CompositionTimeToSample.a(1, i));
                } else {
                    CompositionTimeToSample.a aVar = (CompositionTimeToSample.a) linkedList2.getLast();
                    aVar.c(aVar.a() + 1);
                }
            }
        }
        return linkedList2;
    }
}
