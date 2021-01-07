package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;
import defpackage.zs4;

/* renamed from: fr4  reason: default package */
public class fr4 implements qu0 {
    private final zs4 a;
    private final e b;

    /* renamed from: fr4$a */
    static class a extends RecyclerView.b0 {
        final TextView C;

        public a(View view) {
            super(view);
            this.C = (TextView) view.findViewById(C0707R.id.picker_error_message);
        }
    }

    public fr4(zs4 zs4, e eVar) {
        this.a = zs4;
        this.b = eVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        return new a(je.G(viewGroup, C0707R.layout.picker_error, viewGroup, false));
    }

    @Override // defpackage.qu0
    public int c() {
        return this.a.b() != 0 ? 1 : 0;
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{77};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i) {
        if (b0Var instanceof a) {
            int b2 = this.a.b();
            ((a) b0Var).C.setText(b2);
            if (C0707R.string.connect_picker_no_internet == b2) {
                ((vt0) this.b.b()).g();
            } else {
                ((vt0) this.b.b()).l();
            }
        } else {
            throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", a.class.getSimpleName(), b0Var.getClass().getSimpleName()));
        }
    }

    public void g(zs4.a aVar) {
        this.a.e(aVar);
    }

    @Override // defpackage.qu0
    public long getItemId(int i) {
        return 77;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i) {
        return 77;
    }

    public void start() {
        this.a.f();
    }

    public void stop() {
        this.a.g();
    }
}
