package com.spotify.android.storage;

public interface MovingOrchestrator {

    public enum State {
        IDLE,
        SYNCING,
        SYNCED,
        PRUNING,
        CANCELLED
    }

    public enum SyncingResult {
        EVERYTHING_IN_SYNC,
        SOMETHING_SYNCED,
        AN_ERROR_WHILE_SYNCING
    }

    public interface a {
        void a(State state);

        void b(SyncError syncError);
    }

    String a();

    void b(String str);

    void c();

    void d(a aVar);

    SyncingResult e(String str, f fVar);

    State getState();
}
