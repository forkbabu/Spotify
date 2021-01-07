package com.spotify.music.storage;

class g implements Runnable {
    final /* synthetic */ ConfigStorageFragment a;

    g(ConfigStorageFragment configStorageFragment) {
        this.a = configStorageFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConfigStorageFragment.V4(this.a).notifyDataSetChanged();
    }
}
