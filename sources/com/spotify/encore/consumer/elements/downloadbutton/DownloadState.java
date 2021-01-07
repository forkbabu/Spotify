package com.spotify.encore.consumer.elements.downloadbutton;

import kotlin.jvm.internal.f;

public abstract class DownloadState {

    public static final class Downloadable extends DownloadState {
        public static final Downloadable INSTANCE = new Downloadable();

        private Downloadable() {
            super(null);
        }
    }

    public static final class Downloaded extends DownloadState {
        public static final Downloaded INSTANCE = new Downloaded();

        private Downloaded() {
            super(null);
        }
    }

    public static final class Downloading extends DownloadState {
        private final Float progress;

        public Downloading() {
            this(null, 1, null);
        }

        public Downloading(Float f) {
            super(null);
            this.progress = f;
        }

        public final Float getProgress() {
            return this.progress;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Downloading(Float f, int i, f fVar) {
            this((i & 1) != 0 ? null : f);
        }
    }

    public static final class Error extends DownloadState {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    public static final class None extends DownloadState {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public static final class Pending extends DownloadState {
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }
    }

    private DownloadState() {
    }

    public /* synthetic */ DownloadState(f fVar) {
        this();
    }
}
