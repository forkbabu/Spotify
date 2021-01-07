package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.c;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;
import defpackage.op4;

/* renamed from: rn4  reason: default package */
public class rn4 implements qu0 {
    private final op4 a;
    private final e b;

    /* renamed from: rn4$a */
    static class a extends RecyclerView.b0 {
        final TextView C;

        public a(TextView textView) {
            super(textView);
            this.C = textView;
            Context context = textView.getContext();
            c.n(textView, R.style.TextAppearance_Encore_Ballad);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.device_picker_space_at_not_available_devices);
            textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            textView.setTextColor(androidx.core.content.a.b(context, C0707R.color.glue_row_subtitle_color));
            textView.setClickable(false);
            textView.setGravity(17);
        }
    }

    public rn4(op4 op4, e eVar) {
        this.a = op4;
        this.b = eVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        return new a(com.spotify.android.paste.app.c.f(viewGroup.getContext()));
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
            ((a) b0Var).C.setText(b0Var.a.getResources().getString(b2));
            if (C0707R.string.connect_picker_no_internet == b2) {
                ((vt0) this.b.b()).g();
            } else {
                ((vt0) this.b.b()).l();
            }
        } else {
            throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", a.class.getSimpleName(), b0Var.getClass().getSimpleName()));
        }
    }

    public void g(op4.a aVar) {
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
