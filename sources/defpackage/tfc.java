package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import defpackage.yrc;

/* renamed from: tfc  reason: default package */
public class tfc implements yrc {

    /* renamed from: tfc$a */
    public static class a extends csc {
        public a() {
            c(false);
        }
    }

    /* renamed from: tfc$b */
    public static class b extends yrc.a {
        public b(View view) {
            super(view);
        }
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(C0707R.layout.footer_loading_infinite, viewGroup, false));
    }
}
