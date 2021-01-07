package androidx.core.app;

import android.app.Notification;
import android.content.res.Resources;
import android.os.Build;
import android.widget.RemoteViews;
import com.spotify.music.C0707R;
import java.util.ArrayList;

public class l extends n {
    private RemoteViews j(RemoteViews remoteViews, boolean z) {
        ArrayList arrayList;
        int min;
        boolean z2 = true;
        RemoteViews b = b(true, C0707R.layout.notification_template_custom_big, false);
        b.removeAllViews(C0707R.id.actions);
        ArrayList<h> arrayList2 = this.a.b;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (h hVar : arrayList2) {
                if (!hVar.f()) {
                    arrayList3.add(hVar);
                }
            }
            arrayList = arrayList3;
        }
        if (!z || arrayList == null || (min = Math.min(arrayList.size(), 3)) <= 0) {
            z2 = false;
        } else {
            for (int i = 0; i < min; i++) {
                h hVar2 = (h) arrayList.get(i);
                boolean z3 = hVar2.k == null;
                RemoteViews remoteViews2 = new RemoteViews(this.a.a.getPackageName(), z3 ? C0707R.layout.notification_action_tombstone : C0707R.layout.notification_action);
                remoteViews2.setImageViewBitmap(C0707R.id.action_image, c(hVar2.c(), this.a.a.getResources().getColor(C0707R.color.notification_action_color_filter)));
                remoteViews2.setTextViewText(C0707R.id.action_text, hVar2.j);
                if (!z3) {
                    remoteViews2.setOnClickPendingIntent(C0707R.id.action_container, hVar2.k);
                }
                int i2 = Build.VERSION.SDK_INT;
                remoteViews2.setContentDescription(C0707R.id.action_container, hVar2.j);
                b.addView(C0707R.id.actions, remoteViews2);
            }
        }
        int i3 = z2 ? 0 : 8;
        b.setViewVisibility(C0707R.id.actions, i3);
        b.setViewVisibility(C0707R.id.action_divider, i3);
        b.setViewVisibility(C0707R.id.title, 8);
        b.setViewVisibility(C0707R.id.text2, 8);
        b.setViewVisibility(C0707R.id.text, 8);
        b.removeAllViews(C0707R.id.notification_main_column);
        b.addView(C0707R.id.notification_main_column, remoteViews.clone());
        b.setViewVisibility(C0707R.id.notification_main_column, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            Resources resources = this.a.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0707R.dimen.notification_top_pad_large_text);
            float f = resources.getConfiguration().fontScale;
            if (f < 1.0f) {
                f = 1.0f;
            } else if (f > 1.3f) {
                f = 1.3f;
            }
            float f2 = (f - 1.0f) / 0.29999995f;
            b.setViewPadding(C0707R.id.notification_main_column_container, 0, Math.round((f2 * ((float) dimensionPixelSize2)) + ((1.0f - f2) * ((float) dimensionPixelSize))), 0, 0);
        }
        return b;
    }

    @Override // androidx.core.app.n
    public void a(g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((o) gVar).a().setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    @Override // androidx.core.app.n
    public RemoteViews f(g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        k kVar = this.a;
        RemoteViews remoteViews = kVar.w;
        if (remoteViews == null) {
            remoteViews = kVar.v;
        }
        if (remoteViews == null) {
            return null;
        }
        return j(remoteViews, true);
    }

    @Override // androidx.core.app.n
    public RemoteViews g(g gVar) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT < 24 && (remoteViews = this.a.v) != null) {
            return j(remoteViews, false);
        }
        return null;
    }

    @Override // androidx.core.app.n
    public RemoteViews h(g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        this.a.getClass();
        RemoteViews remoteViews = this.a.v;
        return null;
    }
}
