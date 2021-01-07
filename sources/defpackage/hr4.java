package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import defpackage.qu0;

/* renamed from: hr4  reason: default package */
public class hr4 implements qu0 {
    private final Context a;
    private qu0.a b = br4.a;
    private boolean c;
    private String d;

    /* renamed from: hr4$a */
    public static class a extends RecyclerView.b0 {
        final TextView C;

        public a(View view) {
            super(view);
            this.C = (TextView) view.findViewById(C0707R.id.header_text);
        }
    }

    public hr4(Context context) {
        this.a = context;
    }

    public void a(qu0.a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        return new a(je.G(viewGroup, C0707R.layout.picker_text_header, viewGroup, false));
    }

    @Override // defpackage.qu0
    public int c() {
        return this.c ? 1 : 0;
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{111};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i) {
        ((a) b0Var).C.setText(this.d);
    }

    public void g(int i) {
        this.d = this.a.getString(i);
    }

    @Override // defpackage.qu0
    public long getItemId(int i) {
        return 111;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i) {
        return 111;
    }

    public void h(boolean z) {
        this.c = z;
        this.b.a();
    }
}
