package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: jl4  reason: default package */
public class jl4 implements ml4 {
    private final List<ml4> a;

    public jl4(sl4 sl4, vl4 vl4, pl4 pl4) {
        this.a = ImmutableList.of((pl4) sl4, (pl4) vl4, pl4);
    }

    @Override // defpackage.ml4
    public boolean a(Uri uri) {
        for (ml4 ml4 : this.a) {
            if (ml4.a(uri)) {
                return true;
            }
        }
        return false;
    }
}
