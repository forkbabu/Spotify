package defpackage;

import com.googlecode.mp4parser.boxes.mp4.samplegrouping.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r30  reason: default package */
public abstract class r30 implements x30 {
    String a;
    List<t30> b = new ArrayList();
    Map<b, long[]> c = new HashMap();

    public r30(String str) {
        this.a = str;
    }

    @Override // defpackage.x30
    public List<t30> W0() {
        return this.b;
    }

    @Override // defpackage.x30
    public long e() {
        long j = 0;
        for (long j2 : B1()) {
            j += j2;
        }
        return j;
    }

    @Override // defpackage.x30
    public Map<b, long[]> g1() {
        return this.c;
    }

    @Override // defpackage.x30
    public String getName() {
        return this.a;
    }
}
