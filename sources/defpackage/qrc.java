package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* renamed from: qrc  reason: default package */
public class qrc implements g90 {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final Button f;
    private final Drawable n;
    private final float o;
    private final f0 p = new a();

    /* renamed from: qrc$a */
    class a implements f0 {
        a() {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            qrc.this.b.setImageDrawable(qrc.this.n);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            qrc.this.b.setImageDrawable(new d(bitmap, qrc.this.o));
            qrc.this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            qrc.this.b.setImageDrawable(qrc.this.n);
        }
    }

    private qrc(ViewGroup viewGroup, rrc rrc) {
        View G = je.G(viewGroup, C0707R.layout.onboarding_call_to_action, viewGroup, false);
        this.a = G;
        this.b = (ImageView) G.findViewById(C0707R.id.image);
        this.c = (TextView) G.findViewById(C0707R.id.title);
        this.f = (Button) G.findViewById(C0707R.id.button);
        this.o = (float) G.getResources().getDimensionPixelSize(C0707R.dimen.call_to_action_corner_radius);
        this.n = G.getResources().getDrawable(C0707R.drawable.onboarding_call_to_action_placeholder);
        int a2 = rrc.a();
        G.getLayoutParams().width = a2;
        G.findViewById(C0707R.id.placeholder_image).getLayoutParams().width = a2;
    }

    public static qrc g(ViewGroup viewGroup, rrc rrc) {
        return new qrc(viewGroup, rrc);
    }

    public void E(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    public void J(String str, String str2) {
        TextView textView = this.c;
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(4);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        Button button = this.f;
        if (TextUtils.isEmpty(str2)) {
            button.setVisibility(4);
            return;
        }
        button.setText(str2);
        button.setVisibility(0);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public f0 w() {
        return this.p;
    }
}
