package com.spotify.encore.consumer.components.api.trackrowplaylistextender;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class Events {
    public static final Companion Companion = new Companion(null);

    public static final class AddToPlaylistClicked extends Events {
        public static final AddToPlaylistClicked INSTANCE = new AddToPlaylistClicked();

        private AddToPlaylistClicked() {
            super(null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public final Events addToPlaylistClicked() {
            return AddToPlaylistClicked.INSTANCE;
        }

        public final Events rowClicked() {
            return RowClicked.INSTANCE;
        }

        public final Events rowLongClicked() {
            return RowLongClicked.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public static final class RowClicked extends Events {
        public static final RowClicked INSTANCE = new RowClicked();

        private RowClicked() {
            super(null);
        }
    }

    public static final class RowLongClicked extends Events {
        public static final RowLongClicked INSTANCE = new RowLongClicked();

        private RowLongClicked() {
            super(null);
        }
    }

    private Events() {
    }

    public static final Events addToPlaylistClicked() {
        return Companion.addToPlaylistClicked();
    }

    public static final Events rowClicked() {
        return Companion.rowClicked();
    }

    public static final Events rowLongClicked() {
        return Companion.rowLongClicked();
    }

    public final <R> R map(nmf<? super RowClicked, ? extends R> nmf, nmf<? super RowLongClicked, ? extends R> nmf2, nmf<? super AddToPlaylistClicked, ? extends R> nmf3) {
        h.e(nmf, "rowClicked");
        h.e(nmf2, "rowLongClicked");
        h.e(nmf3, "addToPlaylistClicked");
        if (this instanceof RowClicked) {
            return (R) nmf.invoke(this);
        }
        if (this instanceof RowLongClicked) {
            return (R) nmf2.invoke(this);
        }
        if (this instanceof AddToPlaylistClicked) {
            return (R) nmf3.invoke(this);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void match(nmf<? super RowClicked, kotlin.f> nmf, nmf<? super RowLongClicked, kotlin.f> nmf2, nmf<? super AddToPlaylistClicked, kotlin.f> nmf3) {
        h.e(nmf, "rowClicked");
        h.e(nmf2, "rowLongClicked");
        h.e(nmf3, "addToPlaylistClicked");
        if (this instanceof RowClicked) {
            nmf.invoke(this);
        } else if (this instanceof RowLongClicked) {
            nmf2.invoke(this);
        } else if (this instanceof AddToPlaylistClicked) {
            nmf3.invoke(this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ Events(f fVar) {
        this();
    }
}
