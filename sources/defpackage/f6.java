package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.g;
import androidx.core.app.h;
import androidx.core.app.n;
import com.spotify.music.C0707R;

/* renamed from: f6  reason: default package */
public class f6 extends n {
    int[] e = null;
    MediaSessionCompat.Token f;
    boolean g;
    PendingIntent h;

    private RemoteViews j(h hVar) {
        boolean z = hVar.k == null;
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), (int) C0707R.layout.notification_media_action);
        remoteViews.setImageViewResource(C0707R.id.action0, hVar.i);
        if (!z) {
            remoteViews.setOnClickPendingIntent(C0707R.id.action0, hVar.k);
        }
        int i = Build.VERSION.SDK_INT;
        remoteViews.setContentDescription(C0707R.id.action0, hVar.j);
        return remoteViews;
    }

    @Override // androidx.core.app.n
    public void a(g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            Notification.Builder a = gVar.a();
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            int[] iArr = this.e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.c());
            }
            a.setStyle(mediaStyle);
        } else if (this.g) {
            gVar.a().setOngoing(true);
        }
    }

    @Override // androidx.core.app.n
    public RemoteViews f(g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        int min = Math.min(this.a.b.size(), 5);
        RemoteViews b = b(false, min <= 3 ? C0707R.layout.notification_template_big_media_narrow : C0707R.layout.notification_template_big_media, false);
        b.removeAllViews(C0707R.id.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                b.addView(C0707R.id.media_actions, j(this.a.b.get(i)));
            }
        }
        if (this.g) {
            b.setViewVisibility(C0707R.id.cancel_action, 0);
            b.setInt(C0707R.id.cancel_action, "setAlpha", this.a.a.getResources().getInteger(C0707R.integer.cancel_button_image_alpha));
            b.setOnClickPendingIntent(C0707R.id.cancel_action, this.h);
        } else {
            b.setViewVisibility(C0707R.id.cancel_action, 8);
        }
        return b;
    }

    @Override // androidx.core.app.n
    public RemoteViews g(g gVar) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        RemoteViews b = b(false, C0707R.layout.notification_template_media, true);
        int size = this.a.b.size();
        int[] iArr = this.e;
        if (iArr == null) {
            i = 0;
        } else {
            i = Math.min(iArr.length, 3);
        }
        b.removeAllViews(C0707R.id.media_actions);
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < size) {
                    b.addView(C0707R.id.media_actions, j(this.a.b.get(this.e[i2])));
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                }
            }
        }
        if (this.g) {
            b.setViewVisibility(C0707R.id.end_padder, 8);
            b.setViewVisibility(C0707R.id.cancel_action, 0);
            b.setOnClickPendingIntent(C0707R.id.cancel_action, this.h);
            b.setInt(C0707R.id.cancel_action, "setAlpha", this.a.a.getResources().getInteger(C0707R.integer.cancel_button_image_alpha));
        } else {
            b.setViewVisibility(C0707R.id.end_padder, 0);
            b.setViewVisibility(C0707R.id.cancel_action, 8);
        }
        return b;
    }

    public f6 k(PendingIntent pendingIntent) {
        this.h = pendingIntent;
        return this;
    }

    public f6 l(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public f6 m(int... iArr) {
        this.e = iArr;
        return this;
    }

    public f6 n(boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            this.g = z;
        }
        return this;
    }
}
