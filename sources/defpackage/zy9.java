package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.ageverification.AgeVerificationDialogViewModel;
import com.spotify.music.slate.model.q;
import com.spotify.music.slate.model.u;
import com.squareup.picasso.Picasso;

/* renamed from: zy9  reason: default package */
public class zy9 implements a3d {
    private final Picasso a;
    protected View b;
    private AgeVerificationDialogViewModel c;

    public zy9(AgeVerificationDialogViewModel ageVerificationDialogViewModel, Picasso picasso) {
        this.c = ageVerificationDialogViewModel;
        this.a = picasso;
    }

    private static void a(u uVar, u uVar2, TextView textView) {
        if (uVar2 == null) {
            textView.setVisibility(4);
            return;
        }
        uVar2.a(textView);
        textView.setVisibility(0);
        if (!uVar2.equals(uVar)) {
            textView.setAlpha(0.0f);
            textView.animate().setDuration(500).alpha(1.0f).start();
        }
    }

    private void b(AgeVerificationDialogViewModel ageVerificationDialogViewModel) {
        View findViewById = this.b.findViewById(C0707R.id.title);
        findViewById.getClass();
        TextView textView = (TextView) findViewById;
        View findViewById2 = this.b.findViewById(C0707R.id.sub_title);
        findViewById2.getClass();
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = this.b.findViewById(C0707R.id.image_view);
        findViewById3.getClass();
        ImageView imageView = (ImageView) findViewById3;
        View findViewById4 = this.b.findViewById(C0707R.id.action_button);
        findViewById4.getClass();
        Button button = (Button) findViewById4;
        View findViewById5 = this.b.findViewById(C0707R.id.progress);
        findViewById5.getClass();
        ProgressBar progressBar = (ProgressBar) findViewById5;
        int a2 = this.c.a();
        int a3 = ageVerificationDialogViewModel.a();
        View view = this.b;
        if (a2 != a3) {
            if (view.getBackground() != null && (view.getBackground() instanceof ColorDrawable)) {
                a2 = ((ColorDrawable) view.getBackground()).getColor();
            }
            ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(a2), Integer.valueOf(a3));
            ofObject.setDuration(500L);
            ofObject.start();
        }
        view.setBackgroundColor(a3);
        a(this.c.j(), ageVerificationDialogViewModel.j(), textView);
        a(this.c.b(), ageVerificationDialogViewModel.b(), textView2);
        String c2 = this.c.c();
        String c3 = ageVerificationDialogViewModel.c();
        if (c3 == null) {
            imageView.setVisibility(8);
        } else {
            q.e(Uri.parse(c3)).a(imageView, this.a, null, null);
            imageView.setVisibility(0);
            if (!c3.equals(c2)) {
                imageView.setAlpha(0.0f);
                imageView.animate().setDuration(1000).alpha(1.0f).start();
            }
        }
        a(this.c.f(), ageVerificationDialogViewModel.f(), button);
        if (ageVerificationDialogViewModel.h()) {
            progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            progressBar.setVisibility(0);
            button.setEnabled(false);
            return;
        }
        progressBar.setVisibility(8);
        button.setEnabled(true);
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = layoutInflater.inflate(C0707R.layout.age_verification_dialog, viewGroup, false);
        b(this.c);
        return this.b;
    }

    public void c(AgeVerificationDialogViewModel ageVerificationDialogViewModel) {
        if (this.b != null) {
            b(ageVerificationDialogViewModel);
        }
        this.c = ageVerificationDialogViewModel;
    }
}
