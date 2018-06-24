package nl.hva.bucketlist.ui.home;

import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import nl.hva.bucketlist.database.dao.BucketItemDao;
import nl.hva.bucketlist.database.entity.BucketItem;

public class BucketItemViewModelFactory implements ViewModelProvider.Factory {

    private BucketItemDao bucketItemDao;

    public BucketItemViewModelFactory(BucketItemDao bucketItemDao) {
        this.bucketItemDao = bucketItemDao;
    }

    @NonNull
    @Override
    public BucketItemViewModel create(@NonNull Class modelClass) {
        return new BucketItemViewModel( bucketItemDao );
    }
}
