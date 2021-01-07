package android.support.wearable.view;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

@Deprecated
public class DismissOverlayView extends FrameLayout {
    private SharedPreferences a;
    private boolean b;
    private final TextView c;
    private final View f;

    class a implements View.OnClickListener {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = this.a;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    public DismissOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        animate().alpha(0.0f).setDuration(200).withEndAction(new c(this)).start();
        if (!this.b) {
            return true;
        }
        this.b = false;
        this.a.edit().putBoolean("first_run", false).apply();
        return true;
    }

    public void setIntroText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public DismissOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        LayoutInflater.from(context).inflate(C0707R.layout.dismiss_overlay, (ViewGroup) this, true);
        setBackgroundResource(C0707R.color.dismiss_overlay_bg);
        setClickable(true);
        if (!isInEditMode()) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("android.support.wearable.DismissOverlay", 0);
            this.a = sharedPreferences;
            this.b = sharedPreferences.getBoolean("first_run", true);
        }
        this.c = (TextView) findViewById(C0707R.id.dismiss_overlay_explain);
        View findViewById = findViewById(C0707R.id.dismiss_overlay_button);
        this.f = findViewById;
        findViewById.setOnClickListener(new a(context));
        setVisibility(8);
    }

    public void setIntroText(int i) {
        this.c.setText(i);
    }
}
