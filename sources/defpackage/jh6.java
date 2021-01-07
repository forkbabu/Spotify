package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.playlist.models.l;
import kotlin.jvm.internal.h;

/* renamed from: jh6  reason: default package */
public class jh6 extends RecyclerView.b0 {
    private int C;
    private l D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jh6(View view) {
        super(view);
        h.e(view, "itemView");
    }

    public void h0(l lVar, int i) {
        h.e(lVar, "item");
        this.C = i;
        this.D = lVar;
    }

    public String j0() {
        l lVar = this.D;
        if (lVar != null) {
            return lVar.getUri();
        }
        return null;
    }

    public int l0() {
        return this.C;
    }
}
