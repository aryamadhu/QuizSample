package Controller;

import android.content.Context;
import android.database.Cursor;

import com.example.aryam.quizsample.model.QuestionsData;
import com.example.aryam.quizsample.model.QuzDbWrapper;

import java.util.List;



/**
 * Created by arya.m on 10/6/2016.
 */
public class Data {




    private Data() {}

    private static Data mInstance;

    private List<QuestionsData> mData, mFilteredData;

    public static Data getInstance() {
        if (mInstance == null)
            mInstance = new Data();
        return mInstance;
    }

    public List<QuestionsData> loadData(Context context) {
        QuzDbWrapper model = new QuzDbWrapper();
        if (model.openLocalDb(context)) {
            Cursor cr = model.readAllData();
            mData = QuestionsData.parseTable(cr);
            cr.close();
            model.closeLocalDb();
        }
        return mData;
    }



    public List<QuestionsData> getData() {
        return mData;
    }
}

