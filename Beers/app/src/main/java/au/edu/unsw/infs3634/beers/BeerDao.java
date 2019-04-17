package au.edu.unsw.infs3634.beers;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;


@Dao
public interface BeerDao {
    @Query("SELECT * FROM Beer")
    List<Beer> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Beer... beers);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Beer beer);

    @Delete
    void delete(Beer beer);

}
