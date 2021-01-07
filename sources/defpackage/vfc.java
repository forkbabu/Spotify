package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import defpackage.yrc;

/* renamed from: vfc  reason: default package */
public class vfc implements yrc {

    /* renamed from: vfc$a */
    public static class a extends csc {
    }

    /* renamed from: vfc$b */
    public static class b extends yrc.a {
        private final TextView C;

        public b(View view) {
            super(view);
            this.C = (TextView) view.findViewById(C0707R.id.text);
        }

        static void h0(b bVar, a aVar) {
            TextView textView = bVar.C;
            aVar.getClass();
            textView.setText(0);
        }
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        b.h0((b) b0Var, (a) csc);
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(C0707R.layout.podcast_adapter_delegate_simple_text, viewGroup, false));
    }
}
