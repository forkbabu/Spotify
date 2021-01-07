package defpackage;

import android.view.View;
import android.widget.Button;
import com.spotify.music.C0707R;
import com.spotify.music.libs.ageverification.AgeVerificationDialogViewModel;
import com.spotify.music.libs.ageverification.j;
import com.spotify.music.libs.ageverification.k;
import com.spotify.music.slate.container.view.SlateView;

/* renamed from: bz9  reason: default package */
public class bz9 implements k {
    private final SlateView a;
    private zy9 b;
    private j c;

    public bz9(SlateView slateView) {
        this.a = slateView;
    }

    static void b(bz9 bz9) {
        j jVar = bz9.c;
        if (jVar != null) {
            ((ty9) jVar).e();
        }
    }

    @Override // com.spotify.music.libs.ageverification.k
    public void a(AgeVerificationDialogViewModel ageVerificationDialogViewModel) {
        zy9 zy9 = this.b;
        if (zy9 != null) {
            zy9.c(ageVerificationDialogViewModel);
        }
    }

    public void c(j jVar, zy9 zy9) {
        this.c = jVar;
        this.b = zy9;
        this.a.d(zy9);
        this.a.setFooter(new yy9(this));
        this.a.setInteractionListener(new az9(this));
        View findViewById = this.a.findViewById(C0707R.id.action_button);
        findViewById.getClass();
        ((Button) findViewById).setOnClickListener(new xy9(this));
    }

    public void d(View view) {
        j jVar = this.c;
        if (jVar != null) {
            ((ty9) jVar).f();
        }
    }

    public void e(View view) {
        j jVar = this.c;
        if (jVar != null) {
            ((ty9) jVar).g();
        }
    }
}
