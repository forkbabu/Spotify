package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: tn4  reason: default package */
public class tn4 implements qu0 {
    private int a;

    /* renamed from: tn4$a */
    public static class a extends RecyclerView.b0 {
        public a(View view) {
            super(view);
        }
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        return new a(je.G(viewGroup, C0707R.layout.header_devices, viewGroup, false));
    }

    @Override // defpackage.qu0
    public int c() {
        return 1 == this.a ? 1 : 0;
    }

    public void d(int i) {
        this.a = i;
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{11};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i) {
    }

    @Override // defpackage.qu0
    public long getItemId(int i) {
        return 0;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i) {
        return 11;
    }
}
