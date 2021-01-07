package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.spotify.music.C0707R;
import defpackage.pvb;

/* renamed from: nvb  reason: default package */
public class nvb extends PopupWindow implements pvb, PopupWindow.OnDismissListener {
    private pvb.a a;
    private boolean b;

    public nvb(View view) {
        super(view, -1, -1);
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.car_imageview);
        if (imageView != null) {
            imageView.setImageDrawable(fvb.g(view.getContext()));
        }
        ((Button) view.findViewById(C0707R.id.driving_optout_button)).setOnClickListener(new mvb(this));
        ((Button) view.findViewById(C0707R.id.cancel_button)).setOnClickListener(new lvb(this));
        setOnDismissListener(this);
    }

    public /* synthetic */ void a(View view) {
        ((yub) this.a).b();
    }

    public /* synthetic */ void b(View view) {
        ((yub) this.a).a();
    }

    public void c(pvb.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.pvb
    public void cancel() {
        this.b = true;
        dismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ((yub) this.a).c(this.b);
    }
}
