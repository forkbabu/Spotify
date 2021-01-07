package defpackage;

import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: j61  reason: default package */
public final class j61 extends k61 {
    private final m61 c;

    j61(m61 m61) {
        super(m61.h());
        this.c = m61;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Map<java.lang.String, android.os.Parcelable> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // defpackage.k61
    public void e(Parcelable parcelable, Map<String, Parcelable> map) {
        if (parcelable instanceof urf) {
            urf urf = (urf) parcelable;
            List<s81> j = this.c.j();
            int size = j.size();
            for (int i = 0; i < urf.size(); i++) {
                int keyAt = urf.keyAt(i);
                if (keyAt >= size) {
                    Logger.n("Inconsistent saved state: position is %d but size is %d", Integer.valueOf(keyAt), Integer.valueOf(size));
                    return;
                }
                String id = j.get(keyAt).id();
                if (id != null) {
                    map.put(id, urf.valueAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.k61
    public Parcelable g(Map<String, Parcelable> map) {
        Parcelable parcelable;
        if (map.isEmpty()) {
            return null;
        }
        urf urf = new urf();
        List<s81> j = this.c.j();
        for (int i = 0; i < j.size(); i++) {
            String id = j.get(i).id();
            if (!(id == null || (parcelable = map.get(id)) == null)) {
                urf.put(i, parcelable);
            }
        }
        return urf;
    }
}
