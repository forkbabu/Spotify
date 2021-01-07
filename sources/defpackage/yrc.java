package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yrc  reason: default package */
public interface yrc {

    /* renamed from: yrc$a */
    public static abstract class a extends RecyclerView.b0 {
        public a(View view) {
            super(view);
        }
    }

    void a();

    void c(csc csc, RecyclerView.b0 b0Var, int i);

    void d(csc csc, RecyclerView.b0 b0Var);

    a e(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
