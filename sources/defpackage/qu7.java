package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.e;
import com.spotify.glue.dialogs.f;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.editprofile.p;
import com.spotify.music.features.profile.saveprofile.domain.r;

/* renamed from: qu7  reason: default package */
public class qu7 implements e {
    private final p a;
    private a b = mu7.a;
    private a c = ku7.a;
    private final d d;
    private TextView e;
    private ProgressBar f;
    private View g;

    /* renamed from: qu7$a */
    public interface a {
        void a();
    }

    public qu7(Context context, p pVar) {
        this.a = pVar;
        f fVar = new f(context, this);
        fVar.a(false);
        this.d = fVar.b();
    }

    @Override // com.spotify.glue.dialogs.e
    public void a() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.save_profile_dialog, viewGroup, true);
        this.e = (TextView) inflate.findViewById(C0707R.id.save_dialog_title);
        this.f = (ProgressBar) inflate.findViewById(C0707R.id.save_dialog_progress);
        this.g = inflate.findViewById(C0707R.id.save_dialog_retry_container);
        ((Button) inflate.findViewById(C0707R.id.save_dialog_retry_button)).setOnClickListener(new lu7(this));
        ((Button) inflate.findViewById(C0707R.id.save_dialog_cancel_button)).setOnClickListener(new pu7(this));
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return 0;
    }

    public void d() {
        this.d.dismiss();
    }

    public boolean e() {
        return this.d.b().isShowing();
    }

    public /* synthetic */ void f(View view) {
        this.a.v();
        this.c.a();
    }

    public /* synthetic */ void g(View view) {
        this.a.u();
        this.b.a();
    }

    public void h(a aVar, a aVar2) {
        this.b = (a) MoreObjects.firstNonNull(aVar, nu7.a);
        this.c = (a) MoreObjects.firstNonNull(aVar2, ou7.a);
    }

    public void i() {
        this.d.a();
    }

    public void j(r rVar) {
        ProgressBar progressBar = this.f;
        TextView textView = this.e;
        View view = this.g;
        if (progressBar != null && textView != null && view != null) {
            progressBar.setProgress(Math.round(rVar.b() * 100.0f));
            int ordinal = rVar.c().ordinal();
            if (ordinal == 1) {
                textView.setText(C0707R.string.save_profile_dialog_title_saving);
                progressBar.setVisibility(0);
                view.setVisibility(4);
            } else if (ordinal == 2) {
                textView.setText(C0707R.string.save_profile_dialog_title_failed);
                progressBar.setVisibility(4);
                view.setVisibility(0);
            }
        }
    }
}
