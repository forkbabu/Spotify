package defpackage;

import androidx.recyclerview.widget.m;
import com.google.common.base.MoreObjects;
import com.spotify.playlist.models.Episode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: isc  reason: default package */
public class isc extends m.b {
    private List<csc> a = new ArrayList(0);
    private List<csc> b = new ArrayList(0);

    @Override // androidx.recyclerview.widget.m.b
    public boolean a(int i, int i2) {
        csc csc = this.b.get(i);
        csc csc2 = this.a.get(i2);
        if (!(csc instanceof dsc) || !(csc2 instanceof dsc)) {
            return false;
        }
        Episode e = ((dsc) csc).e();
        Episode e2 = ((dsc) csc2).e();
        if (!MoreObjects.isNullOrEmpty(e.getHeader())) {
            return e.getHeader().equals(e2.getHeader());
        }
        if (!MoreObjects.isNullOrEmpty(e2.getHeader())) {
            return false;
        }
        return e.equals(e2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public boolean b(int i, int i2) {
        csc csc = this.b.get(i);
        csc csc2 = this.a.get(i2);
        if ((csc instanceof dsc) && (csc2 instanceof dsc)) {
            Episode e = ((dsc) csc).e();
            Episode e2 = ((dsc) csc2).e();
            if (!MoreObjects.isNullOrEmpty(e.getHeader())) {
                return e.getHeader().equals(e2.getHeader());
            }
            if (!MoreObjects.isNullOrEmpty(e2.getHeader())) {
                return false;
            }
            return e.getUri().equals(e2.getUri());
        } else if (csc == csc2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.m.b
    public int d() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public int e() {
        return this.b.size();
    }

    public void f(List<csc> list, List<csc> list2) {
        if (list != null) {
            this.b = list;
        }
        this.a = list2;
    }
}
