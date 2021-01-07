package defpackage;

import java.util.List;

/* renamed from: ec  reason: default package */
public class ec extends oc<Integer, Integer> {
    public ec(List<fe<Integer>> list) {
        super((List) list);
    }

    @Override // defpackage.nc
    public jb<Integer, Integer> a() {
        return new nb(this.a);
    }

    @Override // defpackage.nc
    public List b() {
        return this.a;
    }
}
