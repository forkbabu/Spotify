package androidx.viewpager2.adapter;

class c implements Runnable {
    final /* synthetic */ FragmentStateAdapter a;

    c(FragmentStateAdapter fragmentStateAdapter) {
        this.a = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentStateAdapter fragmentStateAdapter = this.a;
        fragmentStateAdapter.r = false;
        fragmentStateAdapter.b0();
    }
}
