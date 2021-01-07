package defpackage;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.music.behindthelyrics.presenter.CardType;
import java.util.List;

/* renamed from: sk2  reason: default package */
public class sk2 {
    private TrackAnnotationSet a;

    public int a(String str) {
        List<TrackAnnotation> annotations = this.a.getAnnotations();
        for (int i = 0; i < annotations.size(); i++) {
            if (str.equals(annotations.get(i).getContent())) {
                return i + 1;
            }
        }
        return 0;
    }

    public int b(String str) {
        if (str.equals(CardType.CREDITS.toString())) {
            return this.a.getAnnotations().size();
        }
        return -1;
    }

    public String c() {
        return String.format("spotify:track:%1$s", this.a.getSpotifyTrackId());
    }

    public void d(TrackAnnotationSet trackAnnotationSet) {
        this.a = trackAnnotationSet;
    }
}
