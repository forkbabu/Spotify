package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class x {
    public final Map<String, Object> a = new HashMap();
    public View b;
    final ArrayList<Transition> c = new ArrayList<>();

    @Deprecated
    public x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.b == xVar.b && this.a.equals(xVar.a);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder V0 = je.V0("TransitionValues@");
        V0.append(Integer.toHexString(hashCode()));
        V0.append(":\n");
        StringBuilder Z0 = je.Z0(V0.toString(), "    view = ");
        Z0.append(this.b);
        Z0.append("\n");
        String x0 = je.x0(Z0.toString(), "    values:");
        for (String str : this.a.keySet()) {
            x0 = x0 + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return x0;
    }

    public x(View view) {
        this.b = view;
    }
}
