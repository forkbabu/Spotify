package com.spotify.music.features.playlistentity.additionaladapters;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.t;

public interface AdditionalAdapter extends t {
    public static final Position[] i = Position.values();

    public enum Position {
        AFTER_HEADER,
        BEFORE_TRACK_LIST,
        AFTER_TRACK_LIST
    }

    public interface a {

        /* renamed from: com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter$a$a  reason: collision with other inner class name */
        public interface AbstractC0240a {
            void a(int i);
        }

        public interface b {
            void a(boolean z);
        }

        void a(b bVar);

        void b(AbstractC0240a aVar);

        RecyclerView.e<? extends RecyclerView.b0> c(ViewGroup viewGroup);

        io.reactivex.subjects.a<Integer> d();
    }

    a e();

    boolean v(h76 h76);
}
