package com.spotify.encore.consumer.entrypoint;

import android.app.Activity;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class EncoreConsumerEntryPoint {
    private final Buttons buttons;
    private final Cards cards;
    private final Error error;
    private final Headers headers;
    private final Headings headings;
    private final Rows rows;

    public static final class Buttons {
        private final Activity activity;

        public Buttons(Activity activity2) {
            h.e(activity2, "activity");
            this.activity = activity2;
        }

        public final Activity getActivity() {
            return this.activity;
        }
    }

    public static final class Cards {
        private final Activity activity;
        private final Picasso picasso;

        public Cards(Activity activity2, Picasso picasso2) {
            h.e(activity2, "activity");
            h.e(picasso2, "picasso");
            this.activity = activity2;
            this.picasso = picasso2;
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }
    }

    public static final class Error {
        private final Activity activity;

        public Error(Activity activity2) {
            h.e(activity2, "activity");
            this.activity = activity2;
        }

        public final Activity getActivity() {
            return this.activity;
        }
    }

    public static final class Headers {
        private final Activity activity;
        private final Picasso picasso;

        public Headers(Activity activity2, Picasso picasso2) {
            h.e(activity2, "activity");
            h.e(picasso2, "picasso");
            this.activity = activity2;
            this.picasso = picasso2;
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }
    }

    public static final class Headings {
        private final Activity activity;
        private final Picasso picasso;

        public Headings(Activity activity2, Picasso picasso2) {
            h.e(activity2, "activity");
            h.e(picasso2, "picasso");
            this.activity = activity2;
            this.picasso = picasso2;
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }
    }

    public static final class Rows {
        private final Activity activity;
        private final Picasso picasso;

        public Rows(Activity activity2, Picasso picasso2) {
            h.e(activity2, "activity");
            h.e(picasso2, "picasso");
            this.activity = activity2;
            this.picasso = picasso2;
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }
    }

    public EncoreConsumerEntryPoint(Activity activity, Picasso picasso) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        this.buttons = new Buttons(activity);
        this.cards = new Cards(activity, picasso);
        this.rows = new Rows(activity, picasso);
        this.headers = new Headers(activity, picasso);
        this.headings = new Headings(activity, picasso);
        this.error = new Error(activity);
    }

    public final Buttons getButtons() {
        return this.buttons;
    }

    public final Cards getCards() {
        return this.cards;
    }

    public final Error getError() {
        return this.error;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final Headings getHeadings() {
        return this.headings;
    }

    public final Rows getRows() {
        return this.rows;
    }
}
