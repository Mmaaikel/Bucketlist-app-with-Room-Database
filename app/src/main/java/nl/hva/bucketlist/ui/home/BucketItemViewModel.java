package nl.hva.bucketlist.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;

import nl.hva.bucketlist.database.dao.BucketItemDao;
import nl.hva.bucketlist.database.entity.BucketItem;

public class BucketItemViewModel extends ViewModel {

    public final LiveData<PagedList<BucketItem>> bucketItemList;

    public BucketItemViewModel(BucketItemDao bucketItemDao) {
        bucketItemList = new LivePagedListBuilder<>( bucketItemDao.getAll(), 20 ).build();
    }
}
