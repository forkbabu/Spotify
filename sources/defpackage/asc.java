package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.zrc;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: asc  reason: default package */
public class asc implements zrc {
    private final Map<String, Integer> a = new HashMap();
    private final Map<Integer, yrc> b = new HashMap();
    private final LayoutInflater c;

    asc(LayoutInflater layoutInflater, Set<zrc.a> set) {
        this.c = layoutInflater;
        for (zrc.a aVar : set) {
            Class<? extends csc> c2 = aVar.c();
            yrc b2 = aVar.b();
            String name = c2.getName();
            int hashCode = name.hashCode();
            if (!this.b.containsKey(Integer.valueOf(hashCode))) {
                this.a.put(name, Integer.valueOf(hashCode));
                this.b.put(Integer.valueOf(hashCode), b2);
            }
        }
    }

    @Override // defpackage.zrc
    public void a(csc csc, RecyclerView.b0 b0Var) {
        yrc yrc = this.b.get(Integer.valueOf(e(csc)));
        if (yrc != null) {
            yrc.a();
            return;
        }
        StringBuilder V0 = je.V0("No AdapterDelegate added for ViewType ");
        V0.append(b0Var.z());
        throw new IllegalStateException(V0.toString());
    }

    @Override // defpackage.zrc
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        yrc yrc = this.b.get(Integer.valueOf(i));
        if (yrc != null) {
            return yrc.e(this.c, viewGroup);
        }
        throw new IllegalStateException(je.p0("No AdapterDelegate added for ViewType", i));
    }

    @Override // defpackage.zrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        yrc yrc = this.b.get(Integer.valueOf(e(csc)));
        if (yrc != null) {
            yrc.c(csc, b0Var, i);
            return;
        }
        StringBuilder V0 = je.V0("No AdapterDelegate added for ViewType ");
        V0.append(b0Var.z());
        throw new IllegalStateException(V0.toString());
    }

    @Override // defpackage.zrc
    public void d(csc csc, RecyclerView.b0 b0Var) {
        yrc yrc = this.b.get(Integer.valueOf(e(csc)));
        if (yrc != null) {
            yrc.d(csc, b0Var);
            return;
        }
        StringBuilder V0 = je.V0("No AdapterDelegate added for ViewType ");
        V0.append(b0Var.z());
        throw new IllegalStateException(V0.toString());
    }

    @Override // defpackage.zrc
    public int e(csc csc) {
        String name = csc.getClass().getName();
        Integer num = this.a.get(name);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(je.y0("No AdapterDelegate added that can handle type: ", name, " Did you register the segment in any adapter delegate?"));
    }
}
