package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.yourlibrary.quickscroll.a0;
import com.spotify.music.yourlibrary.quickscroll.v;
import com.spotify.music.yourlibrary.quickscroll.y;
import com.spotify.music.yourlibrary.quickscroll.z;

/* renamed from: vpd  reason: default package */
public class vpd implements v {
    private final RecyclerView a;
    private final a0 b;
    private final z c;
    private int f;

    public vpd(RecyclerView recyclerView, a0 a0Var, z zVar) {
        this.a = recyclerView;
        this.b = a0Var;
        this.c = zVar;
    }

    private LinearLayoutManager b() {
        return (LinearLayoutManager) this.a.getLayoutManager();
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.a0
    public String a(int i) {
        return this.b.a(i);
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public int f() {
        LinearLayoutManager b2 = b();
        if (b2 != null) {
            return b2.Y1();
        }
        return 0;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public int g() {
        LinearLayoutManager b2 = b();
        int i = 0;
        if (b2 == null) {
            return 0;
        }
        int U1 = b2.U1();
        int Y1 = b2.Y1();
        int Z1 = b2.Z1();
        int b22 = b2.b2();
        int i2 = (Z1 - U1) + (U1 != Y1 ? 1 : 0);
        if (Z1 != b22) {
            i = 1;
        }
        int max = Math.max(this.f, i2 + i);
        this.f = max;
        return max;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public int getSize() {
        RecyclerView.e adapter = this.a.getAdapter();
        return (adapter != null ? adapter.u() : 0) - this.c.m();
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public boolean h(int i) {
        return this.c.h(i);
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public /* synthetic */ int m() {
        return y.a(this);
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public void o(int i) {
        LinearLayoutManager b2 = b();
        if (b2 != null) {
            b2.t2(i, 0);
        }
    }
}
