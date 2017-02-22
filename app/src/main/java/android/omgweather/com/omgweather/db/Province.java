package android.omgweather.com.omgweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/22.
 */

public class Province extends DataSupport{
    private int id;
    private String proviceName;
    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
