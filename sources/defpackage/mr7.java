package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: mr7  reason: default package */
public class mr7 extends nc0 {
    private final ImageView c;
    private final TextView f;

    public mr7(View view) {
        super(view);
        this.c = (ImageView) view.findViewById(C0707R.id.profile_image);
        this.f = (TextView) view.findViewById(C0707R.id.profile_title);
    }

    public void E2(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    public ImageView getImageView() {
        return this.c;
    }

    public void setTitle(String str) {
        this.f.setText(str);
    }
}
