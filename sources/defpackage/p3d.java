package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;

/* renamed from: p3d  reason: default package */
public class p3d implements a3d {
    private final j3d a;
    private final Runnable b;
    private final Picasso c;

    /* renamed from: p3d$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p3d.this.b.run();
        }
    }

    public p3d(Picasso picasso, Runnable runnable, j3d j3d) {
        this.c = picasso;
        this.b = runnable;
        this.a = j3d;
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.slate_modal_background_image, viewGroup, false);
        this.a.a().a((ImageView) inflate.findViewById(C0707R.id.background_image), this.c, null, null);
        this.a.e().a((TextView) inflate.findViewById(C0707R.id.title));
        this.a.c().a((TextView) inflate.findViewById(C0707R.id.subtitle));
        Button button = (Button) inflate.findViewById(C0707R.id.action_button);
        this.a.b().a(button);
        button.setOnClickListener(new a());
        return inflate;
    }
}
